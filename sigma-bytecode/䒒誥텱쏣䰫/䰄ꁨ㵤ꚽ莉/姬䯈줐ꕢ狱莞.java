public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u59ec\u4bc8\uc910\ua562\u72f1\u839e {
    public void \u59ec\u4bc8\uc910\ua562\u72f1\u839e(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, com.mojang.authlib.minecraft.SocialInteractionsService p1) {
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
            invokespecial:Object(Object::<init>, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e)
            putfield:Set<UUID>(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u0b8e\ua6bd\u7e3f\u7006\uc29a\ud158, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e, invokestatic:HashSet[expected:Set<UUID>](Sets::newHashSet))
            putfield:Map<String, UUID>(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u62da\u5bc4\uc229\u72f1\u3d64\ub102, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e, invokestatic:HashMap[expected:Map<String, UUID>](Maps::newHashMap))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u97e6\u52d3\u8308\ud51e\u3a62\u4179, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:SocialInteractionsService(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\uceb8\u12cb\u74b1\u759a\u4f52\u7d52, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e, p1:SocialInteractionsService)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud7e8\u8df4\u2dcc\u5245\u9a18\u97b7(java.util.UUID p0) {
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
            invokeinterface:boolean(Set<UUID>::add, getfield:Set<UUID>(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u0b8e\ua6bd\u7e3f\u7006\uc29a\ud158, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e), p0:UUID)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucef1\u5140\u72f1\u74b1\u6bb9\u760c(java.util.UUID p0) {
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
            invokeinterface:boolean(Set<E>::remove, getfield:Set<UUID>(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u0b8e\ua6bd\u7e3f\u7006\uc29a\ud158, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e), p0:UUID[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8350\uc9f6\u759a\uc910\ubcb0\ud217(java.util.UUID p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicalor:boolean(invokevirtual:boolean(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u3776\u0800\u1833\u5140\u56bd\ub7dc, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e, p0:UUID), invokevirtual:boolean(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\uc910\u6fb0\u7c6b\u3a62\ub102\u64ab, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e, p0:UUID)), xor:int(ldc:int(34), ldc:int(35)), and:int(ldc:int(25948), ldc:int(-30045))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3776\u0800\u1833\u5140\u56bd\ub7dc(java.util.UUID p0) {
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
            return:boolean(invokeinterface:boolean(Set<E>::contains, getfield:Set<UUID>(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u0b8e\ua6bd\u7e3f\u7006\uc29a\ud158, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e), p0:UUID[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc910\u6fb0\u7c6b\u3a62\ub102\u64ab(java.util.UUID p0) {
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
            return:boolean(invokeinterface:boolean(SocialInteractionsService::isBlockedPlayer, getfield:SocialInteractionsService(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\uceb8\u12cb\u74b1\u759a\u4f52\u7d52, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e), p0:UUID))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<java.util.UUID> \ubff1\ud51e\u93a2\uc9f6\u4e72\u5db4() {
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
            return:Set<UUID>(getfield:Set<UUID>(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u0b8e\ua6bd\u7e3f\u7006\uc29a\ud158, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e))
        }
        
        goto(Label_0006)
    }
    
    public java.util.UUID \ub18d\u51b2\u3504\uf9c5\ud217\u446c(java.lang.String p0) {
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
            return:UUID(checkcast:UUID(java.util.UUID.class, invokeinterface:UUID(Map<String, UUID>::getOrDefault, getfield:Map<String, UUID>(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u62da\u5bc4\uc229\u72f1\u3d64\ub102, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e), p0:String[expected:Object], getstatic:UUID(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u3d4b\uc910\ua61f\u5fe1\ub7dc\u62da))))
        }
        
        goto(Label_0006)
    }
    
    public void \uc238\u8df4\u7c6b\ub32d\u6ec6\ucfaf(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u839e\ud36e\ufe34\uc31c\u392e\u64ab p0) {
        var_4_64 : GameProfile
        var_5_7A : \ua3b4\u965f\u6d99\u4492\ud4fe\u7006
        
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
            var_4_64 = invokevirtual:GameProfile(\u839e\ud36e\ufe34\uc31c\u392e\u64ab::\uae87\uc31c\ud523\u5245\u8413\uc3e3, p0:\u839e\ud36e\ufe34\uc31c\u392e\u64ab)
            
            if (invokevirtual:boolean(GameProfile::isComplete, var_4_64:GameProfile)) {
                invokeinterface:UUID(Map<String, UUID>::put, getfield:Map<String, UUID>(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u62da\u5bc4\uc229\u72f1\u3d64\ub102, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e), invokevirtual:String(GameProfile::getName, var_4_64:GameProfile), invokevirtual:UUID(GameProfile::getId, var_4_64:GameProfile))
            }
            
            var_5_7A = getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u97e6\u52d3\u8308\ud51e\u3a62\u4179, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e))
            
            if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6.class, var_5_7A:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)) {
                invokevirtual:void(\u718f\u183a\u6d99\u3bc9\ub70c\u7af6::\u624e\u4bc8\u4ab3\ub102\u156b\u946b, checkcast:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6.class, var_5_7A:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006]), p0:\u839e\ud36e\ufe34\uc31c\u392e\u64ab)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4e72\u6c52\u97e6\u8389\u16f6\u51fa(java.util.UUID p0) {
        var_4_67 : \ua3b4\u965f\u6d99\u4492\ud4fe\u7006
        
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
            var_4_67 = getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u97e6\u52d3\u8308\ud51e\u3a62\u4179, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e))
            
            if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6.class, var_4_67:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)) {
                invokevirtual:void(\u718f\u183a\u6d99\u3bc9\ub70c\u7af6::\u527a\u7c6b\ufe34\ud171\u759a\u983f, checkcast:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6.class, var_4_67:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006]), p0:UUID)
            }
            
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
    
    public void \u8258\ucfaf\u69d9\u8413\u4f52\uc229(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FA : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_605 : int
        
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
        var_3_5FA = and:int(ldc:int(1808283434), ldc:int(-640958465))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u59ec\u4bc8\uc910\ua562\u72f1\u839e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_5FA = and:int(var_3_5FA:int, ldc:int(-548339726))
            var_5_7D = and:int(ldc:int(-27875), ldc:int(27840))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10095), ldc:int(9998)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5FA:int, ldc:int(1801893687))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(8769), ldc:int(5)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(4304), ldc:int(4305)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5FA = and:int(var_3_CA:int, ldc:int(-908169345))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(20), ldc:int(21)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-1673960934))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1075278815))
                        goto(Label_0531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-1067768802))
                    }
                    else {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-303812682))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0531)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1668069842))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-581224591))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1460711564))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(754661313))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(1230962467))
                            var_11_DB = and:int(ldc:int(-8734), ldc:int(541))
                            goto(Label_1400)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0531:
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(381201252))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-513254399))
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-1658502676))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(443626613))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-271898625))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-298205988))
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(760583165))
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-230971628))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-352155296))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0531)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-910004370))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(605533657))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0531)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(1880064935))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1833773026))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(513), ldc:int(512))
                                goto(Label_1044)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-1746591706))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1588752912))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(-872322301))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(-1208451735))
                            goto(Label_0531)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(-411755861))
                            loopcontinue()
                        }
                        
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-304371869))
                        var_11_DB = and:int(ldc:int(-30797), ldc:int(26700))
                    }
                    
                    Label_1044:
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1739635318))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1494679842))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(1641655915))
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(378079822))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0531)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(138266166))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-606355610))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1302)
                            }
                        }
                    }
                    
                    Label_1173:
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-1290154386))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(420911458))
                            goto(Label_1044)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(-830072624))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0531)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(-936927908))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FA = and:int(var_3_5FA:int, ldc:int(-580458634))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1400)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1302:
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FA = and:int(var_3_5FA:int, ldc:int(2036297587))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1400:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_605 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1411:
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1034006246))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(606345331))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(96919489))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(-1146079543))
                        goto(Label_0531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FA = and:int(var_3_5FA:int, ldc:int(1810294758))
                        var_17_605 = add:int(var_16_109:int, and:int(ldc:int(101), ldc:int(18577)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FA = and:int(var_3_5FA:int, ldc:int(1290651189))
                }
                
                var_3_5FA = and:int(var_3_5FA:int, ldc:int(2110078830))
                
                if (cmple:boolean(var_5_7D = var_17_605:int, sub:int(var_6_84:int, and:int(ldc:int(1429), ldc:int(8265))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5FA:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
