public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b {
    private com.mojang.serialization.DataResult<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b> \ub102\uae87\ua3b4\u3504\ubb2b\u6435() {
        var_1_5F : int
        var_1_A0 : int
        stack_CE_0 : DataResult [generated]
        
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
        var_1_5F = and:int(ldc:int(500689773), ldc:int(484206543))
        
        if (cmpne:boolean(checkcast:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee.class, invokevirtual:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\ube23\ucb79\uc84e\u92ee\u965f\u3bc9, getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u7e3f\u4492\u760c\u6bb9\u4c2b\u4c04))), aconstnull:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee())) {
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_1_A0 = and:int(var_1_5F:int, ldc:int(1586838838))
                }
                else {
                    var_1_A0 = and:int(var_1_5F:int, ldc:int(-621381675))
                    
                    if (invokespecial:boolean(\u7043\u40a9\u4975\u0800\u385b::\u7e3f\u71ae\u8df4\u392e\u71ae\ubcb0, this:\u7043\u40a9\u4975\u0800\u385b)) {
                        stack_CE_0 = invokestatic:DataResult(DataResult::success, this:\u7043\u40a9\u4975\u0800\u385b[expected:Object], invokestatic:Lifecycle(Lifecycle::stable))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_A0:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_A0 = and:int(var_1_A0:int, ldc:int(-67701433))
                    stack_CE_0 = invokestatic:DataResult(DataResult::success, this:\u7043\u40a9\u4975\u0800\u385b[expected:Object])
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_A0:int, ldc:int(1755439491))
            }
            
            return:DataResult<\u7043\u40a9\u4975\u0800\u385b>(stack_CE_0:DataResult)
        }
        
        return:DataResult<\u7043\u40a9\u4975\u0800\u385b>(invokestatic:DataResult(DataResult::error, loadelement:String(getstatic:String[](\u7043\u40a9\u4975\u0800\u385b::\u760c\u99f7\u946b\u12b2\u0c95\ubb2b), and:int(ldc:int(2854), ldc:int(-2855)))))
    }
    
    private boolean \u7e3f\u71ae\u8df4\u392e\u71ae\ubcb0() {
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
            return:boolean(invokestatic:boolean(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\uae87\u51fa\uc84e\uc7fe\u51fa\ubcb0, getfield:long(\u7043\u40a9\u4975\u0800\u385b::\ud51e\u4daf\ub70c\ub18d\uc246\u5fe1, this:\u7043\u40a9\u4975\u0800\u385b), getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b)))
        }
        
        goto(Label_0006)
    }
    
    public void \u7043\u40a9\u4975\u0800\u385b(long p0, boolean p1, boolean p2, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee> p3) {
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
        invokespecial:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, this:\u7043\u40a9\u4975\u0800\u385b, p0:long, p1:boolean, p2:boolean, p3:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, invokestatic:Optional<String>(Optional<T>::empty))
        
        if (cmpne:boolean(checkcast:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee.class, invokevirtual:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\ube23\ucb79\uc84e\u92ee\u965f\u3bc9, p3:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u7e3f\u4492\u760c\u6bb9\u4c2b\u4c04))), aconstnull:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee())) {
            return:void()
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u7043\u40a9\u4975\u0800\u385b::\u760c\u99f7\u946b\u12b2\u0c95\ubb2b), and:int(ldc:int(26276), ldc:int(-28341)))))
    }
    
    private void \u7043\u40a9\u4975\u0800\u385b(long p0, boolean p1, boolean p2, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee> p3, java.util.Optional<java.lang.String> p4) {
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
            invokespecial:Object(Object::<init>, this:\u7043\u40a9\u4975\u0800\u385b)
            putfield:long(\u7043\u40a9\u4975\u0800\u385b::\ud51e\u4daf\ub70c\ub18d\uc246\u5fe1, this:\u7043\u40a9\u4975\u0800\u385b, p0:long)
            putfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\ubcb0\ud12e\u0b8e\ube23\uf9c5, this:\u7043\u40a9\u4975\u0800\u385b, p1:boolean)
            putfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\u12cb\u61a4\u8d90\u9033\u7c6b\u51fa, this:\u7043\u40a9\u4975\u0800\u385b, p2:boolean)
            putfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b, p3:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>)
            putfield:Optional<String>(\u7043\u40a9\u4975\u0800\u385b::\u7873\u6ec6\u7c6b\u97e6\u4daf\u36d3, this:\u7043\u40a9\u4975\u0800\u385b, p4:Optional<String>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u9255\u97b7\u624e\uc4d2\ud171\u8d90(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f p0) {
        var_3_67 : \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc2e8\u9255\u647c\ud171\ubf56>
        var_4_76 : int
        var_5_7F : \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>
        var_6_88 : \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u4179\uc9f6\u0c95\uceb8\uc87f>
        
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
            var_3_67 = invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc2e8\u9255\u647c\ud171\ubf56>(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, p0:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f))
            var_4_76 = invokevirtual:int(String::hashCode, loadelement:String(getstatic:String[](\u7043\u40a9\u4975\u0800\u385b::\u760c\u99f7\u946b\u12b2\u0c95\ubb2b), xor:int(ldc:int(1088), ldc:int(1089))))
            var_5_7F = invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, p0:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u3c25\u7ce1\u0c95\ubff1\u64f2\u718f))
            var_6_88 = invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u4179\uc9f6\u0c95\uceb8\uc87f>(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, p0:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u8350\u760c\u4d85\u071d\u93a2\ud51e))
            return:\u7043\u40a9\u4975\u0800\u385b(initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, i2l:long(var_4_76:int), and:int[expected:boolean](ldc:int(1091), ldc:int(4645)), and:int[expected:boolean](ldc:int(73), ldc:int(4017)), invokestatic:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u56bd\u47c2\u9af2\ubf56\u0b8e\u6d69, var_5_7F:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>], invokestatic:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u6cfe\u4d85\u120d\u5fe1\u071d\ub1b9, var_5_7F:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>], var_3_67:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc2e8\u9255\u647c\ud171\ubf56>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>], var_6_88:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u4179\uc9f6\u0c95\uceb8\uc87f>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>], i2l:long(var_4_76:int)), invokestatic:\ud158\uc9f6\u8413\u7049\uceb8\u3bd6(\u7043\u40a9\u4975\u0800\u385b::\ua61f\u4daf\u183a\u7006\ud4fe\u74b1, var_3_67:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc2e8\u9255\u647c\ud171\ubf56>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>], var_6_88:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u4179\uc9f6\u0c95\uceb8\uc87f>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>], i2l:long(var_4_76:int)))))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u8709\u62da\u9937\u8df4\ua3b4\ufe34(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p1, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f> p2) {
        var_5_6A : long
        
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
            var_5_6A = invokevirtual:long(Random::nextLong, initobject:Random(Random::<init>))
            return:\u7043\u40a9\u4975\u0800\u385b(initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, var_5_6A:long, and:int[expected:boolean](ldc:int(12453), ldc:int(17475)), and:int[expected:boolean](ldc:int(21670), ldc:int(-21695)), invokestatic:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u56bd\u47c2\u9af2\ubf56\u0b8e\u6d69, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>, invokestatic:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u6cfe\u4d85\u120d\u5fe1\u071d\ub1b9, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>, p1:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>, p2:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>, var_5_6A:long), invokestatic:\ud158\uc9f6\u8413\u7049\uceb8\u3bd6(\u7043\u40a9\u4975\u0800\u385b::\ua61f\u4daf\u183a\u7006\ud4fe\u74b1, p1:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>, p2:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>, var_5_6A:long))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ud158\uc9f6\u8413\u7049\uceb8\u3bd6 \ua61f\u4daf\u183a\u7006\ud4fe\u74b1(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f> p1, long p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public long \ubf56\u071d\u873d\u4c04\u0800\uc29a() {
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
            return:long(getfield:long(\u7043\u40a9\u4975\u0800\u385b::\ud51e\u4daf\ub70c\ub18d\uc246\u5fe1, this:\u7043\u40a9\u4975\u0800\u385b))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua6bd\u8258\u0b8e\ua61f\uc31c\ud51e() {
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
            return:boolean(getfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\ubcb0\ud12e\u0b8e\ube23\uf9c5, this:\u7043\u40a9\u4975\u0800\u385b))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub18d\uc9f6\u7043\u7c6b\ucfaf\u3e2a() {
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
            return:boolean(getfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\u12cb\u61a4\u8d90\u9033\u7c6b\u51fa, this:\u7043\u40a9\u4975\u0800\u385b))
        }
        
        goto(Label_0006)
    }
    
    public static \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee> \u56bd\u47c2\u9af2\ubf56\u0b8e\u6d69(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87> p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee> p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public static \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee> \u67d0\u9af2\u67d0\u4d85\u6c56\u516c(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee> p0, java.util.function.Supplier<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87> p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2) {
        var_3_9E : int
        var_5_6F : \u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>
        var_6_8F : Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>
        var_7_D1 : Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>, V>
        var_8_DD : \u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>
        
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
            var_3_9E = and:int(ldc:int(812501131), ldc:int(-136000373))
            var_5_6F = initobject:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::<init>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4f4a\u8709\u64ab\u4ab3\u6d69\ubff1), invokestatic:Lifecycle(Lifecycle::experimental))
            invokevirtual:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, var_5_6F:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u7e3f\u4492\u760c\u6bb9\u4c2b\u4c04), initobject:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::<init>, p1:Supplier<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>, p2:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0), invokestatic:Lifecycle(Lifecycle::stable))
            var_6_8F = invokeinterface:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>(Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>::iterator, invokevirtual:Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\u516c\ud51e\u3e2a\u36d3\uc7fe\u836c, p0:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>))
            
            loop {
                if (cmpne:boolean(and:int(var_3_9E:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_9E = and:int(var_3_9E:int, ldc:int(1591532731))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_8F:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>)) {
                        var_7_D1 = checkcast:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>, V>(java.util.Map.Entry<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<java.lang.Object>, V>.class, invokeinterface:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>::next, var_6_8F:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>))
                        var_8_DD = checkcast:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<java.lang.Object>.class, invokeinterface:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>, V>::getKey, var_7_D1:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>, V>))
                        
                        if (cmpne:boolean(var_8_DD:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u7e3f\u4492\u760c\u6bb9\u4c2b\u4c04))) {
                            invokevirtual:V(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, var_5_6F:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, var_8_DD:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, invokeinterface:V(Entry<K, V>::getValue, var_7_D1:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>, V>), invokevirtual:Lifecycle(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\u8df4\u4492\u983f\uc246\u6ec6\u4cd9, p0:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, invokeinterface:V[expected:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee](Entry<K, V>::getValue, var_7_D1:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>, V>)))
                        }
                        
                        var_3_9E = and:int(var_3_9E:int, ldc:int(2026753977))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_9E:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_9E = and:int(var_3_9E:int, ldc:int(378214011))
            }
            
            return:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(var_5_6F:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>)
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee> \u9937\u74b1\u7c6b\ub7dc\u3bc9\u1833() {
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
            return:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 \u7330\ub171\u6bb9\u527a\u6bb9\u71ae() {
        var_3_6F : \u6ec6\ub19c\u392e\uc238\u51fa\u92ee
        
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
        var_3_6F = checkcast:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee.class, invokevirtual:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\ube23\ucb79\uc84e\u92ee\u965f\u3bc9, getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u7e3f\u4492\u760c\u6bb9\u4c2b\u4c04)))
        
        if (cmpne:boolean(var_3_6F:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee, aconstnull:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee())) {
            return:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\ufcaf\u4c2b\u600f\u9937\u183a\uf995, var_3_6F:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee))
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u7043\u40a9\u4975\u0800\u385b::\u760c\u99f7\u946b\u12b2\u0c95\ubb2b), and:int(ldc:int(-4337), ldc:int(4336)))))
    }
    
    public com.google.common.collect.ImmutableSet<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>> \u3dd3\u4e72\u4daf\ub70c\u5f50\u8aa5() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public boolean \u8df4\u5f50\u8df4\u0800\u6cfe\u4cd9() {
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
            return:boolean(instanceof:boolean(\u59ec\u8413\u97e6\uc229\u3776.\ub18d\u156b\u92ff\u4bc8\u6b5f.class, invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u7043\u40a9\u4975\u0800\u385b::\u7330\ub171\u6bb9\u527a\u6bb9\u71ae, this:\u7043\u40a9\u4975\u0800\u385b)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4f52\u927d\u61a4\ub1b9\u3e2a\ud51e() {
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
            return:boolean(instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u40a9\uf995\u7d52\u8d90\u76bc.class, invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u7043\u40a9\u4975\u0800\u385b::\u7330\ub171\u6bb9\u527a\u6bb9\u71ae, this:\u7043\u40a9\u4975\u0800\u385b)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4bc8\u1187\ubb2b\u759a\uf9c5\u4c04() {
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
            return:boolean(invokevirtual:boolean(Optional<T>::isPresent, getfield:Optional<String>(\u7043\u40a9\u4975\u0800\u385b::\u7873\u6ec6\u7c6b\u97e6\u4daf\u36d3, this:\u7043\u40a9\u4975\u0800\u385b)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u3bc9\u4f52\u6d69\uae5d\ub1b9\u516c() {
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
            return:\u7043\u40a9\u4975\u0800\u385b(initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, getfield:long(\u7043\u40a9\u4975\u0800\u385b::\ud51e\u4daf\ub70c\ub18d\uc246\u5fe1, this:\u7043\u40a9\u4975\u0800\u385b), getfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\ubcb0\ud12e\u0b8e\ube23\uf9c5, this:\u7043\u40a9\u4975\u0800\u385b), xor:int[expected:boolean](ldc:int(-30702), ldc:int(-30701)), getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b), getfield:Optional<String>(\u7043\u40a9\u4975\u0800\u385b::\u7873\u6ec6\u7c6b\u97e6\u4daf\u36d3, this:\u7043\u40a9\u4975\u0800\u385b)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u4ab3\u7043\u74b1\u760c\u67e9\ub113() {
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
            return:\u7043\u40a9\u4975\u0800\u385b(initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, getfield:long(\u7043\u40a9\u4975\u0800\u385b::\ud51e\u4daf\ub70c\ub18d\uc246\u5fe1, this:\u7043\u40a9\u4975\u0800\u385b), ternaryop:int[expected:boolean](getfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\ubcb0\ud12e\u0b8e\ube23\uf9c5, this:\u7043\u40a9\u4975\u0800\u385b), and:int(ldc:int(25987), ldc:int(-28580)), xor:int(ldc:int(8289), ldc:int(8288))), getfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\u12cb\u61a4\u8d90\u9033\u7c6b\u51fa, this:\u7043\u40a9\u4975\u0800\u385b), getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u6c52\ub32d\u5fe1\u6b0d\uc3e3\u3e75() {
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
            return:\u7043\u40a9\u4975\u0800\u385b(initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, getfield:long(\u7043\u40a9\u4975\u0800\u385b::\ud51e\u4daf\ub70c\ub18d\uc246\u5fe1, this:\u7043\u40a9\u4975\u0800\u385b), getfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\ubcb0\ud12e\u0b8e\ube23\uf9c5, this:\u7043\u40a9\u4975\u0800\u385b), ternaryop:int[expected:boolean](getfield:boolean(\u7043\u40a9\u4975\u0800\u385b::\u12cb\u61a4\u8d90\u9033\u7c6b\u51fa, this:\u7043\u40a9\u4975\u0800\u385b), and:int(ldc:int(-17858), ldc:int(17857)), and:int(ldc:int(17), ldc:int(17699))), getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b)))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \ub32d\u839e\uc31c\ubff1\u6d99\u0b8e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f p0, java.util.Properties p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u873d\u759a\ubf56\u7d52\ud523\u7ce1(boolean p0, java.util.OptionalLong p1) {
        var_3_61 : int
        var_5_6A : long
        var_3_1A3 : int
        var_7_7D : \u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>
        var_8_99 : long
        var_10_A7 : Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>
        var_11_E9 : Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>
        var_3_146 : int
        expr_14B : long [generated]
        stack_1A6_3 : boolean [generated]
        stack_1A6_4 : int [generated]
        var_13_183 : \u7043\u40a9\u4975\u0800\u385b
        
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
            var_3_61 = and:int(ldc:int(244271209), ldc:int(180208255))
            var_5_6A = invokevirtual:long(OptionalLong::orElse, p1:OptionalLong, getfield:long(\u7043\u40a9\u4975\u0800\u385b::\ud51e\u4daf\ub70c\ub18d\uc246\u5fe1, this:\u7043\u40a9\u4975\u0800\u385b))
            
            if (logicalnot:boolean(invokevirtual:boolean(OptionalLong::isPresent, p1:OptionalLong))) {
                var_3_1A3 = and:int(var_3_61:int, ldc:int(-1163954690))
                var_7_7D = getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b)
            }
            else {
                var_7_7D = initobject:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::<init>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4f4a\u8709\u64ab\u4ab3\u6d69\ubff1), invokestatic:Lifecycle(Lifecycle::experimental))
                var_8_99 = invokevirtual:long(OptionalLong::getAsLong, p1:OptionalLong)
                var_10_A7 = invokeinterface:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>(Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>::iterator, invokevirtual:Set<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\u516c\ud51e\u3e2a\u36d3\uc7fe\u836c, getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b)))
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-825265941))
                        
                        if (invokeinterface:boolean(Iterator::hasNext, var_10_A7:Iterator)) {
                            var_11_E9 = checkcast:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>(java.util.Map.Entry<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>.class, invokeinterface:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>::next, var_10_A7:Iterator<Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, \u6ec6\ub19c\u392e\uc238\u51fa\u92ee>>))
                            invokevirtual:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, var_7_7D:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>, checkcast:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<java.lang.Object>.class, invokeinterface:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>, V>::getKey, var_11_E9:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>, V>)), initobject:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::<init>, invokevirtual:Supplier<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u624e\u8aa5\u9255\u836c\u960f\u67d0, checkcast:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee.class, invokeinterface:V(Entry<K, V>::getValue, var_11_E9:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>))), invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\u92ff\u7049\u8d90\uf995\u71ae\u7043, invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\ufcaf\u4c2b\u600f\u9937\u183a\uf995, checkcast:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee.class, invokeinterface:V(Entry<K, V>::getValue, var_11_E9:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>))), var_8_99:long)), invokevirtual:Lifecycle(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>::\u8df4\u4492\u983f\uc246\u6ec6\u4cd9, getfield:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u3711\ub19c\u1833\u8aa5\u97b7\u7bad, this:\u7043\u40a9\u4975\u0800\u385b), invokeinterface:V(Entry<K, V>::getValue, var_11_E9:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>)))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(16)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(1630720948))
                }
                
                var_3_1A3 = and:int(var_3_61:int, ldc:int(248375035))
            }
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\u8df4\u5f50\u8df4\u0800\u6cfe\u4cd9, this:\u7043\u40a9\u4975\u0800\u385b))) {
                var_3_146 = and:int(var_3_1A3:int, ldc:int(535779691))
                expr_14B = var_5_6A:long
                stack_1A6_3 = invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\u8258\u0b8e\ua61f\uc31c\ud51e, this:\u7043\u40a9\u4975\u0800\u385b)
                stack_1A6_4 = ternaryop:int(logicaland:boolean(invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ub18d\uc9f6\u7043\u7c6b\ucfaf\u3e2a, this:\u7043\u40a9\u4975\u0800\u385b), logicalnot:boolean(p0:boolean)), xor:int(ldc:int(4140), ldc:int(4141)), and:int(ldc:int(-1091), ldc:int(1090)))
                var_3_1A3 = and:int(var_3_146:int, ldc:int(1334798202))
                var_13_183 = initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, expr_14B:long, stack_1A6_3:boolean, stack_1A6_4:boolean, var_7_7D:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>)
            }
            else {
                var_13_183 = initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, var_5_6A:long, and:int[expected:boolean](ldc:int(1876), ldc:int(-5974)), and:int[expected:boolean](ldc:int(-4085), ldc:int(4080)), var_7_7D:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>)
            }
            
            return:\u7043\u40a9\u4975\u0800\u385b(var_13_183:\u7043\u40a9\u4975\u0800\u385b)
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f lambda$\uc7fe\u34df\u5d20\u51fa\uafe7\u8413$8(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\u4179\uc9f6\u0c95\uceb8\uc87f(checkcast:\u4179\uc9f6\u0c95\uceb8\uc87f(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f.class, invokevirtual:\u4179\uc9f6\u0c95\uceb8\uc87f(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u4179\uc9f6\u0c95\uceb8\uc87f>(\u4179\uc9f6\u0c95\uceb8\uc87f::\u6b5f\ufcaf\u385b\u69d9\ua61f\u3504))))
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f lambda$\u51fa\uae5d\u3776\u8aa5\u92ee\u960f$7(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\u4179\uc9f6\u0c95\uceb8\uc87f(checkcast:\u4179\uc9f6\u0c95\uceb8\uc87f(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f.class, invokevirtual:\u4179\uc9f6\u0c95\uceb8\uc87f(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u4179\uc9f6\u0c95\uceb8\uc87f>(\u4179\uc9f6\u0c95\uceb8\uc87f::\uc31c\ub8be\ud171\u64ab\ub18d\ud523))))
        }
        
        goto(Label_0006)
    }
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e lambda$\ucfaf\u392e\u983f\u624e\uc246\u8753$6(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e(invokestatic:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\ud171\ud217\u6ec6\u8640\u8753\u7d52, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u7d52\u8709\u946b\uf9c5\uae5d\u839e$5(java.lang.String p0) {
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
            return:String(invokevirtual:String(String::toLowerCase, p0:String, getstatic:Locale(Locale::ROOT)))
        }
        
        goto(Label_0006)
    }
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6 lambda$\ud7e8\ucef1\uc246\u8d90\ub83f\u839e$4(java.util.Map.Entry p0) {
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
            return:\u64f2\ub8be\u760c\u5245\u6c52\u7af6(invokestatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<Object>::\u8c8a\u0800\uceb8\u647c\ud4fe\u6c56, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u47c2\uc229\u759a\u2dcc\u2dcc\u34df), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, checkcast:\u64f2\ub8be\u760c\u5245\u6c52\u7af6(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6.class, invokeinterface:\u64f2\ub8be\u760c\u5245\u6c52\u7af6(Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>::getKey, p0:Entry<\u64f2\ub8be\u760c\u5245\u6c52\u7af6, V>)))))
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87 lambda$\u494c\uae87\uae5d\uc2e8\u183a\ud36e$3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6ec6\ub19c\u392e\uc238\u51fa\u92ee p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p1) {
        var_2_61 : int
        stack_87_0 : \u3d4b\u9937\u7af6\u7af6\u6198\uae87 [generated]
        
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
            var_2_61 = and:int(ldc:int(-950752154), ldc:int(-405004641))
            
            if (cmpne:boolean(p0:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee, aconstnull:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee())) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-985797497))
                stack_87_0 = invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\u6ec6\ub19c\u392e\uc238\u51fa\u92ee::\u3504\u0b8e\u93a2\u0800\u3a62\u69d9, p0:\u6ec6\ub19c\u392e\uc238\u51fa\u92ee)
            }
            else {
                stack_87_0 = checkcast:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87.class, invokevirtual:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p1:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u9a18\u6cfe\uae5d\u385b\ub70c\u9a18)))
            }
            
            return:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(stack_87_0:\u3d4b\u9937\u7af6\u7af6\u6198\uae87)
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f lambda$\u51b2\u071d\u071d\u8308\u0800\u3e75$2(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\u4179\uc9f6\u0c95\uceb8\uc87f(checkcast:\u4179\uc9f6\u0c95\uceb8\uc87f(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f.class, invokevirtual:\u4179\uc9f6\u0c95\uceb8\uc87f(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u4179\uc9f6\u0c95\uceb8\uc87f>(\u4179\uc9f6\u0c95\uceb8\uc87f::\u6b5f\ufcaf\u385b\u69d9\ua61f\u3504))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\uc29a\u7043\ubded\ube23\ud36e\u983f$1(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static java.util.Optional lambda$\u071d\u6cfe\u6c56\u76bc\u6198\ubefe$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p0) {
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
            return:Optional(getfield:Optional<String>(\u7043\u40a9\u4975\u0800\u385b::\u7873\u6ec6\u7c6b\u97e6\u4daf\u36d3, p0:\u7043\u40a9\u4975\u0800\u385b))
        }
        
        goto(Label_0006)
    }
    
    static {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \ud4fe\ub32d\u416d\u64ab\u873d\ubb2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_667 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_672 : int
        
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
        var_3_667 = and:int(ldc:int(1291648726), ldc:int(-910820140))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7043\u40a9\u4975\u0800\u385b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
            var_3_667 = and:int(var_3_667:int, ldc:int(-822270003))
        }
        else {
            var_3_667 = and:int(var_3_667:int, ldc:int(-134808206))
            var_5_8A = and:int(ldc:int(-1431), ldc:int(1430))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12192), ldc:int(-12217)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_667:int, ldc:int(-1409647364))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(4097), ldc:int(4096)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(26625), ldc:int(4379)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_667 = and:int(var_3_DA:int, ldc:int(1542708571))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(3216), ldc:int(3217)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(442136609))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1882504856))
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(612232472))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(79783058))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-879839001))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-302847218))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(330915699))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1997085990))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-504879653))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1801154008))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1724422384))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-980311677))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-1489578204))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-537428906))
                        var_11_EB = and:int(ldc:int(-26645), ldc:int(26644))
                        goto(Label_1533)
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1184026813))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1145258086))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(733076820))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1327372171))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-873210030))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-1825150427))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1501256840))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-261285990))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1011687847))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(19521), ldc:int(531))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1477541344))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1898057301))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-361597003))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1796418737))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1766121725))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-306815244))
                        var_11_EB = and:int(ldc:int(-16343), ldc:int(15830))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-284182661))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1985465337))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-479167965))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-706168596))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-361955465))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(984637175))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1405)
                            }
                        }
                    }
                    
                    Label_1243:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(2133109316))
                            goto(Label_1110)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(911145902))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-750603838))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-2090342260))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(940407108))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(64)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-128948387))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-419558361))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1917002531))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1533)
                    }
                    
                    Label_1405:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(107527447))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1165616021))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1458881498))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_667 = and:int(var_3_667:int, ldc:int(1287512028))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1533:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_672 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1544:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1337655516))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-48331301))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-373457580))
                        var_17_672 = add:int(var_16_119:int, xor:int(ldc:int(4482), ldc:int(4483)))
                        looporswitchbreak()
                    }
                }
                
                var_3_667 = and:int(var_3_667:int, ldc:int(-974103043))
                
                if (cmple:boolean(var_5_8A = var_17_672:int, sub:int(var_6_91:int, xor:int(ldc:int(19472), ldc:int(19473))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
