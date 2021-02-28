public abstract class \u494c\u4975\ua068\u0c95\uc84e.\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e {
    public void \ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8df4\u4492\u7049\u6435\u446c\ubded p0) {
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
        invokespecial:Object(Object::<init>, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e)
        
        if (cmpne:boolean(p0:\u8df4\u4492\u7049\u6435\u446c\ubded, aconstnull:\u8df4\u4492\u7049\u6435\u446c\ubded())) {
            putfield:\u8df4\u4492\u7049\u6435\u446c\ubded(\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e::\u69d9\u12cb\u6bb9\ubff1\u4c04\u8258, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e, p0:\u8df4\u4492\u7049\u6435\u446c\ubded)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("delegate == null")))
    }
    
    public final \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8df4\u4492\u7049\u6435\u446c\ubded \u64ab\u1833\u8258\u4cd9\u446c\u7873() {
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
            return:\u8df4\u4492\u7049\u6435\u446c\ubded(getfield:\u8df4\u4492\u7049\u6435\u446c\ubded(\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e::\u69d9\u12cb\u6bb9\ubff1\u4c04\u8258, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\u3e2a\u8308\uc229\ud12e\ub19c(\u3d64\u7af6\uae87\uc238\u7d52.\u3711\u34df\ubded\u3d64\u494c\u6198 p0, long p1) {
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
            invokeinterface:void(\u8df4\u4492\u7049\u6435\u446c\ubded::\ua068\u3e2a\u8308\uc229\ud12e\ub19c, getfield:\u8df4\u4492\u7049\u6435\u446c\ubded(\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e::\u69d9\u12cb\u6bb9\ubff1\u4c04\u8258, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e), p0:\u3711\u34df\ubded\u3d64\u494c\u6198, p1:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void flush() {
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
            invokeinterface:void(\u8df4\u4492\u7049\u6435\u446c\ubded::flush, getfield:\u8df4\u4492\u7049\u6435\u446c\ubded(\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e::\u69d9\u12cb\u6bb9\ubff1\u4c04\u8258, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe \u3e2a\ub32d\uc29a\ub83f\u9937\u927d() {
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
            return:\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe(invokeinterface:\u6c56\u5db4\u4daf\ub18d\uceb8\ud4fe(\u8df4\u4492\u7049\u6435\u446c\ubded::\u3e2a\ub32d\uc29a\ub83f\u9937\u927d, getfield:\u8df4\u4492\u7049\u6435\u446c\ubded(\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e::\u69d9\u12cb\u6bb9\ubff1\u4c04\u8258, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e)))
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            invokeinterface:void(\u8df4\u4492\u7049\u6435\u446c\ubded::close, getfield:\u8df4\u4492\u7049\u6435\u446c\ubded(\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e::\u69d9\u12cb\u6bb9\ubff1\u4c04\u8258, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(Class<T>::getSimpleName, invokevirtual:Class<? extends \ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e>(\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e::getClass, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e))), ldc:String("(")), invokevirtual:String(Object::toString, getfield:\u8df4\u4492\u7049\u6435\u446c\ubded[expected:Object](\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e::\u69d9\u12cb\u6bb9\ubff1\u4c04\u8258, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e))), ldc:String(")"))))
        }
        
        goto(Label_0006)
    }
    
    public void \u836c\u516c\u6c56\u8389\ub70c\uc3e3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_622 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_62D : int
        
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
        var_3_622 = and:int(ldc:int(1151567927), ldc:int(-436217859))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubf56\uff55\ub32d\uf9c5\u3bd6\u0b8e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_622 = and:int(var_3_622:int, ldc:int(548367225))
        }
        else {
            var_3_622 = and:int(var_3_622:int, ldc:int(2130390197))
            var_5_85 = and:int(ldc:int(-10689), ldc:int(10688))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2650), ldc:int(2633)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_622:int, ldc:int(1711010935))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(2304), ldc:int(2305)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(5403), ldc:int(26753)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_622 = and:int(var_3_DA:int, ldc:int(1958161133))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(177), ldc:int(176)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(41218604))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1163148367))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1411834362))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(129648911))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-51683401))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(918712555))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-607497756))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1217128282))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-402654913))
                        var_11_EB = and:int(ldc:int(18274), ldc:int(-18279))
                        goto(Label_1455)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1513012877))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1653335866))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1518824609))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1386886475))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1458212798))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1024399686))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-226804374))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(2095808383))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1635866733))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1610603074))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-323912258))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1382900204))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-441482705))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1874863320))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-349750433))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(64)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-194533193))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-1554849167))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(64)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(2070651655))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(1610553581))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(-30590), ldc:int(-30589))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1719654039))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1433035841))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-700957856))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-677922612))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-2095232000))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-87005189))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-902288604))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-2040062752))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-270020369))
                        var_11_EB = and:int(ldc:int(29642), ldc:int(-29643))
                    }
                    
                    Label_1091:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1928953564))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-123818026))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-2100862274))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-290497347))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1500295465))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(46406022))
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1602521706))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(28983767))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-54183863))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-138424707))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1455)
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(635019652))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1534536296))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1625671649))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(64)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(811357157))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1276066482))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_622 = and:int(var_3_622:int, ldc:int(1437068085))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(575040839))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1572522180))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1118011199))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1202680237))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-440939929))
                        var_17_62D = add:int(var_16_119:int, xor:int(ldc:int(816), ldc:int(817)))
                        looporswitchbreak()
                    }
                }
                
                var_3_622 = and:int(var_3_622:int, ldc:int(-672701443))
                
                if (cmple:boolean(var_5_85 = var_17_62D:int, sub:int(var_6_8C:int, xor:int(ldc:int(16388), ldc:int(16389))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
            var_3_622 = and:int(var_3_622:int, ldc:int(-125142977))
            goto(Label_0106)
        }
    }
}
