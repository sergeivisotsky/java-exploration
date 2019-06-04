package org.sergei.core.reflection;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public class MethodMetaData {

    private String name;
    private Class<?> returnType;
    private Class<?>[] paramTypes;
    private Class<?>[] exceptionTypes;
    private int modifiers;

    private MethodMetaData(Builder builder) {
        name = builder.name;
        returnType = builder.returnType;
        paramTypes = builder.paramTypes;
        exceptionTypes = builder.exceptionTypes;
        modifiers = builder.modifiers;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public Class<?> getReturnType() {
        return returnType;
    }

    public Class<?>[] getParamTypes() {
        return paramTypes;
    }

    public Class<?>[] getExceptionTypes() {
        return exceptionTypes;
    }

    public int getModifiers() {
        return modifiers;
    }

//    @Override
//    public String toString() {
//        return "MethodMetaData{" +
//                "name='" + name + '\'' +
//                ", returnType=" + returnType +
//                ", paramTypes=" + Arrays.toString(paramTypes) +
//                ", exceptionTypes=" + Arrays.toString(exceptionTypes) +
//                ", modifiers=" + modifiers +
//                '}';
//    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public static final class Builder {
        private String name;
        private Class<?> returnType;
        private Class<?>[] paramTypes;
        private Class<?>[] exceptionTypes;
        private int modifiers;

        private Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withReturnType(Class<?> val) {
            returnType = val;
            return this;
        }

        public Builder withParamTypes(Class<?>[] val) {
            paramTypes = val;
            return this;
        }

        public Builder withExceptionTypes(Class<?>[] val) {
            exceptionTypes = val;
            return this;
        }

        public Builder withModifiers(int val) {
            modifiers = val;
            return this;
        }

        public MethodMetaData build() {
            return new MethodMetaData(this);
        }
    }
}
