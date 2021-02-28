public class \u5245\u8aa5\u61a4\u7049\u4cd9.\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T> {
    public void \u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8(float p0, float p1, int p2, int p3) {
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
            invokespecial:\u7e3f\u7d52\ube23\u4c2b\u071d\u67d0(\u7e3f\u7d52\ube23\u4c2b\u071d\u67d0::<init>, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, p0:float, p1:float, p2:int, p3:int)
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:\uc910\uc29a\u527a\u6c56\u34df\u6d69], ldc:int(32), ldc:int(48))), ldc:float(-3.0f), ldc:float(-2.0f), ldc:float(-2.0f), ldc:float(4.0f), ldc:float(12.0f), ldc:float(4.0f), p0:float)
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\uc229\uc910\u6c52\u7043\u624e\ufcaf, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(-5.0f), add:float(ldc:float(2.0f), p1:float), ldc:float(0.0f))
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u8df4\u92ff\u5f50\u97e6\u5245\u392e, putfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\ud158\u67e9\ube23\ua6bd\uc4d2\ub171, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, initobject:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::<init>, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:\uc910\uc29a\u527a\u6c56\u34df\u6d69], ldc:int(16), ldc:int(48))), ldc:float(-2.0f), ldc:float(0.0f), ldc:float(-2.0f), ldc:float(4.0f), ldc:float(12.0f), ldc:float(4.0f), p0:float)
            invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\uc229\uc910\u6c52\u7043\u624e\ufcaf, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\ud158\u67e9\ube23\ua6bd\uc4d2\ub171, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(-1.9f), add:float(ldc:float(12.0f), p1:float), ldc:float(0.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8(float p0, boolean p1) {
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
            invokespecial:\u7e3f\u7d52\ube23\u4c2b\u071d\u67d0(\u7e3f\u7d52\ube23\u4c2b\u071d\u67d0::<init>, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, p0:float, ldc:float(0.0f), ldc:int(64), ternaryop:int(p1:boolean, ldc:int(32), ldc:int(64)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\u61a4\uceb8\ud217\u8d98\uc246(T extends \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3504\uafe7\ucb79\u0c95\ubff1 p0, float p1, float p2, float p3) {
        var_5_61 : int
        
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
            var_5_61 = and:int(ldc:int(-753458285), ldc:int(-266384943))
            putfield:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u71ae\u7049\u5bc4\ube23\u0800\uc238, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, getstatic:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u4975\uc2e8\ube23\uc87f\u1187\u64ab::\u4d85\u3d64\u8308\u2dcc\uc87f\u600f))
            putfield:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6d99\u3e2a\ud4fe\u8cae\u71f1\u759a, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, getstatic:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u4975\uc2e8\ube23\uc87f\u1187\u64ab::\u4d85\u3d64\u8308\u2dcc\uc87f\u600f))
            
            if (cmpeq:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u71f1\u836c\u47c2\uae5d\u6b0d\u946b, p0:T extends \u3504\uafe7\ucb79\u0c95\ubff1[expected:\ube23\u67d0\u64f2\u839e\u76bc], getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9))), getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ud523\ud217\u760c\u62da\u40a9\ub32d))) {
                if (invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\u72f1\u760c\ubcb0\u385b\ud12e\u446c, p0:T extends \u3504\uafe7\ucb79\u0c95\ubff1[expected:\u4f4a\uafe7\u76bc\u392e\ub8be])) {
                    if (cmpne:boolean(invokevirtual:\u93a2\u7bad\u946b\u4ab3\ub171\u0b8e(\u4f4a\uafe7\u76bc\u392e\ub8be::\u718f\ud217\ub70c\uc2e8\u3d4b\u6198, p0:T extends \u3504\uafe7\ucb79\u0c95\ubff1[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]), getstatic:\u93a2\u7bad\u946b\u4ab3\ub171\u0b8e(\u93a2\u7bad\u946b\u4ab3\ub171\u0b8e::\u600f\ubefe\uc910\u4492\u9033\u527a))) {
                        var_5_61 = and:int(var_5_61:int, ldc:int(-894278658))
                        putfield:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6d99\u3e2a\ud4fe\u8cae\u71f1\u759a, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, getstatic:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u4975\uc2e8\ube23\uc87f\u1187\u64ab::\u7d52\ubefe\u4bc8\ud12e\ua068\uc87f))
                    }
                    else {
                        putfield:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u71ae\u7049\u5bc4\ube23\u0800\uc238, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, getstatic:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u4975\uc2e8\ube23\uc87f\u1187\u64ab::\u7d52\ubefe\u4bc8\ud12e\ua068\uc87f))
                    }
                }
            }
            
            invokespecial:void(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>::\u6d69\u61a4\uceb8\ud217\u8d98\uc246, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>], p0:T extends \u3504\uafe7\ucb79\u0c95\ubff1, p1:float, p2:float, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\ud158\u8350\u183a\u516c\ubcb0(T extends \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3504\uafe7\ucb79\u0c95\ubff1 p0, float p1, float p2, float p3, float p4, float p5) {
        var_7_87 : int
        expr_18A : \u8d98\u5db4\uc910\u0b8e\ubf56\ud36e [generated]
        expr_1A6 : \u8d98\u5db4\uc910\u0b8e\ubf56\ud36e [generated]
        
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
            var_7_87 = and:int(ldc:int(-1816015505), ldc:int(-1747431697))
            invokespecial:void(\ua6bd\u56bd\u7c6b\u4d85\uae87\u516c<T>::\u7bad\ud158\u8350\u183a\u516c\ubcb0, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:\ua6bd\u56bd\u7c6b\u4d85\uae87\u516c<T>], p0:T extends \u3504\uafe7\ucb79\u0c95\ubff1, p1:float, p2:float, p3:float, p4:float, p5:float)
            
            if (cmpeq:boolean(getfield:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6d99\u3e2a\ud4fe\u8cae\u71f1\u759a, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), getstatic:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u4975\uc2e8\ube23\uc87f\u1187\u64ab::\u7d52\ubefe\u4bc8\ud12e\ua068\uc87f))) {
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), sub:float(mul:float(getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>)), ldc:float(0.5f)), ldc:float(3.1415927f)))
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9033\u67e9\u3d64\ufe34\u12cb\u3dd3, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(0.0f))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_7_87:int, ldc:int(4194304)), ldc:int(0))) {
                    var_7_87 = and:int(var_7_87:int, ldc:int(2009133432))
                    
                    if (cmpeq:boolean(getfield:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u71ae\u7049\u5bc4\ube23\u0800\uc238, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), getstatic:\u4975\uc2e8\ube23\uc87f\u1187\u64ab(\u4975\uc2e8\ube23\uc87f\u1187\u64ab::\u7d52\ubefe\u4bc8\ud12e\ua068\uc87f))) {
                        putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), sub:float(mul:float(getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>)), ldc:float(0.5f)), ldc:float(3.1415927f)))
                        putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9033\u67e9\u3d64\ufe34\u12cb\u3dd3, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(0.0f))
                    }
                }
                
                if (cmpne:boolean(and:int(var_7_87:int, ldc:int(32)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_7_87 = and:int(var_7_87:int, ldc:int(282195436))
            }
            
            if (cmpgt:boolean(getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(0.0f))) {
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), add:float(invokevirtual:float(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>::\u64ab\ua61f\u9033\u62da\u8308\u71ae, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>], getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>)), ldc:float(-2.5132742f)), mul:float(mul:float(getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(0.35f)), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(ldc:float(0.1f), p3:float)))))
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), sub:float(invokevirtual:float(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>::\u64ab\ua61f\u9033\u62da\u8308\u71ae, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>], getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>)), ldc:float(-2.5132742f)), mul:float(mul:float(getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(0.35f)), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(ldc:float(0.1f), p3:float)))))
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u0c95\u8aa5\ub113\u34df\u156b\u527a, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), invokevirtual:float(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>::\u64ab\ua61f\u9033\u62da\u8308\u71ae, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>], getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u0c95\u8aa5\ub113\u34df\u156b\u527a, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>)), ldc:float(-0.15f)))
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u0c95\u8aa5\ub113\u34df\u156b\u527a, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), invokevirtual:float(\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>::\u64ab\ua61f\u9033\u62da\u8308\u71ae, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:\u98a4\ud171\u8aa5\u8df4\u120d\u6cfe<T>], getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u0c95\u8aa5\ub113\u34df\u156b\u527a, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>)), ldc:float(0.15f)))
                expr_18A = getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u3e2a\u71f1\u4f4a\ubf56\u3711\u3d4b, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>)
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, expr_18A:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, sub:float(getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, expr_18A:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e), mul:float(mul:float(getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(0.55f)), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(ldc:float(0.1f), p3:float)))))
                expr_1A6 = getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\ud158\u67e9\ube23\ua6bd\uc4d2\ub171, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>)
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, expr_1A6:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e, add:float(getfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, expr_1A6:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e), mul:float(mul:float(getfield:float(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(0.55f)), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(ldc:float(0.1f), p3:float)))))
                putfield:float(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u9937\u72f1\u4f4a\u99f7\u0a06\u9033, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8::\u56bd\ub70c\ub171\uae87\u6fb0\u3776, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>), ldc:float(0.0f))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\ud158\u8350\u183a\u516c\ubcb0(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u3711\u7ce1\u76bc\u7049\u16f6 p0, float p1, float p2, float p3, float p4, float p5) {
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
            invokevirtual:void(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<\u3504\uafe7\ucb79\u0c95\ubff1>::\u7bad\ud158\u8350\u183a\u516c\ubcb0, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, checkcast:\u3504\uafe7\ucb79\u0c95\ubff1(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3504\uafe7\ucb79\u0c95\ubff1.class, p0:\u3711\u7ce1\u76bc\u7049\u16f6[expected:\u3504\uafe7\ucb79\u0c95\ubff1]), p1:float, p2:float, p3:float, p4:float, p5:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\ud158\u8350\u183a\u516c\ubcb0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, float p1, float p2, float p3, float p4, float p5) {
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
            invokevirtual:void(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<\u3504\uafe7\ucb79\u0c95\ubff1>::\u7bad\ud158\u8350\u183a\u516c\ubcb0, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, checkcast:\u3504\uafe7\ucb79\u0c95\ubff1(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3504\uafe7\ucb79\u0c95\ubff1.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u3504\uafe7\ucb79\u0c95\ubff1]), p1:float, p2:float, p3:float, p4:float, p5:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\u61a4\uceb8\ud217\u8d98\uc246(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, float p1, float p2, float p3) {
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
            invokevirtual:void(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<\u3504\uafe7\ucb79\u0c95\ubff1>::\u6d69\u61a4\uceb8\ud217\u8d98\uc246, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, checkcast:\u3504\uafe7\ucb79\u0c95\ubff1(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3504\uafe7\ucb79\u0c95\ubff1.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u3504\uafe7\ucb79\u0c95\ubff1]), p1:float, p2:float, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\u61a4\uceb8\ud217\u8d98\uc246(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, float p1, float p2, float p3) {
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
            invokevirtual:void(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<\u3504\uafe7\ucb79\u0c95\ubff1>::\u6d69\u61a4\uceb8\ud217\u8d98\uc246, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, checkcast:\u3504\uafe7\ucb79\u0c95\ubff1(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3504\uafe7\ucb79\u0c95\ubff1.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u3504\uafe7\ucb79\u0c95\ubff1]), p1:float, p2:float, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\ud158\u8350\u183a\u516c\ubcb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, float p1, float p2, float p3, float p4, float p5) {
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
            invokevirtual:void(\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<\u3504\uafe7\ucb79\u0c95\ubff1>::\u7bad\ud158\u8350\u183a\u516c\ubcb0, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>, checkcast:\u3504\uafe7\ucb79\u0c95\ubff1(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3504\uafe7\ucb79\u0c95\ubff1.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u3504\uafe7\ucb79\u0c95\ubff1]), p1:float, p2:float, p3:float, p4:float, p5:float)
            return:void()
        }
        
        goto(Label_0006)
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
    
    public void \u4975\u6198\u516c\ubcb0\u7049\u4f4a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(1821252570), ldc:int(-374697346))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-507931683))
            var_5_7D = and:int(ldc:int(-16618), ldc:int(16617))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13120), ldc:int(13079)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_69F:int, ldc:int(-155667617))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(20545), ldc:int(20544)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(132), ldc:int(133)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_D2:int, ldc:int(-259376517))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1329), ldc:int(22603)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(348902943))
                        goto(Label_1583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-603424107))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(81580455))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1688884405))
                        goto(Label_0844)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(409036750))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-52887559))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0844)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1992883903))
                        goto(Label_1583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1110869617))
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2127727730))
                        goto(Label_0844)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1256843876))
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-56927239))
                            var_11_E3 = and:int(ldc:int(24619), ldc:int(-26940))
                            goto(Label_1572)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0571:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-950120616))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-552096668))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1998349495))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(201033670))
                        goto(Label_0844)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1264784591))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-221794858))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-122724641))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0844)
                        }
                    }
                    
                    Label_0712:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1335987492))
                        goto(Label_1583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(786066390))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-307369292))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(501111918))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2110307034))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0844:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1797976257))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-767868271))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-655007181))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(507184774))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1671102463))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(20610), ldc:int(20611))
                                goto(Label_1108)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1330205558))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1193855906))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2060254174))
                        var_11_E3 = and:int(ldc:int(-9130), ldc:int(9128))
                    }
                    
                    Label_1108:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-829123620))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1137350239))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-512814510))
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(535630267))
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1446337698))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2093609695))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1401)
                            }
                        }
                    }
                    
                    Label_1239:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(166088491))
                        goto(Label_1583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-453364583))
                            goto(Label_1108)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-2054793175))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0844)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(83384455))
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1776656407))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1306074857))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1805849303))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2097085436))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1572)
                    }
                    
                    Label_1401:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-270116338))
                        goto(Label_1583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1093280106))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1866376532))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-576652332))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(388805257))
                        goto(Label_0844)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(218265794))
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1689671706))
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-163507744))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(1737120762))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1572:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1583:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-912443875))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1091275928))
                        goto(Label_0844)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-840622380))
                        goto(Label_0712)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-410231938))
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-405053448))
                        var_17_6AA = add:int(var_16_111:int, and:int(ldc:int(16643), ldc:int(2293)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(-107250051))
                
                if (cmple:boolean(var_5_7D = var_17_6AA:int, sub:int(var_6_84:int, xor:int(ldc:int(2692), ldc:int(2693))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(1489266618))
            goto(Label_0106)
        }
    }
}
