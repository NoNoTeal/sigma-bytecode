public abstract class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u76bc\ub8be\u6b0d\ucb79\u71ae<C> {
    private static F extends \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u76bc\ub8be\u6b0d\ucb79\u71ae<C> \ubff1\ucef1\u3a62\u9033\ua61f\u56bd(java.lang.String p0, F extends \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u76bc\ub8be\u6b0d\ucb79\u71ae<C> p1) {
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
            return:F extends \u76bc\ub8be\u6b0d\ucb79\u71ae<C>(checkcast:F extends \u76bc\ub8be\u6b0d\ucb79\u71ae<C>(F extends \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u76bc\ub8be\u6b0d\ucb79\u71ae<C>.class, invokestatic:F extends \u76bc\ub8be\u6b0d\ucb79\u71ae<C>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\ud158\ub19c\u8258\ub113\u6cfe\uc29a, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u76bc\ub8be\u6b0d\ucb79\u71ae<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uc3e3\ub83f\u6ec6\u4492\u3776\u61a4), p0:String, p1:F extends \u76bc\ub8be\u6b0d\ucb79\u71ae<C>)))
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\ub8be\u6b0d\ucb79\u71ae(com.mojang.serialization.Codec<C> p0) {
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
            invokespecial:Object(Object::<init>, this:\u76bc\ub8be\u6b0d\ucb79\u71ae<C>)
            putfield:Codec<\u64ab\ua6bd\u8413\u93a2\u88c5<C>>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ub7dc\u839e\u34df\u759a\u4492\u7049, this:\u76bc\ub8be\u6b0d\ucb79\u71ae<C>, invokevirtual:Codec(MapCodec::codec, invokevirtual:MapCodec(MapCodec::xmap, invokeinterface:MapCodec(Codec::fieldOf, p0:Codec<C>, ldc:String("config")), invokedynamic:Function<\u3a62\u47c2\u946b\u6c56\u51b2, \u64ab\ua6bd\u8413\u93a2\u88c5>(apply:(L\u12b2\u9a18\uc7fe\u4c2b\u6c52/\u76bc\ub8be\u6b0d\ucb79\u71ae;)Ljava/util/function/Function;, this:\u76bc\ub8be\u6b0d\ucb79\u71ae<C>), invokedynamic:Function<T, \u3a62\u47c2\u946b\u6c56\u51b2>(apply:()Ljava/util/function/Function;))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Codec<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<C>> \ud158\ud217\u3d4b\u4daf\ub18d\uff55() {
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
            return:Codec<\u64ab\ua6bd\u8413\u93a2\u88c5<C>>(getfield:Codec<\u64ab\ua6bd\u8413\u93a2\u88c5<C>>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ub7dc\u839e\u34df\u759a\u4492\u7049, this:\u76bc\ub8be\u6b0d\ucb79\u71ae<C>))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<C> \ua61f\u4c2b\ub18d\ub6ab\u5bc4\u624e(C extends \u59ec\u8413\u97e6\uc229\u3776.\u3a62\u47c2\u946b\u6c56\u51b2 p0) {
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
            return:\u64ab\ua6bd\u8413\u93a2\u88c5<C>(initobject:\u64ab\ua6bd\u8413\u93a2\u88c5<C>(\u64ab\ua6bd\u8413\u93a2\u88c5<C>::<init>, this:\u76bc\ub8be\u6b0d\ucb79\u71ae<C>, p0:C extends \u3a62\u47c2\u946b\u6c56\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u4cd9\u40a9\u4c04\uf94d\u760c\u69d9(java.util.Random p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p2, int p3, int p4, int p5, double p6, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p7, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p8, int p9, long p10, C extends \u59ec\u8413\u97e6\uc229\u3776.\u3a62\u47c2\u946b\u6c56\u51b2 p11);
    
    public void \u3e75\ub32d\u0a06\u3bc9\ub7dc\u64f2(long p0) {
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
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8308\ubf56\u6d99\u47c2\u9937\u6d99, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u51fa\u4492\ubb2b\u7006\u8350\u4ab3)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u873d\ufcaf\u9a18\ud51e\u97e6\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u9255\ud12e\ufcaf\u960f\ub18d\ud523)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u760c\ud36e\u69d9\u8640\u12b2\ua068, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ua6bd\u97e6\ua068\u8cae\ub70c\u392e)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u74b1\ua068\u6c56\ubb2b\u3c25\ufcaf)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u76bc\uae5d\u8df4\u624e\u98a4\u516c, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u4f4a\u72f1\u965f\u3776\ubefe\u0b8e)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u52d3\u4e72\u6c56\u4daf\u983f\u983f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ud51e\u69d9\u071d\ud12e\ubff1\ud217)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u494c\u156b\u56bd\u9937\ud171\u4e72, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc910\ub171\u99f7\ubf56\u12b2\u3a62)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3e75\ubefe\uc29a\u7ce1\u946b\uc84e, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u3d4b\ub83f\u3bc9\u9a18\u3711\ua3b4)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u446c\u836c\ub102\u183a\ud7e8\u9033, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8df4\u8cae\ua3b4\u873d\u5245\ua3b4)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3e75\u7e3f\ub83f\u4f4a\ub6ab\u3e75, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ud36e\ubcb0\u839e\ua3b4\u4bc8\u5140)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3d4b\u92ee\u3d64\uc87f\uf995\ub7dc, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc229\ufcaf\u76bc\u7c6b\ub70c\u97b7)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\uc246\u99f7\ubff1\u8709\u4179\u3d4b, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc9f6\u67d0\u16f6\u8c8a\ud36e\u8308)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ufcaf\u836c\u9033\uf94d\u7c6b\ud158, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7e3f\u67e9\u6c52\ud523\u92ff\u527a)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u72f1\u7af6\uc229\u7ce1\uc7fe\u5245, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u446c\u12b2\u97b7\uc87f\ua3b4\u8308)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u97b7\ua068\u983f\u69d9\u3bd6\u7ce1, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7e3f\u6c56\u4492\u76bc\u5db4\u92ff)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3dd3\uc9f6\u9af2\u7330\u52d3\u3c25, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u960f\u873d\uc229\u62da\u7049\uf94d)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6b5f\ud217\u3d4b\u64f2\u8640\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc87f\u16f6\u99f7\u6c52\u8389\ube23)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6d69\uae87\u647c\u9255\u7e3f\u51b2, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc3e3\u527a\ud7e8\ub1b9\ub8be\ud12e)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8d98\uc229\u718f\ub32d\u12cb\u61a4, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8258\u3dd3\u52d3\u4c04\u3776\u59ec)))
            putstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ub83f\uae5d\u16f6\ub6ab\ub8be\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u6435\uc84e\ud4fe\ubb2b\u183a\u8aa5)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u4ab3\u4cd9\u494c\u3bd6\u6cfe\ubded, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u760c\ud36e\u69d9\u8640\u12b2\ua068), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8308\ubf56\u6d99\u47c2\u9937\u6d99), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6cfe\ub8be\ufe34\ub83f\u120d\u52d3, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u965f\u156b\u9a18\u2dcc\u946b\u927d, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u873d\ufcaf\u9a18\ud51e\u97e6\u6c56), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8308\ubf56\u6d99\u47c2\u9937\u6d99), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u51b2\u12b2\u4f52\u3bd6\ubff1\ucef1, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u76bc\uae5d\u8df4\u624e\u98a4\u516c), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u76bc\uae5d\u8df4\u624e\u98a4\u516c), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ub171\u8cae\u61a4\u4ab3\u47c2\u4ab3, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u52d3\u4e72\u6c56\u4daf\u983f\u983f), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8308\ubf56\u6d99\u47c2\u9937\u6d99), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u9937\u7006\u385b\u64f2\u59ec\u6d99, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u494c\u156b\u56bd\u9937\ud171\u4e72), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u494c\u156b\u56bd\u9937\ud171\u4e72), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6fb0\u97b7\ubcb0\ua6bd\ud12e\u7006, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u873d\ufcaf\u9a18\ud51e\u97e6\u6c56), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8308\ubf56\u6d99\u47c2\u9937\u6d99), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u494c\u156b\u56bd\u9937\ud171\u4e72)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6bb9\uc229\u8389\uafe7\u3c25\u62da, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u494c\u156b\u56bd\u9937\ud171\u4e72), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u494c\u156b\u56bd\u9937\ud171\u4e72), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u494c\u156b\u56bd\u9937\ud171\u4e72)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\uc238\u6c56\u3bd6\uc4d2\u156b\ua068, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3e75\ubefe\uc29a\u7ce1\u946b\uc84e), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u446c\u836c\ub102\u183a\ud7e8\u9033), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8d90\u927d\u62da\u6c52\u416d\ua562, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3e75\u7e3f\ub83f\u4f4a\ub6ab\u3e75), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8308\ubf56\u6d99\u47c2\u9937\u6d99), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8cae\ua562\ud12e\u6198\u51b2\u7006)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8d90\u76bc\u99f7\u69d9\u0800\u8753, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\uc246\u99f7\ubff1\u8709\u4179\u3d4b), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\uc246\u99f7\ubff1\u8709\u4179\u3d4b), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\uc246\u99f7\ubff1\u8709\u4179\u3d4b)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6c56\u927d\u3e2a\uc229\ube23\u3d4b, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3d4b\u92ee\u3d64\uc87f\uf995\ub7dc), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3d4b\u92ee\u3d64\uc87f\uf995\ub7dc), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3d4b\u92ee\u3d64\uc87f\uf995\ub7dc)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ubf56\u4ab3\ub113\u3504\u6198\u7873, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ufcaf\u836c\u9033\uf94d\u7c6b\ud158), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ufcaf\u836c\u9033\uf94d\u7c6b\ud158), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ufcaf\u836c\u9033\uf94d\u7c6b\ud158)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u4daf\u6d99\u071d\ubb2b\ub19c\u40a9, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u72f1\u7af6\uc229\u7ce1\uc7fe\u5245), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\uc246\u99f7\ubff1\u8709\u4179\u3d4b), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3dd3\uc9f6\u9af2\u7330\u52d3\u3c25)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ud217\ud51e\ub113\u71f1\uafe7\u8308, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u97b7\ua068\u983f\u69d9\u3bd6\u7ce1), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\uc246\u99f7\ubff1\u8709\u4179\u3d4b), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6b5f\ud217\u3d4b\u64f2\u8640\u6c56)))
            putstatic:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u7043\uae87\u92ff\u5140\u8709\uc4d2, initobject:\u836c\u6b0d\uc3e3\u71f1\u4daf(\u836c\u6b0d\uc3e3\u71f1\u4daf::<init>, getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6d69\uae87\u647c\u9255\u7e3f\u51b2), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u8d98\uc229\u718f\ub32d\u12cb\u61a4), getstatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ub83f\uae5d\u16f6\ub6ab\ub8be\u873d)))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u92ff\u647c\u7c6b\u446c\u3711\u51b2, invokestatic:\u9255\u446c\u0a06\ua61f\u74b1[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("default"), initobject:\u9255\u446c\u0a06\ua61f\u74b1(\u9255\u446c\u0a06\ua61f\u74b1::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u3c25\u392e\u3bc9\u6198\u8cae\u7d52, invokestatic:\uc3e3\u92ee\u983f\u4bc8\u9937[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("mountain"), initobject:\uc3e3\u92ee\u983f\u4bc8\u9937(\uc3e3\u92ee\u983f\u4bc8\u9937::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\uc31c\u416d\u965f\u4cd9\u16f6\u3711, invokestatic:\u5bc4\ub171\u9a18\u5654\ub6ab[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("shattered_savanna"), initobject:\u5bc4\ub171\u9a18\u5654\ub6ab(\u5bc4\ub171\u9a18\u5654\ub6ab::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ub8be\u6c56\u760c\ub102\u120d\u64ab, invokestatic:\u3711\ubff1\u600f\u9937\u6d69[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("gravelly_mountain"), initobject:\u3711\ubff1\u600f\u9937\u6d69(\u3711\ubff1\u600f\u9937\u6d69::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u2dcc\uc3e3\u8df4\uc84e\u8aa5\ubefe, invokestatic:\ub83f\u59ec\ub19c\u4492\ud12e[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("giant_tree_taiga"), initobject:\ub83f\u59ec\ub19c\u4492\ud12e(\ub83f\u59ec\ub19c\u4492\ud12e::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u56bd\u3776\u516c\u1187\u4e72\u4e72, invokestatic:\u527a\u12b2\u624e\u120d\u7d52[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("swamp"), initobject:\u527a\u12b2\u624e\u120d\u7d52(\u527a\u12b2\u624e\u120d\u7d52::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ub6ab\u6c52\u3776\u946b\ub102\u8753, invokestatic:\ub18d\u67e9\uc84e\u6d99\u6198[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("badlands"), initobject:\ub18d\u67e9\uc84e\u6d99\u6198(\ub18d\u67e9\uc84e\u6d99\u6198::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u7330\u836c\u51fa\uc238\ud217\u416d, invokestatic:\u4c2b\u6b5f\u8df4\uceb8\u960f[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("wooded_badlands"), initobject:\u4c2b\u6b5f\u8df4\uceb8\u960f(\u4c2b\u6b5f\u8df4\uceb8\u960f::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\ubefe\ud171\u59ec\u3504\u51fa\u9a18, invokestatic:\u92ff\u6435\uf9c5\ua6bd\u0a06[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("eroded_badlands"), initobject:\u92ff\u6435\uf9c5\ua6bd\u0a06(\u92ff\u6435\uf9c5\ua6bd\u0a06::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u4c2b\ua3b4\u64f2\u7873\u4ab3\u8389, invokestatic:\u3e75\u4cd9\u97e6\u873d\u8709[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("frozen_ocean"), initobject:\u3e75\u4cd9\u97e6\u873d\u8709(\u3e75\u4cd9\u97e6\u873d\u8709::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u12cb\ub7dc\u6ec6\u718f\u97e6\ube23, invokestatic:\ub1b9\u8bb0\u527a\u0c95\u8cae[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("nether"), initobject:\ub1b9\u8bb0\u527a\u0c95\u8cae(\ub1b9\u8bb0\u527a\u0c95\u8cae::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u76bc\u9937\u34df\u647c\u0b8e\u6ec6, invokestatic:\ufe34\u8709\u99f7\u3dd3\u6d69[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("nether_forest"), initobject:\ufe34\u8709\u99f7\u3dd3\u6d69(\ufe34\u8709\u99f7\u3dd3\u6d69::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u12cb\u6b0d\u8aa5\u1833\uc84e\u392e, invokestatic:\u4daf\u7006\ub70c\ub83f\uf995[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("soul_sand_valley"), initobject:\u4daf\u7006\ub70c\ub83f\uf995(\u4daf\u7006\ub70c\ub83f\uf995::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u6b0d\u88c5\u965f\u8389\uc29a\u1187, invokestatic:\uff55\u5654\u12cb\u8389\uafe7[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("basalt_deltas"), initobject:\uff55\u5654\u12cb\u8389\uafe7(\uff55\u5654\u12cb\u8389\uafe7::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            putstatic:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u76bc\ub8be\u6b0d\ucb79\u71ae::\u7d52\u965f\u839e\u9255\u494c\u0c95, invokestatic:\u3776\u836c\u0c95\u4179\u67e9[expected:\u76bc\ub8be\u6b0d\ucb79\u71ae<\u836c\u6b0d\uc3e3\u71f1\u4daf>](\u76bc\ub8be\u6b0d\ucb79\u71ae<C>::\ubff1\ucef1\u3a62\u9033\ua61f\u56bd, ldc:String("nope"), initobject:\u3776\u836c\u0c95\u4179\u67e9(\u3776\u836c\u0c95\u4179\u67e9::<init>, getstatic:Codec<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u836c\u6b0d\uc3e3\u71f1\u4daf::\u4c04\ud158\u6c52\u9033\ub113\uae87))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u97b7\u6d69\ub70c\u718f\uc2bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6CC : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6D7 : int
        
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
        var_3_6CC = and:int(ldc:int(1605943721), ldc:int(-672335377))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u76bc\ub8be\u6b0d\ucb79\u71ae<C>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2068119529))
        }
        else {
            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1408035769))
            var_5_8A = and:int(ldc:int(-3627), ldc:int(3626))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25219), ldc:int(-25288)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6CC:int, ldc:int(-4658181))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(23809), ldc:int(243)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(4737), ldc:int(1)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6CC = and:int(var_3_E3:int, ldc:int(-239547461))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(15641), ldc:int(613)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1895572811))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1284761967))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(353311277))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(368101152))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1061192243))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0765)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(413466948))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1260855208))
                    }
                    else {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-541069399))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0622)
                            }
                            
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0447:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(486322345))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1082035781))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(292537609))
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(765549936))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2482050))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1677322175))
                        var_11_F4 = and:int(ldc:int(6824), ldc:int(-15086))
                        goto(Label_1589)
                    }
                    
                    Label_0622:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1834944889))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(215514905))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1672271518))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1026326454))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(920029538))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1983741912))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-538193409))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0765:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1061191554))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-381060266))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1446411773))
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(2075971563))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0888:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(97320325))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-702252014))
                            goto(Label_0765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2125182035))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1042086201))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-336010309))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(16387), ldc:int(12813))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1013:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2115568671))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-761468682))
                            goto(Label_0765)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(2044592544))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-239535169))
                        var_11_F4 = and:int(ldc:int(25826), ldc:int(-25827))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(700971153))
                            goto(Label_1013)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2120929988))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1604014343))
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-373358599))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-23025449))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-892254405))
                            goto(Label_1164)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-376911506))
                            goto(Label_1013)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2002634200))
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1249543505))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1551830916))
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1841087483))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1589)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(749835048))
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1881955886))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(319639642))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1629622121))
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1422843079))
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1598753280))
                        goto(Label_0447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6CC = and:int(var_3_6CC:int, ldc:int(1844175291))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1589:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6D7 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1600:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(2023833122))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1709933560))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1740658727))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-631067794))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(15817238))
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-517393936))
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(943602657))
                        goto(Label_0447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-877867009))
                        var_17_6D7 = add:int(var_16_122:int, xor:int(ldc:boolean(0), ldc:boolean(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6CC = and:int(var_3_6CC:int, ldc:int(1273681917))
                
                if (cmple:boolean(var_5_8A = var_17_6D7:int, sub:int(var_6_91:int, xor:int(ldc:int(-31360), ldc:int(-31359))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(65536)), ldc:int(0))) {
            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1917188225))
            goto(Label_0108)
        }
    }
}
