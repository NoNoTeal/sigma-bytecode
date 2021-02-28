public class \u12b2\u4e72\u8df4\u67e9\u67e9.\ub102\u8753\u0a06\u62da\u74b1 {
    private static boolean \u3d4b\u4c2b\u64f2\u5d20\u5db4\u6b0d(java.lang.reflect.Method p0) {
        var_1_5F : int
        var_3_64 : Class<?>[]
        var_4_67 : int
        var_5_70 : int
        var_6_93 : Class<?>
        
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
        var_1_5F = and:int(ldc:int(912287219), ldc:int(1370516479))
        var_3_64 = invokevirtual:Class<?>[](Method::getParameterTypes, p0:Method)
        var_4_67 = arraylength:int(var_3_64:Class<?>[])
        var_5_70 = and:int(ldc:int(-26640), ldc:int(26631))
        
        loop {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-131449865))
            
            if (cmpge:boolean(var_5_70:int, var_4_67:int)) {
                return:boolean(xor:int[expected:boolean](ldc:int(3392), ldc:int(3393)))
            }
            
            var_6_93 = loadelement:Class<?>(var_3_64:Class<?>[], var_5_70:int)
            
            if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(Class<T>::isPrimitive, var_6_93:Class<?>)), cmpne:boolean(var_6_93:Class<String>, ldc:Class<String>(java.lang.String.class)))) {
                return:boolean(and:int[expected:boolean](ldc:int(30356), ldc:int(-30453)))
            }
            
            inc:int(var_5_70, ldc:int(1))
        }
    }
    
    public static boolean \ud7e8\u4179\u47c2\u8d90\uc9f6\u3c25(java.lang.reflect.Method p0) {
        var_1_94 : int
        stack_CC_0 : int [generated]
        
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
        var_1_94 = and:int(ldc:int(-417074253), ldc:int(-10797121))
        
        if (invokevirtual:boolean(Class<T>::isAnnotationPresent, invokevirtual:Class<?>(Method::getDeclaringClass, p0:Method), ldc:Class<\u836c\u6c52\u40a9\uc2e8\ud36e>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u836c\u6c52\u40a9\uc2e8\ud36e.class))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_94:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_94 = and:int(var_1_94:int, ldc:int(431188223))
                }
                else {
                    var_1_94 = and:int(var_1_94:int, ldc:int(-1324199))
                    
                    if (invokevirtual:boolean(AccessibleObject::isAnnotationPresent, p0:Method[expected:AccessibleObject], ldc:Class<\u47c2\ub113\ub18d\u51fa\u0800>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u47c2\ub113\ub18d\u51fa\u0800.class))) {
                        if (invokestatic:boolean(\ub102\u8753\u0a06\u62da\u74b1::\u3d4b\u4c2b\u64f2\u5d20\u5db4\u6b0d, p0:Method)) {
                            stack_CC_0 = xor:int(ldc:int(-32223), ldc:int(-32224))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_94:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_94 = and:int(var_1_94:int, ldc:int(-542190599))
                    stack_CC_0 = and:int(ldc:int(-1699), ldc:int(1698))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_CC_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(132), ldc:int(-133)))
    }
    
    public void \ub102\u8753\u0a06\u62da\u74b1(java.lang.reflect.Method p0, java.lang.Object p1) {
        expr_77 : String [generated]
        
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
            invokespecial:\u69d9\ua3b4\uf9c5\ua3b4\u6d69(\u69d9\ua3b4\uf9c5\ua3b4\u6d69::<init>, this:\ub102\u8753\u0a06\u62da\u74b1)
            putfield:Method(\ub102\u8753\u0a06\u62da\u74b1::\u7ce1\ud158\u927d\u5f50\uc29a, this:\ub102\u8753\u0a06\u62da\u74b1, p0:Method)
            putfield:Object(\ub102\u8753\u0a06\u62da\u74b1::\uceb8\u446c\uc31c\uc910\ubff1, this:\ub102\u8753\u0a06\u62da\u74b1, p1:Object)
            expr_77 = invokeinterface:String(\u47c2\ub113\ub18d\u51fa\u0800::\u647c\u8753\ub171\u6cfe\ua562\u3d4b, checkcast:\u47c2\ub113\ub18d\u51fa\u0800(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u47c2\ub113\ub18d\u51fa\u0800.class, invokevirtual:\u47c2\ub113\ub18d\u51fa\u0800(Method::getAnnotation, p0:Method, ldc:Class<\u47c2\ub113\ub18d\u51fa\u0800>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u47c2\ub113\ub18d\u51fa\u0800.class))))
            putfield:String(\ub102\u8753\u0a06\u62da\u74b1::\u983f\u7e3f\u4e72\u6cfe\u6435, this:\ub102\u8753\u0a06\u62da\u74b1, expr_77:String)
            
            if (invokestatic:boolean(\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u56bd\u0800\ub171\uc31c\u99f7\uc9f6, expr_77:String)) {
                putfield:String(\ub102\u8753\u0a06\u62da\u74b1::\u983f\u7e3f\u4e72\u6cfe\u6435, this:\ub102\u8753\u0a06\u62da\u74b1, invokevirtual:String(Method::getName, p0:Method))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Object \u624e\u61a4\ubb2b\u4c2b\u98a4\u873d(java.lang.String[] p0, int p1, java.lang.Class p2) {
        var_4_61 : int
        
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
        var_4_61 = and:int(ldc:int(-906864116), ldc:int(-107135202))
        
        if (cmpge:boolean(p1:int, arraylength:int(p0:String[]))) {
            return:Object(aconstnull:Object())
        }
        
        loop {
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1055740170))
                goto(Label_1118)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_1021)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(12489490))
                goto(Label_0883)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0765)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1188591561))
                goto(Label_0617)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(174676992))
                goto(Label_0479)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0351)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1427670873))
            }
            else {
                var_4_61 = and:int(var_4_61:int, ldc:int(-573432999))
                
                if (cmpeq:boolean(p2:Class<Byte>, getstatic:Class<Byte>(Byte::TYPE))) {
                    return:Object(invokestatic:Byte[expected:Object](Byte::valueOf, invokestatic:byte(Byte::parseByte, loadelement:String(p0:String[], p1:int))))
                }
            }
            
            Label_0233:
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1122478192))
                goto(Label_1118)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_1021)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0883)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0765)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-626627383))
                goto(Label_0617)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(605114135))
                goto(Label_0479)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(64)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(524288)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-435994311))
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-1946411098))
                
                if (cmpeq:boolean(p2:Class<Character>, getstatic:Class<Character>(Character::TYPE))) {
                    return:Object(invokestatic:Character[expected:Object](Character::valueOf, invokevirtual:char(String::charAt, loadelement:String(p0:String[], p1:int), and:int(ldc:int(-5028), ldc:int(4643)))))
                }
            }
            
            Label_0351:
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-934186666))
                goto(Label_1118)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(512)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(2070350495))
                goto(Label_1021)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0883)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0765)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-329659794))
                goto(Label_0617)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(640727402))
            }
            else {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1732690334))
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-1984795745))
                
                if (cmpeq:boolean(p2:Class<Short>, getstatic:Class<Short>(Short::TYPE))) {
                    return:Object(invokestatic:Short[expected:Object](Short::valueOf, invokestatic:short(Short::parseShort, loadelement:String(p0:String[], p1:int))))
                }
            }
            
            Label_0479:
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_1118)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(2018180175))
                goto(Label_1021)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-196590579))
                goto(Label_0883)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1269194926))
                goto(Label_0765)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1999832783))
            }
            else {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-2037889619))
                    goto(Label_0351)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1478614949))
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-101594139))
                
                if (cmpeq:boolean(p2:Class<Integer>, getstatic:Class<Integer>(Integer::TYPE))) {
                    return:Object(invokestatic:Integer[expected:Object](Integer::valueOf, invokestatic:int(Integer::parseInt, loadelement:String(p0:String[], p1:int))))
                }
            }
            
            Label_0617:
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_1118)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32768)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1314006688))
                goto(Label_1021)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-618885777))
                goto(Label_0883)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(658120493))
            }
            else {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-741145699))
                    goto(Label_0479)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1115500205))
                    goto(Label_0351)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(64)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1490484491))
                    goto(Label_0233)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1988032003))
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-369403321))
                
                if (cmpeq:boolean(p2:Class<Long>, getstatic:Class<Long>(Long::TYPE))) {
                    return:Object(invokestatic:Long[expected:Object](Long::valueOf, invokestatic:long(Long::parseLong, loadelement:String(p0:String[], p1:int))))
                }
            }
            
            Label_0765:
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_1118)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_1021)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32768)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1582007207))
            }
            else {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-2129998212))
                    goto(Label_0617)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0479)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0351)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1968176383))
                    goto(Label_0233)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-627157314))
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-38793516))
                
                if (cmpeq:boolean(p2:Class<Float>, getstatic:Class<Float>(Float::TYPE))) {
                    return:Object(invokestatic:Float[expected:Object](Float::valueOf, invokestatic:float(Float::parseFloat, loadelement:String(p0:String[], p1:int))))
                }
            }
            
            Label_0883:
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(64)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1376114665))
                goto(Label_1118)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1428373430))
            }
            else {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(1449781444))
                    goto(Label_0765)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-590568783))
                    goto(Label_0617)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0479)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-2091881061))
                    goto(Label_0351)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-754784029))
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-1885602037))
                
                if (cmpeq:boolean(p2:Class<Double>, getstatic:Class<Double>(Double::TYPE))) {
                    return:Object(invokestatic:Double[expected:Object](Double::valueOf, invokestatic:double(Double::parseDouble, loadelement:String(p0:String[], p1:int))))
                }
            }
            
            Label_1021:
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8388608)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0883)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0765)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0617)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(512)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-938592635))
                    goto(Label_0479)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0351)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0233)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-507955277))
                    loopcontinue()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-1980015865))
                
                if (cmpne:boolean(p2:Class<String>, ldc:Class<String>(java.lang.String.class))) {
                    if (cmpne:boolean(p2:Class<Object>, ldc:Class<Object>(java.lang.Object.class))) {
                        return:Object(aconstnull:Object())
                    }
                }
            }
            
            Label_1118:
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_1021)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1486960895))
                goto(Label_0883)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(32863152))
                goto(Label_0765)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0617)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1526466694))
                goto(Label_0479)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0351)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1283397121))
                goto(Label_0233)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                return:Object(loadelement:String[expected:Object](p0:String[], p1:int))
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-73246744))
        }
    }
    
    public void \u93a2\u92ee\u9255\uc2e8\u9937\uc87f(java.lang.String p0, java.lang.String[] p1) {
        var_3_233 : int
        var_5_100 : Object[]
        var_6_10F : int
        var_5_23B : Object
        stack_23B_0 : Object [generated]
        
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
            var_3_233 = and:int(ldc:int(-464134138), ldc:int(-454187611))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_233 = and:int(var_3_233:int, ldc:int(-1101666274))
                        
                        if (cmpne:boolean(arraylength:int(p1:String[]), ldc:int(0))) {
                            var_5_100 = newarray:Object[](java.lang.Object.class, arraylength:int(p1:String[]))
                            var_3_233 = and:int(var_3_233:int, ldc:int(-1211113051))
                            var_6_10F = and:int(ldc:int(-5319), ldc:int(5318))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(4)), ldc:int(0))) {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(1433817530))
                                    goto(Label_0431)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(4)), ldc:int(0))) {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-699028382))
                                    goto(Label_0382)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_233:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-1350800604))
                                }
                                else {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-970534418))
                                    
                                    if (cmpge:boolean(var_6_10F:int, arraylength:int(var_5_100:Object[]))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_0337:
                                
                                if (cmpne:boolean(and:int(var_3_233:int, ldc:int(1)), ldc:int(0))) {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-265576053))
                                    goto(Label_0431)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(262144)), ldc:int(0))) {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-559152500))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_3_233:int, ldc:int(134217728)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-171651185))
                                }
                                
                                Label_0382:
                                
                                if (cmpne:boolean(and:int(var_3_233:int, ldc:int(32768)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_3_233:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_0337)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(262144)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-1378487953))
                                    storeelement:Object(var_5_100:Object[], var_6_10F:int, invokespecial:Object(\ub102\u8753\u0a06\u62da\u74b1::\u624e\u61a4\ubb2b\u4c2b\u98a4\u873d, this:\ub102\u8753\u0a06\u62da\u74b1, p1:String[], var_6_10F:int, loadelement:Class<?>(invokevirtual:Class<?>[](Method::getParameterTypes, getfield:Method(\ub102\u8753\u0a06\u62da\u74b1::\u7ce1\ud158\u927d\u5f50\uc29a, this:\ub102\u8753\u0a06\u62da\u74b1)), var_6_10F:int)))
                                }
                                
                                Label_0431:
                                
                                if (cmpne:boolean(and:int(var_3_233:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(2064305085))
                                    goto(Label_0382)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_233:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-1858723300))
                                    goto(Label_0337)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_233:int, ldc:int(4096)), ldc:int(0))) {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-2061323522))
                                }
                                else {
                                    var_3_233 = and:int(var_3_233:int, ldc:int(-2126526563))
                                    inc:int(var_6_10F, ldc:int(1))
                                }
                            }
                            
                            invokevirtual:Object(Method::invoke, getfield:Method(\ub102\u8753\u0a06\u62da\u74b1::\u7ce1\ud158\u927d\u5f50\uc29a, this:\ub102\u8753\u0a06\u62da\u74b1), getfield:Object(\ub102\u8753\u0a06\u62da\u74b1::\uceb8\u446c\uc31c\uc910\ubff1, this:\ub102\u8753\u0a06\u62da\u74b1), var_5_100:Object[])
                            goto(Label_0510)
                        }
                    }
                    
                    Label_0131:
                    
                    if (cmpne:boolean(and:int(var_3_233:int, ldc:int(16)), ldc:int(0))) {
                        var_3_233 = and:int(var_3_233:int, ldc:int(1056923275))
                        goto(Label_0510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_233:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_233 = and:int(var_3_233:int, ldc:int(-161624515))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_233 = and:int(var_3_233:int, ldc:int(-230190402))
                    }
                    
                    Label_0177:
                    
                    if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_233 = and:int(var_3_233:int, ldc:int(1164225227))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_233:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_233 = and:int(var_3_233:int, ldc:int(1461909207))
                            goto(Label_0131)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_233:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_233 = and:int(var_3_233:int, ldc:int(-227240115))
                        invokevirtual:Object(Method::invoke, getfield:Method(\ub102\u8753\u0a06\u62da\u74b1::\u7ce1\ud158\u927d\u5f50\uc29a, this:\ub102\u8753\u0a06\u62da\u74b1), getfield:Object(\ub102\u8753\u0a06\u62da\u74b1::\uceb8\u446c\uc31c\uc910\ubff1, this:\ub102\u8753\u0a06\u62da\u74b1), newarray:Object[](java.lang.Object.class, and:int(ldc:int(1449), ldc:int(-3498))))
                    }
                    
                    Label_0510:
                    
                    if (cmpne:boolean(and:int(var_3_233:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_233 = and:int(var_3_233:int, ldc:int(-1514608150))
                        goto(Label_0177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_233:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_233 = and:int(var_3_233:int, ldc:int(792566468))
                        goto(Label_0131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_233:int, ldc:int(16777216)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_233 = and:int(var_3_233:int, ldc:int(1811580473))
                }
                
                var_3_233 = and:int(var_3_233:int, ldc:int(-1895529747))
            }
            catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException ex_23B) {
                var_5_23B = stack_23B_0:Object
                invokeinterface:void(\u624e\u4f4a\u59ec\uae87\uc29a::\u8413\u718f\u64f2\u120d\u4975, invokevirtual:\u624e\u4f4a\u59ec\uae87\uc29a(\u6b0d\ua068\uc4d2\u5245\u4d85::\u156b\u7e3f\u51fa\u927d\u8bb0, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub102\u8753\u0a06\u62da\u74b1::\u8aa5\ubded\ub18d\u4f4a\u4f52), and:int(ldc:int(1784), ldc:int(-9984)))), invokevirtual:String(Class<T>::getName, invokevirtual:Class<?>(Object::getClass, getfield:Object(\ub102\u8753\u0a06\u62da\u74b1::\uceb8\u446c\uc31c\uc910\ubff1, this:\ub102\u8753\u0a06\u62da\u74b1)))), loadelement:String(getstatic:String[](\ub102\u8753\u0a06\u62da\u74b1::\u8aa5\ubded\ub18d\u4f4a\u4f52), xor:int(ldc:int(-16255), ldc:int(-16256)))), invokevirtual:String(Method::getName, getfield:Method(\ub102\u8753\u0a06\u62da\u74b1::\u7ce1\ud158\u927d\u5f50\uc29a, this:\ub102\u8753\u0a06\u62da\u74b1)))))
                invokevirtual:void(Throwable::printStackTrace, var_5_23B:Object)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u8aa5\ud51e\u3e2a\u494c\u7049\u120d(java.lang.String p0, java.lang.String[] p1) {
        var_3_61 : int
        var_5_6A : StringBuilder
        var_6_73 : int
        
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
            var_3_61 = and:int(ldc:int(761398708), ldc:int(-1346069006))
            var_5_6A = initobject:StringBuilder(StringBuilder::<init>, p0:String)
            var_6_73 = and:int(ldc:int(10501), ldc:int(-10502))
            
            loop {
                Label_0117:
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1452774371))
                    goto(Label_0206)
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1949345960))
                }
                else {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-1252346433))
                    
                    if (cmplt:boolean(var_6_73:int, arraylength:int(p1:String[]))) {
                        if (cmplt:boolean(var_6_73:int, invokevirtual:int(Method::getParameterCount, getfield:Method(\ub102\u8753\u0a06\u62da\u74b1::\u7ce1\ud158\u927d\u5f50\uc29a, this:\ub102\u8753\u0a06\u62da\u74b1)))) {
                            var_3_61 = and:int(var_3_61:int, ldc:int(-77980165))
                            invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, var_5_6A:StringBuilder, loadelement:String(getstatic:String[](\ub102\u8753\u0a06\u62da\u74b1::\u8aa5\ubded\ub18d\u4f4a\u4f52), xor:int(ldc:int(28736), ldc:int(28738)))), loadelement:String(p1:String[], var_6_73:int))
                            inc:int(var_6_73, ldc:int(1))
                            loopcontinue()
                        }
                    }
                }
                
                Label_0164:
                
                while (cmpne:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1480602294))
                        loopcontinue(Label_0117)
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(-136116233))
                    
                    if (cmpge:boolean(var_6_73:int, invokevirtual:int(Method::getParameterCount, getfield:Method(\ub102\u8753\u0a06\u62da\u74b1::\u7ce1\ud158\u927d\u5f50\uc29a, this:\ub102\u8753\u0a06\u62da\u74b1)))) {
                        looporswitchbreak()
                    }
                    
                    invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, var_5_6A:StringBuilder, loadelement:String(getstatic:String[](\ub102\u8753\u0a06\u62da\u74b1::\u8aa5\ubded\ub18d\u4f4a\u4f52), xor:int(ldc:int(-31615), ldc:int(-31613)))), invokestatic:String(\u74b1\uc7fe\ucfaf\ube23\ubf56::\u40a9\u51b2\uae87\ud217\u69d9\u516c, loadelement:Class<?>(invokevirtual:Class<?>[](Method::getParameterTypes, getfield:Method(\ub102\u8753\u0a06\u62da\u74b1::\u7ce1\ud158\u927d\u5f50\uc29a, this:\ub102\u8753\u0a06\u62da\u74b1)), var_6_73:int)))
                    inc:int(var_6_73, ldc:int(1))
                }
                
                Label_0206:
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-209213952))
                    goto(Label_0164)
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_5_6A:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1CE : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9D_0 : byte[] [generated]
        stack_9F_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_EA_0 : byte[] [generated]
        stack_1E1_0 : byte[] [generated]
        stack_24B_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_168 : byte[]
        var_4_169 : int
        expr_9F : int [generated]
        var_5_1B9 : int
        var_3_1BE : byte[]
        var_4_1BF : int
        expr_1E4 : byte [generated]
        var_0_241 : int
        expr_24B : byte [generated]
        stack_27B_2 : byte [generated]
        expr_BD : int [generated]
        var_3_F6 : String
        stack_15F_0 : String[] [generated]
        expr_108 : String[] [generated]
        
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
            var_0_1CE = and:int(ldc:int(-1603756414), ldc:int(-706216190))
            expr_68 = var_2_6C = stack_9D_0 = stack_9F_0 = stack_BB_0 = stack_BD_0 = stack_EA_0 = stack_1E1_0 = stack_24B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AHZCRgNcKB9+CoPn7I/jRRszJznA"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_168 = newarray:byte[](byte.class, expr_70:int)
                var_4_169 = expr_70:int
                
                loop {
                    var_0_1CE = and:int(var_0_1CE:int, ldc:int(-2065580741))
                    var_4_169 = add:int(var_4_169:int, ldc:int(-1))
                    storeelement:byte(var_3_168:byte[], var_4_169:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_169:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_169:int, and:int(ldc:int(1441), ldc:int(8265)))), ldc:int(5)), xor:int(ldc:int(4116), ldc:int(4115)))))
                    
                    if (cmpne:boolean(var_4_169:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9F_0 = stack_9D_0 = stack_BB_0 = stack_BD_0 = stack_EA_0 = stack_1E1_0 = stack_24B_0 = var_3_168:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_1CE:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_1CE = and:int(var_0_1CE:int, ldc:int(57899231))
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_0_1CE:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_1CE = and:int(var_0_1CE:int, ldc:int(-1073840442))
                    goto(Label_0164)
                }
                
                var_0_1CE = and:int(var_0_1CE:int, ldc:int(-629154010))
                expr_9F = arraylength:int(stack_9F_0:byte[])
                
                if (cmpeq:boolean(expr_9F:int, ldc:int(0))) {
                    goto(Label_0164)
                }
                
                var_5_1B9 = expr_9F:int
                var_3_1BE = newarray:byte[](byte.class, expr_9F:int)
                var_4_1BF = expr_9F:int
                Label_0449:
                
                while (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_1CE = and:int(var_0_1CE:int, ldc:int(-1082598173))
                    var_4_1BF = add:int(var_4_1BF:int, ldc:int(-1))
                    expr_1E4 = xor:byte(loadelement:byte(stack_1E1_0:byte[], var_4_1BF:int), ldc:byte(23))
                    storeelement:byte(var_3_1BE:byte[], var_4_1BF:int, add:int(or:int(and:int(shl:int(expr_1E4:byte, and:int(ldc:int(11295), ldc:int(36))), ldc:int(-16)), and:int(shr:int(expr_1E4:byte[expected:int], xor:int(ldc:int(1049), ldc:int(1053))), ldc:int(15))), ldc:int(126)))
                    
                    if (cmpne:boolean(var_4_1BF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_9F_0 = stack_9D_0 = stack_BB_0 = stack_BD_0 = stack_EA_0 = stack_1E1_0 = stack_24B_0 = var_3_1BE:byte[]
                    goto(Label_0164)
                }
                
                var_0_1CE = and:int(var_0_1CE:int, ldc:int(-1211335561))
                Label_0556:
                
                while (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_241 = and:int(var_0_1CE:int, ldc:int(-1780244665))
                    var_4_1BF = add:int(var_4_1BF:int, ldc:int(-1))
                    expr_24B = loadelement:byte(stack_24B_0:byte[], var_4_1BF:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_1BF:int, ldc:int(5)), neg:int(var_5_1B9:int)), ldc:int(0))) {
                        var_0_241 = and:int(var_0_241:int, ldc:int(-571892545))
                        stack_27B_2 = add:byte(expr_24B:byte, ldc:byte(5))
                    }
                    else {
                        stack_27B_2 = add:byte(expr_24B:byte, loadelement:byte(var_3_1BE:byte[], add:int(var_4_1BF:int, ldc:int(5))))
                    }
                    
                    var_0_1CE = and:int(var_0_241:int, ldc:int(1634328122))
                    storeelement:byte(var_3_1BE:byte[], var_4_1BF:int, stack_27B_2:byte)
                    
                    if (cmpne:boolean(var_4_1BF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_9F_0 = stack_9D_0 = stack_BB_0 = stack_BD_0 = stack_EA_0 = stack_1E1_0 = stack_24B_0 = var_3_1BE:byte[]
                    goto(Label_0194)
                }
                
                var_0_1CE = and:int(var_0_1CE:int, ldc:int(-1151143501))
                goto(Label_0449)
                Label_0164:
                
                if (cmpne:boolean(and:int(var_0_1CE:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_1CE = and:int(var_0_1CE:int, ldc:int(-2005614593))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_5_1B9 = expr_BD:int
                        var_3_1BE = newarray:byte[](byte.class, expr_BD:int)
                        var_4_1BF = expr_BD:int
                        goto(Label_0556)
                    }
                }
                
                Label_0194:
                
                if (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_1CE = and:int(var_0_1CE:int, ldc:int(789895213))
                    goto(Label_0164)
                }
                
                if (cmpeq:boolean(and:int(var_0_1CE:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_1CE = and:int(var_0_1CE:int, ldc:int(-993564701))
            }
            
            var_3_F6 = initobject:String(String::<init>, stack_EA_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_15F_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2063), ldc:int(2060)))
            expr_108 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5407), ldc:int(16515)))
            storeelement:String(expr_108:String[], and:int(ldc:int(4742), ldc:int(16698)), invokevirtual:String[expected:String](String::substring, var_3_F6:String, and:int(ldc:int(28172), ldc:int(-28189)), and:int(ldc:int(8465), ldc:int(4297))))
            storeelement:String(expr_108:String[], xor:int(ldc:int(14400), ldc:int(14401)), invokevirtual:String[expected:String](String::substring, var_3_F6:String, and:int(ldc:int(11715), ldc:int(561)), and:int(ldc:int(531), ldc:int(5387))))
            storeelement:String(expr_108:String[], and:int(ldc:int(21254), ldc:int(-21255)), invokevirtual:String[expected:String](String::substring, var_3_F6:String, xor:int(ldc:int(4160), ldc:int(4163)), and:int(ldc:int(1116), ldc:int(4372))))
            putstatic:String[](\ub102\u8753\u0a06\u62da\u74b1::\u8aa5\ubded\ub18d\u4f4a\u4f52, expr_108:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u927d\u3e75\u3dd3\u7af6\u98a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_664 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_66F : int
        
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
        var_3_664 = and:int(ldc:int(-561758864), ldc:int(-1176043684))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub102\u8753\u0a06\u62da\u74b1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8)), ldc:int(0))) {
            var_3_664 = and:int(var_3_664:int, ldc:int(-88637571))
            var_5_81 = and:int(ldc:int(-8921), ldc:int(8904))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21834), ldc:int(-21851)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_664:int, ldc:int(-90784048))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, xor:int(ldc:int(3072), ldc:int(3073)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(-30672), ldc:int(-30671)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_664 = and:int(var_3_D0:int, ldc:int(-1074594188))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-13824), ldc:int(-13823)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1214907880))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-432219876))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-978649747))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-654028591))
                    }
                    else {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-19515398))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0396:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(995180431))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1312472189))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1072800180))
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1467450559))
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-280210505))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1182065966))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1617463340))
                        var_11_E1 = and:int(ldc:int(15248), ldc:int(-15249))
                        goto(Label_1525)
                    }
                    
                    Label_0575:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-187317198))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(848673805))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-723545882))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1204144571))
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-2125756706))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1660946725))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0706:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(475532013))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1958404346))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-696680668))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-942268075))
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-48435544))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(359687228))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1716355332))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0848:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-814980280))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-867279759))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(587274229))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1720388904))
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1977170176))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-608109063))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = xor:int(ldc:int(673), ldc:int(672))
                                goto(Label_1151)
                            }
                        }
                    }
                    
                    Label_0978:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-379308598))
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(64)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-519608810))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1103941826))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1490754020))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(797029116))
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(2012788612))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-590547720))
                        var_11_E1 = and:int(ldc:int(-1957), ldc:int(1956))
                    }
                    
                    Label_1151:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-563720256))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1452628487))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0978)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(127997354))
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1459999855))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1711949965))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1401)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(64)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1906303571))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(909771569))
                            goto(Label_1151)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0978)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-246027075))
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(671775805))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-67716008))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                        goto(Label_1525)
                    }
                    
                    Label_1401:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1536)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(992443766))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1420708897))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1277479122))
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_664 = and:int(var_3_664:int, ldc:int(-87279750))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1525:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1536:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(812862167))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1849541014))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(2031025478))
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(64)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1699987588))
                        var_17_66F = add:int(var_16_10F:int, xor:int(ldc:int(8233), ldc:int(8232)))
                        looporswitchbreak()
                    }
                }
                
                var_3_664 = and:int(var_3_664:int, ldc:int(-89787310))
                
                if (cmple:boolean(var_5_81 = var_17_66F:int, sub:int(var_6_88:int, xor:int(ldc:int(646), ldc:int(647))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
