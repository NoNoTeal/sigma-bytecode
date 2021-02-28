public abstract class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u12cb\u6198\ub18d\u1833\u4cd9\u5db4 {
    public void \u12cb\u6198\ub18d\u1833\u4cd9\u5db4(java.lang.String p0, java.lang.Class<?> p1, java.lang.reflect.Type p2) {
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
            invokespecial:\u9a18\uae87\u5245\u8cae\u0800\uf94d(\u9a18\uae87\u5245\u8cae\u0800\uf94d::<init>, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, p0:String, p1:Class<?>)
            putfield:Type(\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u6d99\u7043\u93a2\u416d\u9af2\u836c, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, p2:Type)
            putfield:boolean(\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u960f\u4975\u8308\ua61f\u98a4\ubcb0, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, ternaryop:int[expected:boolean](cmpne:boolean(p2:Type, aconstnull:Type()), and:int(ldc:int(-25532), ldc:int(17203)), and:int(ldc:int(8449), ldc:int(129))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Class<?>[] \u71f1\ub70c\u0b8e\u5654\uc246\u5140() {
        var_1_177 : int
        var_4_13E : Type[]
        var_5_163 : int
        var_6_29E : Type
        var_3_319 : Type
        expr_335 : Class[] [generated]
        
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
        var_1_177 = and:int(ldc:int(520624230), ldc:int(-1639014570))
        
        if (logicalnot:boolean(getfield:boolean(\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u960f\u4975\u8308\ua61f\u98a4\ubcb0, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4))) {
            if (logicalnot:boolean(instanceof:boolean(java.lang.reflect.ParameterizedType.class, getfield:Type(\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u6d99\u7043\u93a2\u416d\u9af2\u836c, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4)))) {
                goto(Label_0148)
            }
            
            var_4_13E = invokeinterface:Type[](ParameterizedType::getActualTypeArguments, checkcast:ParameterizedType(java.lang.reflect.ParameterizedType.class, getfield:Type[expected:ParameterizedType](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u6d99\u7043\u93a2\u416d\u9af2\u836c, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4)))
            
            if (cmpgt:boolean(arraylength:int(var_4_13E:Type[]), ldc:int(0))) {
                putfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, newarray:Class[](java.lang.Class.class, arraylength:int(var_4_13E:Type[])))
                var_5_163 = and:int(ldc:int(4456), ldc:int(-4457))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_177:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_177:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_177 = and:int(var_1_177:int, ldc:int(-1518898873))
                        goto(Label_0552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_177 = and:int(var_1_177:int, ldc:int(-455629401))
                        goto(Label_0492)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_177:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_177 = and:int(var_1_177:int, ldc:int(1595572067))
                        
                        if (cmpge:boolean(var_5_163:int, arraylength:int(var_4_13E:Type[]))) {
                            looporswitchbreak()
                        }
                        
                        if (instanceof:boolean(java.lang.Class.class, loadelement:Type(var_4_13E:Type[], var_5_163:int))) {
                            storeelement:Class<?>(getfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4), var_5_163:int, checkcast:Class(java.lang.Class.class, loadelement:Type(var_4_13E:Type[], var_5_163:int)))
                            goto(Label_0722)
                        }
                    }
                    
                    Label_0432:
                    
                    if (cmpne:boolean(and:int(var_1_177:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_177 = and:int(var_1_177:int, ldc:int(1638955187))
                        goto(Label_0552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_177 = and:int(var_1_177:int, ldc:int(1699510824))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_177:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_177 = and:int(var_1_177:int, ldc:int(466311618))
                        
                        if (instanceof:boolean(java.lang.reflect.ParameterizedType.class, loadelement:Type(var_4_13E:Type[], var_5_163:int))) {
                            storeelement:Class<?>(getfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4), var_5_163:int, checkcast:Class(java.lang.Class.class, invokeinterface:Type(ParameterizedType::getRawType, checkcast:ParameterizedType(java.lang.reflect.ParameterizedType.class, loadelement:Type(var_4_13E:Type[], var_5_163:int)))))
                            goto(Label_0722)
                        }
                    }
                    
                    Label_0492:
                    
                    if (cmpne:boolean(and:int(var_1_177:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_177 = and:int(var_1_177:int, ldc:int(-221864793))
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_177:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_1_177 = and:int(var_1_177:int, ldc:int(-130546767))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_177 = and:int(var_1_177:int, ldc:int(-28369501))
                        
                        if (instanceof:boolean(java.lang.reflect.GenericArrayType.class, loadelement:Type(var_4_13E:Type[], var_5_163:int))) {
                            var_6_29E = invokeinterface:Type(GenericArrayType::getGenericComponentType, checkcast:GenericArrayType(java.lang.reflect.GenericArrayType.class, loadelement:Type[expected:GenericArrayType](var_4_13E:Type[], var_5_163:int)))
                            
                            if (logicalnot:boolean(instanceof:boolean(java.lang.Class.class, var_6_29E:Type))) {
                                var_1_177 = and:int(var_1_177:int, ldc:int(534256431))
                                putfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, aconstnull:Class<?>[]())
                                looporswitchbreak()
                            }
                            
                            storeelement:Class<?>(getfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4), var_5_163:int, invokevirtual:Class<?>(Object::getClass, invokestatic:Object(Array::newInstance, checkcast:Class<?>(java.lang.Class<?>.class, var_6_29E:Class<?>[expected:Type]), and:int(ldc:int(-340), ldc:int(339)))))
                            goto(Label_0722)
                        }
                    }
                    
                    Label_0552:
                    
                    if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_177:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0492)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_177 = and:int(var_1_177:int, ldc:int(-2023561336))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(256)), ldc:int(0))) {
                            var_1_177 = and:int(var_1_177:int, ldc:int(-23570129))
                            putfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, aconstnull:Class<?>[]())
                            looporswitchbreak()
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0722:
                    
                    if (cmpne:boolean(and:int(var_1_177:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_177 = and:int(var_1_177:int, ldc:int(-1216137824))
                        goto(Label_0492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_177 = and:int(var_1_177:int, ldc:int(1643052657))
                    }
                    else {
                        var_1_177 = and:int(var_1_177:int, ldc:int(1583087279))
                        inc:int(var_5_163, ldc:int(1))
                    }
                }
            }
            
            var_1_177 = and:int(var_1_177:int, ldc:int(-4646449))
            goto(Label_0244)
        }
        
        Label_0103:
        
        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0244)
        }
        
        if (cmpne:boolean(and:int(var_1_177:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(8388608)), ldc:int(0))) {
            return:Class<?>[](getfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4))
        }
        
        Label_0148:
        
        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0244)
        }
        
        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(2)), ldc:int(0))) {
            var_1_177 = and:int(var_1_177:int, ldc:int(1434502726))
        }
        else {
            if (cmpne:boolean(and:int(var_1_177:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0103)
            }
            
            var_1_177 = and:int(var_1_177:int, ldc:int(1540323791))
            
            if (instanceof:boolean(java.lang.reflect.GenericArrayType.class, getfield:Type(\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u6d99\u7043\u93a2\u416d\u9af2\u836c, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4))) {
                var_3_319 = invokeinterface:Type(GenericArrayType::getGenericComponentType, checkcast:GenericArrayType(java.lang.reflect.GenericArrayType.class, getfield:Type[expected:GenericArrayType](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u6d99\u7043\u93a2\u416d\u9af2\u836c, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4)))
                
                if (instanceof:boolean(java.lang.Class.class, var_3_319:Type)) {
                    expr_335 = newarray:Class[](java.lang.Class.class, xor:int(ldc:int(272), ldc:int(273)))
                    storeelement:Class(expr_335:Class[], and:int(ldc:int(11473), ldc:int(-27858)), checkcast:Class<?>(java.lang.Class<?>.class, var_3_319:Class<?>))
                    putfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, expr_335:Class<?>[])
                }
                
                var_1_177 = and:int(var_1_177:int, ldc:int(993827587))
                goto(Label_0244)
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_1_177:int, ldc:int(536870912)), ldc:int(0))) {
            var_1_177 = and:int(var_1_177:int, ldc:int(1583748263))
        }
        else {
            if (cmpne:boolean(and:int(var_1_177:int, ldc:int(256)), ldc:int(0))) {
                var_1_177 = and:int(var_1_177:int, ldc:int(-845190949))
                goto(Label_0148)
            }
            
            if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0103)
            }
            
            var_1_177 = and:int(var_1_177:int, ldc:int(1595570614))
            
            if (instanceof:boolean(java.lang.Class.class, getfield:Type(\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u6d99\u7043\u93a2\u416d\u9af2\u836c, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4))) {
                if (invokevirtual:boolean(Class::isArray, checkcast:Class(java.lang.Class.class, getfield:Type[expected:Class](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u6d99\u7043\u93a2\u416d\u9af2\u836c, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4)))) {
                    storeelement:Class<?>(putfield:Class<?>[](\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u9255\u51b2\u0800\ub102\u927d\u8258, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, newarray:Class[](java.lang.Class.class, xor:int(ldc:int(4098), ldc:int(4099)))), and:int(ldc:int(-15571), ldc:int(15506)), invokevirtual:Class<?>(Class<T>::getComponentType, invokevirtual:Class<?>(\u9a18\uae87\u5245\u8cae\u0800\uf94d::\ub8be\u7e3f\u8bb0\u416d\u8308\ub18d, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4[expected:\u9a18\uae87\u5245\u8cae\u0800\uf94d])))
                }
            }
        }
        
        Label_0244:
        
        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(2147483647)), ldc:int(0))) {
            var_1_177 = and:int(var_1_177:int, ldc:int(-833190201))
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(33554432)), ldc:int(0))) {
            var_1_177 = and:int(var_1_177:int, ldc:int(905238030))
            goto(Label_0148)
        }
        
        if (cmpeq:boolean(and:int(var_1_177:int, ldc:int(16384)), ldc:int(0))) {
            var_1_177 = and:int(var_1_177:int, ldc:int(-17941846))
            putfield:boolean(\u12cb\u6198\ub18d\u1833\u4cd9\u5db4::\u960f\u4975\u8308\ua61f\u98a4\ubcb0, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4, xor:int[expected:boolean](ldc:int(-12284), ldc:int(-12283)))
        }
        
        goto(Label_0103)
    }
    
    public void \u392e\ud523\u156b\u8aa5\u8d90\u3dd3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F8 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_603 : int
        
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
        var_3_5F8 = and:int(ldc:int(283144724), ldc:int(1542558068))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12cb\u6198\ub18d\u1833\u4cd9\u5db4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1024)), ldc:int(0))) {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2083360205))
        }
        else {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1612546419))
            var_5_85 = and:int(ldc:int(25857), ldc:int(-25858))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23777), ldc:int(19552)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5F8:int, ldc:int(1391296413))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(325), ldc:int(15017)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4225), ldc:int(1281)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5F8 = and:int(var_3_DA:int, ldc:int(988921021))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(837), ldc:int(6145)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1150451230))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1985024328))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1890386214))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2095258197))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1971609954))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(583225155))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-950578116))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2046475988))
                            var_11_EB = and:int(ldc:int(-18823), ldc:int(18820))
                            goto(Label_1440)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2007323226))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(691563078))
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-388293772))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1510317178))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-3739338))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-846836797))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-52233227))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1700891559))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1484265520))
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1228544828))
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1967201274))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1824748033))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1235534904))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(334492804))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1172101617))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(439483692))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(249885444))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1140862961))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(1162), ldc:int(1163))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-544229441))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1347076058))
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1985608592))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(973149606))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-387573512))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1763249578))
                        var_11_EB = and:int(ldc:int(-27951), ldc:int(25898))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-634159245))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1504005725))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1091962867))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1312)
                            }
                        }
                    }
                    
                    Label_1149:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(158372969))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2048408404))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1066889280))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2104885731))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-475952495))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(232811754))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1482272173))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1450768641))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2147237559))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1440)
                    }
                    
                    Label_1312:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1452697227))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1491320507))
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(154087240))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1194179055))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F8 = and:int(var_3_5F8:int, ldc:int(972741173))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1440:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_603 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1451:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-377560723))
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-118181401))
                        var_17_603 = add:int(var_16_119:int, and:int(ldc:int(2049), ldc:int(4141)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-118120634))
                
                if (cmple:boolean(var_5_85 = var_17_603:int, sub:int(var_6_8C:int, and:int(ldc:int(2049), ldc:int(8337))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(64)), ldc:int(0))) {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(569118317))
            goto(Label_0106)
        }
    }
}
