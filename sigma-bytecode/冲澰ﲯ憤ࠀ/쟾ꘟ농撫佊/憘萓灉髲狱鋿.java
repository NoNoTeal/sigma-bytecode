public abstract class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u6198\u8413\u7049\u9af2\u72f1\u92ff {
    public void \u6198\u8413\u7049\u9af2\u72f1\u92ff(java.io.InputStream p0, javax.sound.sampled.AudioFormat p1, long p2) {
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
            invokespecial:AudioInputStream(AudioInputStream::<init>, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff, p0:InputStream, p1:AudioFormat, p2:long)
            putfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\u6198\u8413\u7049\u9af2\u72f1\u92ff::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff, initobject:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::<init>, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff[expected:\u3504\u5fe1\u4f52\u718f\u74b1\u873d]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int read() {
        var_1_A5 : int
        var_3_BA : int
        
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
            var_1_A5 = and:int(ldc:int(-430963542), ldc:int(-453137271))
            
            if (cmpeq:boolean(getfield:byte[](\u6198\u8413\u7049\u9af2\u72f1\u92ff::\u3a62\u72f1\u7873\u5d20\u92ee\ud12e, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff), aconstnull:byte[]())) {
                putfield:byte[](\u6198\u8413\u7049\u9af2\u72f1\u92ff::\u3a62\u72f1\u7873\u5d20\u92ee\ud12e, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff, newarray:byte[](byte.class, and:int(ldc:int(10251), ldc:int(513))))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_A5:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_A5 = and:int(var_1_A5:int, ldc:int(-337948909))
                    
                    if (cmpeq:boolean(invokevirtual:int(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\u40a9\u7006\u8389\uafe7\u76bc\u6198, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\u6198\u8413\u7049\u9af2\u72f1\u92ff::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff), getfield:byte[](\u6198\u8413\u7049\u9af2\u72f1\u92ff::\u3a62\u72f1\u7873\u5d20\u92ee\ud12e, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff), and:int(ldc:int(27729), ldc:int(-27730)), xor:int(ldc:int(24848), ldc:int(24849))), ldc:int(-1))) {
                        var_3_BA = ldc:int(-1)
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_A5:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_A5 = and:int(var_1_A5:int, ldc:int(-489141090))
                    var_3_BA = and:int(loadelement:byte[expected:int](getfield:byte[](\u6198\u8413\u7049\u9af2\u72f1\u92ff::\u3a62\u72f1\u7873\u5d20\u92ee\ud12e, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff), and:int(ldc:int(14098), ldc:int(-14099))), and:int(ldc:int(12543), ldc:int(1279)))
                    looporswitchbreak()
                }
                
                var_1_A5 = and:int(var_1_A5:int, ldc:int(1827235634))
            }
            
            return:int(var_3_BA:int)
        }
        
        goto(Label_0006)
    }
    
    public int read(byte[] p0) {
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
            return:int(invokevirtual:int(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\u40a9\u7006\u8389\uafe7\u76bc\u6198, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\u6198\u8413\u7049\u9af2\u72f1\u92ff::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff), p0:byte[], and:int(ldc:int(-15237), ldc:int(6532)), arraylength:int(p0:byte[])))
        }
        
        goto(Label_0006)
    }
    
    public int read(byte[] p0, int p1, int p2) {
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
            return:int(invokevirtual:int(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\u40a9\u7006\u8389\uafe7\u76bc\u6198, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\u6198\u8413\u7049\u9af2\u72f1\u92ff::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff), p0:byte[], p1:int, p2:int))
        }
        
        goto(Label_0006)
    }
    
    public long skip(long p0) {
        var_3_5F : int
        var_5_62 : int
        var_6_68 : byte[]
        
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
            var_3_5F = and:int(ldc:int(485014049), ldc:int(205319067))
            var_5_62 = l2i:int(p0:long)
            var_6_68 = newarray:byte[](byte.class, var_5_62:int)
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-286297435))
                
                if (cmple:boolean(var_5_62:int, ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_62 = sub:int(var_5_62:int, invokevirtual:int(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\u40a9\u7006\u8389\uafe7\u76bc\u6198, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\u6198\u8413\u7049\u9af2\u72f1\u92ff::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff), var_6_68:byte[], and:int(ldc:int(-19522), ldc:int(19521)), var_5_62:int))
            }
            
            return:long(p0:long)
        }
        
        goto(Label_0006)
    }
    
    public int available() {
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
            return:int(invokevirtual:int(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\u760c\u600f\u6435\u839e\u3a62\u72f1, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\u6198\u8413\u7049\u9af2\u72f1\u92ff::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff)))
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
            invokevirtual:void(\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1::\ufe34\uc229\u7c6b\u5d20\ucef1\u8d90, getfield:\u0a06\u647c\u0800\ua6bd\u74b1\u5fe1(\u6198\u8413\u7049\u9af2\u72f1\u92ff::\ua61f\u4cd9\u7330\u7bad\u9937\u3e75, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean markSupported() {
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
            return:boolean(and:int[expected:boolean](ldc:int(-25984), ldc:int(24955)))
        }
        
        goto(Label_0006)
    }
    
    public void mark(int p0) {
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
    
    public void reset() {
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
            athrow(initobject:IOException(IOException::<init>, ldc:String("mark not supported")))
        }
        
        goto(Label_0006)
    }
    
    public void \u965f\u3a62\u8709\u3c25\u3bc9\u6c56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F0 : int
        
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
        var_3_5E5 = and:int(ldc:int(22511683), ldc:int(590844672))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6198\u8413\u7049\u9af2\u72f1\u92ff[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(771479751))
        }
        else {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1490829109))
            var_5_85 = and:int(ldc:int(32013), ldc:int(-32142))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12632), ldc:int(-14685)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5E5:int, ldc:int(1375199102))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(81), ldc:int(1197)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(66), ldc:int(67)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_D2:int, ldc:int(788737002))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(579), ldc:int(32001)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1120455316))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-433367824))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1392280747))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(631753556))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-404816586))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(372226433))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1787644178))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1745911522))
                        var_11_E3 = and:int(ldc:int(-4459), ldc:int(4458))
                        goto(Label_1399)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2133021492))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-69926262))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1130379597))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(728297627))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-74632863))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1496179811))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(751359255))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2010077306))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1520980697))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(595593176))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2066485796))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-527562110))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1173561955))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(190013209))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1597445348))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(777964181))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-297924171))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1557657911))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(52701313))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(290167190))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(16423), ldc:int(3601))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-662912317))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(508088407))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1948298755))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1524355510))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1432055351))
                        var_11_E3 = and:int(ldc:int(-25256), ldc:int(25255))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(807681890))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-788724182))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1428513702))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1181757682))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(97367286))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1261979839))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2090247583))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-247095530))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1187550250))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1399)
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1387805089))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-287378107))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1780021231))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(212070349))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1604311342))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2010371970))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1709471533))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1860962422))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1300748283))
                        var_17_5F0 = add:int(var_16_111:int, xor:int(ldc:int(6), ldc:int(7)))
                        looporswitchbreak()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2021041757))
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1453332316))
                
                if (cmple:boolean(var_5_85 = var_17_5F0:int, sub:int(var_6_8C:int, xor:int(ldc:int(-24508), ldc:int(-24507))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
