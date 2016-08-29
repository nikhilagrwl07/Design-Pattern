
package DesignPattern.FactoryDesignPattern;


interface Currency
{
    public String getCurrency();
}

class Rupee implements Currency{

    @Override
    public String getCurrency()
    {
        return "INR";
    }
}

class USD implements Currency{

    @Override
    public String getCurrency()
    {
        return "USD";
    }
}

class SGC implements Currency{

    @Override
    public String getCurrency()
    {
        return "SGC";
    }
}

class CurrencyFactory{

    public static Currency getCurrency(String country) throws Exception
    {
        if(country.equalsIgnoreCase("India"))
        {
            return new Rupee();
        }

        if(country.equalsIgnoreCase("US"))
        {
            return new USD();
        }

        if(country.equalsIgnoreCase("Singapore"))
        {
            return new SGC();
        }
        throw new Exception("Invaid Country entered");
        //System.out.println("Invalid Cuontry entered");
       // return null;
    }

}



public class FactoryDesignPatternExample1 {

    public static void main(String[] args) {

       String enteredCountry = "India";
       Currency currency;
        try
        {
            currency = CurrencyFactory.getCurrency(enteredCountry);
            System.out.println("Country :: " + enteredCountry + " :: " + currency.getCurrency());
        }
        catch (Exception ex)
        {
        System.out.println("Invalid Country entered");
           // ex.printStackTrace();
        }
    }

}
