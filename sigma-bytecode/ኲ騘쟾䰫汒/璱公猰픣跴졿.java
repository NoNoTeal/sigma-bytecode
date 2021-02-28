public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u74b1\u516c\u7330\ud523\u8df4\uc87f {
    public void \u74b1\u516c\u7330\ud523\u8df4\uc87f() {
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
            invokespecial:Object(Object::<init>, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f)
            putfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f, invokestatic:Narrator(Narrator::getNarrator))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u624e\u76bc\u92ee\u5db4\u5654\u88c5(net.minecraft.util.text.ChatType p0, net.minecraft.util.text.ITextComponent p1, java.util.UUID p2) {
        var_4_85 : int
        var_6_66 : \uf995\u983f\u4c04\u3504\u40a9\ud158
        var_7_105 : ITextComponent
        
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
            var_4_85 = and:int(ldc:int(1038311754), ldc:int(-236229425))
            var_6_66 = invokestatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\ucfaf\u98a4\u5f50\u6198\u9937\u156b)
            
            if (cmpne:boolean(var_6_66:\uf995\u983f\u4c04\u3504\u40a9\ud158, getstatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u4bc8\u36d3\u6d99\u8413\u3a62\u64ab))) {
                if (invokeinterface:boolean(Narrator::active, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f))) {
                    if (cmpeq:boolean(var_6_66:\uf995\u983f\u4c04\u3504\u40a9\ud158, getstatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u3bc9\u5db4\u8d90\u64ab\u8d98\u5140))) {
                        goto(Label_0177)
                    }
                    
                    if (logicaland:boolean(cmpeq:boolean(var_6_66:\uf995\u983f\u4c04\u3504\u40a9\ud158, getstatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u6c52\u8bb0\ucfaf\u6c56\ub171\uc87f)), cmpeq:boolean(p0:ChatType, getstatic:ChatType(ChatType::CHAT)))) {
                        goto(Label_0177)
                    }
                    
                    var_4_85 = and:int(var_4_85:int, ldc:int(972288375))
                    
                    if (cmpeq:boolean(var_6_66:\uf995\u983f\u4c04\u3504\u40a9\ud158, getstatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u0a06\u4c04\u446c\u5245\uff55\u7043))) {
                        if (cmpeq:boolean(p0:ChatType, getstatic:ChatType(ChatType::SYSTEM))) {
                            goto(Label_0177)
                        }
                    }
                }
            }
            
            Label_0112:
            
            if (cmpne:boolean(and:int(var_4_85:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0227)
            }
            
            if (cmpeq:boolean(and:int(var_4_85:int, ldc:int(128)), ldc:int(0))) {
                return:void()
            }
            
            var_4_85 = and:int(var_4_85:int, ldc:int(1534090963))
            Label_0177:
            
            if (cmpeq:boolean(and:int(var_4_85:int, ldc:int(16777216)), ldc:int(0))) {
                var_4_85 = and:int(var_4_85:int, ldc:int(-1212640875))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_85:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_85 = and:int(var_4_85:int, ldc:int(1972014607))
                    goto(Label_0112)
                }
                
                var_4_85 = and:int(var_4_85:int, ldc:int(737895771))
                
                if (instanceof:boolean(net.minecraft.util.text.TranslationTextComponent.class, p1:ITextComponent)) {
                    if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), and:int(ldc:int(-29665), ldc:int(29504))), invokevirtual:String[expected:Object](TranslationTextComponent::getKey, checkcast:TranslationTextComponent(net.minecraft.util.text.TranslationTextComponent.class, p1:ITextComponent[expected:TranslationTextComponent])))) {
                        var_7_105 = initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), and:int(ldc:int(8195), ldc:int(7681))), invokevirtual:Object[](TranslationTextComponent::getFormatArgs, checkcast:TranslationTextComponent(net.minecraft.util.text.TranslationTextComponent.class, p1:ITextComponent[expected:TranslationTextComponent])))
                        goto(Label_0400)
                    }
                }
            }
            
            Label_0227:
            
            if (cmpeq:boolean(and:int(var_4_85:int, ldc:int(16384)), ldc:int(0))) {
                var_4_85 = and:int(var_4_85:int, ldc:int(1586286474))
                goto(Label_0177)
            }
            
            if (cmpeq:boolean(and:int(var_4_85:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_4_85 = and:int(var_4_85:int, ldc:int(-302593310))
            var_7_105 = p1:ITextComponent
            Label_0400:
            invokespecial:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u624e\u76bc\u92ee\u5db4\u5654\u88c5, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f, invokevirtual:boolean(ChatType::getInterrupts, p0:ChatType), invokeinterface:String(ITextComponent::getString, var_7_105:ITextComponent))
            goto(Label_0112)
        }
        
        goto(Label_0006)
    }
    
    public void \u624e\u76bc\u92ee\u5db4\u5654\u88c5(java.lang.String p0) {
        var_4_63 : \uf995\u983f\u4c04\u3504\u40a9\ud158
        
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
            var_4_63 = invokestatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\ucfaf\u98a4\u5f50\u6198\u9937\u156b)
            
            if (invokeinterface:boolean(Narrator::active, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f))) {
                if (cmpne:boolean(var_4_63:\uf995\u983f\u4c04\u3504\u40a9\ud158, getstatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u4bc8\u36d3\u6d99\u8413\u3a62\u64ab))) {
                    if (cmpne:boolean(var_4_63:\uf995\u983f\u4c04\u3504\u40a9\ud158, getstatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u6c52\u8bb0\ucfaf\u6c56\ub171\uc87f))) {
                        if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, p0:String))) {
                            invokeinterface:void(Narrator::clear, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f))
                            invokespecial:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u624e\u76bc\u92ee\u5db4\u5654\u88c5, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f, xor:int[expected:boolean](ldc:int(1061), ldc:int(1060)), p0:String)
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uf995\u983f\u4c04\u3504\u40a9\ud158 \ucfaf\u98a4\u5f50\u6198\u9937\u156b() {
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
            return:\uf995\u983f\u4c04\u3504\u40a9\ud158(getfield:\uf995\u983f\u4c04\u3504\u40a9\ud158(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u3e75\u839e\uc3e3\u4e72\ub19c\u8753, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))
        }
        
        goto(Label_0006)
    }
    
    private void \u624e\u76bc\u92ee\u5db4\u5654\u88c5(boolean p0, java.lang.String p1) {
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
            
            if (getstatic:boolean(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\uc31c\ub8be\u52d3\u5fe1\uceb8\u7006)) {
                invokeinterface:void(Logger::debug, getstatic:Logger(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u6bb9\uc246\u4492\u69d9\ucfaf\u8bb0), loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), xor:int(ldc:int(769), ldc:int(771))), invokevirtual:String[expected:Object](String::replaceAll, p1:String, loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), and:int(ldc:int(547), ldc:int(8399))), loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), xor:int(ldc:int(22528), ldc:int(22532)))))
            }
            
            invokeinterface:void(Narrator::say, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f), p1:String, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc238\u071d\ufe34\u385b\uff55\u40a9(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uf995\u983f\u4c04\u3504\u40a9\ud158 p0) {
        var_2_C9 : int
        var_4_A8 : \ua068\u4cd9\u9255\u56bd\u62da\u67d0
        
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
            var_2_C9 = and:int(ldc:int(1451817042), ldc:int(1448460103))
            invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u647c\u4c2b\ua6bd\u8d90\u6cfe\u51b2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f)
            invokeinterface:void(Narrator::say, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f), invokeinterface:String(ITextComponent::getString, invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::append, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::appendString, initobject:TranslationTextComponent[expected:IFormattableTextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), and:int(ldc:int(17797), ldc:int(549)))), loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), xor:int(ldc:int(-30196), ldc:int(-30198)))), invokevirtual:ITextComponent(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u7c6b\u3e75\u965f\u8640\ub32d\u4bc8, p0:\uf995\u983f\u4c04\u3504\u40a9\ud158))), xor:int[expected:boolean](ldc:int(-15856), ldc:int(-15855)))
            var_4_A8 = invokevirtual:\ua068\u4cd9\u9255\u56bd\u62da\u67d0(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub1b9\u3bc9\ub83f\u6d69\u76bc\u59ec, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
            
            if (invokeinterface:boolean(Narrator::active, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f))) {
                if (cmpne:boolean(p0:\uf995\u983f\u4c04\u3504\u40a9\ud158, getstatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u4bc8\u36d3\u6d99\u8413\u3a62\u64ab))) {
                    goto(Label_0260)
                }
                
                invokestatic:void(\ud158\u56bd\uafe7\u7043\u965f\u8389::\ub32d\u6bb9\ub113\u416d\ub18d\u76bc, var_4_A8:\ua068\u4cd9\u9255\u56bd\u62da\u67d0, getstatic:\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab(\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab::\u836c\u59ec\u16f6\u4ab3\u6bb9\u527a), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), xor:int(ldc:int(-32691), ldc:int(-32694)))), checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, aconstnull:ITextComponent()))
                return:void()
            }
            
            Label_0182:
            
            if (cmpeq:boolean(and:int(var_2_C9:int, ldc:int(65536)), ldc:int(0))) {
                var_2_C9 = and:int(var_2_C9:int, ldc:int(-231493017))
                invokestatic:void(\ud158\u56bd\uafe7\u7043\u965f\u8389::\ub32d\u6bb9\ub113\u416d\ub18d\u76bc, var_4_A8:\ua068\u4cd9\u9255\u56bd\u62da\u67d0, getstatic:\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab(\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab::\u836c\u59ec\u16f6\u4ab3\u6bb9\u527a), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), and:int(ldc:int(2087), ldc:int(8455)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), and:int(ldc:int(21769), ldc:int(10987)))))
                return:void()
            }
            
            var_2_C9 = and:int(var_2_C9:int, ldc:int(1524527638))
            Label_0260:
            
            if (cmpeq:boolean(and:int(var_2_C9:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0182)
            }
            
            var_2_C9 = and:int(var_2_C9:int, ldc:int(-2132166953))
            invokestatic:void(\ud158\u56bd\uafe7\u7043\u965f\u8389::\ub32d\u6bb9\ub113\u416d\ub18d\u76bc, var_4_A8:\ua068\u4cd9\u9255\u56bd\u62da\u67d0, getstatic:\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab(\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab::\u836c\u59ec\u16f6\u4ab3\u6bb9\u527a), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3), and:int(ldc:int(92), ldc:int(23210)))), invokevirtual:ITextComponent(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u7c6b\u3e75\u965f\u8640\ub32d\u4bc8, p0:\uf995\u983f\u4c04\u3504\u40a9\ud158))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc7fe\uc4d2\u8350\u62da\u7af6\ua61f() {
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
            return:boolean(invokeinterface:boolean(Narrator::active, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f)))
        }
        
        goto(Label_0006)
    }
    
    public void \u647c\u4c2b\ua6bd\u8d90\u6cfe\u51b2() {
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
            
            if (cmpne:boolean(invokestatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\ucfaf\u98a4\u5f50\u6198\u9937\u156b), getstatic:\uf995\u983f\u4c04\u3504\u40a9\ud158(\uf995\u983f\u4c04\u3504\u40a9\ud158::\u4bc8\u36d3\u6d99\u8413\u3a62\u64ab))) {
                if (invokeinterface:boolean(Narrator::active, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f))) {
                    invokeinterface:void(Narrator::clear, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\u3d64\uc87f\uae5d\u0800\u1833() {
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
            invokeinterface:void(Narrator::destroy, getfield:Narrator(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\uc238\u9937\ucfaf\uf995\u71f1\u64f2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_28D : int
        expr_6E : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_FB_0 : byte[] [generated]
        stack_FD_0 : byte[] [generated]
        stack_129_0 : byte[] [generated]
        stack_2A0_0 : byte[] [generated]
        stack_2FF_0 : byte[] [generated]
        stack_383_0 : byte[] [generated]
        stack_3D9_0 : byte[] [generated]
        var_4_278 : int
        var_3_27D : byte[]
        var_5_27E : int
        expr_2A3 : byte [generated]
        var_0_319 : int
        expr_2FF : byte [generated]
        stack_351_2 : byte [generated]
        stack_325_0 : byte [generated]
        expr_9C : int [generated]
        var_2_C1 : byte[]
        expr_C5 : int [generated]
        var_3_371 : byte[]
        var_5_372 : int
        expr_FD : int [generated]
        var_3_3C7 : byte[]
        var_5_3C8 : int
        var_3_135 : String
        stack_25B_0 : String[] [generated]
        expr_147 : String[] [generated]
        
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
        var_0_28D = and:int(ldc:int(-1832089028), ldc:int(-608006532))
        expr_6E = arraylength:int(stack_9A_0 = stack_9C_0 = stack_C1_0 = stack_C3_0 = stack_FB_0 = stack_FD_0 = stack_129_0 = stack_2A0_0 = stack_2FF_0 = stack_383_0 = stack_3D9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("raO235WUZWGbUjKRm4Gle0SRbGNSbYxguyF9fYOkcphEb1htjGC7IX19g6QinU5vqXSUdWVsaJl7lGVrWGtoeKhjKGllYrhlanVmlHySmnqUZWtYa2h4qGMoaWR9upNxYZRrk5hjaGopY3llqHSUZWuXamxjYWhqKWN5Zah0lGVrWGtuaLWVcGaSTG1ndY/D1M6m")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_278 = expr_6E:int
        var_3_27D = newarray:byte[](byte.class, expr_6E:int)
        var_5_27E = expr_6E:int
        Label_0640:
        
        while (cmpne:boolean(and:int(var_0_28D:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(-628442434))
            var_5_27E = add:int(var_5_27E:int, ldc:int(-1))
            expr_2A3 = xor:byte(loadelement:byte(stack_2A0_0:byte[], var_5_27E:int), ldc:byte(104))
            storeelement:byte(var_3_27D:byte[], var_5_27E:int, or:int(and:int(shl:int(expr_2A3:byte, and:int(ldc:int(16902), ldc:int(44))), ldc:int(-16)), and:int(shr:int(expr_2A3:byte[expected:int], xor:int(ldc:int(1280), ldc:int(1284))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_27E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C1_0 = stack_C3_0 = stack_FB_0 = stack_FD_0 = stack_129_0 = stack_2A0_0 = stack_2FF_0 = stack_383_0 = stack_3D9_0 = var_3_27D:byte[]
            goto(Label_0115)
        }
        
        var_0_28D = and:int(var_0_28D:int, ldc:int(-1196840922))
        Label_0744:
        
        while (cmpne:boolean(and:int(var_0_28D:int, ldc:int(8)), ldc:int(0))) {
            var_0_319 = and:int(var_0_28D:int, ldc:int(861462399))
            var_5_27E = add:int(var_5_27E:int, ldc:int(-1))
            expr_2FF = stack_351_2 = loadelement(stack_2FF_0, var_5_27E)
            
            if (cmplt:boolean(add:int(add:int(var_5_27E:int, ldc:int(4)), neg:int(var_4_278:int)), ldc:int(0))) {
                stack_351_2 = stack_325_0 = add:byte(expr_2FF:byte, loadelement:byte(var_3_27D:byte[], add:int(var_5_27E:int, ldc:int(4))))
                goto(Label_0821)
            }
            
            Label_0780:
            
            if (cmpeq:boolean(and:int(var_0_319:int, ldc:int(32)), ldc:int(0))) {
                var_0_319 = and:int(var_0_319:int, ldc:int(1577067513))
            }
            else {
                var_0_319 = and:int(var_0_319:int, ldc:int(334204591))
                stack_351_2 = stack_325_0 = add:byte(expr_2FF:byte, ldc:byte(4))
            }
            
            Label_0821:
            
            if (cmpne:boolean(and:int(var_0_319:int, ldc:int(1)), ldc:int(0))) {
                var_0_319 = and:int(var_0_319:int, ldc:int(-28695724))
                goto(Label_0780)
            }
            
            var_0_28D = and:int(var_0_319:int, ldc:int(-5715346))
            storeelement:byte(var_3_27D:byte[], var_5_27E:int, stack_351_2:byte)
            
            if (cmpne:boolean(var_5_27E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C1_0 = stack_C3_0 = stack_FB_0 = stack_FD_0 = stack_129_0 = stack_2A0_0 = stack_2FF_0 = stack_383_0 = stack_3D9_0 = var_3_27D:byte[]
            goto(Label_0161)
        }
        
        goto(Label_0640)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(32768)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(601520257))
            goto(Label_0258)
        }
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0202)
        }
        
        if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(2114252796))
            expr_9C = arraylength:int(stack_9C_0:byte[])
            
            if (cmpne:boolean(expr_9C:int, ldc:int(0))) {
                var_4_278 = expr_9C:int
                var_3_27D = newarray:byte[](byte.class, expr_9C:int)
                var_5_27E = expr_9C:int
                goto(Label_0744)
            }
        }
        
        Label_0161:
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0258)
        }
        
        if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_28D = and:int(var_0_28D:int, ldc:int(2119088894))
            var_2_C1 = stack_C1_0:byte[]
            expr_C5 = add:int(arraylength:int(stack_C3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C5:int, ldc:int(0))) {
                var_3_371 = newarray:byte[](byte.class, expr_C5:int)
                var_5_372 = expr_C5:int
                
                loop {
                    var_0_28D = and:int(var_0_28D:int, ldc:int(1522851519))
                    var_5_372 = add:int(var_5_372:int, ldc:int(-1))
                    storeelement:byte(var_3_371:byte[], var_5_372:int, add:int(shl:int(loadelement:byte(stack_383_0:byte[], var_5_372:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_C1:byte[], add:int(var_5_372:int, and:int(ldc:int(26113), ldc:int(139)))), ldc:int(4)), and:int(ldc:int(15), ldc:int(8415)))))
                    
                    if (cmpne:boolean(var_5_372:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_C1_0 = stack_C3_0 = stack_FB_0 = stack_FD_0 = stack_129_0 = stack_2A0_0 = stack_2FF_0 = stack_383_0 = stack_3D9_0 = var_3_371:byte[]
            }
        }
        
        Label_0202:
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(65536)), ldc:int(0))) {
                var_0_28D = and:int(var_0_28D:int, ldc:int(775322829))
                goto(Label_0161)
            }
            
            if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(1024)), ldc:int(0))) {
                var_0_28D = and:int(var_0_28D:int, ldc:int(1426770222))
                goto(Label_0115)
            }
            
            var_0_28D = and:int(var_0_28D:int, ldc:int(2122119932))
            expr_FD = arraylength:int(stack_FD_0:byte[])
            
            if (cmpne:boolean(expr_FD:int, ldc:int(0))) {
                var_3_3C7 = newarray:byte[](byte.class, expr_FD:int)
                var_5_3C8 = expr_FD:int
                
                loop {
                    var_0_28D = and:int(var_0_28D:int, ldc:int(974433260))
                    var_5_3C8 = add:int(var_5_3C8:int, ldc:int(-1))
                    storeelement:byte(var_3_3C7:byte[], var_5_3C8:int, add:byte(loadelement:byte(stack_3D9_0:byte[], var_5_3C8:int), ldc:byte(118)))
                    
                    if (cmpne:boolean(var_5_3C8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_C1_0 = stack_C3_0 = stack_FB_0 = stack_FD_0 = stack_129_0 = stack_2A0_0 = stack_2FF_0 = stack_383_0 = stack_3D9_0 = var_3_3C7:byte[]
            }
        }
        
        Label_0258:
        
        if (cmpeq:boolean(and:int(var_0_28D:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0202)
        }
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(128)), ldc:int(0))) {
            var_0_28D = and:int(var_0_28D:int, ldc:int(679658507))
            goto(Label_0161)
        }
        
        if (cmpne:boolean(and:int(var_0_28D:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_135 = initobject:String(String::<init>, stack_129_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_25B_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(555), ldc:int(10638)))
            expr_147 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5163), ldc:int(8606)))
            storeelement:String(expr_147:String[], and:int(ldc:int(6387), ldc:int(527)), invokevirtual:String[expected:String](String::substring, var_3_135:String, and:int(ldc:int(2347), ldc:int(-7468)), xor:int(ldc:int(2080), ldc:int(2081))))
            storeelement:String(expr_147:String[], and:int(ldc:int(8231), ldc:int(1550)), invokevirtual:String[expected:String](String::substring, var_3_135:String, and:int(ldc:int(24709), ldc:int(6195)), xor:int(ldc:int(1281), ldc:int(1285))))
            storeelement:String(expr_147:String[], xor:int(ldc:int(1034), ldc:int(1032)), invokevirtual:String[expected:String](String::substring, var_3_135:String, and:int(ldc:int(4868), ldc:int(108)), xor:int(ldc:int(-27613), ldc:int(-27598))))
            storeelement:String(expr_147:String[], and:int(ldc:int(24838), ldc:int(2588)), invokevirtual:String[expected:String](String::substring, var_3_135:String, and:int(ldc:int(24657), ldc:int(661)), xor:int(ldc:int(138), ldc:int(158))))
            storeelement:String(expr_147:String[], and:int(ldc:int(-8034), ldc:int(7776)), invokevirtual:String[expected:String](String::substring, var_3_135:String, and:int(ldc:int(9278), ldc:int(18836)), xor:int(ldc:int(8296), ldc:int(8266))))
            storeelement:String(expr_147:String[], and:int(ldc:int(1541), ldc:int(16809)), invokevirtual:String[expected:String](String::substring, var_3_135:String, and:int(ldc:int(682), ldc:int(7206)), xor:int(ldc:int(13343), ldc:int(13351))))
            storeelement:String(expr_147:String[], xor:int(ldc:int(1319), ldc:int(1312)), invokevirtual:String[expected:String](String::substring, var_3_135:String, xor:int(ldc:int(12469), ldc:int(12429)), xor:int(ldc:int(8459), ldc:int(8516))))
            storeelement:String(expr_147:String[], and:int(ldc:int(16392), ldc:int(9228)), invokevirtual:String[expected:String](String::substring, var_3_135:String, xor:int(ldc:int(126), ldc:int(49)), and:int(ldc:int(27237), ldc:int(109))))
            storeelement:String(expr_147:String[], and:int(ldc:int(269), ldc:int(21077)), invokevirtual:String[expected:String](String::substring, var_3_135:String, and:int(ldc:int(2023), ldc:int(2157)), and:int(ldc:int(117), ldc:int(12541))))
            storeelement:String(expr_147:String[], and:int(ldc:int(523), ldc:int(2345)), invokevirtual:String[expected:String](String::substring, var_3_135:String, xor:int(ldc:int(14418), ldc:int(14375)), and:int(ldc:int(5786), ldc:int(10418))))
            putstatic:String[](\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3, expr_147:String[])
            putstatic:ITextComponent(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u7bad\u3e75\u0b8e\u16f6\u6ec6\ua3b4, getstatic:ITextComponent(StringTextComponent::EMPTY))
            putstatic:Logger(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u6bb9\uc246\u4492\u69d9\ucfaf\u8bb0, invokestatic:Logger(LogManager::getLogger))
            putstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c, initobject:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::<init>))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u156b\u8350\u385b\u6b0d\u6435\ub6ab(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66C : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_677 : int
        
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
        var_3_66C = and:int(ldc:int(-1549923769), ldc:int(-1113605659))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u74b1\u516c\u7330\ud523\u8df4\uc87f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
            var_3_66C = and:int(var_3_66C:int, ldc:int(-1310947004))
            var_5_81 = and:int(ldc:int(2409), ldc:int(-2410))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10434), ldc:int(-10435)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_66C:int, ldc:int(-235128617))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, xor:int(ldc:int(284), ldc:int(285)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(16387), ldc:int(13361)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_66C = and:int(var_3_D0:int, ldc:int(-1380025484))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(2593), ldc:int(4101)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(1819970193))
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-471111286))
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(812743016))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(426817224))
                    }
                    else {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-107013284))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0552)
                            }
                            
                            goto(Label_0824)
                        }
                    }
                    
                    Label_0398:
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1661944305))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-312763599))
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1480115742))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-302171274))
                            var_11_E1 = and:int(ldc:int(20562), ldc:int(-20563))
                            goto(Label_1530)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0552:
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1795394422))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1509869853))
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1201467678))
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1064797230))
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(528256623))
                            loopcontinue()
                        }
                        
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-69231530))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0824)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-2118787637))
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-239264215))
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1575862050))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(1113144535))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-80947955))
                            loopcontinue()
                        }
                        
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1176555793))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0824:
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(1440659800))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-1601922313))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-319124577))
                            loopcontinue()
                        }
                        
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-140751546))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = xor:int(ldc:int(5648), ldc:int(5649))
                                goto(Label_1103)
                            }
                        }
                    }
                    
                    Label_0938:
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(1012473073))
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(719337755))
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1163043826))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(278994718))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-2122181838))
                            loopcontinue()
                        }
                        
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-205576098))
                        var_11_E1 = and:int(ldc:int(-13522), ldc:int(13393))
                    }
                    
                    Label_1103:
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1242468790))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0938)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-262242012))
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(1232457389))
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(336451542))
                            loopcontinue()
                        }
                        
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1080080268))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1369)
                            }
                        }
                    }
                    
                    Label_1227:
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1171191454))
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1478795164))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1103)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-1867714171))
                            goto(Label_0938)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-142119844))
                            goto(Label_0824)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(2061221370))
                            goto(Label_0552)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66C = and:int(var_3_66C:int, ldc:int(-1109612305))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                            goto(Label_1530)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1369:
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-798610781))
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-206605748))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1984486501))
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(1284132021))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(412761171))
                        goto(Label_0552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1437747050))
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1591481129))
                        loopcontinue()
                    }
                    
                    var_3_66C = and:int(var_3_66C:int, ldc:int(-270755723))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1530:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_677 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1541:
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-574539105))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(1376405384))
                        goto(Label_0824)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66C = and:int(var_3_66C:int, ldc:int(-1075966394))
                        var_17_677 = add:int(var_16_10F:int, and:int(ldc:int(329), ldc:int(19463)))
                        looporswitchbreak()
                    }
                    
                    var_3_66C = and:int(var_3_66C:int, ldc:int(-1416658000))
                }
                
                var_3_66C = and:int(var_3_66C:int, ldc:int(-472077193))
                
                if (cmple:boolean(var_5_81 = var_17_677:int, sub:int(var_6_88:int, xor:int(ldc:int(17474), ldc:int(17475))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_66C:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
