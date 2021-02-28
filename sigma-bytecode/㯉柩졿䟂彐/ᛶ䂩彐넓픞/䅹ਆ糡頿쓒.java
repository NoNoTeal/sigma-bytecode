public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u4179\u0a06\u7ce1\u983f\uc4d2 {
    public void \u4179\u0a06\u7ce1\u983f\uc4d2(\u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p0, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p1) {
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
        invokespecial:Object(Object::<init>, this:\u4179\u0a06\u7ce1\u983f\uc4d2)
        
        if (cmpne:boolean(p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102)) {
            putfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2, p0:\u6b0d\uf9c5\ucfaf\ud36e\ub102)
            putfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2, p1:\u6b0d\uf9c5\ucfaf\ud36e\ub102)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u4179\u0a06\u7ce1\u983f\uc4d2::\ud523\u624e\ub18d\u64f2\u3d64\u52d3), and:int(ldc:int(-16808), ldc:int(16807)))))
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u8d90\u9255\u3bd6\u5d20\ub83f\u1187(double p0, double p1, double p2) {
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
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:double, p1:double, p2:double)
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:double, p1:double, p2:double)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u4179\u0a06\u7ce1\u983f\uc4d2[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \ub70c\u600f\u93a2\uc910\u9937\u946b(int p0, int p1, int p2, int p3) {
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
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:int, p1:int, p2:int, p3:int)
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:int, p1:int, p2:int, p3:int)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u4179\u0a06\u7ce1\u983f\uc4d2[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u946b\uf995\ufe34\u1833\ua61f\uc246(float p0, float p1) {
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
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:float, p1:float)
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:float, p1:float)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u4179\u0a06\u7ce1\u983f\uc4d2[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u12b2\u6b0d\ub102\u6fb0\u600f\uc7fe(int p0, int p1) {
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
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u12b2\u6b0d\ub102\u6fb0\u600f\uc7fe, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:int, p1:int)
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u12b2\u6b0d\ub102\u6fb0\u600f\uc7fe, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:int, p1:int)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u4179\u0a06\u7ce1\u983f\uc4d2[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u56bd\ube23\u99f7\ubf56\u64ab\ud12e(int p0, int p1) {
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
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:int, p1:int)
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u56bd\ube23\u99f7\ubf56\u64ab\ud12e, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:int, p1:int)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u4179\u0a06\u7ce1\u983f\uc4d2[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 \u4179\uc7fe\ub8be\u64f2\ua068\u8389(float p0, float p1, float p2) {
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
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:float, p1:float, p2:float)
            invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4179\uc7fe\ub8be\u64f2\ua068\u8389, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:float, p1:float, p2:float)
            return:\u6b0d\uf9c5\ucfaf\ud36e\ub102(this:\u4179\u0a06\u7ce1\u983f\uc4d2[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102])
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\ubf56\u4c04\u494c\u67d0\uc7fe(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9, int p10, float p11, float p12, float p13) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u72f1\ubf56\u4c04\u494c\u67d0\uc7fe, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:float, p1:float, p2:float, p3:float, p4:float, p5:float, p6:float, p7:float, p8:float, p9:int, p10:int, p11:float, p12:float, p13:float)
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u72f1\ubf56\u4c04\u494c\u67d0\uc7fe, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:float, p1:float, p2:float, p3:float, p4:float, p5:float, p6:float, p7:float, p8:float, p9:int, p10:int, p11:float, p12:float, p13:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258() {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\ud4fe\u7049\u4f52\u6d69\u416d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d p0) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4c04\ud4fe\u7049\u4f52\u6d69\u416d, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:\u97b7\u8350\u99f7\ub1b9\u839e\u873d)
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4c04\ud4fe\u7049\u4f52\u6d69\u416d, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:\u97b7\u8350\u99f7\ub1b9\u839e\u873d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufe34\u99f7\u4492\u5245\ub171\u4f52(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d p0) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ufe34\u99f7\u4492\u5245\ub171\u4f52, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:\u97b7\u8350\u99f7\ub1b9\u839e\u873d)
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ufe34\u99f7\u4492\u5245\ub171\u4f52, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:\u97b7\u8350\u99f7\ub1b9\u839e\u873d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u76bc\u7006\u759a\u8df4\u3e75(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
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
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4bc8\u76bc\u7006\u759a\u8df4\u3e75, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\ub1b9\u5db4\u6cfe\u7e3f\ube23\u12b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:\uf995\u4975\u1187\ubff1\u839e\u8389)
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u4bc8\u76bc\u7006\u759a\u8df4\u3e75, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:\uf995\u4975\u1187\ubff1\u839e\u8389)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u516c\u3d64\u718f\ub171\u6b5f.\uae5d\ua068\u9a18\u8413\u51fa\ub83f \u071d\ud158\u836c\uc246\u4daf\ubcb0(\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\ua068\u9a18\u8413\u51fa\ub83f p0) {
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
            return:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(invokeinterface:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u071d\ud158\u836c\uc246\u4daf\ubcb0, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:\uae5d\ua068\u9a18\u8413\u51fa\ub83f))
        }
        
        goto(Label_0006)
    }
    
    public \u516c\u3d64\u718f\ub171\u6b5f.\uae5d\ua068\u9a18\u8413\u51fa\ub83f \u071d\ud158\u836c\uc246\u4daf\ubcb0(float p0, float p1, float p2) {
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
            return:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(invokeinterface:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u071d\ud158\u836c\uc246\u4daf\ubcb0, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:float, p1:float, p2:float))
        }
        
        goto(Label_0006)
    }
    
    public float[] \u3504\ud523\ub70c\ucef1\u7ce1\u6c56(float p0, float p1, float p2, float p3) {
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
            return:float[](invokeinterface:float[](\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u3504\ud523\ub70c\ucef1\u7ce1\u6c56, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:float, p1:float, p2:float, p3:float))
        }
        
        goto(Label_0006)
    }
    
    public int[] \u12b2\u9af2\u4f52\ubff1\u7bad\ucef1(int p0, int p1, int p2, int p3) {
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
            return:int[](invokeinterface:int[](\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u12b2\u9af2\u4f52\ubff1\u7bad\ucef1, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2), p0:int, p1:int, p2:int, p3:int))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u61a4\u76bc\u0c95\u1833\u7043\u3711 \u88c5\u67d0\ucef1\u92ff\u7873\ub6ab() {
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
            return:\u61a4\u76bc\u0c95\u1833\u7043\u3711(invokeinterface:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u88c5\u67d0\ucef1\u92ff\u7873\ub6ab, getfield:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u4179\u0a06\u7ce1\u983f\uc4d2::\u759a\u4f52\ufe34\ua068\u67d0\u3504, this:\u4179\u0a06\u7ce1\u983f\uc4d2)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_214 : int
        expr_6B : int [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_F5_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_12F_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_173_0 : byte[] [generated]
        stack_175_0 : byte[] [generated]
        stack_1B4_0 : byte[] [generated]
        stack_226_0 : byte[] [generated]
        stack_271_0 : byte[] [generated]
        stack_2F7_0 : byte[] [generated]
        stack_347_0 : byte[] [generated]
        stack_39C_0 : byte[] [generated]
        var_4_1FA : int
        var_3_1FF : byte[]
        var_5_200 : int
        var_0_289 : int
        expr_271 : byte [generated]
        stack_2B5_2 : byte [generated]
        stack_28C_0 : byte [generated]
        expr_2F7 : byte [generated]
        expr_AD : int [generated]
        expr_F7 : int [generated]
        var_2_12F : byte[]
        expr_133 : int [generated]
        var_3_336 : byte[]
        var_5_337 : int
        expr_175 : int [generated]
        var_3_38B : byte[]
        var_5_38C : int
        var_3_1C0 : String
        stack_1F3_0 : String[] [generated]
        expr_1D2 : String[] [generated]
        
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
        var_0_214 = and:int(ldc:int(-1485523026), ldc:int(-1168656402))
        expr_6B = arraylength:int(stack_AB_0 = stack_AD_0 = stack_F5_0 = stack_F7_0 = stack_12F_0 = stack_131_0 = stack_173_0 = stack_175_0 = stack_1B4_0 = stack_226_0 = stack_271_0 = stack_2F7_0 = stack_347_0 = stack_39C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Fgz4efp4egzcGIUEBviEeAz8YnE=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1FA = expr_6B:int
        var_3_1FF = newarray:byte[](byte.class, expr_6B:int)
        var_5_200 = expr_6B:int
        Label_0514:
        
        while (cmpne:boolean(and:int(var_0_214:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_214:int, ldc:int(16)), ldc:int(0))) {
                var_0_214 = and:int(var_0_214:int, ldc:int(-1361580215))
                goto(Label_0597)
            }
            
            var_0_214 = and:int(var_0_214:int, ldc:int(-1502218341))
            var_5_200 = add:int(var_5_200:int, ldc:int(-1))
            storeelement:byte(var_3_1FF:byte[], var_5_200:int, xor:byte(loadelement:byte(stack_226_0:byte[], var_5_200:int), ldc:byte(123)))
            
            if (cmpne:boolean(var_5_200:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_F5_0 = stack_F7_0 = stack_12F_0 = stack_131_0 = stack_173_0 = stack_175_0 = stack_1B4_0 = stack_226_0 = stack_271_0 = stack_2F7_0 = stack_347_0 = stack_39C_0 = var_3_1FF:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0731)
        Label_0597:
        
        while (cmpne:boolean(and:int(var_0_214:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0514)
            }
            
            var_0_289 = and:int(var_0_214:int, ldc:int(-1084688429))
            var_5_200 = add:int(var_5_200:int, ldc:int(-1))
            expr_271 = stack_2B5_2 = loadelement(stack_271_0, var_5_200)
            
            if (cmplt:boolean(add:int(add:int(var_5_200:int, ldc:int(1)), neg:int(var_4_1FA:int)), ldc:int(0))) {
                stack_2B5_2 = stack_28C_0 = add:byte(expr_271:byte, loadelement:byte(var_3_1FF:byte[], add:int(var_5_200:int, ldc:int(1))))
                goto(Label_0668)
            }
            
            Label_0638:
            
            if (cmpne:boolean(and:int(var_0_289:int, ldc:int(8192)), ldc:int(0))) {
                var_0_289 = and:int(var_0_289:int, ldc:int(-219875381))
                stack_2B5_2 = stack_28C_0 = add:byte(expr_271:byte, ldc:byte(1))
            }
            
            Label_0668:
            
            if (cmpeq:boolean(and:int(var_0_289:int, ldc:int(1024)), ldc:int(0))) {
                var_0_289 = and:int(var_0_289:int, ldc:int(-215937271))
                goto(Label_0638)
            }
            
            var_0_214 = and:int(var_0_289:int, ldc:int(-1571176490))
            storeelement:byte(var_3_1FF:byte[], var_5_200:int, stack_2B5_2:byte)
            
            if (cmpne:boolean(var_5_200:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_F5_0 = stack_F7_0 = stack_12F_0 = stack_131_0 = stack_173_0 = stack_175_0 = stack_1B4_0 = stack_226_0 = stack_271_0 = stack_2F7_0 = stack_347_0 = stack_39C_0 = var_3_1FF:byte[]
            goto(Label_0178)
        }
        
        Label_0731:
        
        while (cmpne:boolean(and:int(var_0_214:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_214:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0514)
            }
            
            var_0_214 = and:int(var_0_214:int, ldc:int(913176519))
            var_5_200 = add:int(var_5_200:int, ldc:int(-1))
            expr_2F7 = loadelement:byte(stack_2F7_0:byte[], var_5_200:int)
            storeelement:byte(var_3_1FF:byte[], var_5_200:int, or:int(and:int(shl:int(expr_2F7:byte, and:int(ldc:int(18868), ldc:int(12804))), ldc:int(-16)), and:int(shr:int(expr_2F7:byte[expected:int], xor:int(ldc:int(-31983), ldc:int(-31979))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_200:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_F5_0 = stack_F7_0 = stack_12F_0 = stack_131_0 = stack_173_0 = stack_175_0 = stack_1B4_0 = stack_226_0 = stack_271_0 = stack_2F7_0 = stack_347_0 = stack_39C_0 = var_3_1FF:byte[]
            goto(Label_0252)
        }
        
        goto(Label_0597)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_214:int, ldc:int(16)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(995412971))
            goto(Label_0378)
        }
        
        if (cmpne:boolean(and:int(var_0_214:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0312)
        }
        
        if (cmpne:boolean(and:int(var_0_214:int, ldc:int(131072)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(-1553538329))
            goto(Label_0252)
        }
        
        if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(1024)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(-143810081))
        }
        else {
            var_0_214 = and:int(var_0_214:int, ldc:int(1724366751))
            expr_AD = arraylength:int(stack_AD_0:byte[])
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_4_1FA = expr_AD:int
                var_3_1FF = newarray:byte[](byte.class, expr_AD:int)
                var_5_200 = expr_AD:int
                goto(Label_0597)
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_0_214:int, ldc:int(524288)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(-1414499165))
            goto(Label_0378)
        }
        
        if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(-14917761))
            goto(Label_0312)
        }
        
        if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(4096)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(138759181))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_214 = and:int(var_0_214:int, ldc:int(-1820103552))
                goto(Label_0112)
            }
            
            var_0_214 = and:int(var_0_214:int, ldc:int(853737438))
            expr_F7 = arraylength:int(stack_F7_0:byte[])
            
            if (cmpne:boolean(expr_F7:int, ldc:int(0))) {
                var_4_1FA = expr_F7:int
                var_3_1FF = newarray:byte[](byte.class, expr_F7:int)
                var_5_200 = expr_F7:int
                goto(Label_0731)
            }
        }
        
        Label_0252:
        
        if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0378)
        }
        
        if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(4096)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(750100776))
        }
        else {
            if (cmpne:boolean(and:int(var_0_214:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0178)
            }
            
            if (cmpne:boolean(and:int(var_0_214:int, ldc:int(64)), ldc:int(0))) {
                var_0_214 = and:int(var_0_214:int, ldc:int(-1544392389))
                goto(Label_0112)
            }
            
            var_0_214 = and:int(var_0_214:int, ldc:int(653195183))
            var_2_12F = stack_12F_0:byte[]
            expr_133 = add:int(arraylength:int(stack_131_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_133:int, ldc:int(0))) {
                var_3_336 = newarray:byte[](byte.class, expr_133:int)
                var_5_337 = expr_133:int
                
                loop {
                    var_0_214 = and:int(var_0_214:int, ldc:int(776845299))
                    var_5_337 = add:int(var_5_337:int, ldc:int(-1))
                    storeelement:byte(var_3_336:byte[], var_5_337:int, add:int(shl:int(loadelement:byte(stack_347_0:byte[], var_5_337:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_12F:byte[], add:int(var_5_337:int, xor:int(ldc:int(16962), ldc:int(16963)))), ldc:int(3)), xor:int(ldc:int(1553), ldc:int(1550)))))
                    
                    if (cmpne:boolean(var_5_337:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_F5_0 = stack_F7_0 = stack_12F_0 = stack_131_0 = stack_173_0 = stack_175_0 = stack_1B4_0 = stack_226_0 = stack_271_0 = stack_2F7_0 = stack_347_0 = stack_39C_0 = var_3_336:byte[]
            }
        }
        
        Label_0312:
        
        if (cmpne:boolean(and:int(var_0_214:int, ldc:int(524288)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(-1531224796))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_214 = and:int(var_0_214:int, ldc:int(455054354))
                goto(Label_0252)
            }
            
            if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(8192)), ldc:int(0))) {
                var_0_214 = and:int(var_0_214:int, ldc:int(2031638422))
                goto(Label_0178)
            }
            
            if (cmpne:boolean(and:int(var_0_214:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_214 = and:int(var_0_214:int, ldc:int(-1769553))
            expr_175 = arraylength:int(stack_175_0:byte[])
            
            if (cmpne:boolean(expr_175:int, ldc:int(0))) {
                var_3_38B = newarray:byte[](byte.class, expr_175:int)
                var_5_38C = expr_175:int
                
                loop {
                    var_0_214 = and:int(var_0_214:int, ldc:int(-1426718790))
                    var_5_38C = add:int(var_5_38C:int, ldc:int(-1))
                    storeelement:byte(var_3_38B:byte[], var_5_38C:int, add:byte(loadelement:byte(stack_39C_0:byte[], var_5_38C:int), ldc:byte(29)))
                    
                    if (cmpne:boolean(var_5_38C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_F5_0 = stack_F7_0 = stack_12F_0 = stack_131_0 = stack_173_0 = stack_175_0 = stack_1B4_0 = stack_226_0 = stack_271_0 = stack_2F7_0 = stack_347_0 = stack_39C_0 = var_3_38B:byte[]
            }
        }
        
        Label_0378:
        
        if (cmpne:boolean(and:int(var_0_214:int, ldc:int(64)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(-897630572))
            goto(Label_0312)
        }
        
        if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(1817476986))
            goto(Label_0252)
        }
        
        if (cmpne:boolean(and:int(var_0_214:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpeq:boolean(and:int(var_0_214:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_214 = and:int(var_0_214:int, ldc:int(1549928729))
            goto(Label_0112)
        }
        
        var_3_1C0 = initobject:String(String::<init>, stack_1B4_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1F3_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16389), ldc:int(12617)))
        expr_1D2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(265), ldc:int(7)))
        storeelement:String(expr_1D2:String[], and:int(ldc:int(18531), ldc:int(-18532)), invokevirtual:String[expected:String](String::substring, var_3_1C0:String, and:int(ldc:int(2841), ldc:int(-6944)), xor:int(ldc:int(1097), ldc:int(1114))))
        putstatic:String[](\u4179\u0a06\u7ce1\u983f\uc4d2::\ud523\u624e\ub18d\u64f2\u3d64\u52d3, expr_1D2:String[])
    }
    
    public void \u6c52\u8c8a\u76bc\ud7e8\u99f7\ubefe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_659 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BA : double
        var_3_CC : int
        var_11_DD : int
        var_14_107 : double
        var_16_10B : int
        var_12_103 : double
        var_17_664 : int
        
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
        var_3_659 = and:int(ldc:int(1029915020), ldc:int(791076284))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4179\u0a06\u7ce1\u983f\uc4d2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
            var_3_659 = and:int(var_3_659:int, ldc:int(976742847))
            var_5_7D = and:int(ldc:int(-27348), ldc:int(27346))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21421), ldc:int(17320)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BA = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CC = and:int(var_3_659:int, ldc:int(1017607341))
                    var_9_BA = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DD = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DD:int, sub:int(var_6_84:int, xor:int(ldc:int(9228), ldc:int(9229)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DD:int, and:int(ldc:int(129), ldc:int(2067)))), var_7_93:double))) {
                        inc:int(var_11_DD, ldc:int(1))
                    }
                    
                    var_3_659 = and:int(var_3_CC:int, ldc:int(1845413836))
                    var_14_107 = var_7_93:double
                    var_16_10B = var_11_DD:int
                }
                else {
                    var_11_DD = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(166), ldc:int(167)))
                    var_12_103 = var_14_107 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10B = var_11_DD:int, var_6_84:int)) {
                        var_9_BA = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DD:int)
                        var_16_10B = var_11_DD:int
                        var_14_107 = var_12_103:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(699905508))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1864996125))
                        goto(Label_0967)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-665226703))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1961078409))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1187845905))
                        
                        if (cmplt:boolean(var_16_10B:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0554)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-756644717))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-91541204))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-165878540))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(2021516680))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0967)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(1803186894))
                            var_11_DD = and:int(ldc:int(-5571), ldc:int(5570))
                            goto(Label_1521)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0554:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1249762553))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1996816387))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1554778920))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-2094204721))
                        goto(Label_0967)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-90778629))
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-2102730691))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(-343945011))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_107 = var_9_BA:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1151855624))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1480233755))
                        goto(Label_0967)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-932841887))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(886456072))
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-1459928606))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(1823960766))
                        var_14_107 = mul:double(ldc:double(0.5), add:double(var_9_BA:double, var_14_107:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1369993131))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1231509868))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-198078423))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-522253282))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-299177104))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(1635249061))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(729012414))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DD = xor:int(ldc:int(-32256), ldc:int(-32255))
                                goto(Label_1130)
                            }
                        }
                    }
                    
                    Label_0967:
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1866561112))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1208908439))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(106151803))
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(8)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-1494624449))
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(681290287))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(1026999772))
                        var_11_DD = and:int(ldc:int(-13751), ldc:int(1462))
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-103282831))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(787427300))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(1871709725))
                            goto(Label_0967)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-321501378))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(-369436770))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DD:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1248:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-9659146))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1043036214))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1130)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0967)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(257348547))
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-51293045))
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-1650499564))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(1018354397))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_107:double, var_5_7D:int, var_16_10B:int)
                        goto(Label_1521)
                    }
                    
                    Label_1389:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1069297855))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-2059715200))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1676840571))
                        goto(Label_0967)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1546922604))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_659 = and:int(var_3_659:int, ldc:int(-1179129444))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_107:double, ldc:double(0.0))
                    Label_1521:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_664 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DD:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1532:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1764068028))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1409955051))
                        goto(Label_0554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(32)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1435271508))
                        var_17_664 = add:int(var_16_10B:int, and:int(ldc:int(5909), ldc:int(2243)))
                        looporswitchbreak()
                    }
                }
                
                var_3_659 = and:int(var_3_659:int, ldc:int(975360207))
                
                if (cmple:boolean(var_5_7D = var_17_664:int, sub:int(var_6_84:int, and:int(ldc:int(13161), ldc:int(131))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
