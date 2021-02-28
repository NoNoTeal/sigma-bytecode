public abstract class \u5d20\u7043\u88c5\u5db4\uf94d.\u8df4\u718f\u156b\ub8be\u600f<T> {
    public void \u8df4\u718f\u156b\ub8be\u600f() {
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
            invokespecial:Object(Object::<init>, this:\u8df4\u718f\u156b\ub8be\u600f<T>)
            putfield:List<\u67d0\u36d3\uae5d\u99f7\u9a18>(\u8df4\u718f\u156b\ub8be\u600f::\ub171\u3711\ua6bd\ud523\u6d69\u3a62, this:\u8df4\u718f\u156b\ub8be\u600f<T>, invokestatic:ArrayList[expected:List<\u67d0\u36d3\uae5d\u99f7\u9a18>](Lists::newArrayList))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract T extends \u5d20\u7043\u88c5\u5db4\uf94d.\u8df4\u718f\u156b\ub8be\u600f<T> \u7bad\u600f\uc238\u8640\uc2bd\u8c8a();
    
    public T extends \u5d20\u7043\u88c5\u5db4\uf94d.\u8df4\u718f\u156b\ub8be\u600f<T> \u7873\u8bb0\u9255\uafe7\u7330\u4daf(\ub113\uc4d2\u183a\u527a\u6435.\u760c\uc2e8\ub70c\u4f4a\ucb79 p0) {
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
            invokeinterface:boolean(List<\u67d0\u36d3\uae5d\u99f7\u9a18>::add, getfield:List<\u67d0\u36d3\uae5d\u99f7\u9a18>(\u8df4\u718f\u156b\ub8be\u600f::\ub171\u3711\ua6bd\ud523\u6d69\u3a62, this:\u8df4\u718f\u156b\ub8be\u600f<T>), invokeinterface:\u67d0\u36d3\uae5d\u99f7\u9a18(\u760c\uc2e8\ub70c\u4f4a\ucb79::\u5fe1\ud51e\u4ab3\ucb79\u760c\u40a9, p0:\u760c\uc2e8\ub70c\u4f4a\ucb79))
            return:T extends \u8df4\u718f\u156b\ub8be\u600f<T>(invokevirtual:T extends \u8df4\u718f\u156b\ub8be\u600f<T>(\u8df4\u718f\u156b\ub8be\u600f<T>::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a, this:\u8df4\u718f\u156b\ub8be\u600f<T>))
        }
        
        goto(Label_0006)
    }
    
    public final T extends \u5d20\u7043\u88c5\u5db4\uf94d.\u8df4\u718f\u156b\ub8be\u600f<T> \u69d9\u51b2\u494c\u71ae\u97e6\u3e75() {
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
            return:T extends \u8df4\u718f\u156b\ub8be\u600f<T>(invokevirtual:T extends \u8df4\u718f\u156b\ub8be\u600f<T>(\u8df4\u718f\u156b\ub8be\u600f<T>::\u7bad\u600f\uc238\u8640\uc2bd\u8c8a, this:\u8df4\u718f\u156b\ub8be\u600f<T>))
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] \u71f1\u416d\u0800\u76bc\u8c8a\u4bc8() {
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
            return:\u67d0\u36d3\uae5d\u99f7\u9a18[](checkcast:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[].class, invokeinterface:\u67d0\u36d3\uae5d\u99f7\u9a18[](List<\u67d0\u36d3\uae5d\u99f7\u9a18>::toArray, getfield:List<\u67d0\u36d3\uae5d\u99f7\u9a18>(\u8df4\u718f\u156b\ub8be\u600f::\ub171\u3711\ua6bd\ud523\u6d69\u3a62, this:\u8df4\u718f\u156b\ub8be\u600f<T>), newarray:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18.class, and:int(ldc:int(-19826), ldc:int(19505))))))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u9255\ufe34\u4cd9\u8350\u7af6 \u71ae\u62da\u9a18\u4f4a\u8413\u51b2(\u5d20\u7043\u88c5\u5db4\uf94d.\u8df4\u718f\u156b\ub8be\u600f<?> p0) {
        expr_6B : \u8df4\u718f\u156b\ub8be\u600f[] [generated]
        
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
            expr_6B = newarray:\u8df4\u718f\u156b\ub8be\u600f[](\u5d20\u7043\u88c5\u5db4\uf94d.\u8df4\u718f\u156b\ub8be\u600f.class, xor:int(ldc:int(2309), ldc:int(2311)))
            storeelement:\u8df4\u718f\u156b\ub8be\u600f(expr_6B:\u8df4\u718f\u156b\ub8be\u600f[], and:int(ldc:int(-29599), ldc:int(29586)), this:\u8df4\u718f\u156b\ub8be\u600f<T>)
            storeelement:\u8df4\u718f\u156b\ub8be\u600f(expr_6B:\u8df4\u718f\u156b\ub8be\u600f[], xor:int(ldc:int(2152), ldc:int(2153)), p0:\u8df4\u718f\u156b\ub8be\u600f<?>)
            return:\u9255\ufe34\u4cd9\u8350\u7af6(initobject:\u9255\ufe34\u4cd9\u8350\u7af6(\u9255\ufe34\u4cd9\u8350\u7af6::<init>, expr_6B:\u8df4\u718f\u156b\ub8be\u600f<?>[]))
        }
        
        goto(Label_0006)
    }
    
    public abstract \u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c \u527a\u61a4\uc246\u965f\u3e2a\ua6bd();
    
    public java.lang.Object \u69d9\u51b2\u494c\u71ae\u97e6\u3e75() {
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
            return:Object(invokevirtual:Object(\u8df4\u718f\u156b\ub8be\u600f<Object>::\u69d9\u51b2\u494c\u71ae\u97e6\u3e75, this:\u8df4\u718f\u156b\ub8be\u600f<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u7873\u8bb0\u9255\uafe7\u7330\u4daf(\ub113\uc4d2\u183a\u527a\u6435.\u760c\uc2e8\ub70c\u4f4a\ucb79 p0) {
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
            return:Object(invokevirtual:Object(\u8df4\u718f\u156b\ub8be\u600f<Object>::\u7873\u8bb0\u9255\uafe7\u7330\u4daf, this:\u8df4\u718f\u156b\ub8be\u600f<T>, p0:\u760c\uc2e8\ub70c\u4f4a\ucb79))
        }
        
        goto(Label_0006)
    }
    
    public void \u4c2b\u51fa\u1187\ucef1\u67d0\uc229(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E7 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F2 : int
        
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
        var_3_5E7 = and:int(ldc:int(1794339556), ldc:int(-76579204))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8df4\u718f\u156b\ub8be\u600f<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-75814276))
            var_5_7D = and:int(ldc:int(-16710), ldc:int(16709))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11035), ldc:int(-32736)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5E7:int, ldc:int(931134063))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(5197), ldc:int(915)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(859), ldc:int(3105)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5E7 = and:int(var_3_CA:int, ldc:int(-1409864091))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4236), ldc:int(4237)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(421403483))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-139246749))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-664854108))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1777729984))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1427727916))
                    }
                    else {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-160733313))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(2108065599))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(228022320))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-844895963))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1955516524))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-679486948))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1233654018))
                            var_11_DB = and:int(ldc:int(-5557), ldc:int(5556))
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1554834624))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-765706382))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1593283995))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1884562411))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1287340695))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1867975773))
                            loopcontinue()
                        }
                        
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(578254717))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-513575210))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1127338877))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-728926270))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1568692226))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(362108120))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1788326590))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1054431377))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-184869606))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1560922513))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(4112), ldc:int(4113))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-487379764))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-2098917195))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1147195650))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1064446847))
                        var_11_DB = and:int(ldc:int(-11633), ldc:int(2416))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1200076381))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1305300435))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-599357185))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-239818487))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-285579273))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-417709555))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(808677756))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1191169246))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-767478247))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1352171780))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-263989174))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1755431113))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(560460820))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1228562522))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1970179831))
                        loopcontinue()
                    }
                    
                    var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1418285057))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F2 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(1656577192))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1334832293))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1592963621))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1225065756))
                        var_17_5F2 = add:int(var_16_109:int, xor:int(ldc:int(-32719), ldc:int(-32720)))
                        looporswitchbreak()
                    }
                    
                    var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-554084049))
                }
                
                var_3_5E7 = and:int(var_3_5E7:int, ldc:int(-1208538259))
                
                if (cmple:boolean(var_5_7D = var_17_5F2:int, sub:int(var_6_84:int, and:int(ldc:int(12291), ldc:int(9))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5E7:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
