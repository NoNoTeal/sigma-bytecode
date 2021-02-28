public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u9033\ucef1\u12b2\ua3b4\u6cfe {
    public void \u9033\ucef1\u12b2\ua3b4\u6cfe(java.lang.String p0) {
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
            invokespecial:Object(Object::<init>, this:\u9033\ucef1\u12b2\ua3b4\u6cfe)
            invokestatic:String(Objects::requireNonNull, p0:String, loadelement:String(getstatic:String[](\u9033\ucef1\u12b2\ua3b4\u6cfe::\u3a62\u0a06\u76bc\u9255\u98a4\u97e6), and:int(ldc:int(7728), ldc:int(-7793))))
            putfield:String(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u385b\u93a2\u965f\u4daf\u516c\ube23, this:\u9033\ucef1\u12b2\ua3b4\u6cfe, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u9033\ucef1\u12b2\ua3b4\u6cfe \ud171\u5f50\ud158\uc229\u6fb0\u7006(java.lang.String p0) {
        var_1_5F : int
        stack_83_0 : \u9033\ucef1\u12b2\ua3b4\u6cfe [generated]
        
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
            var_1_5F = and:int(ldc:int(-18773305), ldc:int(-729065569))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, p0:String))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1629332698))
                stack_83_0 = initobject:\u9033\ucef1\u12b2\ua3b4\u6cfe(\u9033\ucef1\u12b2\ua3b4\u6cfe::<init>, p0:String)
            }
            else {
                stack_83_0 = getstatic:\u9033\ucef1\u12b2\ua3b4\u6cfe(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u56bd\uc7fe\u1833\u8308\ud12e\u4f52)
            }
            
            return:\u9033\ucef1\u12b2\ua3b4\u6cfe(stack_83_0:\u9033\ucef1\u12b2\ua3b4\u6cfe)
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u3711\u071d\u92ee\ub113\u3776(java.io.DataOutput p0) {
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
            invokeinterface:void(DataOutput::writeUTF, p0:DataOutput, getfield:String(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u385b\u93a2\u965f\u4daf\u516c\ube23, this:\u9033\ucef1\u12b2\ua3b4\u6cfe))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public byte \u98a4\u72f1\u7006\u3bd6\u59ec\u7e3f() {
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
            return:byte(ldc:byte(8))
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u7bad\uc238\u3a62\ua562\u7af6<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u9033\ucef1\u12b2\ua3b4\u6cfe> \u6bb9\ub18d\u51fa\u51fa\u72f1\uc910() {
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
            return:\u7bad\uc238\u3a62\ua562\u7af6<\u9033\ucef1\u12b2\ua3b4\u6cfe>(getstatic:\u7bad\uc238\u3a62\ua562\u7af6<\u9033\ucef1\u12b2\ua3b4\u6cfe>(\u9033\ucef1\u12b2\ua3b4\u6cfe::\uafe7\u3e2a\ua3b4\u3e75\u760c\u72f1))
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
            return:String(invokestatic:String(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u1187\u873d\u927d\u7e3f\u7e3f\u92ff, getfield:String(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u385b\u93a2\u965f\u4daf\u516c\ube23, this:\u9033\ucef1\u12b2\ua3b4\u6cfe)))
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u9033\ucef1\u12b2\ua3b4\u6cfe \u3d64\u12cb\u56bd\u0a06\u6cfe\u120d() {
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
            return:\u9033\ucef1\u12b2\ua3b4\u6cfe(this:\u9033\ucef1\u12b2\ua3b4\u6cfe)
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        var_2_93 : int
        stack_D5_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(694047434), ldc:int(1729816111))
        
        if (cmpne:boolean(this:\u9033\ucef1\u12b2\ua3b4\u6cfe[expected:Object], p0:Object)) {
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_93 = and:int(var_2_5F:int, ldc:int(1982649767))
                }
                else {
                    var_2_93 = and:int(var_2_5F:int, ldc:int(-1220383905))
                    
                    if (instanceof:boolean(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u9033\ucef1\u12b2\ua3b4\u6cfe.class, p0:Object)) {
                        if (invokestatic:boolean(Objects::equals, getfield:String[expected:Object](\u9033\ucef1\u12b2\ua3b4\u6cfe::\u385b\u93a2\u965f\u4daf\u516c\ube23, this:\u9033\ucef1\u12b2\ua3b4\u6cfe), getfield:String[expected:Object](\u9033\ucef1\u12b2\ua3b4\u6cfe::\u385b\u93a2\u965f\u4daf\u516c\ube23, checkcast:\u9033\ucef1\u12b2\ua3b4\u6cfe(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u9033\ucef1\u12b2\ua3b4\u6cfe.class, p0:Object[expected:\u9033\ucef1\u12b2\ua3b4\u6cfe])))) {
                            stack_D5_0 = xor:int(ldc:int(-32512), ldc:int(-32511))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_93:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_93 = and:int(var_2_93:int, ldc:int(1736173419))
                    stack_D5_0 = and:int(ldc:int(-6919), ldc:int(6662))
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_93:int, ldc:int(-291931363))
            }
            
            return:boolean(stack_D5_0:int)
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(-24060), ldc:int(-24059)))
    }
    
    public int hashCode() {
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
            return:int(invokevirtual:int(String::hashCode, getfield:String(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u385b\u93a2\u965f\u4daf\u516c\ube23, this:\u9033\ucef1\u12b2\ua3b4\u6cfe)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ud36e\u51fa\ua562\ubf56\u51fa\u1187() {
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
            return:String(getfield:String(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u385b\u93a2\u965f\u4daf\u516c\ube23, this:\u9033\ucef1\u12b2\ua3b4\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u12b2\u946b\ufcaf\u61a4\u8cae\u9af2(java.lang.String p0, int p1) {
        var_5_67 : String
        var_6_7C : String
        
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
            var_5_67 = invokestatic:String(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u1187\u873d\u927d\u7e3f\u7e3f\u92ff, getfield:String(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u385b\u93a2\u965f\u4daf\u516c\ube23, this:\u9033\ucef1\u12b2\ua3b4\u6cfe))
            var_6_7C = invokevirtual:String(String::substring, var_5_67:String, and:int(ldc:int(-31100), ldc:int(2147)), xor:int(ldc:int(-27644), ldc:int(-27643)))
            return:ITextComponent(invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokevirtual:IFormattableTextComponent(TextComponent::append, initobject:StringTextComponent(StringTextComponent::<init>, var_6_7C:String), invokevirtual:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, invokevirtual:String(String::substring, var_5_67:String, xor:int(ldc:int(78), ldc:int(79)), sub:int(invokevirtual:int(String::length, var_5_67:String), and:int(ldc:int(1), ldc:int(25609))))), getstatic:TextFormatting(\u9033\ucef1\u12b2\ua3b4\u6cfe::\uc229\u8c8a\u4f4a\u5654\u64ab\ubefe))), var_6_7C:String))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u1187\u873d\u927d\u7e3f\u7e3f\u92ff(java.lang.String p0) {
        var_1_252 : int
        var_3_72 : StringBuilder
        var_4_7A : int
        var_5_83 : int
        var_1_90 : int
        var_6_117 : char
        stack_263_0 : int [generated]
        
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
            var_1_252 = and:int(ldc:int(-1602970408), ldc:int(-539505213))
            var_3_72 = initobject:StringBuilder(StringBuilder::<init>, loadelement:String(getstatic:String[](\u9033\ucef1\u12b2\ua3b4\u6cfe::\u3a62\u0a06\u76bc\u9255\u98a4\u97e6), xor:int(ldc:int(20610), ldc:int(20611))))
            var_4_7A = and:int(ldc:int(-7747), ldc:int(7746))
            var_5_83 = and:int(ldc:int(-26779), ldc:int(26778))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_90 = and:int(var_1_252:int, ldc:int(1610484106))
                    goto(Label_0209)
                }
                
                if (cmpne:boolean(and:int(var_1_252:int, ldc:int(256)), ldc:int(0))) {
                    var_1_252 = and:int(var_1_252:int, ldc:int(-1301002608))
                }
                else {
                    var_1_252 = and:int(var_1_252:int, ldc:int(-2091397422))
                    
                    if (cmplt:boolean(var_5_83:int, invokevirtual:int(String::length, p0:String))) {
                        var_6_117 = invokevirtual:char(String::charAt, p0:String, var_5_83:int)
                        
                        if (cmpeq:boolean(var_6_117:char, ldc:char(92))) {
                            invokevirtual:StringBuilder(StringBuilder::append, var_3_72:StringBuilder, ldc:char(92))
                            goto(Label_0438)
                        }
                        
                        Label_0288:
                        
                        if (cmpne:boolean(and:int(var_1_252:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_252 = and:int(var_1_252:int, ldc:int(1655375248))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_252:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_252 = and:int(var_1_252:int, ldc:int(-654897231))
                            
                            if (cmpne:boolean(var_6_117:char, ldc:char(34))) {
                                if (cmpne:boolean(var_6_117:char, ldc:char(39))) {
                                    goto(Label_0438)
                                }
                            }
                        }
                        
                        Label_0336:
                        
                        if (cmpne:boolean(and:int(var_1_252:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_252:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(2048)), ldc:int(0))) {
                            var_1_252 = and:int(var_1_252:int, ldc:int(1372945496))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_252:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_252 = and:int(var_1_252:int, ldc:int(743482231))
                                goto(Label_0288)
                            }
                            
                            var_1_252 = and:int(var_1_252:int, ldc:int(-1216962664))
                            
                            if (cmpeq:boolean(var_4_7A:int, ldc:int(0))) {
                                if (cmpne:boolean(var_6_117:char, ldc:char(34))) {
                                    goto(Label_0554)
                                }
                                
                                stack_263_0 = ldc:int(39)
                                goto(Label_0606)
                            }
                        }
                        
                        Label_0390:
                        
                        if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_252:int, ldc:int(262144)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0336)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_252 = and:int(var_1_252:int, ldc:int(-681001916))
                                goto(Label_0288)
                            }
                            
                            var_1_252 = and:int(var_1_252:int, ldc:int(-1059143723))
                            
                            if (cmpeq:boolean(var_4_7A:char, var_6_117:char)) {
                                invokevirtual:StringBuilder(StringBuilder::append, var_3_72:StringBuilder, ldc:char(92))
                            }
                        }
                        
                        Label_0438:
                        
                        if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_252 = and:int(var_1_252:int, ldc:int(-1518481102))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_252:int, ldc:int(134217728)), ldc:int(0))) {
                                var_1_252 = and:int(var_1_252:int, ldc:int(-1275525403))
                                goto(Label_0390)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_252:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_252 = and:int(var_1_252:int, ldc:int(-111225655))
                                goto(Label_0336)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(4)), ldc:int(0))) {
                                var_1_252 = and:int(var_1_252:int, ldc:int(-1896071240))
                                invokevirtual:StringBuilder(StringBuilder::append, var_3_72:StringBuilder, var_6_117:char)
                                inc:int(var_5_83, ldc:int(1))
                                loopcontinue()
                            }
                            
                            goto(Label_0288)
                        }
                        
                        Label_0554:
                        
                        if (cmpne:boolean(and:int(var_1_252:int, ldc:int(256)), ldc:int(0))) {
                            var_1_252 = and:int(var_1_252:int, ldc:int(1798028789))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_252:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_252:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0336)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_252:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0288)
                        }
                        
                        var_1_252 = and:int(var_1_252:int, ldc:int(-178864695))
                        stack_263_0 = ldc:int(34)
                        Label_0606:
                        var_1_252 = and:int(var_1_252:int, ldc:int(-1107829368))
                        var_4_7A = i2c:char(stack_263_0:int)
                        goto(Label_0390)
                    }
                }
                
                Label_0177:
                
                if (cmpne:boolean(and:int(var_1_252:int, ldc:int(4)), ldc:int(0))) {
                    var_1_90 = and:int(var_1_252:int, ldc:int(-1226229500))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_252:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_90 = and:int(var_1_252:int, ldc:int(-1538412603))
                    
                    if (cmpeq:boolean(var_4_7A:char, ldc:char(0))) {
                        var_4_7A = ldc:char(34)
                    }
                }
                
                Label_0209:
                
                if (cmpeq:boolean(and:int(var_1_90:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_252 = and:int(var_1_90:int, ldc:int(1025225552))
                    goto(Label_0177)
                }
                
                if (cmpeq:boolean(and:int(var_1_90:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_252 = and:int(var_1_90:int, ldc:int(963471719))
            }
            
            invokevirtual:void(StringBuilder::setCharAt, var_3_72:StringBuilder, and:int(ldc:int(31936), ldc:int(-31945)), var_4_7A:char)
            invokevirtual:StringBuilder(StringBuilder::append, var_3_72:StringBuilder, var_4_7A:char)
            return:String(invokevirtual:String(StringBuilder::toString, var_3_72:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab \u3d64\u12cb\u56bd\u0a06\u6cfe\u120d() {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(invokevirtual:\u9033\ucef1\u12b2\ua3b4\u6cfe[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u9033\ucef1\u12b2\ua3b4\u6cfe::\u3d64\u12cb\u56bd\u0a06\u6cfe\u120d, this:\u9033\ucef1\u12b2\ua3b4\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1D8 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_97_0 : byte[] [generated]
        stack_99_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_255_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_173 : byte[]
        var_4_174 : int
        expr_99 : int [generated]
        var_5_1C4 : int
        var_3_1C9 : byte[]
        var_4_1CA : int
        expr_1EE : byte [generated]
        var_0_24B : int
        expr_255 : byte [generated]
        stack_285_2 : byte [generated]
        expr_B5 : int [generated]
        var_3_E2 : String
        expr_EA : String[] [generated]
        expr_F4 : String[] [generated]
        var_3_14D : String[]
        
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
            var_0_1D8 = and:int(ldc:int(2094712698), ldc:int(2111335737))
            expr_65 = var_2_69 = stack_97_0 = stack_99_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1EB_0 = stack_255_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("B0PuxF/AfUEpRFxZpfhHwML1W0GUEB8VqA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_173 = newarray:byte[](byte.class, expr_6D:int)
                var_4_174 = expr_6D:int
                
                loop {
                    var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1055870905))
                    var_4_174 = add:int(var_4_174:int, ldc:int(-1))
                    storeelement:byte(var_3_173:byte[], var_4_174:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_174:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_174:int, xor:int(ldc:int(-31744), ldc:int(-31743)))), ldc:int(3)), xor:int(ldc:int(10345), ldc:int(10358)))))
                    
                    if (cmpne:boolean(var_4_174:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_99_0 = stack_97_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1EB_0 = stack_255_0 = var_3_173:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(1)), ldc:int(0))) {
                    var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1453245820))
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1362573010))
                    goto(Label_0158)
                }
                
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1071292409))
                expr_99 = arraylength:int(stack_99_0:byte[])
                
                if (cmpeq:boolean(expr_99:int, ldc:int(0))) {
                    goto(Label_0158)
                }
                
                var_5_1C4 = expr_99:int
                var_3_1C9 = newarray:byte[](byte.class, expr_99:int)
                var_4_1CA = expr_99:int
                Label_0460:
                
                while (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1093011586))
                    var_4_1CA = add:int(var_4_1CA:int, ldc:int(-1))
                    expr_1EE = add:byte(loadelement:byte(stack_1EB_0:byte[], var_4_1CA:int), ldc:byte(46))
                    storeelement:byte(var_3_1C9:byte[], var_4_1CA:int, xor:int(or:int(and:int(shl:int(expr_1EE:byte, xor:int(ldc:int(8497), ldc:int(8501))), ldc:int(-16)), and:int(shr:int(expr_1EE:byte[expected:int], xor:int(ldc:int(385), ldc:int(389))), ldc:int(15))), ldc:int(97)))
                    
                    if (cmpne:boolean(var_4_1CA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_99_0 = stack_97_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1EB_0 = stack_255_0 = var_3_1C9:byte[]
                    goto(Label_0158)
                }
                
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(1085378441))
                Label_0566:
                
                while (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(1)), ldc:int(0))) {
                    var_0_24B = and:int(var_0_1D8:int, ldc:int(-1083329219))
                    var_4_1CA = add:int(var_4_1CA:int, ldc:int(-1))
                    expr_255 = loadelement:byte(stack_255_0:byte[], var_4_1CA:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_1CA:int, ldc:int(5)), neg:int(var_5_1C4:int)), ldc:int(0))) {
                        var_0_24B = and:int(var_0_24B:int, ldc:int(2144865726))
                        stack_285_2 = add:byte(expr_255:byte, ldc:byte(5))
                    }
                    else {
                        stack_285_2 = add:byte(expr_255:byte, loadelement:byte(var_3_1C9:byte[], add:int(var_4_1CA:int, ldc:int(5))))
                    }
                    
                    var_0_1D8 = and:int(var_0_24B:int, ldc:int(1048106491))
                    storeelement:byte(var_3_1C9:byte[], var_4_1CA:int, stack_285_2:byte)
                    
                    if (cmpne:boolean(var_4_1CA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_99_0 = stack_97_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1EB_0 = stack_255_0 = var_3_1C9:byte[]
                    goto(Label_0186)
                }
                
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(590160439))
                goto(Label_0460)
                Label_0158:
                
                if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_1D8 = and:int(var_0_1D8:int, ldc:int(2105226687))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_5_1C4 = expr_B5:int
                        var_3_1C9 = newarray:byte[](byte.class, expr_B5:int)
                        var_4_1CA = expr_B5:int
                        goto(Label_0566)
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_0_1D8:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_0_1D8:int, ldc:int(2097152)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_1D8 = and:int(var_0_1D8:int, ldc:int(-1194313790))
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_EA = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(19), ldc:int(12931)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(163), ldc:int(4683)))
            storeelement:String(expr_EA:String[], and:int(ldc:int(3078), ldc:int(16906)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(18505), ldc:int(-22634)), and:int(ldc:int(-16739), ldc:int(16738))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(1108), ldc:int(1109)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-7087), ldc:int(7084)), and:int(ldc:int(31745), ldc:int(113))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(24849), ldc:int(-24954)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-32736), ldc:int(-32735)), and:int(ldc:int(10264), ldc:int(921))))
            putstatic:String[](\u9033\ucef1\u12b2\ua3b4\u6cfe::\u3a62\u0a06\u76bc\u9255\u98a4\u97e6, expr_F4:String[])
            var_3_14D = expr_EA:String[]
            putstatic:\u7bad\uc238\u3a62\ua562\u7af6<\u9033\ucef1\u12b2\ua3b4\u6cfe>(\u9033\ucef1\u12b2\ua3b4\u6cfe::\uafe7\u3e2a\ua3b4\u3e75\u760c\u72f1, initobject:\u600f\uc31c\u34df\uc2bd\u9a18[expected:\u7bad\uc238\u3a62\ua562\u7af6<\u9033\ucef1\u12b2\ua3b4\u6cfe>](\u600f\uc31c\u34df\uc2bd\u9a18::<init>))
            putstatic:\u9033\ucef1\u12b2\ua3b4\u6cfe(\u9033\ucef1\u12b2\ua3b4\u6cfe::\u56bd\uc7fe\u1833\u8308\ud12e\u4f52, initobject:\u9033\ucef1\u12b2\ua3b4\u6cfe(\u9033\ucef1\u12b2\ua3b4\u6cfe::<init>, loadelement:String(var_3_14D:String[], and:int(ldc:int(191), ldc:int(18434)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc29a\u0800\u7c6b\ub7dc\u385b\u67d0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_661 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
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
        var_3_661 = and:int(ldc:int(1600992733), ldc:int(-1621460071))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9033\ucef1\u12b2\ua3b4\u6cfe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
            var_3_661 = and:int(var_3_661:int, ldc:int(-1613220359))
            var_5_81 = and:int(ldc:int(-12388), ldc:int(8291))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19569), ldc:int(19504)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_661:int, ldc:int(1073610141))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, and:int(ldc:int(105), ldc:int(17795)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(1091), ldc:int(6437)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_661 = and:int(var_3_D0:int, ldc:int(2011133915))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(16657), ldc:int(163)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1167006856))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1827316518))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1848336424))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1823320198))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(984763713))
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1588089501))
                    }
                    else {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1756382727))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(2)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1332769135))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-957356020))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-3417089))
                            var_11_E1 = and:int(ldc:int(31488), ldc:int(-31498))
                            goto(Label_1514)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(73346132))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-303671006))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-314199168))
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1747337283))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1698474192))
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1855999027))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(2075534245))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1209182215))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1055979415))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(1348505376))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(633409588))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-2107920138))
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(-547416641))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = and:int(ldc:int(1905), ldc:int(8193))
                                goto(Label_1068)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1579398643))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(759594472))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-1682945951))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(104275432))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1756638819))
                        var_11_E1 = and:int(ldc:int(-32724), ldc:int(22339))
                    }
                    
                    Label_1068:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-544531837))
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1254281555))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(1719963026))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-114943638))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(2)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(2074301874))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(181680353))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(1954030498))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(1471932906))
                            loopcontinue()
                        }
                        
                        var_3_661 = and:int(var_3_661:int, ldc:int(938284537))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(941548531))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-438496796))
                            goto(Label_1068)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(-1322945415))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(1537397366))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(256)), ldc:int(0))) {
                            var_3_661 = and:int(var_3_661:int, ldc:int(1608373755))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                            goto(Label_1514)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1356:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(256)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(604216203))
                        goto(Label_1525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(735682827))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(256)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(2004599253))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1595906025))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(23543062))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-2008766668))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(128)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(-1158174228))
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_661 = and:int(var_3_661:int, ldc:int(-1755603553))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1514:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66C = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1525:
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(1)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(816099642))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_661:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(482987422))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(2021032033))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(606773312))
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_661:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_661 = and:int(var_3_661:int, ldc:int(399260569))
                        var_17_66C = add:int(var_16_10F:int, and:int(ldc:int(15003), ldc:int(5)))
                        looporswitchbreak()
                    }
                }
                
                var_3_661 = and:int(var_3_661:int, ldc:int(525228957))
                
                if (cmple:boolean(var_5_81 = var_17_66C:int, sub:int(var_6_88:int, and:int(ldc:int(8259), ldc:int(289))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_661:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
