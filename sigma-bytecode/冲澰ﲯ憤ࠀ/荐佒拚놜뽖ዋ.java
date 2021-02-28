public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb {
    public void \u8350\u4f52\u62da\ub19c\ubf56\u12cb(float p0, float p1, float p2, float p3) {
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
            invokespecial:Object(Object::<init>, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)
            putfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\ub102\u7c6b\u6c52\uae5d\ud51e\u4e72, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb, p0:float)
            putfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u1833\ub32d\u3dd3\uc229\u4c2b\ua562, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb, p1:float)
            putfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u8640\u7af6\u7ce1\ud12e\u5bc4\u61a4, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb, p2:float)
            putfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u7049\ua3b4\u3c25\u6d99\u718f\u760c, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb, invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, p3:float, ldc:float(0.01f), ldc:float(4.0f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\u3e75\uc3e3\uceb8\u88c5\u7c6b(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeFloat, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\ub102\u7c6b\u6c52\uae5d\ud51e\u4e72, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeFloat, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u1833\ub32d\u3dd3\uc229\u4c2b\ua562, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeFloat, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u8640\u7af6\u7ce1\ud12e\u5bc4\u61a4, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeFloat, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u7049\ua3b4\u3c25\u6d99\u718f\u760c, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u52d3\u4f4a\ubded\u527a\u7e3f\u5140() {
        stack_CB_0 : Locale [generated]
        stack_CB_1 : String [generated]
        expr_75 : Object[] [generated]
        
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
            stack_CB_0 = getstatic:Locale(Locale::ROOT)
            stack_CB_1 = loadelement:String(getstatic:String[](\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u3bd6\u7c6b\u760c\u7d52\u5245\u6c52), and:int(ldc:int(-5040), ldc:int(5038)))
            expr_75 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1111), ldc:int(8461)))
            storeelement:Object(expr_75:Object[], and:int(ldc:int(8426), ldc:int(-25323)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u8350\u4f52\u62da\ub19c\ubf56\u12cb>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u64f2\u3e2a\u71ae\ud171\ua068\u120d), invokevirtual:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u8350\u4f52\u62da\ub19c\ubf56\u12cb>(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
            storeelement:Object(expr_75:Object[], and:int(ldc:int(4867), ldc:int(9353)), invokestatic:Float[expected:Object](Float::valueOf, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\ub102\u7c6b\u6c52\uae5d\ud51e\u4e72, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
            storeelement:Object(expr_75:Object[], xor:int(ldc:int(8608), ldc:int(8610)), invokestatic:Float[expected:Object](Float::valueOf, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u1833\ub32d\u3dd3\uc229\u4c2b\ua562, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
            storeelement:Object(expr_75:Object[], xor:int(ldc:int(24616), ldc:int(24619)), invokestatic:Float[expected:Object](Float::valueOf, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u8640\u7af6\u7ce1\ud12e\u5bc4\u61a4, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
            storeelement:Object(expr_75:Object[], xor:int(ldc:int(16409), ldc:int(16413)), invokestatic:Float[expected:Object](Float::valueOf, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u7049\ua3b4\u3c25\u6d99\u718f\u760c, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
            return:String(invokestatic:String(String::format, stack_CB_0:Locale, stack_CB_1:String, expr_75:Object[]))
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb> \u8389\u516c\u6fb0\u52d3\ubb2b\uae5d() {
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
            return:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u8350\u4f52\u62da\ub19c\ubf56\u12cb>(getstatic:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u8350\u4f52\u62da\ub19c\ubf56\u12cb>(\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5bc4\u5d20\u0a06\u5245\u97b7\u8413))
        }
        
        goto(Label_0006)
    }
    
    public float \u1187\uc3e3\ud4fe\u7d52\u3d4b\uf995() {
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
            return:float(getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\ub102\u7c6b\u6c52\uae5d\ud51e\u4e72, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))
        }
        
        goto(Label_0006)
    }
    
    public float \u8709\ud523\u416d\u5db4\ud4fe\ud4fe() {
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
            return:float(getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u1833\ub32d\u3dd3\uc229\u4c2b\ua562, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))
        }
        
        goto(Label_0006)
    }
    
    public float \u516c\uceb8\ube23\u4daf\u12cb\u0a06() {
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
            return:float(getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u8640\u7af6\u7ce1\ud12e\u5bc4\u61a4, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))
        }
        
        goto(Label_0006)
    }
    
    public float \u0b8e\ufcaf\u3d4b\u7330\u7043\u5d20() {
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
            return:float(getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u7049\ua3b4\u3c25\u6d99\u718f\u760c, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u2dcc\u64ab\u4cd9\ua61f\u839e\u4f52$4(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.lang.Float lambda$\u624e\u7043\u67d0\u965f\u5654\ud4fe$3(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u7049\ua3b4\u3c25\u6d99\u718f\u760c, p0:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u97b7\u6198\u71ae\ua562\u071d\u5140$2(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u8640\u7af6\u7ce1\ud12e\u5bc4\u61a4, p0:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u156b\u9033\u759a\u836c\u8640\u8640$1(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u1833\ub32d\u3dd3\uc229\u4c2b\ua562, p0:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u71ae\ud12e\uc31c\ub7dc\u40a9\u8709$0(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\ub102\u7c6b\u6c52\uae5d\ud51e\u4e72, p0:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)))
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
    
    public void \u67d0\u98a4\u3776\uf995\u8308\ub70c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_661 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_66C : int
        
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
        var_3_661 = and:int(ldc:int(-1054500467), ldc:int(1336795113))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\u4f52\u62da\ub19c\ubf56\u12cb[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(131072)), ldc:int(0))) {
            var_3_661 = and:int(var_3_661:int, ldc:int(1740084829))
            var_5_81 = and:int(ldc:int(-27526), ldc:int(18820))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10079), ldc:int(9564)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_661:int, ldc:int(-236072853))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(10250), ldc:int(10251)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(6481), ldc:int(9263)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_661 = and:int(var_3_D1:int, ldc:int(-138610391))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(8320), ldc:int(8321)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(64)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1646278475))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1083685796))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1413350233))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1691960947))
                        goto(Label_0942)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1058418190))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(32)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-491504235))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1601163805))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1235756640))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1424960847))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1196918360))
                        goto(Label_0942)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(64)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-2125537331))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-241379013))
                            var_11_E2 = and:int(ldc:int(-5485), ldc:int(5484))
                            goto(Label_1475)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0585:
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(252862249))
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-30960877))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(-683764021))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-158052096))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1590913549))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-2068132908))
                        goto(Label_0942)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1669580690))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(449047511))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-1265931406))
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(1333113469))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1084719455))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1731665430))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(1531959085))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(576), ldc:int(577))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0942:
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(1172137991))
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(183620884))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-424029747))
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(1259132185))
                        var_11_E2 = and:int(ldc:int(-18515), ldc:int(18514))
                    }
                    
                    Label_1091:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1809665320))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1018451656))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0942)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(1502987932))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-1399739986))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(1830785737))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1214:
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1091)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0942)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(1914251047))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(440645299))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(2114334687))
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(-173019091))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1475)
                    }
                    
                    Label_1340:
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1430309382))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(976052386))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-649094118))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-168904562))
                        loopcontinue()
                    }
                    
                    var_3_661 = and:int(var_3_661:int, ldc:int(1966518713))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1475:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66C = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1486:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-58927156))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-558646661))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(32)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(530081887))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1320387475))
                        goto(Label_0942)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(559514222))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(114652311))
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(321173176))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-413860689))
                        var_17_66C = add:int(var_16_110:int, and:int(ldc:int(417), ldc:int(26691)))
                        looporswitchbreak()
                    }
                    
                    var_3_661 = and:int(var_3_661:int, ldc:int(689581849))
                }
                
                var_3_661 = and:int(var_3_661:int, ldc:int(1367797977))
                
                if (cmple:boolean(var_5_81 = var_17_66C:int, sub:int(var_6_88:int, xor:int(ldc:int(12832), ldc:int(12833))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
