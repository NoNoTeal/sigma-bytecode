public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2 {
    public void \u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0 p0) {
        var_4_6D : \uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0
        var_5_9A : byte[]
        var_6_A3 : int
        
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
            invokespecial:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee(\u7bad\u4d85\u7ce1\u071d\u873d\u92ee::<init>, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0)
            var_4_6D = invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1935894633L))
            putfield:String(\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\u624e\u2dcc\u385b\u8753\u8d98\u960f, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2, initobject:String(String::<init>, invokevirtual:byte[](\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6::\u1833\u120d\u120d\u34df\u4ab3\u92ee, checkcast:\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6(\u494c\u4975\ua068\u0c95\uc84e.\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, var_4_6D:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1970496882L))))))
            var_5_9A = invokevirtual:byte[](\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6::\u1833\u120d\u120d\u34df\u4ab3\u92ee, checkcast:\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6(\u494c\u4975\ua068\u0c95\uc84e.\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0[expected:\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6](\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, var_4_6D:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1851878757L))))
            var_6_A3 = and:int(ldc:int(3400), ldc:int(-19801))
            
            while (cmpne:boolean(loadelement:byte(var_5_9A:byte[], var_6_A3:int), ldc:byte(0))) {
                inc:int(var_6_A3, ldc:int(1))
            }
            
            putfield:String(\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\uc7fe\ud523\ucef1\u3bc9\u0c95\u0a06, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2, initobject:String(String::<init>, var_5_9A:byte[], and:int(ldc:int(5406), ldc:int(-32031)), sub:int(var_6_A3:int, xor:int(ldc:int(288), ldc:int(289)))))
            putfield:String(\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\ub1b9\u9937\u97b7\u7bad\ud36e\ub113, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2, initobject:String(String::<init>, invokevirtual:byte[](\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6::\u1833\u120d\u120d\u34df\u4ab3\u92ee, checkcast:\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6(\u494c\u4975\ua068\u0c95\uc84e.\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, var_4_6D:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1801812256L))))))
            putfield:byte[](\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\ub18d\u8389\uc4d2\ubded\u624e\ubded, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2, invokevirtual:byte[](\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6::\u1833\u120d\u120d\u34df\u4ab3\u92ee, checkcast:\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6(\u494c\u4975\ua068\u0c95\uc84e.\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, var_4_6D:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1886546294L)))))
            putfield:byte[](\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\u6b0d\ud523\u6b5f\u0b8e\u7e3f\u6fb0, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2, invokevirtual:byte[](\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6::\u1833\u120d\u120d\u34df\u4ab3\u92ee, checkcast:\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6(\u494c\u4975\ua068\u0c95\uc84e.\ua6bd\u12b2\u4cd9\uc238\u6d99\u6ec6.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, var_4_6D:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1769367926L)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uae87\ub171\ubff1\u5db4\u88c5\u3e2a \u3711\u67e9\ubff1\u8350\u7ce1\ubb2b() {
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
            return:\uae87\ub171\ubff1\u5db4\u88c5\u3e2a(getstatic:\uae87\ub171\ubff1\u5db4\u88c5\u3e2a(\uae87\ub171\ubff1\u5db4\u88c5\u3e2a::\u2dcc\uc9f6\u873d\ub8be\u7873\u8cae))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u6fb0\u0a06\uafe7\u5db4\u67e9\u99f7() {
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
            return:String(getfield:String(\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\u624e\u2dcc\u385b\u8753\u8d98\u960f, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ub70c\u927d\u64ab\u6198\u8753\u4bc8() {
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
            return:String(getfield:String(\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\uc7fe\ud523\ucef1\u3bc9\u0c95\u0a06, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u1187\u6198\u7d52\u385b\uc910\u99f7() {
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
            return:String(getfield:String(\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\ub1b9\u9937\u97b7\u7bad\ud36e\ub113, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2))
        }
        
        goto(Label_0006)
    }
    
    public byte[] \ubb2b\u873d\u74b1\uf995\ud217\u12cb() {
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
            return:byte[](getfield:byte[](\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\ub18d\u8389\uc4d2\ubded\u624e\ubded, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2))
        }
        
        goto(Label_0006)
    }
    
    public byte[] \u5fe1\u8389\u4cd9\u8d90\ud51e\u8d98() {
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
            return:byte[](getfield:byte[](\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2::\u6b0d\ud523\u6b5f\u0b8e\u7e3f\u6fb0, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2))
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
    
    public void \u839e\u4ab3\u7d52\u9033\u0800\u51b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_629 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_634 : int
        
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
        var_3_629 = and:int(ldc:int(-129936805), ldc:int(-915551270))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8258\u8c8a\u6d99\uc2e8\u6c56\u64f2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_629 = and:int(var_3_629:int, ldc:int(-869098725))
        }
        else {
            var_3_629 = and:int(var_3_629:int, ldc:int(-36308997))
            var_5_85 = and:int(ldc:int(30728), ldc:int(-30729))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2889), ldc:int(2888)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_629:int, ldc:int(-899078212))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(9413), ldc:int(4097)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(18452), ldc:int(18453)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_629 = and:int(var_3_DA:int, ldc:int(-656418148))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(69), ldc:int(11809)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(256)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1530660518))
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-622061401))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(811285082))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1562097515))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(16)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-331122977))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(256)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1184340319))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-695738181))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(32)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1743822822))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(1590118971))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(880215698))
                            loopcontinue()
                        }
                        
                        var_3_629 = and:int(var_3_629:int, ldc:int(-612368810))
                        var_11_EB = and:int(ldc:int(-4739), ldc:int(4738))
                        goto(Label_1453)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(4)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-787367704))
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(1212178946))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(1356787513))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(641580620))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1892164978))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(256)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(940419450))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_629 = and:int(var_3_629:int, ldc:int(-354613734))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(300950857))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-825735862))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(4)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(1464097905))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(1405243173))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(512)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(911886106))
                            loopcontinue()
                        }
                        
                        var_3_629 = and:int(var_3_629:int, ldc:int(-588393483))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1829699754))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1342362383))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(381929824))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(32)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1062831229))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(-1041638111))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(1132612233))
                            loopcontinue()
                        }
                        
                        var_3_629 = and:int(var_3_629:int, ldc:int(-923546629))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(2561), ldc:int(20847))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(324064689))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(32)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(656689147))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(4)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(1747189349))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_629 = and:int(var_3_629:int, ldc:int(-616449033))
                        var_11_EB = and:int(ldc:int(-25770), ldc:int(25760))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(-1799986105))
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(1099765427))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(186482149))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(1142448568))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(65748576))
                            loopcontinue()
                        }
                        
                        var_3_629 = and:int(var_3_629:int, ldc:int(-906674382))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1283036287))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1075)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(-524192422))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(457610912))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_629:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_629 = and:int(var_3_629:int, ldc:int(-238473491))
                            loopcontinue()
                        }
                        
                        var_3_629 = and:int(var_3_629:int, ldc:int(-121118156))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1453)
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(4)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(679572784))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1610105373))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-290080533))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(16)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1544357509))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(1535182195))
                        loopcontinue()
                    }
                    
                    var_3_629 = and:int(var_3_629:int, ldc:int(-303845579))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1453:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_634 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1464:
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(244435551))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1227973621))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-1244217462))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(256)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(1716144820))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_629:int, ldc:int(4)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-97977815))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(32)), ldc:int(0))) {
                        var_3_629 = and:int(var_3_629:int, ldc:int(-909905377))
                        var_17_634 = add:int(var_16_119:int, xor:int(ldc:int(16664), ldc:int(16665)))
                        looporswitchbreak()
                    }
                }
                
                var_3_629 = and:int(var_3_629:int, ldc:int(-118526049))
                
                if (cmple:boolean(var_5_85 = var_17_634:int, sub:int(var_6_8C:int, and:int(ldc:int(2119), ldc:int(1825))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_629:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_629 = and:int(var_3_629:int, ldc:int(-33125011))
            goto(Label_0106)
        }
    }
}
