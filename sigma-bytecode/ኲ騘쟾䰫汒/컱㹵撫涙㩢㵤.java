public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64 {
    public void \ucef1\u3e75\u64ab\u6d99\u3a62\u3d64(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u7330\uceb8\u71ae\u7873\ub1b9\uf995 p0, int p1, int p2, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ud523\u4f52\u59ec\u516c\u3e75 p3, boolean p4) {
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
            putfield:\u7330\uceb8\u71ae\u7873\ub1b9\uf995(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3e75\uc246\u6bb9\u16f6\u4f52\u9033, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64, p0:\u7330\uceb8\u71ae\u7873\ub1b9\uf995)
            invokespecial:\u527a\u7bad\uc2bd\u8753\u93a2\u51b2(\u527a\u7bad\uc2bd\u8753\u93a2\u51b2::<init>, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64, p1:int, p2:int)
            putfield:\ud523\u4f52\u59ec\u516c\u3e75(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u92ee\u72f1\u7ce1\uae5d\u3a62\u5d20, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64, p3:\ud523\u4f52\u59ec\u516c\u3e75)
            putfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u88c5\u5245\u759a\u3711\ud36e\u92ee, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64, invokevirtual:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\u3d64\u74b1\uafe7\u61a4\u3776\ua61f::\uc2bd\ub19c\u52d3\ua3b4\u0c95\u3e2a, invokevirtual:\u3d64\u74b1\uafe7\u61a4\u3776\ua61f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3776\u34df\uc2bd\u92ff\ubf56\u965f, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), p3:\ud523\u4f52\u59ec\u516c\u3e75))
            putfield:boolean(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u4cd9\ubb2b\u5fe1\u71ae\u6c52\u4f52, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64, p4:boolean)
            putfield:ITextComponent(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u97e6\u7e3f\uc9f6\u071d\u7c6b\u516c, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64, invokespecial:ITextComponent(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u8df4\ud51e\u4d85\u8640\uceb8\uc29a, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64, p3:\ud523\u4f52\u59ec\u516c\u3e75, p4:boolean))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private net.minecraft.util.text.ITextComponent \u8df4\ud51e\u4d85\u8640\uceb8\uc29a(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ud523\u4f52\u59ec\u516c\u3e75 p0, boolean p1) {
        var_5_6B : TranslationTextComponent
        
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
            var_5_6B = initobject:TranslationTextComponent(TranslationTextComponent::<init>, invokevirtual:String(\ud523\u4f52\u59ec\u516c\u3e75::\u6c56\u600f\u3c25\u156b\u51b2\u5bc4, p0:\ud523\u4f52\u59ec\u516c\u3e75))
            
            if (logicalnot:boolean(p1:boolean)) {
                if (cmpne:boolean(p0:\ud523\u4f52\u59ec\u516c\u3e75, getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u93a2\u4e72\uc9f6\ub6ab\u1833\u960f))) {
                    invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, var_5_6B:TranslationTextComponent[expected:IFormattableTextComponent], loadelement:String(getstatic:String[](\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\uf94d\u0c95\ubefe\ub83f\ub70c\u0b8e), and:int(ldc:int(-1030), ldc:int(1029))))
                }
            }
            
            return:ITextComponent(var_5_6B:TranslationTextComponent[expected:ITextComponent])
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\u47c2\u6c56\u4bc8\uc84e\u8709() {
        var_1_9A : int
        
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
            var_1_9A = and:int(ldc:int(1516164926), ldc:int(524734234))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u527a\u7bad\uc2bd\u8753\u93a2\u51b2::\u6b0d\u965f\ucfaf\u9af2\u759a\ua562, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64[expected:\u527a\u7bad\uc2bd\u8753\u93a2\u51b2]))) {
                if (logicalnot:boolean(getfield:boolean(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u4cd9\ubb2b\u5fe1\u71ae\u6c52\u4f52, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64))) {
                    goto(Label_0135)
                }
                
                invokestatic:\ud523\u4f52\u59ec\u516c\u3e75(\u7330\uceb8\u71ae\u7873\ub1b9\uf995::\ua6bd\ubb2b\u6b0d\u4975\u7043\u61a4, getfield:\u7330\uceb8\u71ae\u7873\ub1b9\uf995(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3e75\uc246\u6bb9\u16f6\u4f52\u9033, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64), getfield:\ud523\u4f52\u59ec\u516c\u3e75(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u92ee\u72f1\u7ce1\uae5d\u3a62\u5d20, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64))
                goto(Label_0186)
            }
            
            Label_0103:
            
            if (cmpeq:boolean(and:int(var_1_9A:int, ldc:int(1)), ldc:int(0))) {
                return:void()
            }
            
            var_1_9A = and:int(var_1_9A:int, ldc:int(-442144431))
            Label_0135:
            
            if (cmpeq:boolean(and:int(var_1_9A:int, ldc:int(16)), ldc:int(0))) {
                var_1_9A = and:int(var_1_9A:int, ldc:int(1987519673))
                goto(Label_0103)
            }
            
            var_1_9A = and:int(var_1_9A:int, ldc:int(-70864901))
            invokestatic:\ud523\u4f52\u59ec\u516c\u3e75(\u7330\uceb8\u71ae\u7873\ub1b9\uf995::\uafe7\uc87f\u392e\u8c8a\u8d98\u4cd9, getfield:\u7330\uceb8\u71ae\u7873\ub1b9\uf995(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3e75\uc246\u6bb9\u16f6\u4f52\u9033, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64), getfield:\ud523\u4f52\u59ec\u516c\u3e75(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u92ee\u72f1\u7ce1\uae5d\u3a62\u5d20, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64))
            Label_0186:
            var_1_9A = and:int(var_1_9A:int, ldc:int(-69222405))
            invokeinterface:void(List::clear, invokestatic:List(\u7330\uceb8\u71ae\u7873\ub1b9\uf995::\u5d20\ub7dc\u4cd9\uc229\uc238\u5d20, getfield:\u7330\uceb8\u71ae\u7873\ub1b9\uf995(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3e75\uc246\u6bb9\u16f6\u4f52\u9033, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64)))
            invokeinterface:void(List::clear, invokestatic:List(\u7330\uceb8\u71ae\u7873\ub1b9\uf995::\u8c8a\u760c\uc84e\u4975\u7049\u1187, getfield:\u7330\uceb8\u71ae\u7873\ub1b9\uf995(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3e75\uc246\u6bb9\u16f6\u4f52\u9033, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64)))
            invokevirtual:void(\u7330\uceb8\u71ae\u7873\ub1b9\uf995::\u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7, getfield:\u7330\uceb8\u71ae\u7873\ub1b9\uf995(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3e75\uc246\u6bb9\u16f6\u4f52\u9033, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64))
            invokevirtual:void(\u7330\uceb8\u71ae\u7873\ub1b9\uf995::\u759a\uc87f\u5140\ud36e\u12cb\ubcb0, getfield:\u7330\uceb8\u71ae\u7873\ub1b9\uf995(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3e75\uc246\u6bb9\u16f6\u4f52\u9033, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64))
            goto(Label_0103)
        }
        
        goto(Label_0006)
    }
    
    public void \ub6ab\u8413\uf9c5\u9937\u99f7\u6198(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2) {
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u6b0d\ud12e\u760c\u6d99\u7873\u3bc9, getfield:\u7330\uceb8\u71ae\u7873\ub1b9\uf995[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3e75\uc246\u6bb9\u16f6\u4f52\u9033, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u97e6\u7e3f\uc9f6\u071d\u7c6b\u516c, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64), p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc84e\u392e\u120d\u3e75\u8c8a\ub171(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u8640\u4179\u624e\u40a9\u67d0\u1833, invokevirtual:\ud171\u156b\u0800\u36d3\ub8be\u760c(\u97b7\u8350\u99f7\ub1b9\u839e\u873d::\u92ee\ud523\u7c6b\u8413\u946b\u76bc, getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u88c5\u5245\u759a\u3711\ud36e\u92ee, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64))))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(getfield:int(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64), and:int(ldc:int(774), ldc:int(6266))), add:int(getfield:int(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64), xor:int(ldc:int(3137), ldc:int(3139))), invokevirtual:int(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ufcaf\u0c95\ub32d\u7e3f\u6435\ub19c, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389]), ldc:int(18), ldc:int(18), getfield:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\u88c5\u5245\u759a\u3711\ud36e\u92ee, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E9 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8F_0 : byte[] [generated]
        stack_91_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_193_0 : byte[] [generated]
        stack_1FB_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_126 : byte[]
        var_4_127 : int
        expr_91 : int [generated]
        var_5_176 : int
        var_3_17B : byte[]
        var_4_17C : int
        expr_193 : byte [generated]
        var_0_1F1 : int
        expr_1FB : byte [generated]
        stack_229_2 : byte [generated]
        expr_B5 : int [generated]
        var_3_EA : String
        stack_11D_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
            var_0_1E9 = and:int(ldc:int(-1315184271), ldc:int(1962671777))
            expr_65 = var_2_69 = stack_8F_0 = stack_91_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_193_0 = stack_1FB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Ha8vIA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_126 = newarray:byte[](byte.class, expr_6D:int)
                var_4_127 = expr_6D:int
                
                loop {
                    var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-136792203))
                    var_4_127 = add:int(var_4_127:int, ldc:int(-1))
                    storeelement:byte(var_3_126:byte[], var_4_127:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_127:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_127:int, and:int(ldc:int(7713), ldc:int(24897)))), ldc:int(5)), and:int(ldc:int(87), ldc:int(8839)))))
                    
                    if (cmpne:boolean(var_4_127:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_193_0 = stack_1FB_0 = var_3_126:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_1E9 = and:int(var_0_1E9:int, ldc:int(1153148460))
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_1E9:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-218156063))
                expr_91 = arraylength:int(stack_91_0:byte[])
                
                if (cmpeq:boolean(expr_91:int, ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_5_176 = expr_91:int
                var_3_17B = newarray:byte[](byte.class, expr_91:int)
                var_4_17C = expr_91:int
                Label_0382:
                
                while (cmpne:boolean(and:int(var_0_1E9:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_1E9 = and:int(var_0_1E9:int, ldc:int(866090851))
                    var_4_17C = add:int(var_4_17C:int, ldc:int(-1))
                    expr_193 = loadelement:byte(stack_193_0:byte[], var_4_17C:int)
                    storeelement:byte(var_3_17B:byte[], var_4_17C:int, xor:int(add:int(or:int(and:int(shl:int(expr_193:byte, and:int(ldc:int(8748), ldc:int(21893))), ldc:int(-16)), and:int(shr:int(expr_193:byte[expected:int], and:int(ldc:int(725), ldc:int(12))), ldc:int(15))), ldc:int(117)), ldc:int(72)))
                    
                    if (cmpne:boolean(var_4_17C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_193_0 = stack_1FB_0 = var_3_17B:byte[]
                    goto(Label_0150)
                }
                
                Label_0478:
                
                while (cmpne:boolean(and:int(var_0_1E9:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_1F1 = and:int(var_0_1E9:int, ldc:int(1004058731))
                    var_4_17C = add:int(var_4_17C:int, ldc:int(-1))
                    expr_1FB = loadelement:byte(stack_1FB_0:byte[], var_4_17C:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_17C:int, ldc:int(5)), neg:int(var_5_176:int)), ldc:int(0))) {
                        var_0_1F1 = and:int(var_0_1F1:int, ldc:int(1956295025))
                        stack_229_2 = add:byte(expr_1FB:byte, ldc:byte(5))
                    }
                    else {
                        stack_229_2 = add:byte(expr_1FB:byte, loadelement:byte(var_3_17B:byte[], add:int(var_4_17C:int, ldc:int(5))))
                    }
                    
                    var_0_1E9 = and:int(var_0_1F1:int, ldc:int(1991883911))
                    storeelement:byte(var_3_17B:byte[], var_4_17C:int, stack_229_2:byte)
                    
                    if (cmpne:boolean(var_4_17C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_193_0 = stack_1FB_0 = var_3_17B:byte[]
                    goto(Label_0186)
                }
                
                var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-765080782))
                goto(Label_0382)
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_1E9:int, ldc:int(1)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(1)), ldc:int(0))) {
                        var_0_1E9 = and:int(var_0_1E9:int, ldc:int(433602876))
                        loopcontinue()
                    }
                    
                    var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-188915317))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_5_176 = expr_B5:int
                        var_3_17B = newarray:byte[](byte.class, expr_B5:int)
                        var_4_17C = expr_B5:int
                        goto(Label_0478)
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-1978941591))
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-611567929))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_11D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(13568), ldc:int(13569)))
            expr_FC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(144), ldc:int(145)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(28481), ldc:int(-32578)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(9764), ldc:int(-11830)), xor:int(ldc:int(8969), ldc:int(8970))))
            putstatic:String[](\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64::\uf94d\u0c95\ubefe\ub83f\ub70c\u0b8e, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68C : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_697 : int
        
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
        var_3_68C = and:int(ldc:int(-1062210800), ldc:int(-318789831))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucef1\u3e75\u64ab\u6d99\u3a62\u3d64[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_68C = and:int(var_3_68C:int, ldc:int(588209882))
        }
        else {
            var_3_68C = and:int(var_3_68C:int, ldc:int(-51383323))
            var_5_8A = and:int(ldc:int(-3453), ldc:int(3196))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10354), ldc:int(-10611)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68C:int, ldc:int(-655436914))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(4098), ldc:int(4099)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(240), ldc:int(241)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68C = and:int(var_3_DA:int, ldc:int(-1832916178))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(26880), ldc:int(26881)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0680)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1056987148))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0374:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1937918030))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1945169991))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1776261652))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1987718978))
                        goto(Label_0680)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1061635470))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(1813428078))
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1296115951))
                        var_11_EB = and:int(ldc:int(12870), ldc:int(-30671))
                        goto(Label_1552)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(900905515))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1534953118))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(465718493))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-1071122536))
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-989938759))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0680:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(2050643475))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1429848250))
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-446677609))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1115083746))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-537369780))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-576441917))
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-960563376))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0830:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(198876327))
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1233835398))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-2033890616))
                            goto(Label_0680)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-313139296))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(661445329))
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-708207543))
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1880194176))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(8224), ldc:int(8225))
                                goto(Label_1130)
                            }
                        }
                    }
                    
                    Label_0973:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-570863154))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-1492363048))
                            goto(Label_0680)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-1409629881))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-1494310037))
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-2035358795))
                        var_11_EB = and:int(ldc:int(24745), ldc:int(-24746))
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(412750871))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0973)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(1880631465))
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0680)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(275918474))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-1157175442))
                            goto(Label_0374)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1057039584))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1415)
                            }
                        }
                    }
                    
                    Label_1254:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1390591887))
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1564691033))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1130)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(1722313891))
                            goto(Label_0973)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(1817869625))
                            goto(Label_0680)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-897330347))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(865471751))
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(381078386))
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1280340164))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1552)
                    }
                    
                    Label_1415:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-486020042))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-866625125))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1114864069))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1057644690))
                        goto(Label_0680)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68C = and:int(var_3_68C:int, ldc:int(-2000780293))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1552:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_697 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1563:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1607066539))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(969306595))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1363917057))
                        goto(Label_0680)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1587901716))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1964050542))
                        var_17_697 = add:int(var_16_119:int, xor:int(ldc:int(528), ldc:int(529)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68C = and:int(var_3_68C:int, ldc:int(-105988318))
                
                if (cmple:boolean(var_5_8A = var_17_697:int, sub:int(var_6_91:int, and:int(ldc:int(26917), ldc:int(4169))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
