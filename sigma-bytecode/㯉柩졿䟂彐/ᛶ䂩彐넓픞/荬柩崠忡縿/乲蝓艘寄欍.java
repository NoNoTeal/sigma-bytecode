public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u4e72\u8753\u8258\u5bc4\u6b0d {
    public void \u4e72\u8753\u8258\u5bc4\u6b0d() {
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
            invokespecial:Object(Object::<init>, this:\u4e72\u8753\u8258\u5bc4\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4e72\u8753\u8258\u5bc4\u6b0d(long p0, long p1, boolean p2) {
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
            invokespecial:Object(Object::<init>, this:\u4e72\u8753\u8258\u5bc4\u6b0d)
            putfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\u7043\u99f7\u1833\u99f7\u4179\ua3b4, this:\u4e72\u8753\u8258\u5bc4\u6b0d, p0:long)
            putfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\ud158\u965f\ub8be\u3bd6\ub83f\u12cb, this:\u4e72\u8753\u8258\u5bc4\u6b0d, p1:long)
            
            if (logicalnot:boolean(p2:boolean)) {
                putfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\ud158\u965f\ub8be\u3bd6\ub83f\u12cb, this:\u4e72\u8753\u8258\u5bc4\u6b0d, neg:long(getfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\ud158\u965f\ub8be\u3bd6\ub83f\u12cb, this:\u4e72\u8753\u8258\u5bc4\u6b0d)))
                
                if (cmpeq:boolean(getfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\ud158\u965f\ub8be\u3bd6\ub83f\u12cb, this:\u4e72\u8753\u8258\u5bc4\u6b0d), ldc:long(0L))) {
                    putfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\ud158\u965f\ub8be\u3bd6\ub83f\u12cb, this:\u4e72\u8753\u8258\u5bc4\u6b0d, ldc:long(-1L))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\ub19c\ubff1\u8aa5\ubb2b\ud7e8(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            putfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\u7043\u99f7\u1833\u99f7\u4179\ua3b4, this:\u4e72\u8753\u8258\u5bc4\u6b0d, invokevirtual:long(\u98a4\uafe7\uc3e3\ua6bd\u8640::readLong, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            putfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\ud158\u965f\ub8be\u3bd6\ub83f\u12cb, this:\u4e72\u8753\u8258\u5bc4\u6b0d, invokevirtual:long(\u98a4\uafe7\uc3e3\ua6bd\u8640::readLong, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u3bd6\u8389\u7bad\u62da\u873d(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeLong, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\u7043\u99f7\u1833\u99f7\u4179\ua3b4, this:\u4e72\u8753\u8258\u5bc4\u6b0d))
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeLong, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\ud158\u965f\ub8be\u3bd6\ub83f\u12cb, this:\u4e72\u8753\u8258\u5bc4\u6b0d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\u759a\u8cae\u59ec\u446c\u71f1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5d20\u4f52\ud523\uc84e\u0800\u6ec6 p0) {
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
            invokeinterface:void(\u5d20\u4f52\ud523\uc84e\u0800\u6ec6::\ua068\u3c25\ua068\ufcaf\ube23\u4975, p0:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6, this:\u4e72\u8753\u8258\u5bc4\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public long \u516c\ub8be\ua068\u7330\ub19c\u5d20() {
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
            return:long(getfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\u7043\u99f7\u1833\u99f7\u4179\ua3b4, this:\u4e72\u8753\u8258\u5bc4\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    public long \u7c6b\u9937\ud217\u3d64\ud523\uc238() {
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
            return:long(getfield:long(\u4e72\u8753\u8258\u5bc4\u6b0d::\ud158\u965f\ub8be\u3bd6\ub83f\u12cb, this:\u4e72\u8753\u8258\u5bc4\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\u759a\u8cae\u59ec\u446c\u71f1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u446c\u7c6b\u8bb0\u4975\u76bc p0) {
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
            invokevirtual:void(\u4e72\u8753\u8258\u5bc4\u6b0d::\u3dd3\u759a\u8cae\u59ec\u446c\u71f1, this:\u4e72\u8753\u8258\u5bc4\u6b0d, checkcast:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5d20\u4f52\ud523\uc84e\u0800\u6ec6.class, p0:\u446c\u7c6b\u8bb0\u4975\u76bc[expected:\u5d20\u4f52\ud523\uc84e\u0800\u6ec6]))
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
    
    public void \u67e9\ucef1\u6d69\u839e\u8753\ub1b9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
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
        var_3_5E5 = and:int(ldc:int(1603709523), ldc:int(-15319242))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4e72\u8753\u8258\u5bc4\u6b0d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-6379269))
            var_5_7D = and:int(ldc:int(-6845), ldc:int(6332))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8931), ldc:int(-8932)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5E5:int, ldc:int(-44826629))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-28543), ldc:int(-28544)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1037), ldc:int(417)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_D2:int, ldc:int(1033039227))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(259), ldc:int(4129)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(518327261))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(778487803))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1182912374))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-572868525))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(783927939))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1071364977))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1456914693))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1154393680))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1598093622))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1060333982))
                        var_11_E3 = and:int(ldc:int(17377), ldc:int(-21482))
                        goto(Label_1391)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1989793890))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1645788977))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-817935972))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1923383970))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2136652342))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1547453353))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-269799782))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2129864819))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-839756953))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(653090192))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1175387651))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(487992566))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1297042761))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1270566269))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-651933569))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(916662753))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1648411681))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(20969), ldc:int(2049))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(890026898))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1234382533))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(60827919))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2429894))
                        var_11_E3 = and:int(ldc:int(11474), ldc:int(-11508))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1128255820))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1467046524))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2050087919))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1764778546))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-38076554))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2070853622))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1981641094))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1188336629))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(408753832))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(278110916))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1597697235))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-613274850))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-937477215))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1107560552))
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-541967785))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-108581332))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1925664763))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2091078674))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(530297258))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(570793804))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1058503646))
                        var_17_5F0 = add:int(var_16_111:int, xor:int(ldc:int(198), ldc:int(199)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1606413406))
                
                if (cmple:boolean(var_5_7D = var_17_5F0:int, sub:int(var_6_84:int, and:int(ldc:int(4609), ldc:int(3153))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1657717181))
            goto(Label_0106)
        }
    }
}
