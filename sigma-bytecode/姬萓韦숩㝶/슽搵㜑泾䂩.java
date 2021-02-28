public class \u59ec\u8413\u97e6\uc229\u3776.\uc2bd\u6435\u3711\u6cfe\u40a9 {
    public void \uc2bd\u6435\u3711\u6cfe\u40a9(com.mojang.brigadier.StringReader p0, boolean p1) {
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
            invokespecial:Object(Object::<init>, this:\uc2bd\u6435\u3711\u6cfe\u40a9)
            putfield:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u494c\u516c\u7ce1\u64ab\u6b0d\u6fb0, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokestatic:HashMap[expected:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>](Maps::newHashMap))
            putfield:Map<String, String>(\uc2bd\u6435\u3711\u6cfe\u40a9::\uae87\ub171\ud171\u8d98\u718f\uff55, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokestatic:HashMap[expected:Map<String, String>](Maps::newHashMap))
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ub113\u946b\u0b8e\u5db4\u7006\u156b, this:\uc2bd\u6435\u3711\u6cfe\u40a9, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(getstatic:String[](\uc2bd\u6435\u3711\u6cfe\u40a9::\u516c\u494c\u3dd3\u385b\u5140\u51fa), and:int(ldc:int(-17415), ldc:int(17414)))))
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(getstatic:String[](\uc2bd\u6435\u3711\u6cfe\u40a9::\u516c\u494c\u3dd3\u385b\u5140\u51fa), and:int(ldc:int(-20755), ldc:int(20754)))))
            putfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9, getstatic:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4bc8\uafe7\u93a2\u8350\u7ce1\u64f2))
            putfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9, p0:StringReader)
            putfield:boolean(\uc2bd\u6435\u3711\u6cfe\u40a9::\u7043\u416d\uc2e8\u8d98\u71ae\ub32d, this:\uc2bd\u6435\u3711\u6cfe\u40a9, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, java.lang.Comparable<?>> \ud523\u7c6b\uc7fe\u36d3\ub70c\uceb8() {
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
            return:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(getfield:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u494c\u516c\u7ce1\u64ab\u6b0d\u6fb0, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u873d\u624e\u9033\ube23\u392e\ud51e() {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u516c\u3dd3\u16f6\u3d64\u8aa5\u59ec() {
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
            return:\uc31c\uc87f\uc246\u3776\ub7dc(getfield:\uc31c\uc87f\uc246\u3776\ub7dc(\uc2bd\u6435\u3711\u6cfe\u40a9::\ub32d\u5db4\u7049\u8308\u4cd9\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \ud7e8\u8d90\uae87\u7049\u0c95\u67e9() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uc2bd\u6435\u3711\u6cfe\u40a9 \u983f\u6435\uc229\ub1b9\u3bc9\u965f(boolean p0) {
        var_2_7F : int
        
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
        var_2_7F = and:int(ldc:int(-1093924467), ldc:int(-1611865177))
        putfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokedynamic:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\uc2bd\u6435\u3711\u6cfe\u40a9;)Ljava/util/function/BiFunction;, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
        
        if (invokevirtual:boolean(StringReader::canRead, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9))) {
            if (cmpeq:boolean(invokevirtual:char(StringReader::peek, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9)), ldc:char(35))) {
                invokevirtual:void(\uc2bd\u6435\u3711\u6cfe\u40a9::\uc246\u99f7\ucef1\uae87\uc7fe\uf995, this:\uc2bd\u6435\u3711\u6cfe\u40a9)
                putfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokedynamic:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\uc2bd\u6435\u3711\u6cfe\u40a9;)Ljava/util/function/BiFunction;, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
                
                if (logicalnot:boolean(invokevirtual:boolean(StringReader::canRead, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9)))) {
                    goto(Label_0160)
                }
                
                if (cmpne:boolean(invokevirtual:char(StringReader::peek, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9)), ldc:char(91))) {
                    goto(Label_0160)
                }
                
                invokevirtual:void(\uc2bd\u6435\u3711\u6cfe\u40a9::\u7873\uc4d2\ucef1\u6c56\ub1b9\uc87f, this:\uc2bd\u6435\u3711\u6cfe\u40a9)
                putfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokedynamic:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\uc2bd\u6435\u3711\u6cfe\u40a9;)Ljava/util/function/BiFunction;, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
                goto(Label_0160)
            }
        }
        
        Label_0116:
        
        if (cmpeq:boolean(and:int(var_2_7F:int, ldc:int(33554432)), ldc:int(0))) {
            var_2_7F = and:int(var_2_7F:int, ldc:int(1364658527))
        }
        else {
            var_2_7F = and:int(var_2_7F:int, ldc:int(-272191537))
            invokevirtual:void(\uc2bd\u6435\u3711\u6cfe\u40a9::\u64ab\u7049\u6435\ud523\ud36e\ubcb0, this:\uc2bd\u6435\u3711\u6cfe\u40a9)
            putfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokedynamic:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\uc2bd\u6435\u3711\u6cfe\u40a9;)Ljava/util/function/BiFunction;, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
            
            if (invokevirtual:boolean(StringReader::canRead, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9))) {
                if (cmpeq:boolean(invokevirtual:char(StringReader::peek, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9)), ldc:char(91))) {
                    invokevirtual:void(\uc2bd\u6435\u3711\u6cfe\u40a9::\uf94d\u120d\u88c5\ud7e8\u946b\uc29a, this:\uc2bd\u6435\u3711\u6cfe\u40a9)
                    putfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokedynamic:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\uc2bd\u6435\u3711\u6cfe\u40a9;)Ljava/util/function/BiFunction;, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
                }
            }
        }
        
        Label_0160:
        
        if (cmpne:boolean(and:int(var_2_7F:int, ldc:int(2097152)), ldc:int(0))) {
            var_2_7F = and:int(var_2_7F:int, ldc:int(-1197726387))
            goto(Label_0116)
        }
        
        if (p0:boolean) {
            if (invokevirtual:boolean(StringReader::canRead, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9))) {
                if (cmpeq:boolean(invokevirtual:char(StringReader::peek, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9)), ldc:char(123))) {
                    putfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9, getstatic:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4bc8\uafe7\u93a2\u8350\u7ce1\u64f2))
                    invokevirtual:void(\uc2bd\u6435\u3711\u6cfe\u40a9::\u8389\u4d85\u52d3\u6b0d\u3dd3\u3776, this:\uc2bd\u6435\u3711\u6cfe\u40a9)
                }
            }
        }
        
        return:\uc2bd\u6435\u3711\u6cfe\u40a9(this:\uc2bd\u6435\u3711\u6cfe\u40a9)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \ubcb0\u3d4b\u3d4b\ud158\ubded\u836c(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
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
            
            if (invokevirtual:boolean(String::isEmpty, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder))) {
                invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(93)))
            }
            
            return:CompletableFuture<Suggestions>(invokespecial:CompletableFuture<Suggestions>(\uc2bd\u6435\u3711\u6cfe\u40a9::\ud4fe\uafe7\u61a4\u12cb\uae5d\uc87f, this:\uc2bd\u6435\u3711\u6cfe\u40a9, p0:SuggestionsBuilder, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u4f4a\ub32d\u0b8e\u5fe1\ubf56\u6fb0(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
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
            
            if (invokevirtual:boolean(String::isEmpty, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder))) {
                invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(93)))
            }
            
            return:CompletableFuture<Suggestions>(invokespecial:CompletableFuture<Suggestions>(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua6bd\u6d99\u6b0d\ua068\u839e\u59ec, this:\uc2bd\u6435\u3711\u6cfe\u40a9, p0:SuggestionsBuilder, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \ud4fe\uafe7\u61a4\u12cb\uae5d\uc87f(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
        var_3_87 : int
        var_5_6A : String
        var_6_78 : Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>
        var_7_BC : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>
        
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
            var_3_87 = and:int(ldc:int(1693321696), ldc:int(-1115823116))
            var_5_6A = invokevirtual:String(String::toLowerCase, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder), getstatic:Locale(Locale::ROOT))
            var_6_78 = invokeinterface:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>::iterator, invokevirtual:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\uc246\u3711\uc31c\u516c\ud171\uc84e, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9)))
            
            loop {
                if (cmpne:boolean(and:int(var_3_87:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_87 = and:int(var_3_87:int, ldc:int(-1267954768))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_6_78:Iterator)) {
                        var_7_BC = checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>.class, invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>::next, var_6_78:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u494c\u516c\u7ce1\u64ab\u6b0d\u6fb0, this:\uc2bd\u6435\u3711\u6cfe\u40a9), var_7_BC:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[expected:Object]))) {
                            if (invokevirtual:boolean(String::startsWith, invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, var_7_BC:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>), var_5_6A:String)) {
                                invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, var_7_BC:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>)), ldc:char(61))))
                            }
                        }
                        
                        var_3_87 = and:int(var_3_87:int, ldc:int(-1527860238))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_87:int, ldc:int(524288)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_87 = and:int(var_3_87:int, ldc:int(1721289232))
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \ua6bd\u6d99\u6b0d\ua068\u839e\u59ec(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
        var_3_FD : int
        var_5_6C : String
        var_6_A2 : \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_7_BC : Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_9_EE : Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>
        var_10_127 : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>
        
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
            var_3_FD = and:int(ldc:int(-361855007), ldc:int(-621352970))
            var_5_6C = invokevirtual:String(String::toLowerCase, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder), getstatic:Locale(Locale::ROOT))
            
            if (cmpne:boolean(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
                if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9))))) {
                    var_6_A2 = invokeinterface:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u1187\uc87f\u071d\u494c\u61a4\ub171, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
                    
                    if (cmpne:boolean(var_6_A2:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, aconstnull:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>())) {
                        var_7_BC = invokeinterface:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(List<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::iterator, invokeinterface:List<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ucef1\ub32d\u7ce1\ub70c\u6b0d\u97e6, var_6_A2:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
                        
                        loop {
                            var_3_FD = and:int(var_3_FD:int, ldc:int(-341381137))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_BC:Iterator))) {
                                looporswitchbreak()
                            }
                            
                            var_9_EE = invokeinterface:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>::iterator, invokevirtual:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::\u3711\u8aa5\u7af6\u4cd9\u9255\uc910, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokeinterface:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::next, var_7_BC:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)))))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_3_FD:int, ldc:int(8192)), ldc:int(0))) {
                                    var_3_FD = and:int(var_3_FD:int, ldc:int(-876706836))
                                    
                                    if (invokeinterface:boolean(Iterator::hasNext, var_9_EE:Iterator)) {
                                        var_10_127 = checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>.class, invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>::next, var_9_EE:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>))
                                        
                                        if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<String, String>(\uc2bd\u6435\u3711\u6cfe\u40a9::\uae87\ub171\ud171\u8d98\u718f\uff55, this:\uc2bd\u6435\u3711\u6cfe\u40a9), invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, var_10_127:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>)))) {
                                            if (invokevirtual:boolean(String::startsWith, invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, var_10_127:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>), var_5_6C:String)) {
                                                invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, var_10_127:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>)), ldc:char(61))))
                                            }
                                        }
                                        
                                        var_3_FD = and:int(var_3_FD:int, ldc:int(-70853658))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_3_FD:int, ldc:int(64)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_3_FD = and:int(var_3_FD:int, ldc:int(-898640904))
                        }
                    }
                }
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u4e72\u8389\uc2bd\u6c52\ub171\u8709(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
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
            
            if (invokevirtual:boolean(String::isEmpty, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder))) {
                if (invokespecial:boolean(\uc2bd\u6435\u3711\u6cfe\u40a9::\u873d\u4cd9\u4e72\u446c\u67e9\uae87, this:\uc2bd\u6435\u3711\u6cfe\u40a9, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)) {
                    invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(123)))
                }
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private boolean \u873d\u4cd9\u4e72\u446c\u67e9\uae87(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p0) {
        var_2_61 : int
        var_2_112 : int
        var_4_C6 : \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_5_E0 : Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        
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
        var_2_61 = and:int(ldc:int(-977621964), ldc:int(-436543684))
        
        if (cmpne:boolean(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9), aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
            return:boolean(invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9))))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                var_2_112 = and:int(var_2_61:int, ldc:int(548258429))
            }
            else {
                var_2_112 = and:int(var_2_61:int, ldc:int(-71787659))
                
                if (cmpne:boolean(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
                    var_4_C6 = invokeinterface:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u1187\uc87f\u071d\u494c\u61a4\ub171, p0:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
                    
                    if (cmpne:boolean(var_4_C6:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, aconstnull:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>())) {
                        var_5_E0 = invokeinterface:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(List<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::iterator, invokeinterface:List<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ucef1\ub32d\u7ce1\ub70c\u6b0d\u97e6, var_4_C6:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
                        
                        loop {
                            var_2_112 = and:int(var_2_112:int, ldc:int(-369973250))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_E0:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))) {
                                looporswitchbreak()
                            }
                            
                            if (invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokeinterface:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::next, var_5_E0:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)))) {
                                return:boolean(xor:int[expected:boolean](ldc:int(72), ldc:int(73)))
                            }
                            
                            var_2_112 = and:int(var_2_112:int, ldc:int(-71312524))
                        }
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_112:int, ldc:int(32768)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-30973), ldc:int(30968)))
            }
            
            var_2_61 = and:int(var_2_112:int, ldc:int(1083076002))
        }
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u3a62\u0a06\u76bc\u9255\u98a4\u97e6(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
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
            
            if (invokevirtual:boolean(String::isEmpty, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder))) {
                invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(61)))
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \uafe7\u3e2a\ua3b4\u3e75\u760c\u72f1(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
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
            
            if (invokevirtual:boolean(String::isEmpty, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder))) {
                invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(93)))
            }
            
            if (invokevirtual:boolean(String::isEmpty, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder))) {
                if (cmplt:boolean(invokeinterface:int(Map<K, V>::size, getfield:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u494c\u516c\u7ce1\u64ab\u6b0d\u6fb0, this:\uc2bd\u6435\u3711\u6cfe\u40a9)), invokeinterface:int(Collection<E>::size, invokevirtual:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\uc246\u3711\uc31c\u516c\ud171\uc84e, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9))))) {
                    invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(44)))
                }
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.suggestion.SuggestionsBuilder \u56bd\uc7fe\u1833\u8308\ud12e\u4f52(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p1) {
        var_2_BB : int
        var_4_6B : Iterator<T>
        var_5_AC : Comparable<T>
        
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
            var_2_BB = and:int(ldc:int(1424936945), ldc:int(99602419))
            var_4_6B = invokeinterface:Iterator<T>(Collection<T>::iterator, invokevirtual:Collection<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u12cb\u67e9\ud171\u6b5f\u6198\u36d3, p1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_BB:int, ldc:int(1)), ldc:int(0))) {
                    var_2_BB = and:int(var_2_BB:int, ldc:int(-1597880014))
                }
                else {
                    var_2_BB = and:int(var_2_BB:int, ldc:int(-1511129319))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6B:Iterator<T>)) {
                        var_5_AC = checkcast:T extends Comparable<T>[expected:Comparable<T>](T extends java.lang.Comparable<T>.class, invokeinterface:T extends Comparable<T>(Iterator<T>::next, var_4_6B:Iterator<T>))
                        
                        if (logicalnot:boolean(instanceof:boolean(java.lang.Integer.class, var_5_AC:Comparable<T>))) {
                            var_2_BB = and:int(var_2_BB:int, ldc:int(1961884529))
                            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, p1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, var_5_AC:T extends Comparable<T>))
                        }
                        else {
                            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, var_5_AC:Comparable<T>[expected:Integer])))
                        }
                        
                        var_2_BB = and:int(var_2_BB:int, ldc:int(1072627529))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_BB:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:SuggestionsBuilder(p0:SuggestionsBuilder)
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u385b\u93a2\u965f\u4daf\u516c\ube23(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1, java.lang.String p2) {
        var_4_164 : int
        var_6_6C : int
        var_7_E3 : \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_8_FD : Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_9_122 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_10_12D : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>
        var_4_1D1 : int
        var_11_193 : Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>
        var_4_84 : int
        
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
            var_4_164 = and:int(ldc:int(-1733244481), ldc:int(1863798782))
            var_6_6C = and:int(ldc:int(-18936), ldc:int(18677))
            
            if (cmpne:boolean(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
                if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9))))) {
                    var_7_E3 = invokeinterface:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u1187\uc87f\u071d\u494c\u61a4\ub171, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
                    
                    if (cmpne:boolean(var_7_E3:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, aconstnull:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>())) {
                        var_8_FD = invokeinterface:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(List<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::iterator, invokeinterface:List<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ucef1\ub32d\u7ce1\ub70c\u6b0d\u97e6, var_7_E3:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
                        
                        loop {
                            var_4_164 = and:int(var_4_164:int, ldc:int(1824165309))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_FD:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))) {
                                looporswitchbreak()
                            }
                            
                            var_9_122 = checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokeinterface:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::next, var_8_FD:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
                            var_10_12D = invokevirtual:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::\u8753\u927d\u51b2\ub102\u4ab3\u1833, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, var_9_122:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a), p2:String)
                            
                            if (cmpne:boolean(var_10_12D:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, aconstnull:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>())) {
                                invokestatic:SuggestionsBuilder(\uc2bd\u6435\u3711\u6cfe\u40a9::\u56bd\uc7fe\u1833\u8308\ud12e\u4f52, p0:SuggestionsBuilder, var_10_12D:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>)
                            }
                            
                            loop {
                                if (cmpne:boolean(and:int(var_4_164:int, ldc:int(1024)), ldc:int(0))) {
                                    var_4_1D1 = and:int(var_4_164:int, ldc:int(-560763775))
                                }
                                else {
                                    var_4_1D1 = and:int(var_4_164:int, ldc:int(1486138296))
                                    
                                    if (cmpeq:boolean(var_6_6C:int, ldc:int(0))) {
                                        var_11_193 = invokeinterface:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>::iterator, invokevirtual:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::\u3711\u8aa5\u7af6\u4cd9\u9255\uc910, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, var_9_122:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)))
                                        
                                        loop {
                                            var_4_1D1 = and:int(var_4_1D1:int, ldc:int(1308507582))
                                            
                                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_11_193:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>))) {
                                                looporswitchbreak()
                                            }
                                            
                                            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<String, String>(\uc2bd\u6435\u3711\u6cfe\u40a9::\uae87\ub171\ud171\u8d98\u718f\uff55, this:\uc2bd\u6435\u3711\u6cfe\u40a9), invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>.class, invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>::next, var_11_193:Iterator<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>)))))) {
                                                var_6_6C = xor:int(ldc:int(257), ldc:int(256))
                                                looporswitchbreak()
                                            }
                                            
                                            var_4_1D1 = and:int(var_4_1D1:int, ldc:int(238569912))
                                        }
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_1D1:int, ldc:int(524288)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_4_164 = and:int(var_4_1D1:int, ldc:int(-714750400))
                            }
                            
                            var_4_164 = and:int(var_4_1D1:int, ldc:int(-1927570436))
                        }
                    }
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_4_164:int, ldc:int(128)), ldc:int(0))) {
                    var_4_84 = and:int(var_4_164:int, ldc:int(-954163597))
                }
                else {
                    var_4_84 = and:int(var_4_164:int, ldc:int(977129471))
                    
                    if (cmpne:boolean(var_6_6C:int, ldc:int(0))) {
                        invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(44)))
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_84:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_164 = and:int(var_4_84:int, ldc:int(734349927))
            }
            
            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(93)))
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u8d90\u8389\u5fe1\u156b\u7e3f\ua61f(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
        var_3_105 : int
        var_5_87 : \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_6_9C : int
        var_7_A5 : int
        var_8_B3 : Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_3_C2 : int
        var_3_16B : int
        var_9_152 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        stack_187_0 : int [generated]
        stack_187_1 : int [generated]
        
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
            var_3_105 = and:int(ldc:int(481089890), ldc:int(-1881515024))
            
            if (invokevirtual:boolean(String::isEmpty, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder))) {
                var_5_87 = invokeinterface:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u1187\uc87f\u071d\u494c\u61a4\ub171, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
                
                if (cmpne:boolean(var_5_87:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, aconstnull:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>())) {
                    var_6_9C = and:int(ldc:int(-10168), ldc:int(8855))
                    var_7_A5 = and:int(ldc:int(18332), ldc:int(-18335))
                    var_8_B3 = invokeinterface:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(List<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::iterator, invokeinterface:List<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\ucef1\ub32d\u7ce1\ub70c\u6b0d\u97e6, var_5_87:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_3_105:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_C2 = and:int(var_3_105:int, ldc:int(-1924647404))
                            goto(Label_0276)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_105:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_16B = and:int(var_3_105:int, ldc:int(1671482327))
                        }
                        else {
                            var_3_16B = and:int(var_3_105:int, ldc:int(-1618116895))
                            
                            if (invokeinterface:boolean(Iterator::hasNext, var_8_B3:Iterator)) {
                                var_9_152 = checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokeinterface:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::next, var_8_B3:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
                                stack_187_0 = var_6_9C:int
                                
                                if (invokeinterface:boolean(Collection<E>::isEmpty, invokevirtual:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::\u3711\u8aa5\u7af6\u4cd9\u9255\uc910, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, var_9_152:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)))) {
                                    var_3_16B = and:int(var_3_16B:int, ldc:int(2108128242))
                                    stack_187_1 = and:int(ldc:int(-7216), ldc:int(4141))
                                }
                                else {
                                    stack_187_1 = xor:int(ldc:int(1032), ldc:int(1033))
                                }
                                
                                var_3_16B = and:int(var_3_16B:int, ldc:int(-1929675655))
                                var_6_9C = or:int(stack_187_0:int, stack_187_1:int)
                                var_7_A5 = or:boolean(var_7_A5:boolean, invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, var_9_152:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f]))
                                
                                if (logicalor:boolean(cmpeq:boolean(var_6_9C:int, ldc:int(0)), logicalnot:boolean(var_7_A5:boolean[expected:int]))) {
                                    var_3_105 = and:int(var_3_16B:int, ldc:int(-50408194))
                                    loopcontinue()
                                }
                            }
                        }
                        
                        Label_0231:
                        
                        if (cmpne:boolean(and:int(var_3_16B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_C2 = and:int(var_3_16B:int, ldc:int(830825326))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_16B:int, ldc:int(512)), ldc:int(0))) {
                                var_3_105 = and:int(var_3_16B:int, ldc:int(-110080086))
                                loopcontinue()
                            }
                            
                            var_3_C2 = and:int(var_3_16B:int, ldc:int(-1361317524))
                            
                            if (cmpne:boolean(var_6_9C:int, ldc:int(0))) {
                                invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(91)))
                            }
                        }
                        
                        Label_0276:
                        
                        if (cmpne:boolean(and:int(var_3_C2:int, ldc:int(128)), ldc:int(0))) {
                            var_3_16B = and:int(var_3_C2:int, ldc:int(-20387726))
                            goto(Label_0231)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_C2:int, ldc:int(67108864)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_3_105 = and:int(var_3_C2:int, ldc:int(114165167))
                    }
                    
                    var_3_105 = and:int(var_3_C2:int, ldc:int(519273832))
                    
                    if (cmpne:boolean(var_7_A5:boolean, ldc:boolean(0))) {
                        invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(123)))
                    }
                }
            }
            
            return:CompletableFuture<Suggestions>(invokespecial:CompletableFuture<Suggestions>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u965f\u0b8e\u12cb\u0800\u8709\ub7dc, this:\uc2bd\u6435\u3711\u6cfe\u40a9, p0:SuggestionsBuilder, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u99f7\u3a62\u7af6\ud12e\u6ec6\u6b0d(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
        var_3_61 : int
        
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
            var_3_61 = and:int(ldc:int(-1907122523), ldc:int(-1376575876))
            
            if (invokevirtual:boolean(String::isEmpty, invokevirtual:String(SuggestionsBuilder::getRemaining, p0:SuggestionsBuilder))) {
                if (logicalnot:boolean(invokeinterface:boolean(Collection<E>::isEmpty, invokevirtual:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::\u3711\u8aa5\u7af6\u4cd9\u9255\uc910, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9))))))) {
                    invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(91)))
                }
                
                var_3_61 = and:int(var_3_61:int, ldc:int(-1629835540))
                
                if (invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9)))) {
                    invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(123)))
                }
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u965f\u0b8e\u12cb\u0800\u8709\ub7dc(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
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
            return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokeinterface:Collection[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u8d90\u183a\ub171\u59ec\u836c\u8413::\u2dcc\u0b8e\u1833\u36d3\uc31c\uc7fe, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413), invokevirtual:SuggestionsBuilder(SuggestionsBuilder::add, invokevirtual:SuggestionsBuilder(SuggestionsBuilder::createOffset, p0:SuggestionsBuilder, getfield:int(\uc2bd\u6435\u3711\u6cfe\u40a9::\u6cfe\u97b7\u3dd3\u8640\u7330\ud51e, this:\uc2bd\u6435\u3711\u6cfe\u40a9)), p0:SuggestionsBuilder)))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u4c2b\u4bc8\ub19c\u759a\u446c\ud7e8(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
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
            
            if (getfield:boolean(\uc2bd\u6435\u3711\u6cfe\u40a9::\u7043\u416d\uc2e8\u8d98\u71ae\ub32d, this:\uc2bd\u6435\u3711\u6cfe\u40a9)) {
                invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokeinterface:Collection[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u8d90\u183a\ub171\u59ec\u836c\u8413::\u2dcc\u0b8e\u1833\u36d3\uc31c\uc7fe, p1:\u8d90\u183a\ub171\u59ec\u836c\u8413), p0:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(35)))
            }
            
            invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokevirtual:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::\u92ee\u4c04\u7c6b\u5db4\ud36e\u8389, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255)), p0:SuggestionsBuilder)
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\u7049\u6435\ud523\ud36e\ubcb0() {
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
    
    public void \uc246\u99f7\ucef1\uae87\uc7fe\uf995() {
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
        
        if (getfield:boolean(\uc2bd\u6435\u3711\u6cfe\u40a9::\u7043\u416d\uc2e8\u8d98\u71ae\ub32d, this:\uc2bd\u6435\u3711\u6cfe\u40a9)) {
            putfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokedynamic:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\uc2bd\u6435\u3711\u6cfe\u40a9;)Ljava/util/function/BiFunction;, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
            invokevirtual:void(StringReader::expect, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9), ldc:char(35))
            putfield:int(\uc2bd\u6435\u3711\u6cfe\u40a9::\u6cfe\u97b7\u3dd3\u8640\u7330\ud51e, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokevirtual:int(StringReader::getCursor, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9)))
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ua562\u0c95\u9af2\u9937\u3504\u12cb, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u36d3\u64ab\u4f4a\u8d90\u71f1\u51b2, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9)))
            return:void()
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\uc2bd\u6435\u3711\u6cfe\u40a9::\u0b8e\u0c95\u494c\u9937\uceb8\u7006)))
    }
    
    public void \uf94d\u120d\u88c5\ud7e8\u946b\uc29a() {
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
    
    public void \u7873\uc4d2\ucef1\u6c56\ub1b9\uc87f() {
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
    
    public void \u8389\u4d85\u52d3\u6b0d\u3dd3\u3776() {
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
            putfield:\uc31c\uc87f\uc246\u3776\ub7dc(\uc2bd\u6435\u3711\u6cfe\u40a9::\ub32d\u5db4\u7049\u8308\u4cd9\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u3e75\u6c52\u946b\u76bc\uc31c::\u6bb9\u839e\u4cd9\u8d98\u5d20\ube23, initobject:\u3e75\u6c52\u946b\u76bc\uc31c(\u3e75\u6c52\u946b\u76bc\uc31c::<init>, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6d69\u3e2a\u59ec\uc238\u5fe1\u4bc8(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0, java.lang.String p1, int p2) {
        var_6_6A : Optional<T>
        
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
        var_6_6A = invokevirtual:Optional<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u873d\uc87f\ucef1\u9033\u3bc9\u6bb9, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, p1:String)
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_6_6A:Optional<T>))) {
            invokevirtual:void(StringReader::setCursor, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9), p2:int)
            athrow(invokevirtual:CommandSyntaxException(Dynamic3CommandExceptionType::createWithContext, getstatic:Dynamic3CommandExceptionType(\uc2bd\u6435\u3711\u6cfe\u40a9::\u927d\ub18d\u4d85\u647c\ub7dc\ube23), getfield:StringReader[expected:ImmutableStringReader](\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9), invokevirtual:String[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ub113\u946b\u0b8e\u5db4\u7006\u156b, this:\uc2bd\u6435\u3711\u6cfe\u40a9)), invokevirtual:String[expected:Object](\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>), p1:String[expected:Object]))
        }
        
        putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:Object(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>](\uc2bd\u6435\u3711\u6cfe\u40a9::\u7e3f\ub70c\u40a9\u1833\u61a4\u0c95, this:\uc2bd\u6435\u3711\u6cfe\u40a9), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, checkcast:T extends Comparable<T>(T extends java.lang.Comparable<T>.class, invokevirtual:T extends Comparable<T>(Optional<T>::get, var_6_6A:Optional<T>)))))
        invokeinterface:?(Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>::put, getfield:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u494c\u516c\u7ce1\u64ab\u6b0d\u6fb0, this:\uc2bd\u6435\u3711\u6cfe\u40a9), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, invokevirtual:T extends Comparable<T>(Optional<T>::get, var_6_6A:Optional<T>))
    }
    
    public static java.lang.String toString(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_1_BB : int
        var_3_76 : StringBuilder
        var_4_A0 : int
        var_5_AC : UnmodifiableIterator
        var_6_EB : Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>
        
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
            var_1_BB = and:int(ldc:int(64474836), ldc:int(1003667653))
            var_3_76 = initobject:StringBuilder(StringBuilder::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))))
            
            if (logicalnot:boolean(invokeinterface:boolean(Collection<E>::isEmpty, invokevirtual:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\uc246\u3711\uc31c\u516c\ud171\uc84e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>])))) {
                invokevirtual:StringBuilder(StringBuilder::append, var_3_76:StringBuilder, ldc:char(91))
                var_4_A0 = and:int(ldc:int(17996), ldc:int(-22478))
                var_5_AC = invokevirtual:UnmodifiableIterator(ImmutableSet::iterator, invokevirtual:ImmutableSet(ImmutableMap::entrySet, invokevirtual:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u9af2\u61a4\u965f\u4492\u156b\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>])))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_BB:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_BB = and:int(var_1_BB:int, ldc:int(-1612792943))
                        
                        if (invokeinterface:boolean(Iterator::hasNext, var_5_AC:UnmodifiableIterator)) {
                            var_6_EB = checkcast:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>(java.util.Map.Entry<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>.class, invokeinterface:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>(Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>::next, var_5_AC:Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>))
                            
                            if (cmpne:boolean(var_4_A0:int, ldc:int(0))) {
                                invokevirtual:StringBuilder(StringBuilder::append, var_3_76:StringBuilder, ldc:char(44))
                            }
                            
                            var_1_BB = and:int(var_1_BB:int, ldc:int(1140054013))
                            invokestatic:void(\uc2bd\u6435\u3711\u6cfe\u40a9::\u0c95\uc2bd\uc87f\u946b\ub70c\u16f6, var_3_76:StringBuilder, checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>.class, invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>(Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>::getKey, var_6_EB:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>)), checkcast:Comparable<?>(java.lang.Comparable<?>.class, invokeinterface:V(Entry<K, V>::getValue, var_6_EB:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>)))
                            var_4_A0 = xor:int(ldc:int(424), ldc:int(425))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_1_BB:int, ldc:int(33554432)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_BB = and:int(var_1_BB:int, ldc:int(-1344888687))
                invokevirtual:StringBuilder(StringBuilder::append, var_3_76:StringBuilder, ldc:char(93))
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_3_76:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static void \u0c95\uc2bd\uc87f\u946b\ub70c\u16f6(java.lang.StringBuilder p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p1, java.lang.Comparable<?> p2) {
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
            invokevirtual:StringBuilder(StringBuilder::append, p0:StringBuilder, invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, p1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d))
            invokevirtual:StringBuilder(StringBuilder::append, p0:StringBuilder, ldc:char(61))
            invokevirtual:StringBuilder(StringBuilder::append, p0:StringBuilder, invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, p1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, p2:T extends Comparable<T>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \ub6ab\uc2e8\u1187\u8308\u2dcc\u56bd(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p1) {
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
            return:CompletableFuture<Suggestions>(checkcast:CompletableFuture<Suggestions>(java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions>.class, invokeinterface:CompletableFuture<Suggestions>(BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>::apply, getfield:BiFunction<SuggestionsBuilder, \u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, CompletableFuture<Suggestions>>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u4975\ud7e8\u965f\ud158\u6435\u446c, this:\uc2bd\u6435\u3711\u6cfe\u40a9), invokevirtual:SuggestionsBuilder(SuggestionsBuilder::createOffset, p0:SuggestionsBuilder, invokevirtual:int(StringReader::getCursor, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9))), p1:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.lang.String> \u385b\u67d0\ub18d\u0a06\ub1b9\ubcb0() {
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
            return:Map<String, String>(getfield:Map<String, String>(\uc2bd\u6435\u3711\u6cfe\u40a9::\uae87\ub171\ud171\u8d98\u718f\uff55, this:\uc2bd\u6435\u3711\u6cfe\u40a9))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture lambda$\uc238\uf94d\u7d52\u8bb0\ua068\u120d$8(java.lang.String p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413 p2) {
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
            return:CompletableFuture(invokespecial:CompletableFuture<Suggestions>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u385b\u93a2\u965f\u4daf\u516c\ube23, this:\uc2bd\u6435\u3711\u6cfe\u40a9, p1:SuggestionsBuilder, p2:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, p0:String))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\uc84e\ubded\u8aa5\u4ab3\u93a2\u7bad$7(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413 p2) {
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
            return:CompletableFuture(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, invokestatic:SuggestionsBuilder(\uc2bd\u6435\u3711\u6cfe\u40a9::\u56bd\uc7fe\u1833\u8308\ud12e\u4f52, p1:SuggestionsBuilder, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>)))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.brigadier.exceptions.CommandSyntaxException lambda$\u5654\u7ce1\u8c8a\ubded\u183a\ubf56$6(int p0) {
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
            invokevirtual:void(StringReader::setCursor, getfield:StringReader(\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9), p0:int)
            return:CommandSyntaxException(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::createWithContext, getstatic:DynamicCommandExceptionType(\uc2bd\u6435\u3711\u6cfe\u40a9::\u51fa\u56bd\u3d4b\u8aa5\ub6ab\uf9c5), getfield:StringReader[expected:ImmutableStringReader](\uc2bd\u6435\u3711\u6cfe\u40a9::\uceb8\u8308\u071d\u4ab3\u7873\u5654, this:\uc2bd\u6435\u3711\u6cfe\u40a9), invokevirtual:String[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc2bd\u6435\u3711\u6cfe\u40a9::\ub113\u946b\u0b8e\u5db4\u7006\u156b, this:\uc2bd\u6435\u3711\u6cfe\u40a9))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u4daf\u6ec6\ud158\u624e\u74b1\u9af2$5(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413 p1) {
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
            return:CompletableFuture(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u8640\u5fe1\ua068\u9937\u6198\uc246$4(java.lang.Object p0, java.lang.Object p1) {
        stack_8F_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_8F_1 = loadelement:String(getstatic:String[](\uc2bd\u6435\u3711\u6cfe\u40a9::\u516c\u494c\u3dd3\u385b\u5140\u51fa), and:int(ldc:int(1449), ldc:int(593)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-30719), ldc:int(-30717)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-14081), ldc:int(14080)), p0:Object)
            storeelement:Object(expr_78:Object[], and:int(ldc:int(2703), ldc:int(13329)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\uc84e\u071d\uff55\u92ff\u446c\u0b8e$3(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2) {
        stack_99_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_99_1 = loadelement:String(getstatic:String[](\uc2bd\u6435\u3711\u6cfe\u40a9::\u516c\u494c\u3dd3\u385b\u5140\u51fa), xor:int(ldc:int(3712), ldc:int(3714)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(18570), ldc:int(18569)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-22733), ldc:int(22728)), p0:Object)
            storeelement:Object(expr_78:Object[], xor:int(ldc:int(9236), ldc:int(9237)), p2:Object)
            storeelement:Object(expr_78:Object[], and:int(ldc:int(8323), ldc:int(598)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_99_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\uafe7\u6b5f\ubff1\u51fa\u4d85\u51b2$2(java.lang.Object p0, java.lang.Object p1) {
        stack_8F_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_8F_1 = loadelement:String(getstatic:String[](\uc2bd\u6435\u3711\u6cfe\u40a9::\u516c\u494c\u3dd3\u385b\u5140\u51fa), xor:int(ldc:int(8450), ldc:int(8449)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(1793), ldc:int(1795)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(3749), ldc:int(-11942)), p1:Object)
            storeelement:Object(expr_78:Object[], xor:int(ldc:int(16386), ldc:int(16387)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\ubf56\u7873\ua3b4\uc29a\ua068\u600f$1(java.lang.Object p0, java.lang.Object p1) {
        stack_8F_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_8F_1 = loadelement:String(getstatic:String[](\uc2bd\u6435\u3711\u6cfe\u40a9::\u516c\u494c\u3dd3\u385b\u5140\u51fa), xor:int(ldc:int(18960), ldc:int(18964)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(8482), ldc:int(8480)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(5927), ldc:int(-5928)), p0:Object)
            storeelement:Object(expr_78:Object[], and:int(ldc:int(24385), ldc:int(161)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u600f\u51b2\u3504\u3d64\u3a62\u7006$0(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\uc2bd\u6435\u3711\u6cfe\u40a9::\u516c\u494c\u3dd3\u385b\u5140\u51fa), and:int(ldc:int(2959), ldc:int(4101)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(13353), ldc:int(2309)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(2900), ldc:int(-2903)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
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
    
    public void \u7873\uc9f6\u836c\u3d64\uc84e\u7873(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_689 : int
        
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
        var_3_67E = and:int(ldc:int(1779805864), ldc:int(-906103025))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc2bd\u6435\u3711\u6cfe\u40a9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_67E = and:int(var_3_67E:int, ldc:int(1587443088))
            var_5_81 = and:int(ldc:int(6289), ldc:int(-14486))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1418), ldc:int(-2012)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_67E:int, ldc:int(1937764279))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(16407), ldc:int(2401)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(2053), ldc:int(13729)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_67E = and:int(var_3_D1:int, ldc:int(-996874572))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(5154), ldc:int(5155)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-789175257))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-425865506))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-466164822))
                    }
                    else {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-674455))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1094896253))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1356608863))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(123084551))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-999890846))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(54297359))
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-726305084))
                        var_11_E2 = and:int(ldc:int(-11529), ldc:int(11528))
                        goto(Label_1529)
                    }
                    
                    Label_0568:
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(131387867))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1408258753))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(423732559))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(619642162))
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-438947946))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1156849805))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1280672859))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1124104353))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1774187880))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0815:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-683258180))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-803661677))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1235937595))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1488602284))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-2079849354))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1672767278))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(12816), ldc:int(12817))
                                goto(Label_1117)
                            }
                        }
                    }
                    
                    Label_0949:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1865496692))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(203833043))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(674732522))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(88506630))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1725563734))
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-285741113))
                        var_11_E2 = and:int(ldc:int(-25206), ldc:int(25173))
                    }
                    
                    Label_1117:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-535782309))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(249696977))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-46471426))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1673373673))
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-551840232))
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-762658766))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-1273069112))
                            loopcontinue()
                        }
                        
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1377661969))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1385)
                            }
                        }
                    }
                    
                    Label_1267:
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1117)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(940151089))
                            goto(Label_0949)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(1795882932))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67E = and:int(var_3_67E:int, ldc:int(-559993352))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1529)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1385:
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1614380721))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1444835798))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1471126752))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1986254135))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(1338943687))
                        loopcontinue()
                    }
                    
                    var_3_67E = and:int(var_3_67E:int, ldc:int(1280589811))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1529:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_689 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1540:
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-98779575))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1014632258))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(763810682))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(-1441801036))
                        goto(Label_0393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67E = and:int(var_3_67E:int, ldc:int(2052374117))
                        var_17_689 = add:int(var_16_110:int, xor:int(ldc:int(-32716), ldc:int(-32715)))
                        looporswitchbreak()
                    }
                    
                    var_3_67E = and:int(var_3_67E:int, ldc:int(-501138813))
                }
                
                var_3_67E = and:int(var_3_67E:int, ldc:int(-109056038))
                
                if (cmple:boolean(var_5_81 = var_17_689:int, sub:int(var_6_88:int, xor:int(ldc:int(25104), ldc:int(25105))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_67E:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
