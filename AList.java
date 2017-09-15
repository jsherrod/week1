package edu.gcccd.csis;

// Do NOT import classes from the java.util package.
// Do NOT use the java.lang.System class

// Come up with your own implementation.
// Please consider using an array ...

public class AList
{
    Object[] oa;

    public AList()
    {

    }
    public AList(Object[] oa)
    {
        this.oa = oa;
    }

    public int size()
    {
        return oa.length;
    }

    public Object add(final Object obj)
    {
        final Object[] a = new Object[oa.length + 1];
        for (int i = 0; i < oa.length; i++)
        {
            a[i] = oa[i];
        }
        a[oa.length] = obj;
        oa = a;
        return obj;
    }

    public Object remove(Object obj)
    {
        Object x = null;
        for (final Object o : oa)
        {
            if(o.equals(obj))
            {
                x = o;
            }
        }
        if (x != null)
        {
            final Object[] a = new Object[oa.length - 1];
            int i = 0;
            for (final Object o : oa) {
                if (!o.equals(obj)) {
                    a[i++] = o;
                }
            }
            oa = a;
        }
        return x;
    }

    @Override
    public String toString()
    {
        String s = "";
        for (int i = 0; i < oa.length; i++)
        {
            s += oa[i];
            if (i + 1 < oa.length)
            {
                s += ", ";
            }
        }
        return s;
    }

}
