public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e {
    public void \uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e(java.io.InputStream p0, javax.sound.sampled.AudioFormat p1, long p2) {
        var_9_80 : List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>
        
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
        invokespecial:\u6198\u8413\u7049\u9af2\u72f1\u92ff(\u6198\u8413\u7049\u9af2\u72f1\u92ff::<init>, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e, p0:InputStream, p1:AudioFormat, p2:long)
        var_9_80 = invokevirtual:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\ub83f\u5d20\uae87\u0c95\u16f6\u0a06, invokevirtual:\ua068\ud217\u71ae\u8d98\u9937\u76bc(\u516c\ub6ab\ucfaf\u47c2\u5f50\ud523::\ucef1\uc9f6\u6d99\u72f1\u9a18\u4179, initobject:\u516c\ub6ab\ucfaf\u47c2\u5f50\ud523(\u516c\ub6ab\ucfaf\u47c2\u5f50\ud523::<init>, p0:InputStream)), getstatic:\ua6bd\u183a\u8d90\uc2bd\u1833\u98a4[expected:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56](\ua6bd\u183a\u8d90\uc2bd\u1833\u98a4::\u5fe1\u4cd9\uafe7\u93a2\uc246\ubcb0))
        
        if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_9_80:List))) {
            putfield:\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u6435\u718f\u71ae\uae5d\u3e75\u16f6, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e, checkcast:\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85.class, invokeinterface:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::get, var_9_80:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>, and:int(ldc:int(18637), ldc:int(-18894)))))
            putfield:\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u6c52\uafe7\ud51e\u1833\u983f\ub32d, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e, initobject:\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7(\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7::<init>, invokevirtual:byte[](\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\uc229\u6b5f\ua3b4\u7d52\uc87f\ud4fe, getfield:\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85[expected:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u6435\u718f\u71ae\uae5d\u3e75\u16f6, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))))
            putfield:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u071d\ud171\u5654\u385b\u64ab\u34df, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e, initobject:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::<init>))
            return:void()
        }
        
        athrow(initobject:IOException(IOException::<init>, loadelement:String(getstatic:String[](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\ud158\uc7fe\uc910\ud158\u3dd3\ua068), and:int(ldc:int(-31545), ldc:int(23344)))))
    }
    
    public javax.sound.sampled.AudioFormat getFormat() {
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
            
            if (cmpeq:boolean(getfield:AudioFormat(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u92ee\u9a18\u71ae\u6d99\u446c\ud36e, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e), aconstnull:AudioFormat())) {
                invokespecial:void(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u7043\ud158\u98a4\u3711\ud51e\u0b8e, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e)
                putfield:AudioFormat(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u92ee\u9a18\u71ae\u6d99\u446c\ud36e, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e, initobject:AudioFormat(AudioFormat::<init>, i2f:float(invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\uc29a\u64ab\u67e9\ubb2b\u6d69\u8308, getfield:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u071d\ud171\u5654\u385b\u64ab\u34df, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))), invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\ud158\u3776\ub8be\u3dd3\ub70c\u4daf, getfield:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u071d\ud171\u5654\u385b\u64ab\u34df, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e)), invokevirtual:int(\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\u4f52\uc84e\ub18d\u946b\u92ff\uc246, getfield:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u071d\ud171\u5654\u385b\u64ab\u34df, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e)), and:int[expected:boolean](ldc:int(5741), ldc:int(129)), and:int[expected:boolean](ldc:int(16487), ldc:int(3729))))
                putfield:byte[](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u5d20\u3d4b\u9af2\u946b\u7ce1\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e, invokevirtual:byte[](\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\u59ec\uc7fe\u647c\ubcb0\ub113\u4bc8, getfield:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u071d\ud171\u5654\u385b\u64ab\u34df, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e)))
            }
            
            return:AudioFormat(getfield:AudioFormat(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u92ee\u9a18\u71ae\u6d99\u446c\ud36e, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public void \uc31c\u3a62\ucfaf\u446c\u873d\u7873() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(1510951580), ldc:int(2085310139))
            
            if (cmpne:boolean(getfield:byte[](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u5d20\u3d4b\u9af2\u946b\u7ce1\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e), aconstnull:byte[]())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2125430559))
                invokevirtual:int(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\u7ce1\u9af2\u71ae\u946b\u1187\ub70c, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e), getfield:byte[](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u5d20\u3d4b\u9af2\u946b\u7ce1\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))
                putfield:byte[](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u5d20\u3d4b\u9af2\u946b\u7ce1\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e, aconstnull:byte[]())
            }
            else {
                invokespecial:void(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u7043\ud158\u98a4\u3711\ud51e\u0b8e, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e)
                
                if (invokevirtual:boolean(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\u71f1\u3c25\uc9f6\u6d69\uc4d2\u88c5, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))) {
                    invokevirtual:int(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\u7ce1\u9af2\u71ae\u946b\u1187\ub70c, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e), invokevirtual:byte[](\u4c2b\u120d\u6435\u5db4\u9255\u6cfe::\u59ec\uc7fe\u647c\ubcb0\ub113\u4bc8, getfield:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u071d\ud171\u5654\u385b\u64ab\u34df, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7043\ud158\u98a4\u3711\ud51e\u0b8e() {
        var_1_1D4 : int
        var_3_115 : \u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04
        
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
        var_1_1D4 = and:int(ldc:int(892422808), ldc:int(1022925783))
        
        loop {
            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0231)
            }
            
            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(524288)), ldc:int(0))) {
                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(1889583558))
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(4)), ldc:int(0))) {
                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(1434218418))
                
                if (invokevirtual:boolean(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u600f\u1833\uc2bd\u4d85\uc229\u1187, getfield:\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85[expected:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u6435\u718f\u71ae\uae5d\u3e75\u16f6, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))) {
                    try {
                        var_3_115 = invokevirtual:\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u7c6b\ub8be\u8d90\uf94d\u927d\u6c56, getfield:\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85[expected:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u6435\u718f\u71ae\uae5d\u3e75\u16f6, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0489)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(1048576)), ldc:int(0))) {
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(-1841404873))
                                goto(Label_0428)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_0372)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(32)), ldc:int(0))) {
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(900767359))
                                
                                if (cmpne:boolean(var_3_115:\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04, aconstnull:\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04())) {
                                    invokevirtual:void(\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7::\u52d3\u7af6\ub113\ub19c\ua562\u4975, getfield:\u6c56\uf94d\u7bad\u9af2\ufe34\u99f7(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u6c52\uafe7\ud51e\u1833\u983f\ub32d, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e), invokevirtual:byte[](\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04::\u12b2\u446c\uc84e\u7c6b\ucb79\u494c, var_3_115:\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04), getfield:\u4c2b\u120d\u6435\u5db4\u9255\u6cfe(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\u071d\ud171\u5654\u385b\u64ab\u34df, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))
                                    goto(Label_0489)
                                }
                            }
                            
                            Label_0323:
                            
                            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(512)), ldc:int(0))) {
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(912362537))
                                goto(Label_0489)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_0428)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(1073741824)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_1D4 = and:int(var_1_1D4:int, ldc:int(1679456345))
                                    loopcontinue()
                                }
                                
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(363925470))
                            }
                            
                            Label_0372:
                            
                            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(268435456)), ldc:int(0))) {
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(-1292617798))
                                goto(Label_0489)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(1)), ldc:int(0))) {
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(-142354317))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_0323)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(67108864)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(2087820816))
                                invokevirtual:void(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\ufe34\uc229\u7c6b\u5d20\ucef1\u8d90, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))
                            }
                            
                            Label_0428:
                            
                            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(2097152)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_0372)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(524288)), ldc:int(0))) {
                                    goto(Label_0323)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(131072)), ldc:int(0))) {
                                    var_1_1D4 = and:int(var_1_1D4:int, ldc:int(-1066137579))
                                    loopcontinue()
                                }
                                
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(-1640788364))
                                return:void()
                            }
                            
                            Label_0489:
                            
                            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_0428)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(1700385381))
                                goto(Label_0372)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_0323)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(268435456)), ldc:int(0))) {
                                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(356473663))
                                looporswitchbreak()
                            }
                        }
                    }
                    catch (java.io.IOException var_3_219) {
                        invokevirtual:void(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\ufe34\uc229\u7c6b\u5d20\ucef1\u8d90, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))
                    }
                    
                    return:void()
                }
            }
            
            Label_0140:
            
            if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0231)
            }
            
            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(67108864)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_1D4:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_1D4 = and:int(var_1_1D4:int, ldc:int(1561439725))
                    loopcontinue()
                }
                
                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(343677873))
            }
            
            Label_0174:
            
            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(1609558460))
            }
            else {
                if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_1D4 = and:int(var_1_1D4:int, ldc:int(1323779052))
                    goto(Label_0140)
                }
                
                if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_1D4 = and:int(var_1_1D4:int, ldc:int(-289532290))
                    loopcontinue()
                }
                
                var_1_1D4 = and:int(var_1_1D4:int, ldc:int(2118118237))
                invokevirtual:void(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\ufe34\uc229\u7c6b\u5d20\ucef1\u8d90, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e))
            }
            
            Label_0231:
            
            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0140)
            }
            
            if (cmpne:boolean(and:int(var_1_1D4:int, ldc:int(2097152)), ldc:int(0))) {
                return:void()
            }
            
            var_1_1D4 = and:int(var_1_1D4:int, ldc:int(-32889391))
        }
    }
    
    static {
        var_0_AF : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_195_0 : byte[] [generated]
        stack_1D0_0 : byte[] [generated]
        stack_22D_0 : byte[] [generated]
        stack_2A9_0 : byte[] [generated]
        var_4_177 : int
        var_3_17C : byte[]
        var_5_17D : int
        var_0_223 : int
        expr_22D : byte [generated]
        stack_274_2 : byte [generated]
        stack_252_0 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1BE : byte[]
        var_5_1BF : int
        expr_C3 : int [generated]
        expr_FE : int [generated]
        var_3_297 : byte[]
        var_5_298 : int
        expr_2AC : byte [generated]
        var_3_13D : String
        stack_170_0 : String[] [generated]
        expr_14F : String[] [generated]
        
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
        var_0_AF = and:int(ldc:int(-81374496), ldc:int(-1085245770))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_131_0 = stack_195_0 = stack_1D0_0 = stack_22D_0 = stack_2A9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("DUTFnSdbRS0s96t1NJ+DHQUslb11T3M1BMf0/Q12Wq1ljT1HfQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_177 = expr_6B:int
        var_3_17C = newarray:byte[](byte.class, expr_6B:int)
        var_5_17D = expr_6B:int
        Label_0383:
        
        while (cmpeq:boolean(and:int(var_0_AF:int, ldc:int(524288)), ldc:int(0))) {
            var_0_AF = and:int(var_0_AF:int, ldc:int(-1074233810))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, add:byte(loadelement:byte(stack_195_0:byte[], var_5_17D:int), ldc:byte(3)))
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_131_0 = stack_195_0 = stack_1D0_0 = stack_22D_0 = stack_2A9_0 = var_3_17C:byte[]
            goto(Label_0112)
        }
        
        Label_0535:
        
        while (cmpne:boolean(and:int(var_0_AF:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_223 = and:int(var_0_AF:int, ldc:int(-1165754686))
            var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
            expr_22D = stack_274_2 = loadelement(stack_22D_0, var_5_17D)
            
            if (cmplt:boolean(add:int(add:int(var_5_17D:int, ldc:int(1)), neg:int(var_4_177:int)), ldc:int(0))) {
                stack_274_2 = stack_252_0 = add:byte(expr_22D:byte, loadelement:byte(var_3_17C:byte[], add:int(var_5_17D:int, ldc:int(1))))
                goto(Label_0610)
            }
            
            Label_0570:
            
            if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_223 = and:int(var_0_223:int, ldc:int(-151275461))
            }
            else {
                var_0_223 = and:int(var_0_223:int, ldc:int(-1224361306))
                stack_274_2 = stack_252_0 = add:byte(expr_22D:byte, ldc:byte(1))
            }
            
            Label_0610:
            
            if (cmpne:boolean(and:int(var_0_223:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0570)
            }
            
            var_0_AF = and:int(var_0_223:int, ldc:int(-71469511))
            storeelement:byte(var_3_17C:byte[], var_5_17D:int, stack_274_2:byte)
            
            if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_131_0 = stack_195_0 = stack_1D0_0 = stack_22D_0 = stack_2A9_0 = var_3_17C:byte[]
            goto(Label_0200)
        }
        
        goto(Label_0383)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_AF:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_AF:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_AF:int, ldc:int(524288)), ldc:int(0))) {
            var_0_AF = and:int(var_0_AF:int, ldc:int(-1219585327))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1BE = newarray:byte[](byte.class, expr_90:int)
                var_5_1BF = expr_90:int
                
                loop {
                    var_0_AF = and:int(var_0_AF:int, ldc:int(-1164731659))
                    var_5_1BF = add:int(var_5_1BF:int, ldc:int(-1))
                    storeelement:byte(var_3_1BE:byte[], var_5_1BF:int, add:int(shl:int(loadelement:byte(stack_1D0_0:byte[], var_5_1BF:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1BF:int, xor:int(ldc:int(2696), ldc:int(2697)))), ldc:int(7)), xor:int(ldc:int(24576), ldc:int(24577)))))
                    
                    if (cmpne:boolean(var_5_1BF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_131_0 = stack_195_0 = stack_1D0_0 = stack_22D_0 = stack_2A9_0 = var_3_1BE:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpeq:boolean(and:int(var_0_AF:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_AF = and:int(var_0_AF:int, ldc:int(1418316715))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_AF:int, ldc:int(256)), ldc:int(0))) {
            var_0_AF = and:int(var_0_AF:int, ldc:int(1751342027))
        }
        else {
            if (cmpne:boolean(and:int(var_0_AF:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_AF = and:int(var_0_AF:int, ldc:int(-1150353784))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_177 = expr_C3:int
                var_3_17C = newarray:byte[](byte.class, expr_C3:int)
                var_5_17D = expr_C3:int
                goto(Label_0535)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_AF:int, ldc:int(16)), ldc:int(0))) {
            var_0_AF = and:int(var_0_AF:int, ldc:int(159469338))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_AF:int, ldc:int(4096)), ldc:int(0))) {
                var_0_AF = and:int(var_0_AF:int, ldc:int(992313119))
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_AF:int, ldc:int(524288)), ldc:int(0))) {
                var_0_AF = and:int(var_0_AF:int, ldc:int(-255180037))
                goto(Label_0112)
            }
            
            var_0_AF = and:int(var_0_AF:int, ldc:int(-94153757))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_297 = newarray:byte[](byte.class, expr_FE:int)
                var_5_298 = expr_FE:int
                
                loop {
                    var_0_AF = and:int(var_0_AF:int, ldc:int(-17490401))
                    var_5_298 = add:int(var_5_298:int, ldc:int(-1))
                    expr_2AC = xor:byte(loadelement:byte(stack_2A9_0:byte[], var_5_298:int), ldc:byte(32))
                    storeelement:byte(var_3_297:byte[], var_5_298:int, or:int(and:int(shl:int(expr_2AC:byte, xor:int(ldc:int(-32735), ldc:int(-32731))), ldc:int(-16)), and:int(shr:int(expr_2AC:byte[expected:int], xor:int(ldc:int(20554), ldc:int(20558))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_298:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_131_0 = stack_195_0 = stack_1D0_0 = stack_22D_0 = stack_2A9_0 = var_3_297:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_AF:int, ldc:int(4096)), ldc:int(0))) {
            var_0_AF = and:int(var_0_AF:int, ldc:int(-1247421402))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_AF:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0149)
        }
        
        if (cmpne:boolean(and:int(var_0_AF:int, ldc:int(65536)), ldc:int(0))) {
            var_0_AF = and:int(var_0_AF:int, ldc:int(-1156022922))
            goto(Label_0112)
        }
        
        var_3_13D = initobject:String(String::<init>, stack_131_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_170_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6689), ldc:int(25033)))
        expr_14F = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30717), ldc:int(-30718)))
        storeelement:String(expr_14F:String[], and:int(ldc:int(14682), ldc:int(-14687)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, and:int(ldc:int(-11046), ldc:int(8993)), and:int(ldc:int(2727), ldc:int(9252))))
        putstatic:String[](\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e::\ud158\uc7fe\uc910\ud158\u3dd3\ua068, expr_14F:String[])
    }
    
    public void \u965f\u3a62\u8709\u3c25\u3bc9\u6c56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_633 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_63E : int
        
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
        var_3_633 = and:int(ldc:int(-453565099), ldc:int(244814203))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(1822284875))
            var_5_80 = and:int(ldc:int(15504), ldc:int(-32434))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26833), ldc:int(-27098)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_633:int, ldc:int(-2017619625))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(-32238), ldc:int(-32237)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(22784), ldc:int(22785)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_633 = and:int(var_3_CF:int, ldc:int(-1110119731))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:boolean(0), ldc:boolean(1)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(2103570153))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(2092725688))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-482088184))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-121368343))
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-319365511))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1749438874))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-306401309))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0849)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1100219729))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1297986074))
                        goto(Label_0713)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1681584174))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(343748319))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-860598435))
                        var_11_E0 = and:int(ldc:int(12334), ldc:int(-12335))
                        goto(Label_1468)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-859715074))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1027854145))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1757891187))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1276759690))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-2102986908))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-194037707))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-977347769))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0849)
                        }
                    }
                    
                    Label_0713:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(69922866))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1355324515))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1546265344))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-489998413))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1217251608))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(536712011))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0849:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1520466352))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1911209079))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0713)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-673932821))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(2316), ldc:int(2317))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0948:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1242957447))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-44314095))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1586531584))
                            goto(Label_0849)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0713)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1722627781))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1130553212))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(501106285))
                        var_11_E0 = and:int(ldc:int(-29671), ldc:int(21218))
                    }
                    
                    Label_1111:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1295909144))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1088245686))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0713)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(261969485))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1357)
                            }
                        }
                    }
                    
                    Label_1209:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1659667181))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1810592747))
                            goto(Label_1111)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(271026589))
                            goto(Label_0948)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(733128807))
                            goto(Label_0849)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-636395609))
                            goto(Label_0713)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-2008346658))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(769527887))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1468)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1357:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(755034489))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-418467815))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(-1090630077))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1468:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63E = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1479:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1603042696))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(128)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-696575002))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(121908219))
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0713)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(245677283))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1476174075))
                        var_17_63E = add:int(var_16_10E:int, xor:int(ldc:boolean(0), ldc:boolean(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_633 = and:int(var_3_633:int, ldc:int(-1612951715))
                
                if (cmple:boolean(var_5_80 = var_17_63E:int, sub:int(var_6_87:int, xor:int(ldc:int(34), ldc:int(35))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1048576)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
