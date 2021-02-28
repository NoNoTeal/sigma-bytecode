public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u8bb0\u4975\ub7dc\u47c2\u3e75 {
    public void \u8bb0\u4975\ub7dc\u47c2\u3e75(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, int p1, \u56bd\u8413\u647c\u5bc4\ud158.\ube23\u51b2\u92ee\u6435\u8308\u1833 p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8aa5\u647c\ubded\u516c\u4c2b p3, \u6435\ub8be\u718f\u6b0d\u67e9.\u7330\u6435\u4daf\u4975\ub32d p4) {
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
            invokespecial:Object(Object::<init>, this:\u8bb0\u4975\ub7dc\u47c2\u3e75)
            putfield:AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uf9c5\u1187\ub8be\u1833\u0c95\u1187, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, initobject:AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>(AtomicReferenceArray<E>::<init>, invokeinterface:int(List<E>::size, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u516c\u8aa5\uc246\u6c56\ubff1\u3d4b))))
            putfield:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u5140\u8d98\u9af2\u56bd\u5654\ub8be, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, getstatic:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ufe34\u3711\u6d99\uc31c\ua61f\u62da))
            putfield:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u6b5f\u3776\u4179\u960f\u4ab3\u7d52, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, getstatic:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ufe34\u3711\u6d99\uc31c\ua61f\u62da))
            putfield:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u1187\u3d64\u34df\u97e6\ub113\u873d, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, getstatic:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ufe34\u3711\u6d99\uc31c\ua61f\u62da))
            putfield:CompletableFuture<\u8aa5\ubded\ub18d\u4f4a\u4f52>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u47c2\u1187\u8709\uc29a\u5140\ube23, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, invokestatic:CompletableFuture<\u8aa5\ubded\ub18d\u4f4a\u4f52>(CompletableFuture<T>::completedFuture, checkcast:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52.class, aconstnull:\u8aa5\ubded\ub18d\u4f4a\u4f52())))
            putfield:ShortSet[](\u8bb0\u4975\ub7dc\u47c2\u3e75::\u7ce1\u527a\u9a18\u99f7\ud7e8\u873d, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, newarray:ShortSet[](it.unimi.dsi.fastutil.shorts.ShortSet.class, ldc:int(16)))
            putfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u61a4\ua068\ub32d\u92ee\u416d\ucfaf, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
            putfield:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u9937\ud523\u7ce1\u7bad\u7bad\u8c8a, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p2:\ube23\u51b2\u92ee\u6435\u8308\u1833)
            putfield:\u8aa5\u647c\ubded\u516c\u4c2b(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u12b2\uc229\u4f52\u8640\ucb79\ufe34, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p3:\u8aa5\u647c\ubded\u516c\u4c2b)
            putfield:\u7330\u6435\u4daf\u4975\ub32d(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u5140\u8389\u3e75\u47c2\u624e\ubded, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p4:\u7330\u6435\u4daf\u4975\ub32d)
            putfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u183a\u71f1\u4c04\u5f50\u3bc9\u6fb0, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, add:int(getstatic:int(\uc246\u156b\u7ce1\u3d64\u7873::\u600f\u6d99\ud523\u97b7\ubb2b\u98a4), xor:int(ldc:int(-32766), ldc:int(-32765))))
            putfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc7fe\u446c\uc31c\u4ab3\u6bb9\uc238, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u183a\u71f1\u4c04\u5f50\u3bc9\u6fb0, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
            putfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc2bd\uc910\u0a06\ub171\u8aa5\ua562, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u183a\u71f1\u4c04\u5f50\u3bc9\u6fb0, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
            invokevirtual:void(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ubded\u8640\uae87\u3d4b\u416d\uff55, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \u3e2a\uc229\u3d64\ud7e8\u1187\u8389(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0) {
        var_2_5F : int
        var_4_6E : CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>
        stack_8B_0 : CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>> [generated]
        
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
            var_2_5F = and:int(ldc:int(-1893853503), ldc:int(1834651640))
            var_4_6E = checkcast:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>>.class, invokevirtual:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>::get, getfield:AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uf9c5\u1187\ub8be\u1833\u0c95\u1187, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), invokevirtual:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u99f7\u527a\ubded\u12b2\ud158\u8bb0, p0:\ucb79\u7ce1\ubded\u3d64\ub171)))
            
            if (cmpne:boolean(var_4_6E:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>, aconstnull:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1041944520))
                stack_8B_0 = var_4_6E:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>
            }
            else {
                stack_8B_0 = getstatic:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ubcb0\ub32d\u9255\ucef1\u36d3\u960f)
            }
            
            return:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(stack_8B_0:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \ub102\u2dcc\ubb2b\u4f4a\uc2e8\u76bc(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0) {
        var_2_5F : int
        stack_87_0 : CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>> [generated]
        
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
            var_2_5F = and:int(ldc:int(1538477070), ldc:int(-554605491))
            
            if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, invokestatic:\ucb79\u7ce1\ubded\u3d64\ub171(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u392e\ud12e\u0b8e\u97b7\u156b\u759a, getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc7fe\u446c\uc31c\u4ab3\u6bb9\uc238, this:\u8bb0\u4975\ub7dc\u47c2\u3e75)), p0:\ucb79\u7ce1\ubded\u3d64\ub171))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1857562412))
                stack_87_0 = getstatic:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ubcb0\ub32d\u9255\ucef1\u36d3\u960f)
            }
            else {
                stack_87_0 = invokevirtual:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u3e2a\uc229\u3d64\ud7e8\u1187\u8389, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p0:\ucb79\u7ce1\ubded\u3d64\ub171)
            }
            
            return:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(stack_87_0:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \ub102\u74b1\ubf56\u12cb\u51b2\u7006() {
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
            return:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(getfield:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u6b5f\u3776\u4179\u960f\u4ab3\u7d52, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \u4f4a\u983f\ubb2b\ub1b9\u64ab\u6cfe() {
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
            return:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(getfield:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u1187\u3d64\u34df\u97e6\ub113\u873d, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \ud4fe\u7ce1\u3d4b\u5d20\u3bc9\u6198() {
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
            return:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(getfield:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u5140\u8d98\u9af2\u56bd\u5654\ub8be, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e \uafe7\u8350\u3a62\u6b0d\uae5d\ucef1() {
        var_4_70 : Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>
        
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
            var_4_70 = checkcast:Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>(com.mojang.datafixers.util.Either<\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>.class, invokevirtual:Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>(CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>::getNow, invokevirtual:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ub102\u74b1\ubf56\u12cb\u51b2\u7006, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), checkcast:Either(com.mojang.datafixers.util.Either.class, aconstnull:Either())))
            return:\ud523\u92ff\ubb2b\u759a\ud36e(ternaryop:\ud523\u92ff\ubb2b\u759a\ud36e(cmpne:boolean(var_4_70:Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>, aconstnull:Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>()), checkcast:\ud523\u92ff\ubb2b\u759a\ud36e(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e.class, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(Optional<\ud523\u92ff\ubb2b\u759a\ud36e>::orElse, invokevirtual:Optional(Either::left, var_4_70:Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>), checkcast:\ud523\u92ff\ubb2b\u759a\ud36e(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e.class, aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e()))), aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e()))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \ube23\u183a\uc84e\u92ff\u647c\u97e6() {
        var_1_5F : int
        var_3_70 : int
        var_4_9F : \ucb79\u7ce1\ubded\u3d64\ub171
        
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
        var_1_5F = and:int(ldc:int(-28012732), ldc:int(1045737357))
        var_3_70 = sub:int(invokeinterface:int(List<E>::size, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u516c\u8aa5\uc246\u6c56\ubff1\u3d4b)), xor:int(ldc:int(2056), ldc:int(2057)))
        
        loop {
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(268435456)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2088074167))
                
                if (cmpge:boolean(var_3_70:int, ldc:int(0))) {
                    var_4_9F = checkcast:\ucb79\u7ce1\ubded\u3d64\ub171(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171.class, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(List<\ucb79\u7ce1\ubded\u3d64\ub171>::get, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u516c\u8aa5\uc246\u6c56\ubff1\u3d4b), var_3_70:int))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(Either::left, checkcast:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>.class, invokevirtual:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>::getNow, invokevirtual:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u3e2a\uc229\u3d64\ud7e8\u1187\u8389, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, var_4_9F:\ucb79\u7ce1\ubded\u3d64\ub171), getstatic:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u6fb0\u69d9\u3e75\u624e\u3bd6\u7049))))))) {
                        var_1_5F = and:int(var_1_5F:int, ldc:int(-25241306))
                        inc:int(var_3_70, ldc:int(-1))
                        loopcontinue()
                    }
                    
                    return:\ucb79\u7ce1\ubded\u3d64\ub171(var_4_9F:\ucb79\u7ce1\ubded\u3d64\ub171)
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(524288)), ldc:int(0))) {
                return:\ucb79\u7ce1\ubded\u3d64\ub171(aconstnull:\ucb79\u7ce1\ubded\u3d64\ub171())
            }
        }
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 \u527a\u8640\u4492\ua068\u392e\u47c2() {
        var_1_5F : int
        var_3_70 : int
        var_5_A7 : CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>
        var_6_CE : Optional
        
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
        var_1_5F = and:int(ldc:int(894048387), ldc:int(2112944615))
        var_3_70 = sub:int(invokeinterface:int(List<E>::size, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u516c\u8aa5\uc246\u6c56\ubff1\u3d4b)), and:int(ldc:int(9841), ldc:int(22785)))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2105327359))
                
                if (cmpge:boolean(var_3_70:int, ldc:int(0))) {
                    var_5_A7 = invokevirtual:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u3e2a\uc229\u3d64\ud7e8\u1187\u8389, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, checkcast:\ucb79\u7ce1\ubded\u3d64\ub171(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171.class, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(List<\ucb79\u7ce1\ubded\u3d64\ub171>::get, getstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u516c\u8aa5\uc246\u6c56\ubff1\u3d4b), var_3_70:int)))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(CompletableFuture::isCompletedExceptionally, var_5_A7:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>))) {
                        var_6_CE = invokevirtual:Optional(Either::left, checkcast:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>.class, invokevirtual:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>::getNow, var_5_A7:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>, getstatic:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u6fb0\u69d9\u3e75\u624e\u3bd6\u7049))))
                        
                        if (invokevirtual:boolean(Optional::isPresent, var_6_CE:Optional)) {
                            return:\u8aa5\ubded\ub18d\u4f4a\u4f52(checkcast:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52.class, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(Optional<\u8aa5\ubded\ub18d\u4f4a\u4f52>::get, var_6_CE:Optional<\u8aa5\ubded\ub18d\u4f4a\u4f52>)))
                        }
                    }
                    
                    var_1_5F = and:int(var_1_5F:int, ldc:int(2130065887))
                    inc:int(var_3_70, ldc:int(-1))
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(2)), ldc:int(0))) {
                return:\u8aa5\ubded\ub18d\u4f4a\u4f52(aconstnull:\u8aa5\ubded\ub18d\u4f4a\u4f52())
            }
        }
    }
    
    public java.util.concurrent.CompletableFuture<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52> \ucfaf\u839e\u4d85\u64f2\u7e3f\ub83f() {
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
            return:CompletableFuture<\u8aa5\ubded\ub18d\u4f4a\u4f52>(getfield:CompletableFuture<\u8aa5\ubded\ub18d\u4f4a\u4f52>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u47c2\u1187\u8709\uc29a\u5140\ube23, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
        }
        
        goto(Label_0006)
    }
    
    public void \u99f7\u3776\u1187\u5d20\u93a2\u7006(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_5F : int
        var_5_7E : byte
        
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
            var_2_5F = and:int(ldc:int(1201795106), ldc:int(-694027109))
            
            if (cmpne:boolean(invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uafe7\u8350\u3a62\u6b0d\uae5d\ucef1, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e())) {
                var_5_7E = i2b:byte(invokestatic:int(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u1187\u4f4a\u527a\u4bc8\u156b\u4492, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                
                if (cmpeq:boolean(loadelement:ShortSet(getfield:ShortSet[](\u8bb0\u4975\ub7dc\u47c2\u3e75::\u7ce1\u527a\u9a18\u99f7\ud7e8\u873d, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), var_5_7E:byte[expected:int]), aconstnull:ShortSet())) {
                    putfield:boolean(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u4ab3\ua3b4\u7330\u120d\u7c6b\u3e75, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, xor:int[expected:boolean](ldc:int(18), ldc:int(19)))
                    storeelement:ShortSet(getfield:ShortSet[](\u8bb0\u4975\ub7dc\u47c2\u3e75::\u7ce1\u527a\u9a18\u99f7\ud7e8\u873d, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), var_5_7E:byte[expected:int], initobject:ShortArraySet[expected:ShortSet](ShortArraySet::<init>))
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1546010))
                invokeinterface:boolean(ShortSet::add, loadelement:ShortSet(getfield:ShortSet[](\u8bb0\u4975\ub7dc\u47c2\u3e75::\u7ce1\u527a\u9a18\u99f7\ud7e8\u873d, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), var_5_7E:byte[expected:int]), invokestatic:short(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\u3d4b\u5654\u4492\u0800\uc910\u527a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\u3d4b\u0b8e\u9255\u0800\u6b5f(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u3a62\u7330\uafe7\u5db4\u12cb p0, int p1) {
        var_3_61 : int
        var_5_66 : \ud523\u92ff\ubb2b\u759a\ud36e
        
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
            var_3_61 = and:int(ldc:int(1109236439), ldc:int(1308311455))
            var_5_66 = invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uafe7\u8350\u3a62\u6b0d\uae5d\ucef1, this:\u8bb0\u4975\ub7dc\u47c2\u3e75)
            
            if (cmpne:boolean(var_5_66:\ud523\u92ff\ubb2b\u759a\ud36e, aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e())) {
                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u3711\u839e\u3a62\ubff1\ub102\u7e3f, var_5_66:\ud523\u92ff\ubb2b\u759a\ud36e, xor:int[expected:boolean](ldc:int(16645), ldc:int(16644)))
                
                if (cmpne:boolean(p0:\u3a62\u7330\uafe7\u5db4\u12cb, getstatic:\u3a62\u7330\uafe7\u5db4\u12cb(\u3a62\u7330\uafe7\u5db4\u12cb::\u836c\ud4fe\uc2e8\u3504\u6d69\u3504))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1883035279))
                    putfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u3e75\u6cfe\u3d64\uae5d\uae5d\u40a9, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, or:int(getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u3e75\u6cfe\u3d64\uae5d\uae5d\u40a9, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), shl:int(and:int(ldc:int(1), ldc:int(20679)), sub:int(p1:int, ldc:int(-1)))))
                }
                else {
                    putfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u34df\u600f\u56bd\u760c\u8258\u6d69, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, or:int(getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u34df\u600f\u56bd\u760c\u8258\u6d69, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), shl:int(and:int(ldc:int(257), ldc:int(3)), sub:int(p1:int, ldc:int(-1)))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7043\u3776\u64f2\u12b2\ud4fe\u3bc9(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e p0) {
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
    
    private void \ubefe\u40a9\u183a\u7ce1\ubff1\uc3e3(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
            
            if (invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                invokespecial:void(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u99f7\u960f\u4c2b\u52d3\u0c95\u516c, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u99f7\u960f\u4c2b\u52d3\u0c95\u516c(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        var_5_67 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_6_7E : \u34df\u760c\u12b2\u3e2a\u98a4
        
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
            var_5_67 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (cmpne:boolean(var_5_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                var_6_7E = invokevirtual:\u34df\u760c\u12b2\u3e2a\u98a4(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u759a\ub19c\u64f2\uae87\u4179\u0a06, var_5_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                
                if (cmpne:boolean(var_6_7E:\u34df\u760c\u12b2\u3e2a\u98a4, aconstnull:\u34df\u760c\u12b2\u3e2a\u98a4())) {
                    invokespecial:void(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u7006\u946b\u97b7\uae5d\u983f\uff55, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, var_6_7E:\u34df\u760c\u12b2\u3e2a\u98a4[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>], and:int[expected:boolean](ldc:int(-23973), ldc:int(3492)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7006\u946b\u97b7\uae5d\u983f\uff55(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0, boolean p1) {
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
    
    public java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> \ua61f\u8709\u8cae\u946b\u3776\ud36e(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\uc246\u156b\u7ce1\u3d64\u7873 p1) {
        var_3_E9 : int
        var_5_66 : int
        var_6_74 : CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>
        var_7_FF : Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>
        var_7_132 : CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>
        stack_158_0 : CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>> [generated]
        
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
            var_3_E9 = and:int(ldc:int(-1339162782), ldc:int(-237507813))
            var_5_66 = invokevirtual:int(\ucb79\u7ce1\ubded\u3d64\ub171::\u99f7\u527a\ubded\u12b2\ud158\u8bb0, p0:\ucb79\u7ce1\ubded\u3d64\ub171)
            var_6_74 = checkcast:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>>.class, invokevirtual:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>::get, getfield:AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uf9c5\u1187\ub8be\u1833\u0c95\u1187, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), var_5_66:int))
            
            if (cmpne:boolean(var_6_74:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>, aconstnull:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>())) {
                var_7_FF = checkcast:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>.class, invokevirtual:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>::getNow, var_6_74:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>, checkcast:Either(com.mojang.datafixers.util.Either.class, aconstnull:Either())))
                
                if (logicalor:boolean(cmpeq:boolean(var_7_FF:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>, aconstnull:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>()), invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(Either::left, var_7_FF:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>)))) {
                    return:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(var_6_74:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>)
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_E9:int, ldc:int(512)), ldc:int(0))) {
                    var_3_E9 = and:int(var_3_E9:int, ldc:int(-788959039))
                    goto(Label_0213)
                }
                
                if (cmpne:boolean(and:int(var_3_E9:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_E9 = and:int(var_3_E9:int, ldc:int(2089545947))
                }
                else {
                    var_3_E9 = and:int(var_3_E9:int, ldc:int(-1551390049))
                    
                    if (invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, invokestatic:\ucb79\u7ce1\ubded\u3d64\ub171(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u392e\ud12e\u0b8e\u97b7\u156b\u759a, getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc7fe\u446c\uc31c\u4ab3\u6bb9\uc238, this:\u8bb0\u4975\ub7dc\u47c2\u3e75)), p0:\ucb79\u7ce1\ubded\u3d64\ub171)) {
                        var_7_132 = invokevirtual:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\uc246\u156b\u7ce1\u3d64\u7873::\u3bd6\u3776\uc7fe\u8709\u40a9\u983f, p1:\uc246\u156b\u7ce1\u3d64\u7873, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p0:\ucb79\u7ce1\ubded\u3d64\ub171)
                        invokespecial:void(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u67e9\u6d69\uc87f\u0a06\uc87f\u6c52, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, var_7_132:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>)
                        invokevirtual:void(AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>::set, getfield:AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uf9c5\u1187\ub8be\u1833\u0c95\u1187, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), var_5_66:int, var_7_132:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>)
                        return:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(var_7_132:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>)
                    }
                }
                
                Label_0177:
                
                if (cmpeq:boolean(and:int(var_3_E9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_E9 = and:int(var_3_E9:int, ldc:int(137999892))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_E9:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_E9 = and:int(var_3_E9:int, ldc:int(924171986))
                    
                    if (cmpeq:boolean(var_6_74:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>, aconstnull:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>())) {
                        stack_158_0 = getstatic:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ubcb0\ub32d\u9255\ucef1\u36d3\u960f)
                        looporswitchbreak()
                    }
                }
                
                Label_0213:
                
                if (cmpne:boolean(and:int(var_3_E9:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0177)
                }
                
                if (cmpeq:boolean(and:int(var_3_E9:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_E9 = and:int(var_3_E9:int, ldc:int(632160167))
                    stack_158_0 = var_6_74:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>
                    looporswitchbreak()
                }
            }
            
            return:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(stack_158_0:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>)
        }
        
        goto(Label_0006)
    }
    
    private void \u67e9\u6d69\uc87f\u0a06\uc87f\u6c52(java.util.concurrent.CompletableFuture<? extends com.mojang.datafixers.util.Either<? extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>> p0) {
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
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uf9c5\u5140\ud158\u4492\u3dd3 \uc2bd\ubcb0\u3bc9\u927d\u965f\u7330() {
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
            return:\uf9c5\u5140\ud158\u4492\u3dd3(invokestatic:\uf9c5\u5140\ud158\u4492\u3dd3(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u7049\uc29a\u5fe1\uc246\u3bd6\u36d3, getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc7fe\u446c\uc31c\u4ab3\u6bb9\uc238, this:\u8bb0\u4975\ub7dc\u47c2\u3e75)))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c \ua6bd\u93a2\ucfaf\u97b7\u61a4\u8709() {
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
            return:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u61a4\ua068\ub32d\u92ee\u416d\ucfaf, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
        }
        
        goto(Label_0006)
    }
    
    public int \u4ab3\u40a9\ube23\u965f\ud51e\u7e3f() {
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
            return:int(getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc7fe\u446c\uc31c\u4ab3\u6bb9\uc238, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
        }
        
        goto(Label_0006)
    }
    
    public int \u16f6\u7d52\ua6bd\u8c8a\u7e3f\u69d9() {
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
            return:int(getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc2bd\uc910\u0a06\ub171\u8aa5\ua562, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
        }
        
        goto(Label_0006)
    }
    
    private void \ub171\ufe34\u8df4\u4bc8\u3a62\u52d3(int p0) {
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
            putfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc2bd\uc910\u0a06\ub171\u8aa5\ua562, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u8640\uae87\u3d4b\u416d\uff55(int p0) {
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
            putfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc7fe\u446c\uc31c\u4ab3\u6bb9\uc238, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ube23\u69d9\u4492\uc910\u7e3f\u5fe1(\u71f1\uc910\u3bc9\u516c\u93a2.\uc246\u156b\u7ce1\u3d64\u7873 p0) {
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
    
    public static \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \u392e\ud12e\u0b8e\u97b7\u156b\u759a(int p0) {
        var_1_61 : int
        stack_85_0 : \ucb79\u7ce1\ubded\u3d64\ub171 [generated]
        
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
            var_1_61 = and:int(ldc:int(-1890987823), ldc:int(-841281801))
            
            if (cmpge:boolean(p0:int, ldc:int(33))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1382238081))
                stack_85_0 = invokestatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u67e9\uc238\ufe34\u4d85\u16f6\u965f, sub:int(p0:int, ldc:int(33)))
            }
            else {
                stack_85_0 = getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068)
            }
            
            return:\ucb79\u7ce1\ubded\u3d64\ub171(stack_85_0:\ucb79\u7ce1\ubded\u3d64\ub171)
        }
        
        goto(Label_0006)
    }
    
    public static \u59ec\u8413\u97e6\uc229\u3776.\uf9c5\u5140\ud158\u4492\u3dd3 \u7049\uc29a\u5fe1\uc246\u3bd6\u36d3(int p0) {
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
            return:\uf9c5\u5140\ud158\u4492\u3dd3(loadelement:\uf9c5\u5140\ud158\u4492\u3dd3(getstatic:\uf9c5\u5140\ud158\u4492\u3dd3[](\u8bb0\u4975\ub7dc\u47c2\u3e75::\u446c\u4f52\u6d69\u8389\u97b7\u0a06), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, add:int(sub:int(ldc:int(33), p0:int), xor:int(ldc:int(-27136), ldc:int(-27135))), and:int(ldc:int(22548), ldc:int(-23704)), sub:int(arraylength:int(getstatic:\uf9c5\u5140\ud158\u4492\u3dd3[](\u8bb0\u4975\ub7dc\u47c2\u3e75::\u446c\u4f52\u6d69\u8389\u97b7\u0a06)), xor:int(ldc:int(657), ldc:int(656))))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u516c\uc7fe\u6d99\u527a\u4975\uc2bd() {
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
            return:boolean(getfield:boolean(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u3dd3\u6bb9\u0c95\u516c\u836c\u3e75, this:\u8bb0\u4975\ub7dc\u47c2\u3e75))
        }
        
        goto(Label_0006)
    }
    
    public void \u3711\u071d\uae5d\ub8be\u516c\ucef1() {
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
            putfield:boolean(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u3dd3\u6bb9\u0c95\u516c\u836c\u3e75, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, invokevirtual:boolean(\uf9c5\u5140\ud158\u4492\u3dd3::\u72f1\ud12e\uc7fe\u4c2b\u516c\uc246, invokestatic:\uf9c5\u5140\ud158\u4492\u3dd3(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u7049\uc29a\u5fe1\uc246\u3bd6\u36d3, getfield:int(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uc7fe\u446c\uc31c\u4ab3\u6bb9\uc238, this:\u8bb0\u4975\ub7dc\u47c2\u3e75)), getstatic:\uf9c5\u5140\ud158\u4492\u3dd3(\uf9c5\u5140\ud158\u4492\u3dd3::\u120d\u7330\u98a4\u7043\u8389\u446c)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u8258\u7bad\u416d\u1187\ud51e(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ud217\ub83f\u965f\u7043\u0a06 p0) {
        var_2_61 : int
        var_4_69 : int
        var_2_78 : int
        var_5_C3 : CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>
        var_6_E8 : Optional
        
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
            var_2_61 = and:int(ldc:int(-1266004640), ldc:int(-1121360289))
            var_4_69 = and:int(ldc:int(25658), ldc:int(-25787))
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_78 = and:int(var_2_61:int, ldc:int(-1638191200))
                }
                else {
                    var_2_78 = and:int(var_2_61:int, ldc:int(-10578218))
                    
                    if (cmplt:boolean(var_4_69:int, invokevirtual:int(AtomicReferenceArray<E>::length, getfield:AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uf9c5\u1187\ub8be\u1833\u0c95\u1187, this:\u8bb0\u4975\ub7dc\u47c2\u3e75)))) {
                        var_5_C3 = checkcast:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(java.util.concurrent.CompletableFuture<com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>>.class, invokevirtual:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>::get, getfield:AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uf9c5\u1187\ub8be\u1833\u0c95\u1187, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), var_4_69:int))
                        
                        if (cmpne:boolean(var_5_C3:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>, aconstnull:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>())) {
                            var_6_E8 = invokevirtual:Optional(Either::left, checkcast:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87>.class, invokevirtual:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>::getNow, var_5_C3:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>, getstatic:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u6fb0\u69d9\u3e75\u624e\u3bd6\u7049))))
                            
                            if (invokevirtual:boolean(Optional::isPresent, var_6_E8:Optional)) {
                                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049.class, invokevirtual:Object(Optional::get, var_6_E8:Optional))) {
                                    invokevirtual:void(AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>::set, getfield:AtomicReferenceArray<CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\uf9c5\u1187\ub8be\u1833\u0c95\u1187, this:\u8bb0\u4975\ub7dc\u47c2\u3e75), var_4_69:int, invokestatic:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(CompletableFuture<T>::completedFuture, invokestatic:Either(Either::left, p0:\ud217\ub83f\u965f\u7043\u0a06[expected:Object])))
                                }
                            }
                        }
                        
                        var_2_61 = and:int(var_2_78:int, ldc:int(990775056))
                        inc:int(var_4_69, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_78:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_78:int, ldc:int(-62151073))
            }
            
            invokespecial:void(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u67e9\u6d69\uc87f\u0a06\uc87f\u6c52, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, invokestatic:CompletableFuture<Either>(CompletableFuture<T>::completedFuture, invokestatic:Either(Either::left, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e[expected:Object](\ud217\ub83f\u965f\u7043\u0a06::\u760c\u8bb0\uc910\u385b\u7873\u385b, p0:\ud217\ub83f\u965f\u7043\u0a06))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Either lambda$\u120d\u4179\u7ce1\u97e6\u8aa5\u4492$5(\u71f1\uc910\u3bc9\u516c\u93a2.\uc246\u156b\u7ce1\u3d64\u7873 p0, com.mojang.datafixers.util.Either p1) {
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
            return:Either(invokevirtual:Either(Either::ifLeft, p1:Either, invokedynamic:Consumer<\ud523\u92ff\ubb2b\u759a\ud36e>(accept:(L\u71f1\uc910\u3bc9\u516c\u93a2/\uc246\u156b\u7ce1\u3d64\u7873;)Ljava/util/function/Consumer;, p0:\uc246\u156b\u7ce1\u3d64\u7873)))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 lambda$\ubefe\u3a62\u88c5\u4c04\uc29a\u965f$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p0, com.mojang.datafixers.util.Either p1) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 lambda$\u446c\u7049\ub70c\u4bc8\u40a9\u946b$3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p0, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u5db4\u965f\u416d\u6bb9\uae87 p1) {
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
            return:\u8aa5\ubded\ub18d\u4f4a\u4f52(p0:\u8aa5\ubded\ub18d\u4f4a\u4f52)
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 lambda$\ud36e\u52d3\ucfaf\u927d\u5f50\ua068$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p0) {
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
            return:\u8aa5\ubded\ub18d\u4f4a\u4f52(p0:\u8aa5\ubded\ub18d\u4f4a\u4f52)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u8aa5\ua3b4\u64ab\u0b8e\u76bc\u12b2$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p1) {
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
            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p1:\u51fa\u6c52\u7330\u7330\u960f), p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ubcb0\u600f\u8d90\ubff1\u56bd\u927d$0(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
            invokespecial:void(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ubefe\u40a9\u183a\u7ce1\ubff1\uc3e3, this:\u8bb0\u4975\ub7dc\u47c2\u3e75, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c \u3a62\u3bd6\ub7dc\u69d9\u4ab3\u40a9(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u8bb0\u4975\ub7dc\u47c2\u3e75 p0) {
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
            return:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u61a4\ua068\ub32d\u92ee\u416d\ucfaf, p0:\u8bb0\u4975\ub7dc\u47c2\u3e75))
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
            putstatic:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u6fb0\u69d9\u3e75\u624e\u3bd6\u7049, invokestatic:Either(Either::right, getstatic:\u5db4\u965f\u416d\u6bb9\uae87[expected:Object](\u5db4\u965f\u416d\u6bb9\uae87::\ub171\u3bd6\ud36e\u8308\ubded\u92ee)))
            putstatic:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ubcb0\ub32d\u9255\ucef1\u36d3\u960f, invokestatic:CompletableFuture<Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>>(CompletableFuture<T>::completedFuture, getstatic:Either<\u8aa5\ubded\ub18d\u4f4a\u4f52, \u5db4\u965f\u416d\u6bb9\uae87>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u6fb0\u69d9\u3e75\u624e\u3bd6\u7049)))
            putstatic:Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u8cae\u071d\ud158\u4f4a\u4e72\u6ec6, invokestatic:Either(Either::right, getstatic:\u5db4\u965f\u416d\u6bb9\uae87[expected:Object](\u5db4\u965f\u416d\u6bb9\uae87::\ub171\u3bd6\ud36e\u8308\ubded\u92ee)))
            putstatic:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ufe34\u3711\u6d99\uc31c\ua61f\u62da, invokestatic:CompletableFuture<Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>>(CompletableFuture<T>::completedFuture, getstatic:Either<\ud523\u92ff\ubb2b\u759a\ud36e, \u5db4\u965f\u416d\u6bb9\uae87>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u8cae\u071d\ud158\u4f4a\u4e72\u6ec6)))
            putstatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\u8bb0\u4975\ub7dc\u47c2\u3e75::\u516c\u8aa5\uc246\u6c56\ubff1\u3d4b, invokestatic:List<\ucb79\u7ce1\ubded\u3d64\ub171>(\ucb79\u7ce1\ubded\u3d64\ub171::\u8cae\u3a62\ud158\u416d\ub32d\u6d69))
            putstatic:\uf9c5\u5140\ud158\u4492\u3dd3[](\u8bb0\u4975\ub7dc\u47c2\u3e75::\u446c\u4f52\u6d69\u8389\u97b7\u0a06, invokestatic:\uf9c5\u5140\ud158\u4492\u3dd3[](\uf9c5\u5140\ud158\u4492\u3dd3::values))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5654\u6d99\u8640\ubefe\u8350\u5140(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_688 : int
        
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
        var_3_67D = and:int(ldc:int(-448976804), ldc:int(-1800622497))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\u4975\ub7dc\u47c2\u3e75[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_67D = and:int(var_3_67D:int, ldc:int(-1216595084))
            var_5_81 = and:int(ldc:int(-25781), ldc:int(25780))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-26711), ldc:int(26708)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_67D:int, ldc:int(-402736259))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(1136), ldc:int(1137)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(37), ldc:int(131)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_67D = and:int(var_3_DA:int, ldc:int(-998478379))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(8448), ldc:int(8449)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-189217764))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1647693514))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1867098557))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1262587218))
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1236707394))
                    }
                    else {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1254200835))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0601)
                            }
                            
                            goto(Label_0857)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1395161613))
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1692166592))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1724287040))
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-247150411))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1831256724))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-222644830))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-956502050))
                        var_11_EB = and:int(ldc:int(-20539), ldc:int(20538))
                        goto(Label_1556)
                    }
                    
                    Label_0601:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1328850300))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(30050363))
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(826930201))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1650352824))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1237377154))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0857)
                        }
                    }
                    
                    Label_0726:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-554039193))
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(2097257186))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(542421332))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-316415101))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-545379627))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0857:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1134209919))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(683744995))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1209212969))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(513), ldc:int(1303))
                                goto(Label_1132)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(623935722))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1048562810))
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1789105556))
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-485188262))
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(728192143))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1363391659))
                        var_11_EB = and:int(ldc:int(-15303), ldc:int(15296))
                    }
                    
                    Label_1132:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(664334043))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(998941799))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-233052687))
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-633295801))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(206419997))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1128338180))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1411)
                            }
                        }
                    }
                    
                    Label_1266:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1104162652))
                        goto(Label_1567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1815095062))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1997227472))
                            goto(Label_1132)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(305872521))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-150249510))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1532088835))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1556)
                    }
                    
                    Label_1411:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1717726059))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-117435217))
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1390259496))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-349268201))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1950552620))
                        loopcontinue()
                    }
                    
                    var_3_67D = and:int(var_3_67D:int, ldc:int(-314655266))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1556:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_688 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1567:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-2026281163))
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(61809968))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-839037697))
                        var_17_688 = add:int(var_16_119:int, xor:int(ldc:int(20), ldc:int(21)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67D = and:int(var_3_67D:int, ldc:int(-1083277604))
                
                if (cmple:boolean(var_5_81 = var_17_688:int, sub:int(var_6_88:int, and:int(ldc:int(3345), ldc:int(24583))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
            var_3_67D = and:int(var_3_67D:int, ldc:int(1649024247))
            goto(Label_0108)
        }
    }
}
