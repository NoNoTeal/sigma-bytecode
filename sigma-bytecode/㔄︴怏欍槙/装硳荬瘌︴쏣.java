public class \u3504\ufe34\u600f\u6b0d\u69d9.\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T> {
    public void \u88c5\u7873\u836c\u760c\ufe34\uc3e3(java.lang.Class<?> p0, java.lang.String p1, java.lang.Class[] p2) {
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
            invokespecial:Object(Object::<init>, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>)
            putfield:Class<?>(\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6c56\u4daf\ucb79\ud12e\ub8be\u965f, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>, p0:Class<?>)
            putfield:String(\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u5f50\u92ee\u3d64\ucb79\u960f\u4daf, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>, p1:String)
            putfield:Class[](\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u97e6\u494c\u647c\u8389\uc9f6\u385b, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>, p2:Class[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6c52\u5fe1\u88c5\u3711\u3711\u8d98(T p0) {
        var_2_5F : int
        stack_8A_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(343281741), ldc:int(-1026754723))
            
            if (cmpeq:boolean(invokespecial:Method(\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>::\u4cd9\u760c\u8aa5\u12b2\u7330\u7af6, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>, invokevirtual:Class<?>(Object::getClass, p0:T[expected:Object])), aconstnull:Method())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1607809247))
                stack_8A_0 = and:int(ldc:int(-324), ldc:int(323))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(1280), ldc:int(1281))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u36d3\u8bb0\ub19c\u7049\u4c2b\u6bb9(T p0, java.lang.Object[] p1) {
        var_3_DE : int
        var_5_6D : Method
        stack_DF_0 : Object [generated]
        
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
        var_3_DE = and:int(and:int(ldc:int(-447131560), ldc:int(-1412112791)), ldc:int(-749268137))
        var_5_6D = invokespecial:Method(\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>::\u4cd9\u760c\u8aa5\u12b2\u7330\u7af6, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>, invokevirtual:Class<?>(Object::getClass, p0:T[expected:Object]))
        
        loop {
            if (cmpne:boolean(and:int(var_3_DE:int, ldc:int(8388608)), ldc:int(0))) {
                var_3_DE = and:int(var_3_DE:int, ldc:int(-1320248787))
                goto(Label_0178)
            }
            
            if (cmpeq:boolean(and:int(var_3_DE:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_DE = and:int(var_3_DE:int, ldc:int(-1715977586))
            }
            else {
                var_3_DE = and:int(var_3_DE:int, ldc:int(-2059608579))
                
                if (cmpne:boolean(var_5_6D:Method, aconstnull:Method())) {
                    try {
                        stack_DF_0 = invokevirtual:Object(Method::invoke, var_5_6D:Method, p0:T[expected:Object], p1:Object[])
                        var_3_DE = and:int(var_3_DE:int, ldc:int(-250440493))
                        return:Object(stack_DF_0:Object)
                    }
                    catch (java.lang.IllegalAccessException var_6_E4) {
                        return:Object(aconstnull:Object())
                    }
                }
            }
            
            Label_0151:
            
            if (cmpne:boolean(and:int(var_3_DE:int, ldc:int(8388608)), ldc:int(0))) {
                var_3_DE = and:int(var_3_DE:int, ldc:int(-420881087))
            }
            else {
                if (cmpne:boolean(and:int(var_3_DE:int, ldc:int(256)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_DE = and:int(var_3_DE:int, ldc:int(-308891305))
            }
            
            Label_0178:
            
            if (cmpeq:boolean(and:int(var_3_DE:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0151)
            }
            
            if (cmpeq:boolean(and:int(var_3_DE:int, ldc:int(8388608)), ldc:int(0))) {
                return:Object(aconstnull:Object())
            }
            
            var_3_DE = and:int(var_3_DE:int, ldc:int(1469920464))
        }
    }
    
    public java.lang.Object \u3d4b\u8d90\u718f\u385b\ufe34\ud158(T p0, java.lang.Object[] p1) {
        var_3_5F : int
        stack_70_0 : Object [generated]
        var_3_7B : int
        var_6_81 : Throwable
        var_5_75 : InvocationTargetException
        var_3_8E : int
        var_3_9D : int
        var_7_110 : AssertionError
        
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
            var_3_5F = and:int(ldc:int(-880320049), ldc:int(-895601761))
            
            try {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-56133649))
                stack_70_0 = invokevirtual:Object(\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>::\u36d3\u8bb0\ub19c\u7049\u4c2b\u6bb9, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>, p0:T, p1:Object[])
                var_3_5F = and:int(var_3_5F:int, ldc:int(-34856289))
                return:Object(stack_70_0:Object)
            }
            catch (java.lang.reflect.InvocationTargetException var_5_75) {
                var_3_7B = and:int(var_3_5F:int, ldc:int(-121754705))
                var_6_81 = invokevirtual:Throwable(InvocationTargetException::getTargetException, var_5_75:InvocationTargetException)
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_7B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_8E = and:int(var_3_7B:int, ldc:int(80242959))
                        goto(Label_0209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_7B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_9D = and:int(var_3_7B:int, ldc:int(1634076936))
                    }
                    else {
                        var_3_9D = and:int(var_3_7B:int, ldc:int(-101293105))
                        
                        if (logicalnot:boolean(instanceof:boolean(java.lang.RuntimeException.class, var_6_81:Throwable))) {
                            goto(Label_0254)
                        }
                    }
                    
                    Label_0174:
                    
                    if (cmpeq:boolean(and:int(var_3_9D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_8E = and:int(var_3_9D:int, ldc:int(438251192))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_9D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_7B = and:int(var_3_9D:int, ldc:int(-438439408))
                            loopcontinue()
                        }
                        
                        var_3_8E = and:int(var_3_9D:int, ldc:int(-339250017))
                    }
                    
                    Label_0209:
                    
                    if (cmpeq:boolean(and:int(var_3_8E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_9D = and:int(var_3_8E:int, ldc:int(966883411))
                        goto(Label_0174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_8E:int, ldc:int(1073741824)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_7B = and:int(var_3_8E:int, ldc:int(-12512287))
                }
                
                athrow(checkcast:RuntimeException(java.lang.RuntimeException.class, var_6_81:Throwable))
            }
            
            Label_0254:
            var_7_110 = initobject:AssertionError(AssertionError::<init>, loadelement:String[expected:Object](getstatic:String[](\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6d69\u3711\ub19c\u873d\u93a2\u92ee), and:int(ldc:int(-32469), ldc:int(24148))))
            invokevirtual:Throwable(Throwable::initCause, var_7_110:AssertionError[expected:Throwable], var_6_81:Throwable)
            athrow(var_7_110:AssertionError)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u5d20\ubefe\uafe7\u7e3f\ub18d\u6c56(T p0, java.lang.Object[] p1) {
        var_3_105 : int
        var_5_6D : Method
        stack_106_0 : Object [generated]
        var_7_136 : AssertionError
        var_6_10B : IllegalAccessException
        
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
        var_3_105 = and:int(and:int(ldc:int(-1128031368), ldc:int(-606078121)), ldc:int(-67777775))
        var_5_6D = invokespecial:Method(\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>::\u4cd9\u760c\u8aa5\u12b2\u7330\u7af6, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>, invokevirtual:Class<?>(Object::getClass, p0:T[expected:Object]))
        
        loop {
            if (cmpne:boolean(and:int(var_3_105:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0154)
            }
            
            if (cmpeq:boolean(and:int(var_3_105:int, ldc:int(16384)), ldc:int(0))) {
                var_3_105 = and:int(var_3_105:int, ldc:int(-622412973))
                
                if (cmpne:boolean(var_5_6D:Method, aconstnull:Method())) {
                    try {
                        stack_106_0 = invokevirtual:Object(Method::invoke, var_5_6D:Method, p0:T[expected:Object], p1:Object[])
                        var_3_105 = and:int(var_3_105:int, ldc:int(-3874853))
                        return:Object(stack_106_0:Object)
                    }
                    catch (java.lang.IllegalAccessException var_6_10B) {
                        var_7_136 = initobject:AssertionError(AssertionError::<init>, invokevirtual:String[expected:Object](StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6d69\u3711\ub19c\u873d\u93a2\u92ee), xor:int(ldc:int(8225), ldc:int(8226)))), var_5_6D:Method[expected:Object])))
                        invokevirtual:Throwable(Throwable::initCause, var_7_136:AssertionError[expected:Throwable], var_6_10B:IllegalAccessException[expected:Throwable])
                        athrow(var_7_136:AssertionError)
                    }
                }
            }
            
            Label_0135:
            
            if (cmpeq:boolean(and:int(var_3_105:int, ldc:int(2)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_105:int, ldc:int(134217728)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_105 = and:int(var_3_105:int, ldc:int(-52633743))
            }
            
            Label_0154:
            
            if (cmpeq:boolean(and:int(var_3_105:int, ldc:int(512)), ldc:int(0))) {
                var_3_105 = and:int(var_3_105:int, ldc:int(-860167823))
                goto(Label_0135)
            }
            
            if (cmpeq:boolean(and:int(var_3_105:int, ldc:int(4)), ldc:int(0))) {
                athrow(initobject:AssertionError(AssertionError::<init>, invokevirtual:String[expected:Object](StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6d69\u3711\ub19c\u873d\u93a2\u92ee), xor:int(ldc:int(16416), ldc:int(16417)))), getfield:String(\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u5f50\u92ee\u3d64\ucb79\u960f\u4daf, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>)), loadelement:String(getstatic:String[](\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6d69\u3711\ub19c\u873d\u93a2\u92ee), and:int(ldc:int(25091), ldc:int(150)))), p0:T[expected:Object]))))
            }
            
            var_3_105 = and:int(var_3_105:int, ldc:int(-969387722))
        }
    }
    
    public java.lang.Object \u5245\uf9c5\u5bc4\ufcaf\u8bb0\u4179(T p0, java.lang.Object[] p1) {
        var_3_5F : int
        stack_70_0 : Object [generated]
        var_3_7B : int
        var_6_81 : Throwable
        var_5_75 : InvocationTargetException
        var_7_F0 : AssertionError
        
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
            var_3_5F = and:int(ldc:int(1742306392), ldc:int(1355527518))
            
            try {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1171166768))
                stack_70_0 = invokevirtual:Object(\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>::\u5d20\ubefe\uafe7\u7e3f\ub18d\u6c56, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>, p0:T, p1:Object[])
                var_3_5F = and:int(var_3_5F:int, ldc:int(-672211247))
                return:Object(stack_70_0:Object)
            }
            catch (java.lang.reflect.InvocationTargetException var_5_75) {
                var_3_7B = and:int(var_3_5F:int, ldc:int(-171073780))
                var_6_81 = invokevirtual:Throwable(InvocationTargetException::getTargetException, var_5_75:InvocationTargetException)
                
                loop {
                    if (cmpne:boolean(and:int(var_3_7B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_7B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_7B = and:int(var_3_7B:int, ldc:int(-738568863))
                    }
                    else {
                        var_3_7B = and:int(var_3_7B:int, ldc:int(-788990272))
                        
                        if (logicalnot:boolean(instanceof:boolean(java.lang.RuntimeException.class, var_6_81:Throwable))) {
                            goto(Label_0222)
                        }
                    }
                    
                    Label_0166:
                    
                    if (cmpeq:boolean(and:int(var_3_7B:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_7B:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_7B = and:int(var_3_7B:int, ldc:int(1758213727))
                    }
                    
                    Label_0185:
                    
                    if (cmpeq:boolean(and:int(var_3_7B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_7B:int, ldc:int(2097152)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_7B = and:int(var_3_7B:int, ldc:int(-2123349850))
                }
                
                athrow(checkcast:RuntimeException(java.lang.RuntimeException.class, var_6_81:Throwable))
            }
            
            Label_0222:
            var_7_F0 = initobject:AssertionError(AssertionError::<init>, loadelement:String[expected:Object](getstatic:String[](\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6d69\u3711\ub19c\u873d\u93a2\u92ee), and:int(ldc:int(-21072), ldc:int(21004))))
            invokevirtual:Throwable(Throwable::initCause, var_7_F0:AssertionError[expected:Throwable], var_6_81:Throwable)
            athrow(var_7_F0:AssertionError)
        }
        
        goto(Label_0006)
    }
    
    private java.lang.reflect.Method \u4cd9\u760c\u8aa5\u12b2\u7330\u7af6(java.lang.Class<?> p0) {
        var_4_61 : Method
        
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
            var_4_61 = aconstnull:Method()
            
            if (cmpne:boolean(getfield:String(\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u5f50\u92ee\u3d64\ucb79\u960f\u4daf, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>), aconstnull:String())) {
                var_4_61 = invokestatic:Method(\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>::\u8d98\u4d85\uf94d\ubb2b\ube23\u8753, p0:Class<?>, getfield:String(\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u5f50\u92ee\u3d64\ucb79\u960f\u4daf, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>), getfield:Class[](\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u97e6\u494c\u647c\u8389\uc9f6\u385b, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>))
                
                if (cmpne:boolean(var_4_61:Method, aconstnull:Method())) {
                    if (cmpne:boolean(getfield:Class<?>(\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6c56\u4daf\ucb79\ud12e\ub8be\u965f, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>), aconstnull:Class<?>())) {
                        if (logicalnot:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, getfield:Class<?>(\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6c56\u4daf\ucb79\ud12e\ub8be\u965f, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>), invokevirtual:Class<?>(Method::getReturnType, var_4_61:Method)))) {
                            var_4_61 = aconstnull:Method()
                        }
                    }
                }
            }
            
            return:Method(var_4_61:Method)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.reflect.Method \u8d98\u4d85\uf94d\ubb2b\ube23\u8753(java.lang.Class<?> p0, java.lang.String p1, java.lang.Class[] p2) {
        var_3_64 : int
        var_5_66 : Method
        
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
            var_3_64 = and:int(and:int(ldc:int(-1330554411), ldc:int(-1286709283)), ldc:int(-635311137))
            var_5_66 = aconstnull:Method()
            
            try {
                var_5_66 = invokevirtual:Method(Class::getMethod, p0:Class, p1:String, p2:Class<?>[])
                
                do {
                    if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64 = and:int(var_3_64:int, ldc:int(1751156860))
                    }
                    else {
                        var_3_64 = and:int(var_3_64:int, ldc:int(-256968201))
                        
                        if (cmpeq:boolean(and:int(invokevirtual:int(Method::getModifiers, var_5_66:Method), xor:int(ldc:int(8976), ldc:int(8977))), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        return:Method(var_5_66:Method)
                    }
                } while (cmpeq:boolean(and:int(var_3_64:int, ldc:int(128)), ldc:int(0)))
                
                var_5_66 = aconstnull:Method()
                return:Method(var_5_66:Method)
            }
            catch (java.lang.NoSuchMethodException stack_AF_0) {
            }
            
            return:Method(var_5_66:Method)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E4 : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_138_0 : byte[] [generated]
        stack_1F7_0 : byte[] [generated]
        stack_24B_0 : byte[] [generated]
        stack_2A8_0 : byte[] [generated]
        stack_31D_0 : byte[] [generated]
        var_4_1CF : int
        var_3_1D4 : byte[]
        var_5_1D5 : int
        expr_1FA : byte [generated]
        var_0_29E : int
        expr_2A8 : byte [generated]
        stack_2E8_2 : byte [generated]
        stack_2C5_0 : byte [generated]
        var_2_A4 : byte[]
        expr_A8 : int [generated]
        var_3_239 : byte[]
        var_5_23A : int
        expr_D5 : int [generated]
        expr_10B : int [generated]
        var_3_30B : byte[]
        var_5_30C : int
        var_3_144 : String
        stack_1C8_0 : String[] [generated]
        expr_156 : String[] [generated]
        
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
        var_0_1E4 = and:int(ldc:int(-79847566), ldc:int(1589468020))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_138_0 = stack_1F7_0 = stack_24B_0 = stack_2A8_0 = stack_31D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("nnWF+u/i4gIawBo+tf3v8u4C43XcRuKBWu9F9VLdudmeocGt4hrxxRbu2aqhEvr+Skq5oY2pwa3iGv61Oe4GdRrS0OpCifHfxdVKwdh6ZmKDe+I=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1CF = expr_6B:int
        var_3_1D4 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1D5 = expr_6B:int
        Label_0471:
        
        while (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(373268205))
            var_5_1D5 = add:int(var_5_1D5:int, ldc:int(-1))
            expr_1FA = add:byte(loadelement:byte(stack_1F7_0:byte[], var_5_1D5:int), ldc:byte(34))
            storeelement:byte(var_3_1D4:byte[], var_5_1D5:int, or:int(and:int(shl:int(expr_1FA:byte, xor:int(ldc:int(3201), ldc:int(3205))), ldc:int(-16)), and:int(shr:int(expr_1FA:byte[expected:int], and:int(ldc:int(9764), ldc:int(2052))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1D5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_138_0 = stack_1F7_0 = stack_24B_0 = stack_2A8_0 = stack_31D_0 = var_3_1D4:byte[]
            goto(Label_0112)
        }
        
        var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1304831561))
        Label_0658:
        
        while (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(64)), ldc:int(0))) {
            var_0_29E = and:int(var_0_1E4:int, ldc:int(1891497705))
            var_5_1D5 = add:int(var_5_1D5:int, ldc:int(-1))
            expr_2A8 = stack_2E8_2 = loadelement(stack_2A8_0, var_5_1D5)
            
            if (cmplt:boolean(add:int(add:int(var_5_1D5:int, ldc:int(5)), neg:int(var_4_1CF:int)), ldc:int(0))) {
                stack_2E8_2 = stack_2C5_0 = add:byte(expr_2A8:byte, loadelement:byte(var_3_1D4:byte[], add:int(var_5_1D5:int, ldc:int(5))))
                goto(Label_0725)
            }
            
            Label_0693:
            
            if (cmpne:boolean(and:int(var_0_29E:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_29E = and:int(var_0_29E:int, ldc:int(-348321809))
                stack_2E8_2 = stack_2C5_0 = add:byte(expr_2A8:byte, ldc:byte(5))
            }
            
            Label_0725:
            
            if (cmpeq:boolean(and:int(var_0_29E:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0693)
            }
            
            var_0_1E4 = and:int(var_0_29E:int, ldc:int(964656998))
            storeelement:byte(var_3_1D4:byte[], var_5_1D5:int, stack_2E8_2:byte)
            
            if (cmpne:boolean(var_5_1D5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_138_0 = stack_1F7_0 = stack_24B_0 = stack_2A8_0 = stack_31D_0 = var_3_1D4:byte[]
            goto(Label_0218)
        }
        
        goto(Label_0471)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-315961335))
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(1)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-2028758379))
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(64)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1328668411))
        }
        else {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-247505175))
            var_2_A4 = stack_A4_0:byte[]
            expr_A8 = add:int(arraylength:int(stack_A6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A8:int, ldc:int(0))) {
                var_3_239 = newarray:byte[](byte.class, expr_A8:int)
                var_5_23A = expr_A8:int
                
                loop {
                    var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-289593476))
                    var_5_23A = add:int(var_5_23A:int, ldc:int(-1))
                    storeelement:byte(var_3_239:byte[], var_5_23A:int, add:int(shl:int(loadelement:byte(stack_24B_0:byte[], var_5_23A:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_A4:byte[], add:int(var_5_23A:int, xor:int(ldc:int(688), ldc:int(689)))), ldc:int(6)), and:int(ldc:int(21015), ldc:int(8387)))))
                    
                    if (cmpne:boolean(var_5_23A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_138_0 = stack_1F7_0 = stack_24B_0 = stack_2A8_0 = stack_31D_0 = var_3_239:byte[]
            }
        }
        
        Label_0173:
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(64)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(502231202))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-1023575306))
            expr_D5 = arraylength:int(stack_D5_0:byte[])
            
            if (cmpne:boolean(expr_D5:int, ldc:int(0))) {
                var_4_1CF = expr_D5:int
                var_3_1D4 = newarray:byte[](byte.class, expr_D5:int)
                var_5_1D5 = expr_D5:int
                goto(Label_0658)
            }
        }
        
        Label_0218:
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(262144)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(673971039))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0173)
            }
            
            if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1E4 = and:int(var_0_1E4:int, ldc:int(564319198))
                goto(Label_0112)
            }
            
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-1593988107))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_3_30B = newarray:byte[](byte.class, expr_10B:int)
                var_5_30C = expr_10B:int
                
                loop {
                    var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1002388210))
                    var_5_30C = add:int(var_5_30C:int, ldc:int(-1))
                    storeelement:byte(var_3_30B:byte[], var_5_30C:int, xor:byte(loadelement:byte(stack_31D_0:byte[], var_5_30C:int), ldc:byte(74)))
                    
                    if (cmpne:boolean(var_5_30C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D3_0 = stack_D5_0 = stack_109_0 = stack_10B_0 = stack_138_0 = stack_1F7_0 = stack_24B_0 = stack_2A8_0 = stack_31D_0 = var_3_30B:byte[]
            }
        }
        
        Label_0272:
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(131072)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-705220718))
            goto(Label_0218)
        }
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0173)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_144 = initobject:String(String::<init>, stack_138_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1C8_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(661), ldc:int(16740)))
            expr_156 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10822), ldc:int(5)))
            storeelement:String(expr_156:String[], xor:int(ldc:int(16665), ldc:int(16667)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(-28174), ldc:int(27661)), xor:int(ldc:int(668), ldc:int(646))))
            storeelement:String(expr_156:String[], xor:int(ldc:int(17668), ldc:int(17669)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(538), ldc:int(26938)), xor:int(ldc:int(8319), ldc:int(8286))))
            storeelement:String(expr_156:String[], and:int(ldc:int(-15807), ldc:int(11420)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(-31205), ldc:int(-31174)), xor:int(ldc:int(8454), ldc:int(8499))))
            storeelement:String(expr_156:String[], xor:int(ldc:int(128), ldc:int(131)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(26173), ldc:int(2103)), xor:int(ldc:int(9237), ldc:int(9287))))
            putstatic:String[](\u88c5\u7873\u836c\u760c\ufe34\uc3e3::\u6d69\u3711\ub19c\u873d\u93a2\u92ee, expr_156:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ub83f\ucfaf\ud171\u7ce1\ucb79\ufe34(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61A : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_625 : int
        
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
        var_3_61A = and:int(ldc:int(112436382), ldc:int(91726751))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u88c5\u7873\u836c\u760c\ufe34\uc3e3<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
            var_3_61A = and:int(var_3_61A:int, ldc:int(-1395013084))
        }
        else {
            var_3_61A = and:int(var_3_61A:int, ldc:int(909869823))
            var_5_8A = and:int(ldc:int(-27552), ldc:int(27536))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11152), ldc:int(11015)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_61A:int, ldc:int(1201129182))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(640), ldc:int(641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(417), ldc:int(5185)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_61A = and:int(var_3_E2:int, ldc:int(1838409151))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(17413), ldc:int(10353)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1637559808))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-471810885))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-877839589))
                        goto(Label_0893)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0784)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-814537155))
                    }
                    else {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(762964383))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0784)
                        }
                    }
                    
                    Label_0414:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-80266312))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-253686937))
                        goto(Label_0784)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1338599537))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1735886014))
                            var_11_F3 = and:int(ldc:int(-27660), ldc:int(27651))
                            goto(Label_1438)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(401859865))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1777772664))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0784)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1690697249))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-2057721185))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0784)
                        }
                    }
                    
                    Label_0675:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1403747632))
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-966859367))
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0893)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(767557375))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0784:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(598200535))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1958898262))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1663513181))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-566369793))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = xor:int(ldc:int(4632), ldc:int(4633))
                                goto(Label_1058)
                            }
                        }
                    }
                    
                    Label_0893:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1572241535))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(812930755))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0784)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(398368597))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(625039463))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(486063816))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1709047806))
                        var_11_F3 = and:int(ldc:int(-24834), ldc:int(24833))
                    }
                    
                    Label_1058:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-381924152))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-163251425))
                            goto(Label_0893)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-658081759))
                            goto(Label_0784)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1630701505))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1342034110))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1297)
                            }
                        }
                    }
                    
                    Label_1176:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(515832715))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1058)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0893)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0784)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1710161846))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1657865969))
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1834613918))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                            goto(Label_1438)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1297:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1045944474))
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1694280250))
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0784)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1873365146))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1262216963))
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1474260493))
                        loopcontinue()
                    }
                    
                    var_3_61A = and:int(var_3_61A:int, ldc:int(-466511458))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1438:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_625 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1449:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1777326908))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(784950991))
                        goto(Label_0893)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0784)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1797130843))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-2140984939))
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1941967873))
                        var_17_625 = add:int(var_16_121:int, xor:int(ldc:int(78), ldc:int(79)))
                        looporswitchbreak()
                    }
                    
                    var_3_61A = and:int(var_3_61A:int, ldc:int(-1820893395))
                }
                
                var_3_61A = and:int(var_3_61A:int, ldc:int(-572659201))
                
                if (cmple:boolean(var_5_8A = var_17_625:int, sub:int(var_6_91:int, and:int(ldc:int(4101), ldc:int(9219))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
            var_3_61A = and:int(var_3_61A:int, ldc:int(-1118625957))
            goto(Label_0108)
        }
    }
}
