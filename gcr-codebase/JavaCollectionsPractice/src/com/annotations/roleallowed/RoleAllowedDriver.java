package com.annotations.roleallowed;
import java.lang.reflect.Method;

public class RoleAllowedDriver {

    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        UserContext.setRole("USER");   // try changing to ADMIN

        Method method = service.getClass().getMethod("deleteUser");

        if (method.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

            if (roleAllowed.value().equals(UserContext.getRole())) {
                method.invoke(service);
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
