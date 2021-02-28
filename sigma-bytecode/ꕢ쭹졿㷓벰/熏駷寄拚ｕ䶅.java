public abstract class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u718f\u99f7\u5bc4\u62da\uff55\u4d85 {
    public void \u718f\u99f7\u5bc4\u62da\uff55\u4d85(int p0, java.lang.String p1) {
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
            invokespecial:Object(Object::<init>, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
            putfield:String(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u88c5\u385b\u5db4\u61a4\u9937\ube23, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, ldc:String("items.png"))
            putfield:boolean(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\uc238\uae87\uf94d\u8350\u8d98\u836c, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, and:int[expected:boolean](ldc:int(12545), ldc:int(1055)))
            putfield:boolean(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u3504\u6ec6\u67e9\u6bb9\ud217\uc84e, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, and:int[expected:boolean](ldc:int(5441), ldc:int(51)))
            putfield:\u8bb0\u527a\u4cd9\ub171\ud171[](\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ua562\u8d98\u5245\u8258\ub113\u6d99, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, newarray:\u8bb0\u527a\u4cd9\ub171\ud171[](\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8bb0\u527a\u4cd9\ub171\ud171.class, and:int(ldc:int(3452), ldc:int(-4093))))
            putfield:int(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u4492\u72f1\u4975\u5db4\u12cb\u8d98, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, p0:int)
            putfield:String(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u47c2\uc9f6\u97e6\u98a4\ub19c\u9a18, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, p1:String)
            putfield:ITextComponent(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u8c8a\u8258\u7c6b\u760c\u8258\u47c2, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("itemGroup.")), p1:String))))
            putfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u12b2\ub32d\u69d9\ubb2b\uc7fe\u16f6, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
            storeelement:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(getstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85[](\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u64f2\u8c8a\u6d99\u6d99\u5f50\u12cb), p0:int, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \uff55\u3bc9\u946b\u927d\ub8be\u5654() {
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
            return:int(getfield:int(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u4492\u72f1\u4975\u5db4\u12cb\u8d98, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u946b\u873d\u4daf\uc229\ub171\ubcb0() {
        var_1_5F : int
        stack_80_0 : String [generated]
        
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
            var_1_5F = and:int(ldc:int(699032149), ldc:int(-1008411979))
            
            if (cmpne:boolean(getfield:String(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u64f2\ub32d\u6ec6\u76bc\uf995\u8aa5, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85), aconstnull:String())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1944998165))
                stack_80_0 = getfield:String(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u64f2\ub32d\u6ec6\u76bc\uf995\u8aa5, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
            }
            else {
                stack_80_0 = getfield:String(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u47c2\uc9f6\u97e6\u98a4\ub19c\u9a18, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
            }
            
            return:String(stack_80_0:String)
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \uc4d2\uc246\ub6ab\u92ee\u8640\u64ab() {
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
            return:ITextComponent(getfield:ITextComponent(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u8c8a\u8258\u7c6b\u760c\u8258\u47c2, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u4f4a\u76bc\uae5d\u0a06\u3711\u446c() {
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
            
            if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u12b2\ub32d\u69d9\ubb2b\uc7fe\u16f6, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))) {
                putfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u12b2\ub32d\u69d9\ubb2b\uc7fe\u16f6, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u6c52\u624e\u7043\u97b7\u8258\u5d20, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))
            }
            
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u12b2\ub32d\u69d9\ubb2b\uc7fe\u16f6, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))
        }
        
        goto(Label_0006)
    }
    
    public abstract \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u6c52\u624e\u7043\u97b7\u8258\u5d20();
    
    public java.lang.String \u6d99\u3e2a\u3e2a\uc3e3\u6cfe\u6fb0() {
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
            return:String(getfield:String(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u88c5\u385b\u5db4\u61a4\u9937\ube23, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))
        }
        
        goto(Label_0006)
    }
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u718f\u99f7\u5bc4\u62da\uff55\u4d85 \ub32d\ubcb0\u4c2b\u97e6\ud158\u67e9(java.lang.String p0) {
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
            putfield:String(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u88c5\u385b\u5db4\u61a4\u9937\ube23, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, p0:String)
            return:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
        }
        
        goto(Label_0006)
    }
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u718f\u99f7\u5bc4\u62da\uff55\u4d85 \u960f\u6435\u7006\u16f6\ufe34\u98a4(java.lang.String p0) {
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
            putfield:String(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u64f2\ub32d\u6ec6\u76bc\uf995\u8aa5, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, p0:String)
            return:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4bc8\u56bd\ub6ab\u51fa\ub102\u6435() {
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
            return:boolean(getfield:boolean(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u3504\u6ec6\u67e9\u6bb9\ud217\uc84e, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))
        }
        
        goto(Label_0006)
    }
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u718f\u99f7\u5bc4\u62da\uff55\u4d85 \u71f1\ubded\u760c\u760c\u97b7\ubefe() {
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
            putfield:boolean(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u3504\u6ec6\u67e9\u6bb9\ud217\uc84e, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, and:int[expected:boolean](ldc:int(10882), ldc:int(-10887)))
            return:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u9af2\u960f\u2dcc\u4cd9\u51fa\u56bd() {
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
            return:boolean(getfield:boolean(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\uc238\uae87\uf94d\u8350\u8d98\u836c, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))
        }
        
        goto(Label_0006)
    }
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u718f\u99f7\u5bc4\u62da\uff55\u4d85 \ucb79\uae87\uf9c5\u760c\u071d\u3c25() {
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
            putfield:boolean(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\uc238\uae87\uf94d\u8350\u8d98\u836c, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, and:int[expected:boolean](ldc:int(-13662), ldc:int(12621)))
            return:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
        }
        
        goto(Label_0006)
    }
    
    public int \ubcb0\u0c95\u8350\ud523\u40a9\u8d98() {
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
            return:int(rem:int(getfield:int(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u4492\u72f1\u4975\u5db4\u12cb\u8d98, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85), ldc:int(6)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud523\u9a18\u516c\u6b0d\u92ff\u3d4b() {
        var_1_5F : int
        stack_88_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1417405419), ldc:int(-1682648505))
            
            if (cmpge:boolean(getfield:int(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u4492\u72f1\u4975\u5db4\u12cb\u8d98, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85), ldc:int(6))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-609379619))
                stack_88_0 = and:int(ldc:int(-10131), ldc:int(10002))
            }
            else {
                stack_88_0 = and:int(ldc:int(281), ldc:int(8289))
            }
            
            return:boolean(stack_88_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u624e\ud36e\ube23\ub1b9\u3dd3\ub19c() {
        var_1_5F : int
        stack_8D_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1810848109), ldc:int(747753393))
            
            if (cmpne:boolean(invokevirtual:int(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ubcb0\u0c95\u8350\ud523\u40a9\u8d98, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85), xor:int(ldc:int(24577), ldc:int(24580)))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(789775859))
                stack_8D_0 = and:int(ldc:int(4505), ldc:int(-4506))
            }
            else {
                stack_8D_0 = and:int(ldc:int(9), ldc:int(531))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8bb0\u527a\u4cd9\ub171\ud171[] \u36d3\u6c52\uff55\uf94d\u64f2\u62da() {
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
            return:\u8bb0\u527a\u4cd9\ub171\ud171[](getfield:\u8bb0\u527a\u4cd9\ub171\ud171[](\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ua562\u8d98\u5245\u8258\ub113\u6d99, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85))
        }
        
        goto(Label_0006)
    }
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u718f\u99f7\u5bc4\u62da\uff55\u4d85 \u97e6\u927d\ucef1\u2dcc\u40a9\u6cfe(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8bb0\u527a\u4cd9\ub171\ud171[] p0) {
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
            putfield:\u8bb0\u527a\u4cd9\ub171\ud171[](\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ua562\u8d98\u5245\u8258\ub113\u6d99, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, p0:\u8bb0\u527a\u4cd9\ub171\ud171[])
            return:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub18d\u5140\u7c6b\ub83f\u12cb\u98a4(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8bb0\u527a\u4cd9\ub171\ud171 p0) {
        var_2_5F : int
        var_4_79 : \u8bb0\u527a\u4cd9\ub171\ud171[]
        var_5_7E : int
        var_6_87 : int
        
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
            var_2_5F = and:int(ldc:int(-340494891), ldc:int(-572669511))
            
            if (cmpne:boolean(p0:\u8bb0\u527a\u4cd9\ub171\ud171, aconstnull:\u8bb0\u527a\u4cd9\ub171\ud171())) {
                var_4_79 = getfield:\u8bb0\u527a\u4cd9\ub171\ud171[](\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ua562\u8d98\u5245\u8258\ub113\u6d99, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85)
                var_5_7E = arraylength:int(var_4_79:\u8bb0\u527a\u4cd9\ub171\ud171[])
                var_6_87 = and:int(ldc:int(-4271), ldc:int(4270))
                
                loop {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-906200101))
                    
                    if (cmpge:boolean(var_6_87:int, var_5_7E:int)) {
                        looporswitchbreak()
                    }
                    
                    if (cmpeq:boolean(loadelement:\u8bb0\u527a\u4cd9\ub171\ud171(var_4_79:\u8bb0\u527a\u4cd9\ub171\ud171[], var_6_87:int), p0:\u8bb0\u527a\u4cd9\ub171\ud171)) {
                        return:boolean(and:int[expected:boolean](ldc:int(9601), ldc:int(6221)))
                    }
                    
                    inc:int(var_6_87, ldc:int(1))
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-18744), ldc:int(16663)))
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u16f6\ud217\u5654\u071d\ub8be(\u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p0) {
        var_2_5F : int
        var_4_66 : Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>
        
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
            var_2_5F = and:int(ldc:int(599441625), ldc:int(-1551903014))
            var_4_66 = invokevirtual:Iterator<Object>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::iterator, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u36d3\u67e9\u3504\u7bad\u3504\u2dcc))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(759155867))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_66:Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u6b0d\u3bd6\u4daf\u3e2a\uf9c5\ucfaf, checkcast:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52.class, invokeinterface:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::next, var_4_66:Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>)), this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85, p0:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_F3 : \u6c52\u7e3f\u071d\u4ab3\ub7dc\ua3b4 [generated]
        expr_106 : \u8bb0\u527a\u4cd9\ub171\ud171[] [generated]
        expr_13F : \ub19c\u12cb\ubff1\u4d85\u8753\u93a2 [generated]
        expr_14D : \u8bb0\u527a\u4cd9\ub171\ud171[] [generated]
        
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
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85[](\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u64f2\u8c8a\u6d99\u6d99\u5f50\u12cb, newarray:\u718f\u99f7\u5bc4\u62da\uff55\u4d85[](\ua562\ucb79\uc87f\u3dd3\ubcb0.\u718f\u99f7\u5bc4\u62da\uff55\u4d85.class, ldc:int(12)))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u3d64\u8bb0\u600f\uc2bd\u12cb\u4e72, invokevirtual:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u960f\u6435\u7006\u16f6\ufe34\u98a4, initobject:\u51b2\ud158\ubb2b\uceb8\u392e\u52d3[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u51b2\ud158\ubb2b\uceb8\u392e\u52d3::<init>, and:int(ldc:int(-6651), ldc:int(2544)), ldc:String("buildingBlocks")), ldc:String("building_blocks")))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u071d\ud4fe\u47c2\u3a62\uc229\u9033, initobject:\uc229\uc229\ub113\u8d90\u3504\u8d98[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\uc229\uc229\ub113\u8d90\u3504\u8d98::<init>, and:int(ldc:int(26829), ldc:int(1283)), ldc:String("decorations")))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\uc2bd\u7bad\uc2bd\u4c04\ub8be\u516c, initobject:\u4179\ud4fe\ub8be\u8c8a\ua3b4\u7049[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u4179\ud4fe\ub8be\u8c8a\ua3b4\u7049::<init>, xor:int(ldc:int(394), ldc:int(392)), ldc:String("redstone")))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ud51e\uf995\u3e75\u69d9\u4f4a\ud523, initobject:\u62da\ub171\ub70c\u4179\u8bb0\uc29a[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u62da\ub171\ub70c\u4179\u8bb0\uc29a::<init>, and:int(ldc:int(17827), ldc:int(3)), ldc:String("transportation")))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u12b2\u7ce1\u4c2b\u8c8a\u64f2\u392e, initobject:\u92ee\u8350\u16f6\ua61f\u4c04\u74b1[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u92ee\u8350\u16f6\ua61f\u4c04\u74b1::<init>, ldc:int(6), ldc:String("misc")))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u120d\u4c2b\ud36e\ud158\u8c8a\u9033, invokevirtual:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ub32d\ubcb0\u4c2b\u97e6\ud158\u67e9, initobject:\u8c8a\uc31c\u836c\uae5d\u527a\u9af2[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u8c8a\uc31c\u836c\uae5d\u527a\u9af2::<init>, and:int(ldc:int(2189), ldc:int(5637)), ldc:String("search")), ldc:String("item_search.png")))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u0a06\ua61f\u97b7\uceb8\u156b\u5d20, initobject:\u759a\uc3e3\u36d3\u7873\u7bad\uc246[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u759a\uc3e3\u36d3\u7873\u7bad\uc246::<init>, ldc:int(7), ldc:String("food")))
            expr_F3 = initobject:\u6c52\u7e3f\u071d\u4ab3\ub7dc\ua3b4(\u6c52\u7e3f\u071d\u4ab3\ub7dc\ua3b4::<init>, ldc:int(8), ldc:String("tools"))
            expr_106 = newarray:\u8bb0\u527a\u4cd9\ub171\ud171[](\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8bb0\u527a\u4cd9\ub171\ud171.class, xor:int(ldc:int(-20475), ldc:int(-20479)))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_106:\u8bb0\u527a\u4cd9\ub171\ud171[], and:int(ldc:int(1589), ldc:int(-11894)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u7049\ub70c\u392e\u93a2\ud12e\u8df4))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_106:\u8bb0\u527a\u4cd9\ub171\ud171[], xor:int(ldc:int(4482), ldc:int(4483)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u8cae\ub18d\u34df\uc238\u6198\u156b))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_106:\u8bb0\u527a\u4cd9\ub171\ud171[], xor:int(ldc:int(6180), ldc:int(6182)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\uc3e3\u52d3\u7af6\u6d69\u3776\u8c8a))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_106:\u8bb0\u527a\u4cd9\ub171\ud171[], xor:int(ldc:int(0), ldc:int(3)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u72f1\u4bc8\u6d69\u516c\ufcaf\u6198))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ua6bd\u759a\ub70c\u8753\u67e9\u9af2, invokevirtual:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u97e6\u927d\ucef1\u2dcc\u40a9\u6cfe, expr_F3:\u6c52\u7e3f\u071d\u4ab3\ub7dc\ua3b4[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85], expr_106:\u8bb0\u527a\u4cd9\ub171\ud171[]))
            expr_13F = initobject:\ub19c\u12cb\ubff1\u4d85\u8753\u93a2(\ub19c\u12cb\ubff1\u4d85\u8753\u93a2::<init>, ldc:int(9), ldc:String("combat"))
            expr_14D = newarray:\u8bb0\u527a\u4cd9\ub171\ud171[](\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8bb0\u527a\u4cd9\ub171\ud171.class, ldc:int(12))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], and:int(ldc:int(-12096), ldc:int(11064)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u7049\ub70c\u392e\u93a2\ud12e\u8df4))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], xor:int(ldc:int(-30206), ldc:int(-30205)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u6b0d\u92ee\u6b0d\u3d64\u3e75\u0a06))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], xor:int(ldc:int(-32767), ldc:int(-32765)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u56bd\u51fa\u7ce1\u3d64\uc2bd\uc2bd))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], xor:int(ldc:int(520), ldc:int(523)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\ubf56\u624e\u0800\u93a2\u183a\u5654))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], and:int(ldc:int(19181), ldc:int(1028)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u64ab\u759a\u5bc4\u3bc9\u6bb9\u8bb0))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], xor:int(ldc:int(17541), ldc:int(17536)), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u4c2b\u5fe1\u7af6\u72f1\u6d69\u965f))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], ldc:int(6), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u927d\u1833\u6cfe\u8258\ufe34\u64f2))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], ldc:int(7), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u392e\u7873\ua61f\u5bc4\ud523\uc9f6))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], ldc:int(8), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\uc229\u8709\u5245\u71ae\u8df4\u92ff))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], ldc:int(9), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u72f1\u4bc8\u6d69\u516c\ufcaf\u6198))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], ldc:int(10), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u8d90\u156b\u8d90\u718f\uf9c5\ub171))
            storeelement:\u8bb0\u527a\u4cd9\ub171\ud171(expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[], ldc:int(11), getstatic:\u8bb0\u527a\u4cd9\ub171\ud171(\u8bb0\u527a\u4cd9\ub171\ud171::\u385b\u8bb0\uc29a\u97e6\u494c\u8cae))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u071d\u59ec\u88c5\u74b1\u98a4\ud523, invokevirtual:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u97e6\u927d\ucef1\u2dcc\u40a9\u6cfe, expr_13F:\ub19c\u12cb\ubff1\u4d85\u8753\u93a2[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85], expr_14D:\u8bb0\u527a\u4cd9\ub171\ud171[]))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u6435\u5d20\uc31c\u7049\u8aa5\u7d52, initobject:\u47c2\ucef1\u59ec\ud158\u4179\u0c95[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u47c2\ucef1\u59ec\ud158\u4179\u0c95::<init>, ldc:int(10), ldc:String("brewing")))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\uc238\u76bc\u7873\uc7fe\u8413\u3dd3, getstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u12b2\u7ce1\u4c2b\u8c8a\u64f2\u392e))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u61a4\u8308\u67e9\u516c\u7d52\u8bb0, initobject:\u4179\u7ce1\u7bad\uc246\u3e2a\u5f50[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u4179\u7ce1\u7bad\uc246\u3e2a\u5f50::<init>, and:int(ldc:int(9333), ldc:int(4)), ldc:String("hotbar")))
            putstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\uc2e8\uc2bd\ud523\ube23\u74b1\u392e, invokevirtual:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u71f1\ubded\u760c\u760c\u97b7\ubefe, invokevirtual:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ucb79\uae87\uf9c5\u760c\u071d\u3c25, invokevirtual:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\ub32d\ubcb0\u4c2b\u97e6\ud158\u67e9, initobject:\u69d9\u8c8a\u3711\ub18d\u69d9\u392e[expected:\u718f\u99f7\u5bc4\u62da\uff55\u4d85](\u69d9\u8c8a\u3711\ub18d\u69d9\u392e::<init>, ldc:int(11), ldc:String("inventory")), ldc:String("inventory.png")))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\u8709\u7873\u5db4\uc31c\u92ee(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(-1961653954), ldc:int(958812058))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\u99f7\u5bc4\u62da\uff55\u4d85[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-148231796))
        }
        else {
            var_3_672 = and:int(var_3_672:int, ldc:int(-384407681))
            var_5_8A = and:int(ldc:int(18121), ldc:int(-26318))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(950), ldc:int(-6079)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_672:int, ldc:int(1330984831))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(1033), ldc:int(2049)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(6281), ldc:int(17413)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_E3:int, ldc:int(-346563234))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(18444), ldc:int(18445)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1127347992))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(443582086))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(926766499))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1494812479))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0789)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1266738377))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2046387963))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-74428022))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1231656895))
                            var_11_F4 = and:int(ldc:int(4309), ldc:int(-15062))
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2093903607))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-703699517))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-448139113))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-380532225))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0789)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(850680532))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-283763942))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0789:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(243844979))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1552739890))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1305861394))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(734513631))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-28543), ldc:int(-28544))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(683262687))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-716384320))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1065473827))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2122375976))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1990142338))
                            goto(Label_0789)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1732413709))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-75600506))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1926610049))
                        var_11_F4 = and:int(ldc:int(17424), ldc:int(-17425))
                    }
                    
                    Label_1092:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(605852394))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1089795383))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(506503318))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1717980022))
                            goto(Label_0789)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1692653698))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1217:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1866575073))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-959161977))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-158176937))
                            goto(Label_1092)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-580355375))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0789)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-125135697))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(703088063))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(12833333))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1411644927))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(412653576))
                        goto(Label_0789)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1744260876))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1377777272))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-560612214))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(1829532542))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2002057707))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(223266708))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1657697017))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(607616441))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-936292241))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1306670879))
                        var_17_67D = add:int(var_16_122:int, xor:int(ldc:int(8233), ldc:int(8232)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(1543347610))
                
                if (cmple:boolean(var_5_8A = var_17_67D:int, sub:int(var_6_91:int, xor:int(ldc:int(16458), ldc:int(16459))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(1320118909))
            goto(Label_0108)
        }
    }
}
