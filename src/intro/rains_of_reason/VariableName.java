package intro.rains_of_reason;
/*
Correct variable names consist only of English letters,
digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.

Example

For name = "var_1__Int", the output should be
variableName(name) = true;
For name = "qq-q", the output should be
variableName(name) = false;
For name = "2w2", the output should be
variableName(name) = false.

 */
public class VariableName {
    boolean variableName(String name) {
        if (name.matches("^[a-z_A-z]\\w")) return true;
        else return false;
    }
}
