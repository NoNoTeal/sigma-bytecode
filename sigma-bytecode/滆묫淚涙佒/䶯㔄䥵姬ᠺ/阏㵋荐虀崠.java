public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u960f\u3d4b\u8350\u8640\u5d20 {
    public void \u960f\u3d4b\u8350\u8640\u5d20() {
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
            invokespecial:Object(Object::<init>, this:\u960f\u3d4b\u8350\u8640\u5d20)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u47c2\u2dcc\u12cb\ud171\u8c8a.\u56bd\u88c5\u3e75\u3dd3\u9033 \u760c\u6ec6\ucfaf\uf9c5\u3dd3(java.lang.reflect.Method p0) {
        var_1_5F : int
        var_4_7F : String
        var_5_90 : Lookup
        stack_D8_0 : \u56bd\u88c5\u3e75\u3dd3\u9033 [generated]
        var_3_DD : Throwable
        
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
        var_1_5F = and:int(ldc:int(-1823438054), ldc:int(-1704088609))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-19280546))
            invokevirtual:Class<?>(Method::getReturnType, p0:Method)
            var_1_5F = and:int(var_1_5F:int, ldc:int(-20534306))
            var_4_7F = invokevirtual:String(Method::getName, loadelement:Method(invokevirtual:Method[](Class<T>::getDeclaredMethods, ldc:Class<\u56bd\u88c5\u3e75\u3dd3\u9033>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u56bd\u88c5\u3e75\u3dd3\u9033.class)), and:int(ldc:int(496), ldc:int(-9726))))
            var_1_5F = and:int(var_1_5F:int, ldc:int(-1829589190))
            var_5_90 = invokevirtual:Lookup(Lookup::in, invokestatic:Lookup(MethodHandles::lookup), invokevirtual:Class<?>(Method::getDeclaringClass, p0:Method))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1964757983))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-211559522))
                    invokestatic:void(\u960f\u3d4b\u8350\u8640\u5d20::\uc87f\u416d\u4ab3\u1833\u9a18, var_5_90:Lookup)
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(691107839))
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(-1161045026))
            stack_D8_0 = checkcast:\u56bd\u88c5\u3e75\u3dd3\u9033(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u56bd\u88c5\u3e75\u3dd3\u9033.class, invokestatic:\u56bd\u88c5\u3e75\u3dd3\u9033(\u960f\u3d4b\u8350\u8640\u5d20::\u4c2b\u8df4\u392e\u88c5\u647c, p0:Method, var_5_90:Lookup, ldc:Class<\u56bd\u88c5\u3e75\u3dd3\u9033>(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u56bd\u88c5\u3e75\u3dd3\u9033.class), var_4_7F:String, and:int[expected:boolean](ldc:int(-9855), ldc:int(1662))))
            var_1_5F = and:int(var_1_5F:int, ldc:int(-671159877))
            return:\u56bd\u88c5\u3e75\u3dd3\u9033(stack_D8_0:\u56bd\u88c5\u3e75\u3dd3\u9033)
        }
        catch (java.lang.Throwable var_3_DD) {
            invokevirtual:void(Throwable::printStackTrace, var_3_DD:Throwable)
            return:\u56bd\u88c5\u3e75\u3dd3\u9033(aconstnull:\u56bd\u88c5\u3e75\u3dd3\u9033())
        }
    }
    
    private static T \u4c2b\u8df4\u392e\u88c5\u647c(java.lang.reflect.Method p0, java.lang.invoke.MethodHandles.Lookup p1, java.lang.Class<T> p2, java.lang.String p3, boolean p4) {
        var_5_61 : int
        stack_8B_0 : MethodHandle [generated]
        var_7_8B : MethodHandle
        var_8_92 : MethodType
        
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
            var_5_61 = and:int(ldc:int(-1686233067), ldc:int(-575103043))
            
            if (logicalnot:boolean(p4:boolean)) {
                var_5_61 = and:int(var_5_61:int, ldc:int(1675199167))
                stack_8B_0 = invokevirtual:MethodHandle(Lookup::unreflect, p1:Lookup, p0:Method)
            }
            else {
                stack_8B_0 = invokevirtual:MethodHandle(Lookup::unreflectSpecial, p1:Lookup, p0:Method, invokevirtual:Class<?>(Method::getDeclaringClass, p0:Method))
            }
            
            var_7_8B = stack_8B_0:MethodHandle
            var_8_92 = invokevirtual:MethodType(MethodHandle::type, var_7_8B:MethodHandle)
            return:T(invokevirtual:Object(MethodHandle::invoke, invokevirtual:MethodHandle(CallSite::getTarget, invokestatic:CallSite(\u960f\u3d4b\u8350\u8640\u5d20::\uc87f\ub70c\uc87f\ubb2b\u0c95, p3:String, p1:Lookup, var_7_8B:MethodHandle, var_8_92:MethodType, invokestatic:MethodType(\u960f\u3d4b\u8350\u8640\u5d20::\u8640\u4179\u8df4\u759a\u6c52, p0:Method, var_8_92:MethodType), p2:Class<T>))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.invoke.MethodType \u8640\u4179\u8df4\u759a\u6c52(java.lang.reflect.Method p0, java.lang.invoke.MethodType p1) {
        var_2_5F : int
        var_4_67 : boolean
        stack_8D_0 : MethodType [generated]
        var_2_164 : int
        var_5_8D : MethodType
        var_6_93 : Class<?>[]
        var_7_9C : int
        stack_17F_0 : MethodType [generated]
        stack_17F_1 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1878055588), ldc:int(-276751448))
            var_4_67 = invokestatic:boolean(Modifier::isStatic, invokevirtual:int(Method::getModifiers, p0:Method))
            
            if (logicalnot:boolean(var_4_67:boolean)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2007259872))
                stack_8D_0 = invokevirtual:MethodType(MethodType::changeParameterType, p1:MethodType, and:int(ldc:int(-9891), ldc:int(9378)), ldc:Class<Object>(java.lang.Object.class))
            }
            else {
                stack_8D_0 = p1:MethodType
            }
            
            var_2_164 = and:int(var_2_5F:int, ldc:int(-271582546))
            var_5_8D = stack_8D_0:MethodType
            var_6_93 = invokevirtual:Class<?>[](Method::getParameterTypes, p0:Method)
            var_7_9C = and:int(ldc:int(-4232), ldc:int(4231))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0309)
                }
                
                if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_164 = and:int(var_2_164:int, ldc:int(1902678688))
                    goto(Label_0263)
                }
                
                if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_164 = and:int(var_2_164:int, ldc:int(1922309785))
                }
                else {
                    var_2_164 = and:int(var_2_164:int, ldc:int(1740356579))
                    
                    if (cmplt:boolean(var_7_9C:int, arraylength:int(var_6_93:Class<?>[]))) {
                        if (logicalnot:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Object>(java.lang.Object.class), loadelement:Class<?>(var_6_93:Class<?>[], var_7_9C:int)))) {
                            goto(Label_0309)
                        }
                        
                        stack_17F_0 = var_5_8D:MethodType
                        
                        if (logicalnot:boolean(var_4_67:boolean)) {
                            var_2_164 = and:int(var_2_164:int, ldc:int(-137307397))
                            stack_17F_1 = add:int(var_7_9C:int, and:int(ldc:int(15), ldc:int(2369)))
                        }
                        else {
                            stack_17F_1 = var_7_9C:int
                        }
                        
                        var_2_164 = and:int(var_2_164:int, ldc:int(-269557842))
                        var_5_8D = invokevirtual:MethodType(MethodType::changeParameterType, stack_17F_0:MethodType, stack_17F_1:int, ldc:Class<Object>(java.lang.Object.class))
                        goto(Label_0309)
                    }
                }
                
                Label_0208:
                
                if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0309)
                }
                
                if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_164 = and:int(var_2_164:int, ldc:int(978356217))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_164 = and:int(var_2_164:int, ldc:int(-728578992))
                        loopcontinue()
                    }
                    
                    var_2_164 = and:int(var_2_164:int, ldc:int(1743084222))
                    
                    if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Object>(java.lang.Object.class), invokevirtual:Class<?>(MethodType::returnType, var_5_8D:MethodType))) {
                        var_5_8D = invokevirtual:MethodType(MethodType::changeReturnType, var_5_8D:MethodType, ldc:Class<Object>(java.lang.Object.class))
                    }
                }
                
                Label_0263:
                
                if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0208)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_164:int, ldc:int(512)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0309:
                
                if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0263)
                }
                
                if (cmpne:boolean(and:int(var_2_164:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_2_164:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_164 = and:int(var_2_164:int, ldc:int(-407470427))
                inc:int(var_7_9C, ldc:int(1))
            }
            
            return:MethodType(var_5_8D:MethodType)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.invoke.CallSite \uc87f\ub70c\uc87f\ubb2b\u0c95(java.lang.String p0, java.lang.invoke.MethodHandles.Lookup p1, java.lang.invoke.MethodHandle p2, java.lang.invoke.MethodType p3, java.lang.invoke.MethodType p4, java.lang.Class<?> p5) {
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
            return:CallSite(invokestatic:CallSite(LambdaMetafactory::metafactory, p1:Lookup, p0:String, invokestatic:MethodType(MethodType::methodType, p5:Class<?>), p4:MethodType, p2:MethodHandle, p3:MethodType))
        }
        
        goto(Label_0006)
    }
    
    public static void \uc87f\u416d\u4ab3\u1833\u9a18(java.lang.invoke.MethodHandles.Lookup p0) {
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
            invokevirtual:void(Field::set, invokestatic:Field(\u960f\u3d4b\u8350\u8640\u5d20::\u59ec\u76bc\uf9c5\uc910\ua3b4), p0:Lookup[expected:Object], invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(15)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.reflect.Field \u59ec\u76bc\uf9c5\uc910\ua3b4() {
        var_0_5F : int
        var_2_7B : Field
        var_3_97 : Field
        
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
            var_0_5F = and:int(ldc:int(1604303632), ldc:int(-768625669))
            
            if (logicalor:boolean(cmpeq:boolean(getstatic:Field(\u960f\u3d4b\u8350\u8640\u5d20::\u3504\u8413\u71f1\u4d85\ud4fe), aconstnull:Field()), logicalnot:boolean(invokevirtual:boolean(AccessibleObject::isAccessible, getstatic:Field[expected:AccessibleObject](\u960f\u3d4b\u8350\u8640\u5d20::\u3504\u8413\u71f1\u4d85\ud4fe))))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(2049678334))
                var_2_7B = invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<Field>(java.lang.reflect.Field.class), loadelement:String(getstatic:String[](\u960f\u3d4b\u8350\u8640\u5d20::\u6bb9\u3bd6\u0c95\u6c52\u3dd3), and:int(ldc:int(-4483), ldc:int(4482))))
                invokevirtual:void(AccessibleObject::setAccessible, var_2_7B:Field[expected:AccessibleObject], and:int[expected:boolean](ldc:int(75), ldc:int(8721)))
                var_3_97 = invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<Lookup>(java.lang.invoke.MethodHandles.Lookup.class), loadelement:String(getstatic:String[](\u960f\u3d4b\u8350\u8640\u5d20::\u6bb9\u3bd6\u0c95\u6c52\u3dd3), xor:int(ldc:int(2117), ldc:int(2116))))
                invokevirtual:void(AccessibleObject::setAccessible, var_3_97:Field[expected:AccessibleObject], xor:int[expected:boolean](ldc:int(4358), ldc:int(4359)))
                invokevirtual:void(Field::setInt, var_2_7B:Field, var_3_97:Field[expected:Object], and:int(invokevirtual:int(Field::getModifiers, var_3_97:Field), ldc:int(-17)))
                putstatic:Field(\u960f\u3d4b\u8350\u8640\u5d20::\u3504\u8413\u71f1\u4d85\ud4fe, var_3_97:Field)
            }
            
            return:Field(getstatic:Field(\u960f\u3d4b\u8350\u8640\u5d20::\u3504\u8413\u71f1\u4d85\ud4fe))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_1D5_0 : byte[] [generated]
        stack_22B_0 : byte[] [generated]
        expr_6E : int [generated]
        var_4_14D : int
        var_3_152 : byte[]
        var_5_153 : int
        var_0_15A : int
        expr_164 : byte [generated]
        stack_1A3_2 : byte [generated]
        stack_181_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1C3 : byte[]
        var_5_1C4 : int
        expr_C7 : int [generated]
        var_3_219 : byte[]
        var_5_21A : int
        expr_231 : byte [generated]
        var_3_F8 : String
        stack_146_0 : String[] [generated]
        expr_10A : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(-864864013), ldc:int(788476923))
            expr_68 = stack_9C_0 = stack_9E_0 = stack_C5_0 = stack_C7_0 = stack_EC_0 = stack_1D5_0 = stack_22B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("xA4yEvSMABA4Euwa6A76CAgMIz48HQ=="))
            expr_6E = arraylength:int(expr_68:byte[])
            
            if (cmpne:boolean(expr_6E:int, ldc:int(0))) {
                var_4_14D = expr_6E:int
                var_3_152 = newarray:byte[](byte.class, expr_6E:int)
                var_5_153 = expr_6E:int
                
                loop {
                    var_0_15A = and:int(var_0_61:int, ldc:int(1048001131))
                    var_5_153 = add:int(var_5_153:int, ldc:int(-1))
                    expr_164 = stack_1A3_2 = loadelement(expr_68, var_5_153)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_153:int, ldc:int(3)), neg:int(var_4_14D:int)), ldc:int(0))) {
                        stack_1A3_2 = stack_181_0 = add:byte(expr_164:byte, loadelement:byte(var_3_152:byte[], add:int(var_5_153:int, ldc:int(3))))
                        goto(Label_0401)
                    }
                    
                    Label_0369:
                    
                    if (cmpne:boolean(and:int(var_0_15A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_0_15A = and:int(var_0_15A:int, ldc:int(-806322554))
                        stack_1A3_2 = stack_181_0 = add:byte(expr_164:byte, ldc:byte(3))
                    }
                    
                    Label_0401:
                    
                    if (cmpeq:boolean(and:int(var_0_15A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0369)
                    }
                    
                    var_0_61 = and:int(var_0_15A:int, ldc:int(-1359580950))
                    storeelement:byte(var_3_152:byte[], var_5_153:int, stack_1A3_2:byte)
                    
                    if (cmpne:boolean(var_5_153:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C5_0 = stack_C7_0 = stack_EC_0 = stack_1D5_0 = stack_22B_0 = var_3_152:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1485151286))
                    goto(Label_0204)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1927604517))
                }
                else {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1819934550))
                    var_2_9C = stack_9C_0:byte[]
                    expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                        var_3_1C3 = newarray:byte[](byte.class, expr_A0:int)
                        var_5_1C4 = expr_A0:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(-537510322))
                            var_5_1C4 = add:int(var_5_1C4:int, ldc:int(-1))
                            storeelement:byte(var_3_1C3:byte[], var_5_1C4:int, add:int(shl:int(loadelement:byte(stack_1D5_0:byte[], var_5_1C4:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1C4:int, xor:int(ldc:int(18), ldc:int(19)))), ldc:int(5)), xor:int(ldc:int(20552), ldc:int(20559)))))
                            
                            if (cmpne:boolean(var_5_1C4:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_9E_0 = stack_9C_0 = stack_C5_0 = stack_C7_0 = stack_EC_0 = stack_1D5_0 = stack_22B_0 = var_3_1C3:byte[]
                    }
                }
                
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_61:int, ldc:int(256)), ldc:int(0))) {
                        var_0_61 = and:int(var_0_61:int, ldc:int(783411653))
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(1014315722))
                    expr_C7 = arraylength:int(stack_C7_0:byte[])
                    
                    if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                        var_3_219 = newarray:byte[](byte.class, expr_C7:int)
                        var_5_21A = expr_C7:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(1333080395))
                            var_5_21A = add:int(var_5_21A:int, ldc:int(-1))
                            expr_231 = xor:byte(add:byte(loadelement:byte(stack_22B_0:byte[], var_5_21A:int), ldc:byte(43)), ldc:byte(19))
                            storeelement:byte(var_3_219:byte[], var_5_21A:int, or:int(and:int(shl:int(expr_231:byte, xor:int(ldc:int(-24511), ldc:int(-24507))), ldc:int(-16)), and:int(shr:int(expr_231:byte[expected:int], and:int(ldc:int(16390), ldc:int(5444))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_5_21A:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_9E_0 = stack_9C_0 = stack_C5_0 = stack_C7_0 = stack_EC_0 = stack_1D5_0 = stack_22B_0 = var_3_219:byte[]
                    }
                }
                
                Label_0204:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1733311622))
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_F8 = initobject:String(String::<init>, stack_EC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_146_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(530), ldc:int(3398)))
            expr_10A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8711), ldc:int(8709)))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(16512), ldc:int(16513)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(3400), ldc:int(-20429)), xor:int(ldc:int(391), ldc:int(395))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(-4670), ldc:int(4669)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(4102), ldc:int(4106)), and:int(ldc:int(3253), ldc:int(16925))))
            putstatic:String[](\u960f\u3d4b\u8350\u8640\u5d20::\u6bb9\u3bd6\u0c95\u6c52\u3dd3, expr_10A:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud7e8\ud36e\u9033\u873d\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_675 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_680 : int
        
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
        var_3_675 = and:int(ldc:int(255784341), ldc:int(187020631))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u960f\u3d4b\u8350\u8640\u5d20[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_675 = and:int(var_3_675:int, ldc:int(1512424703))
            var_5_80 = and:int(ldc:int(-12614), ldc:int(12613))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(930), ldc:int(-931)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_675:int, ldc:int(-340370795))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(6945), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(4241), ldc:int(2627)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_675 = and:int(var_3_D0:int, ldc:int(736930839))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(4420), ldc:int(4421)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-628154123))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(192785161))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1639715040))
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-791481987))
                    }
                    else {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1807545917))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0570)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0398:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-892306209))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-861180607))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(731816929))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-2004766829))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(75408940))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-537481805))
                            var_11_E1 = and:int(ldc:int(4270), ldc:int(-4271))
                            goto(Label_1542)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0570:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-337177449))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1461663072))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-913396624))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1433034231))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(58619850))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-2065261643))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1897644239))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(107382481))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0570)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1917690551))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(1878507959))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-596955159))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(2045101407))
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(502025068))
                            goto(Label_0570)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-64542920))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1964045185))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(13337), ldc:int(487))
                                goto(Label_1106)
                            }
                        }
                    }
                    
                    Label_0938:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1321829402))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(506898225))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(2041998806))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1067320263))
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-530497629))
                            goto(Label_0570)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(1333260917))
                        var_11_E1 = and:int(ldc:int(1293), ldc:int(-1838))
                    }
                    
                    Label_1106:
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1693662278))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1568421856))
                            goto(Label_0938)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1037183963))
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1490040603))
                            goto(Label_0570)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-704803539))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(1004884473))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1388)
                            }
                        }
                    }
                    
                    Label_1236:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1729236381))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(2026711442))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1106)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0938)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1631644996))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1580078810))
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0570)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(32)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(983091914))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1352711826))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-77272193))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1542)
                    }
                    
                    Label_1388:
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1456426403))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-86995814))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(32)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1662011728))
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1149639753))
                        goto(Label_0570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1711302489))
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1085560267))
                        loopcontinue()
                    }
                    
                    var_3_675 = and:int(var_3_675:int, ldc:int(-831763977))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1542:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_680 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1553:
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1496856673))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1024994294))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-916931573))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-26284719))
                        var_17_680 = add:int(var_16_10F:int, and:int(ldc:int(16687), ldc:int(3585)))
                        looporswitchbreak()
                    }
                }
                
                var_3_675 = and:int(var_3_675:int, ldc:int(-84111439))
                
                if (cmple:boolean(var_5_80 = var_17_680:int, sub:int(var_6_87:int, xor:int(ldc:int(6288), ldc:int(6289))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
