package umg.progra2.Procesos;

import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.math.MathException;

public class Integrales {

    public  String ResolverIntegral(String termino,char diferencial){
        ExprEvaluator resolver = new ExprEvaluator();
        String resultado = "";
        try {
            String integral1 = "Integrate["+termino+","+diferencial+"]";
            IExpr result = resolver.eval(integral1);
            resultado= result.toString();
        } catch (SyntaxError e){
            System.err.println("Error de sintaxis: " + e.getMessage());
        } catch (MathException e) {
            System.err.println("Error matemático: " + e.getMessage());
        }
        return resultado;
    }



//    ExprEvaluator util = new ExprEvaluator();
//
//        try {
//        // Ejemplo 1: Integral de sin^2(x)
//        String integral1 = "Integrate[Sin[2x]^3*Cos[2x]^4,x]";
//        IExpr result1 = util.eval(integral1);
//        System.out.println("Integral de sin^2(x): " + result1.toString());
//
//        // Ejemplo 2: Integral de cos^3(x)
//        String integral2 = "Integrate[Sin[5x]^4, x]";
//        IExpr result2 = util.eval(integral2);
//        System.out.println("Integral de cos^3(x): " + result2.toString());
//
//        // Ejemplo 3: Integral de tan^2(x)
//        String integral3 = "Integrate[Tan[x]^2, x]";
//        IExpr result3 = util.eval(integral3);
//        System.out.println("Integral de tan^2(x): " + result3.toString());
//
//        // Ejemplo 4: Integral de sin^4(x) * cos^2(x)
//        String integral4 = "Integrate[Sin[x]^4 * Cos[x]^2, x]";
//        IExpr result4 = util.eval(integral4);
//        System.out.println("Integral de sin^4(x) * cos^2(x): " + result4.toString());
//
//    } catch (SyntaxError e) {
//        System.err.println("Error de sintaxis: " + e.getMessage());
//    } catch (MathException e) {
//        System.err.println("Error matemático: " + e.getMessage());
//    }



}
