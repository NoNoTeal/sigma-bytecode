public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u6b5f\u7049\ucb79\u6c52\u3a62\u965f {
    private void \u6b5f\u7049\ucb79\u6c52\u3a62\u965f() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u6b5f\u7049\ucb79\u6c52\u3a62\u965f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.reflect.Field \u927d\ud12e\u6bb9\u416d\u8308\u3e75(java.lang.Class p0, java.lang.Class p1) {
        var_2_5F : int
        var_4_69 : Field[]
        var_5_77 : int
        var_6_D7 : Field
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_5F = and:int(ldc:int(107863712), ldc:int(1038417888))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(2129264354))
            var_4_69 = invokevirtual:Field[](Class::getDeclaredFields, p0:Class)
            var_2_5F = and:int(var_2_5F:int, ldc:int(-806944783))
            var_5_77 = and:int(ldc:int(-17858), ldc:int(17857))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0183)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(146854430))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(367255549))
                    
                    if (cmpge:boolean(var_5_77:int, arraylength:int(var_4_69:Field[]))) {
                        return:Field(aconstnull:Field())
                    }
                }
                
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(698683470))
                        loopcontinue()
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(2012741539))
                }
                
                Label_0183:
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1040462861))
                    goto(Label_0156)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(1877139371))
                var_6_D7 = loadelement:Field(var_4_69:Field[], var_5_77:int)
                
                if (cmpeq:boolean(invokevirtual:Class<?>(Field::getType, var_6_D7:Field), p1:Class<?>)) {
                    invokevirtual:void(AccessibleObject::setAccessible, var_6_D7:Field[expected:AccessibleObject], xor:int[expected:boolean](ldc:int(1046), ldc:int(1047)))
                    return:Field(var_6_D7:Field)
                }
                
                inc:int(var_5_77, ldc:int(1))
            }
        }
        catch (java.lang.Exception var_4_105) {
            return:Field(aconstnull:Field())
        }
    }
    
    public static java.lang.reflect.Field[] \u3a62\u1833\u3d64\ud7e8\u965f\u3c25(java.lang.Class p0, java.lang.Class p1) {
        var_2_5F : int
        var_4_69 : Field[]
        stack_7B_0 : Field[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_5F = and:int(ldc:int(495899804), ldc:int(-1921691176))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(205978614))
            var_4_69 = invokevirtual:Field[](Class::getDeclaredFields, p0:Class)
            var_2_5F = and:int(var_2_5F:int, ldc:int(-1943635563))
            stack_7B_0 = invokestatic:Field[](\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\u3a62\u1833\u3d64\ud7e8\u965f\u3c25, var_4_69:Field[], p1:Class)
            var_2_5F = and:int(var_2_5F:int, ldc:int(745889599))
            return:Field[](stack_7B_0:Field[])
        }
        catch (java.lang.Exception var_4_80) {
            return:Field[](aconstnull:Field[]())
        }
    }
    
    public static java.lang.reflect.Field[] \u3a62\u1833\u3d64\ud7e8\u965f\u3c25(java.lang.reflect.Field[] p0, java.lang.Class p1) {
        var_2_5F : int
        var_4_6C : ArrayList<Field>
        var_5_7A : int
        var_6_E0 : Field
        stack_127_0 : Field[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_5F = and:int(ldc:int(-1234358220), ldc:int(-1116834953))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-683900492))
            var_4_6C = initobject:ArrayList<Field>(ArrayList<E>::<init>)
            var_2_5F = and:int(var_2_5F:int, ldc:int(-540101574))
            var_5_7A = and:int(ldc:int(5844), ldc:int(-7894))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-140931701))
                    goto(Label_0193)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-197229317))
                    
                    if (cmpge:boolean(var_5_7A:int, arraylength:int(p0:Field[]))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0158:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1397084635))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(64)), ldc:int(0))) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-1069363195))
                        loopcontinue()
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1556923234))
                }
                
                Label_0193:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1229403855))
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(1991159093))
                var_6_E0 = loadelement:Field(p0:Field[], var_5_7A:int)
                
                if (cmpeq:boolean(invokevirtual:Class<?>(Field::getType, var_6_E0:Field), p1:Class<?>)) {
                    invokevirtual:void(AccessibleObject::setAccessible, var_6_E0:Field[expected:AccessibleObject], xor:int[expected:boolean](ldc:int(16416), ldc:int(16417)))
                    invokeinterface:boolean(List<Field>::add, var_4_6C:ArrayList<Field>[expected:List<Field>], var_6_E0:Field)
                }
                
                inc:int(var_5_7A, ldc:int(1))
            }
            
            stack_127_0 = checkcast:Field[](java.lang.reflect.Field[].class, checkcast:Field[](java.lang.reflect.Field[].class, invokeinterface:Field[](List<E>::toArray, var_4_6C:ArrayList<Field>[expected:List<Field>], newarray:Field[](java.lang.reflect.Field.class, invokeinterface:int(List<E>::size, var_4_6C:ArrayList<Field>[expected:List<Field>])))))
            var_2_5F = and:int(var_2_5F:int, ldc:int(398291052))
            return:Field[](stack_127_0:Field[])
        }
        catch (java.lang.Exception var_4_12C) {
            return:Field[](aconstnull:Field[]())
        }
    }
    
    public static java.lang.reflect.Field[] \ud523\ubff1\uc238\u839e\u7049\u3711(java.lang.Class p0, java.lang.reflect.Field p1, java.lang.Class p2) {
        var_3_5F : int
        var_5_69 : Field[]
        var_6_75 : List<Field>
        var_7_84 : int
        var_8_F8 : List<Field>
        var_9_113 : Field[]
        stack_125_0 : Field[] [generated]
        stack_DB_0 : Field[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_5F = and:int(ldc:int(-1281375734), ldc:int(1000320982))
        
        try {
            var_3_5F = and:int(var_3_5F:int, ldc:int(-140530971))
            var_5_69 = invokevirtual:Field[](Class::getDeclaredFields, p0:Class)
            var_3_5F = and:int(var_3_5F:int, ldc:int(-107109859))
            var_6_75 = invokestatic:List<Field>(Arrays::asList, var_5_69:Field[])
            var_3_5F = and:int(var_3_5F:int, ldc:int(2111804933))
            var_7_84 = invokeinterface:int(List<E>::indexOf, var_6_75:List<Field>, p1:Field[expected:Object])
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0177)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(905941510))
                    
                    if (cmpge:boolean(var_7_84:int, ldc:int(0))) {
                        var_8_F8 = invokeinterface:List<Field>(List<Field>::subList, var_6_75:List<Field>, add:int(var_7_84:int, and:int(ldc:int(9281), ldc:int(18469))), invokeinterface:int(List<E>::size, var_6_75:List<Field>))
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1275069899))
                        var_9_113 = checkcast:Field[](java.lang.reflect.Field[].class, invokeinterface:Field[](List<Field>::toArray, var_8_F8:List<Field>, newarray:Field[](java.lang.reflect.Field.class, invokeinterface:int(List<E>::size, var_8_F8:List<Field>))))
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1979700806))
                        stack_125_0 = invokestatic:Field[](\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\u3a62\u1833\u3d64\ud7e8\u965f\u3c25, var_9_113:Field[], p2:Class)
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-207647185))
                        return:Field[](stack_125_0:Field[])
                    }
                }
                
                Label_0158:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-205657153))
                }
                
                Label_0177:
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-940404058))
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(2113771177))
                    stack_DB_0 = newarray:Field[](java.lang.reflect.Field.class, and:int(ldc:int(-25947), ldc:int(24850)))
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1000314569))
                    return:Field[](stack_DB_0:Field[])
                }
            }
        }
        catch (java.lang.Exception var_5_12A) {
            return:Field[](aconstnull:Field[]())
        }
    }
    
    public static java.lang.reflect.Field[] \u3a62\u1833\u3d64\ud7e8\u965f\u3c25(java.lang.Object p0, java.lang.reflect.Field[] p1, java.lang.Class p2, java.lang.Object p3) {
        var_4_61 : int
        var_6_71 : ArrayList<Field>
        var_7_81 : int
        var_8_E7 : Field
        var_9_FA : boolean
        var_10_120 : Object
        stack_17A_0 : Field[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_4_61 = and:int(ldc:int(-1348857688), ldc:int(-1621402244))
        
        try {
            var_4_61 = and:int(var_4_61:int, ldc:int(-952116497))
            var_6_71 = initobject:ArrayList<Field>(ArrayList<E>::<init>)
            var_4_61 = and:int(var_4_61:int, ldc:int(-1082205026))
            var_7_81 = and:int(ldc:int(7821), ldc:int(-8094))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0204)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(2009223106))
                }
                else {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-954238035))
                    
                    if (cmpge:boolean(var_7_81:int, arraylength:int(p1:Field[]))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0171:
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(33554432)), ldc:int(0))) {
                        var_4_61 = and:int(var_4_61:int, ldc:int(-1926607483))
                        loopcontinue()
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(-2179811))
                }
                
                Label_0204:
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0171)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(67108864)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-539059697))
                var_8_E7 = loadelement:Field(p1:Field[], var_7_81:int)
                
                if (cmpeq:boolean(invokevirtual:Class<?>(Field::getType, var_8_E7:Field), p2:Class<?>)) {
                    var_9_FA = invokestatic:boolean(Modifier::isStatic, invokevirtual:int(Field::getModifiers, var_8_E7:Field))
                    
                    if (logicaland:boolean(logicalor:boolean(cmpne:boolean(p0:Object, aconstnull:Object()), var_9_FA:boolean), logicalor:boolean(cmpeq:boolean(p0:Object, aconstnull:Object()), logicalnot:boolean(var_9_FA:boolean)))) {
                        invokevirtual:void(AccessibleObject::setAccessible, var_8_E7:Field[expected:AccessibleObject], and:int[expected:boolean](ldc:int(2213), ldc:int(771)))
                        var_10_120 = invokevirtual:Object(Field::get, var_8_E7:Field, p0:Object)
                        
                        if (cmpeq:boolean(var_10_120:Object, p3:Object)) {
                            invokeinterface:boolean(List<Field>::add, var_6_71:ArrayList<Field>[expected:List<Field>], var_8_E7:Field)
                        }
                        else {
                            if (logicaland:boolean(logicaland:boolean(cmpne:boolean(var_10_120:Object, aconstnull:Object()), cmpne:boolean(p3:Object, aconstnull:Object())), invokevirtual:boolean(Object::equals, var_10_120:Object, p3:Object))) {
                                invokeinterface:boolean(List<Field>::add, var_6_71:ArrayList<Field>[expected:List<Field>], var_8_E7:Field)
                            }
                        }
                    }
                }
                
                inc:int(var_7_81, ldc:int(1))
            }
            
            stack_17A_0 = checkcast:Field[](java.lang.reflect.Field[].class, invokeinterface:Field[](List<E>::toArray, var_6_71:ArrayList<Field>[expected:List<Field>], newarray:Field[](java.lang.reflect.Field.class, invokeinterface:int(List<E>::size, var_6_71:ArrayList<Field>[expected:List<Field>]))))
            var_4_61 = and:int(var_4_61:int, ldc:int(-1885433815))
            return:Field[](stack_17A_0:Field[])
        }
        catch (java.lang.Exception var_6_17F) {
            return:Field[](aconstnull:Field[]())
        }
    }
    
    public static java.lang.reflect.Field \u927d\ud12e\u6bb9\u416d\u8308\u3e75(java.lang.Class p0, java.lang.Class p1, int p2) {
        var_5_65 : Field[]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_65 = invokestatic:Field[](\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\u3a62\u1833\u3d64\ud7e8\u965f\u3c25, p0:Class, p1:Class)
            return:Field(ternaryop:Field(logicaland:boolean(cmpge:boolean(p2:int, ldc:int(0)), cmplt:boolean(p2:int, arraylength:int(var_5_65:Field[]))), loadelement:Field(var_5_65:Field[], p2:int), aconstnull:Field()))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.reflect.Field \u88c5\uc910\u52d3\uc2e8\u8640\uc2bd(java.lang.Class p0, java.lang.reflect.Field p1, java.lang.Class p2, int p3) {
        var_6_69 : Field[]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_69 = invokestatic:Field[](\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\ud523\ubff1\uc238\u839e\u7049\u3711, p0:Class, p1:Field, p2:Class)
            return:Field(ternaryop:Field(logicaland:boolean(cmpge:boolean(p3:int, ldc:int(0)), cmplt:boolean(p3:int, arraylength:int(var_6_69:Field[]))), loadelement:Field(var_6_69:Field[], p3:int), aconstnull:Field()))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Object \u6bb9\u64ab\u5654\u76bc\u385b\u40a9(java.lang.Object p0, java.lang.Class p1, java.lang.Class p2) {
        var_5_65 : \u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_5_65 = invokestatic:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\ud171\u647c\u156b\u516c\u3d64\u8709, p1:Class, p2:Class)
        
        if (cmpne:boolean(var_5_65:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0, aconstnull:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0())) {
            return:Object(ternaryop:Object(invokevirtual:boolean(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::\u7e3f\ubb2b\u7e3f\u446c\u97b7\ucfaf, var_5_65:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0), invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u416d\ud158\ud36e\u4c2b\u5db4\u8308, p0:Object, var_5_65:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0), aconstnull:Object()))
        }
        
        return:Object(aconstnull:Object())
    }
    
    public static java.lang.Object \u6bb9\u64ab\u5654\u76bc\u385b\u40a9(java.lang.Object p0, java.lang.Class p1, java.lang.Class p2, int p3) {
        var_6_69 : \u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_6_69 = invokestatic:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\ud171\u647c\u156b\u516c\u3d64\u8709, p1:Class, p2:Class, p3:int)
        
        if (cmpne:boolean(var_6_69:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0, aconstnull:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0())) {
            return:Object(ternaryop:Object(invokevirtual:boolean(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::\u7e3f\ubb2b\u7e3f\u446c\u97b7\ucfaf, var_6_69:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0), invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u416d\ud158\ud36e\u4c2b\u5db4\u8308, p0:Object, var_6_69:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0), aconstnull:Object()))
        }
        
        return:Object(aconstnull:Object())
    }
    
    public static boolean \u960f\u9033\ud158\u6c56\u9033\u4bc8(java.lang.Object p0, java.lang.Class p1, java.lang.Class p2, java.lang.Object p3) {
        var_4_61 : int
        var_6_68 : \u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0
        var_4_A7 : int
        stack_D4_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_4_61 = and:int(ldc:int(1686014388), ldc:int(-1382089282))
        var_6_68 = invokestatic:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\ud171\u647c\u156b\u516c\u3d64\u8709, p1:Class, p2:Class)
        
        if (cmpne:boolean(var_6_68:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0, aconstnull:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0())) {
            loop {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(16384)), ldc:int(0))) {
                    var_4_A7 = and:int(var_4_61:int, ldc:int(-937176013))
                }
                else {
                    var_4_A7 = and:int(var_4_61:int, ldc:int(211729399))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::\u7e3f\ubb2b\u7e3f\u446c\u97b7\ucfaf, var_6_68:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0))) {
                        stack_D4_0 = and:int(ldc:int(6952), ldc:int(-6953))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_A7:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_A7 = and:int(var_4_A7:int, ldc:int(379572709))
                    stack_D4_0 = invokestatic:boolean[expected:int](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u0b8e\u527a\u0a06\u76bc\u624e\u4e72, p0:Object, var_6_68:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0, p3:Object)
                    looporswitchbreak()
                }
                
                var_4_61 = and:int(var_4_A7:int, ldc:int(1142659233))
            }
            
            return:boolean(stack_D4_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(13037), ldc:int(-29424)))
    }
    
    public static boolean \u960f\u9033\ud158\u6c56\u9033\u4bc8(java.lang.Object p0, java.lang.Class p1, java.lang.Class p2, int p3, java.lang.Object p4) {
        var_5_61 : int
        var_7_69 : \u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0
        var_5_AA : int
        stack_D9_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_5_61 = and:int(ldc:int(-1646389916), ldc:int(1002354556))
        var_7_69 = invokestatic:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\ud171\u647c\u156b\u516c\u3d64\u8709, p1:Class, p2:Class, p3:int)
        
        if (cmpne:boolean(var_7_69:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0, aconstnull:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0())) {
            loop {
                if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(32)), ldc:int(0))) {
                    var_5_AA = and:int(var_5_61:int, ldc:int(-815007698))
                }
                else {
                    var_5_AA = and:int(var_5_61:int, ldc:int(397122797))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::\u7e3f\ubb2b\u7e3f\u446c\u97b7\ucfaf, var_7_69:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0))) {
                        stack_D9_0 = and:int(ldc:int(18459), ldc:int(-22684))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_AA:int, ldc:int(16777216)), ldc:int(0))) {
                    var_5_AA = and:int(var_5_AA:int, ldc:int(357302254))
                    stack_D9_0 = invokestatic:boolean[expected:int](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u0b8e\u527a\u0a06\u76bc\u624e\u4e72, p0:Object, var_7_69:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0, p4:Object)
                    looporswitchbreak()
                }
                
                var_5_61 = and:int(var_5_AA:int, ldc:int(-690804038))
            }
            
            return:boolean(stack_D9_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(21282), ldc:int(-21299)))
    }
    
    public static \u36d3\u9033\u6b0d\u983f\u8d90.\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0 \ud171\u647c\u156b\u516c\u3d64\u8709(java.lang.Class p0, java.lang.Class p1) {
        var_4_67 : Field
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_4_67 = invokestatic:Field(\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\u927d\ud12e\u6bb9\u416d\u8308\u3e75, p0:Class, p1:Class)
        
        if (cmpne:boolean(var_4_67:Field, aconstnull:Field())) {
            return:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(initobject:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::<init>, initobject:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::<init>, p0:Class), invokevirtual:String(Field::getName, var_4_67:Field)))
        }
        
        return:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(aconstnull:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0())
    }
    
    public static \u36d3\u9033\u6b0d\u983f\u8d90.\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0 \ud171\u647c\u156b\u516c\u3d64\u8709(java.lang.Class p0, java.lang.Class p1, int p2) {
        var_5_68 : Field
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_5_68 = invokestatic:Field(\u6b5f\u7049\ucb79\u6c52\u3a62\u965f::\u927d\ud12e\u6bb9\u416d\u8308\u3e75, p0:Class, p1:Class, p2:int)
        
        if (cmpne:boolean(var_5_68:Field, aconstnull:Field())) {
            return:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(initobject:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::<init>, initobject:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::<init>, p0:Class), invokevirtual:String(Field::getName, var_5_68:Field)))
        }
        
        return:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(aconstnull:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0())
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u47c2\ufe34\ub8be\u69d9\u5d20\u71ae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68A : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_695 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_68A = and:int(ldc:int(-1924650459), ldc:int(-1880474627))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\u7049\ucb79\u6c52\u3a62\u965f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(-1800768174))
        }
        else {
            var_3_68A = and:int(var_3_68A:int, ldc:int(-321049739))
            var_5_8A = and:int(ldc:int(-293), ldc:int(292))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5606), ldc:int(4581)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_68A:int, ldc:int(-1929715721))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(6658), ldc:int(6659)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(1794), ldc:int(1795)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_68A = and:int(var_3_E2:int, ldc:int(-1379340793))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(579), ldc:int(17681)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-592862769))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-715596702))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-483737977))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-478806609))
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-705475374))
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-856020227))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0594)
                            }
                            
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1694049668))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1459371962))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(265135918))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(848223324))
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-763541669))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-588370099))
                        var_11_F3 = and:int(ldc:int(-6952), ldc:int(4903))
                        goto(Label_1547)
                    }
                    
                    Label_0594:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1281705135))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-177143021))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(347635972))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(606643810))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(287548187))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1352958313))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0723:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(448264192))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-816709758))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1875305618))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1351378020))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-807682379))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0848:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1175415000))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1716099772))
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-308271222))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(125221239))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1661080939))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(16395), ldc:int(10257))
                                goto(Label_1130)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-848551643))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1342091053))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1182727074))
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(794721686))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1494788500))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1662403825))
                        var_11_F3 = and:int(ldc:int(-27908), ldc:int(27907))
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1080337949))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1384134231))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1755771869))
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(827013409))
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1773758147))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-374504902))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-313786531))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1401)
                            }
                        }
                    }
                    
                    Label_1270:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1501280260))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(725392603))
                            goto(Label_1130)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-300257747))
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1441671307))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1630700787))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                            goto(Label_1547)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1401:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-715319616))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(648237868))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2095077041))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1422785191))
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(960052040))
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1674339890))
                        loopcontinue()
                    }
                    
                    var_3_68A = and:int(var_3_68A:int, ldc:int(-1394832793))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1547:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_695 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1558:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1851064322))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1204664498))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1031135388))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-860902628))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-2094964378))
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1132970129))
                        var_17_695 = add:int(var_16_121:int, and:int(ldc:int(10849), ldc:int(16389)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68A = and:int(var_3_68A:int, ldc:int(-1610659211))
                
                if (cmple:boolean(var_5_8A = var_17_695:int, sub:int(var_6_91:int, xor:int(ldc:int(-32716), ldc:int(-32715))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(119644818))
            goto(Label_0108)
        }
    }
}
