public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\ufcaf\u3504\u4975\u3776\u120d\u64ab {
    public void \ufcaf\u3504\u4975\u3776\u120d\u64ab(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p1) {
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u51b2\u5fe1\u3bd6\u9033\u839e\u4e72), and:int(ldc:int(963), ldc:int(-980)))))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\ube23\u16f6\u76bc\u7af6\u3d4b\uf94d, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            putfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab, p1:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
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
    
    private void \ub113\u8d98\uae87\u6c56\u8df4\u64ab(\ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 p0) {
        var_2_9D : int
        var_4_6C : ImmutableList
        var_5_8F : Iterator<\ua61f\uae87\u36d3\u647c\u3d64>
        var_6_F3 : \ua61f\uae87\u36d3\u647c\u3d64
        
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
            var_2_9D = and:int(ldc:int(1232533017), ldc:int(-41354691))
            var_4_6C = invokestatic:ImmutableList(ImmutableList::copyOf, getfield:List<String>[expected:Collection](\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc2e8\ua6bd\u7e3f\u4179\u61a4, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            invokeinterface:void(List<E>::clear, getfield:List<String>(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc2e8\ua6bd\u7e3f\u4179\u61a4, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            invokeinterface:void(List<E>::clear, getfield:List<String>(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4daf\u416d\u6c56\u97b7\ufe34\u071d, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            var_5_8F = invokeinterface:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>(Collection<\ua61f\uae87\u36d3\u647c\u3d64>::iterator, invokevirtual:Collection<\ua61f\uae87\u36d3\u647c\u3d64>(\u4f52\ua068\u4f52\u47c2\u4492::\u527a\u5fe1\u8c8a\u600f\ubefe\u4bc8, p0:\u4f52\ua068\u4f52\u47c2\u4492))
            
            loop {
                if (cmpne:boolean(and:int(var_2_9D:int, ldc:int(16)), ldc:int(0))) {
                    var_2_9D = and:int(var_2_9D:int, ldc:int(1531804279))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_8F:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>)) {
                        var_6_F3 = checkcast:\ua61f\uae87\u36d3\u647c\u3d64(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64.class, invokeinterface:\ua61f\uae87\u36d3\u647c\u3d64(Iterator<\ua61f\uae87\u36d3\u647c\u3d64>::next, var_5_8F:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\ua61f\uae87\u36d3\u647c\u3d64::\u071d\u647c\u9033\u3dd3\u12b2\u3504, var_6_F3:\ua61f\uae87\u36d3\u647c\u3d64))) {
                            invokeinterface:boolean(List<String>::add, getfield:List<String>(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc2e8\ua6bd\u7e3f\u4179\u61a4, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)), invokevirtual:String(\ua61f\uae87\u36d3\u647c\u3d64::\uc2bd\u12b2\u9937\ub102\u64f2\uc238, var_6_F3:\ua61f\uae87\u36d3\u647c\u3d64))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(\u67d0\u7c6b\u5db4\u8df4\u120d::\u7873\uc2bd\u9033\u6fb0\u92ff\u6b0d, invokevirtual:\u67d0\u7c6b\u5db4\u8df4\u120d(\ua61f\uae87\u36d3\u647c\u3d64::\u7d52\u93a2\u4daf\ub7dc\u56bd\u7049, var_6_F3:\ua61f\uae87\u36d3\u647c\u3d64)))) {
                                invokeinterface:boolean(List<String>::add, getfield:List<String>(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4daf\u416d\u6c56\u97b7\ufe34\u071d, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)), invokevirtual:String(\ua61f\uae87\u36d3\u647c\u3d64::\uc2bd\u12b2\u9937\ub102\u64f2\uc238, var_6_F3:\ua61f\uae87\u36d3\u647c\u3d64))
                            }
                        }
                        
                        var_2_9D = and:int(var_2_9D:int, ldc:int(2071453429))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_9D:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_9D = and:int(var_2_9D:int, ldc:int(-632386462))
            }
            
            invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab))
            
            if (logicalnot:boolean(invokeinterface:boolean(List<E>::equals, invokestatic:ImmutableList[expected:List<E>](ImmutableList::copyOf, getfield:List<String>[expected:Collection](\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc2e8\ua6bd\u7e3f\u4179\u61a4, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab))), var_4_6C:ImmutableList[expected:Object]))) {
                invokevirtual:CompletableFuture<Void>(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc29a\u12cb\u0b8e\uceb8\u8df4\u67e9, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private net.minecraft.util.text.ITextComponent \u6198\u8709\u7af6\u3d64\uc3e3\u4f4a(\u6435\ub8be\u718f\u6b0d\u67e9.\u8753\u0800\u4f4a\u4975\u64ab\u4c04 p0) {
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
            return:ITextComponent(invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::append, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::appendString, initobject:TranslationTextComponent[expected:IFormattableTextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u51b2\u5fe1\u3bd6\u9033\u839e\u4e72), and:int(ldc:int(16649), ldc:int(8329)))), loadelement:String(getstatic:String[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u51b2\u5fe1\u3bd6\u9033\u839e\u4e72), xor:int(ldc:int(-32729), ldc:int(-32723)))), invokevirtual:ITextComponent(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u93a2\uc229\u6c56\u12b2\u8389\ub83f, p0:\u8753\u0800\u4f4a\u4975\u64ab\u4c04)))
        }
        
        goto(Label_0006)
    }
    
    private void \ub70c\u6435\u416d\uc87f\ub32d\ua068(boolean p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            
            if (p0:boolean) {
                if (cmpne:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
                    invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)), initobject:\u9a18\uf9c5\uc229\u8308\u0800[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u9a18\uf9c5\uc229\u8308\u0800::<init>, and:int[expected:boolean](ldc:int(17489), ldc:int(45))))
                    invokevirtual:void(\u8640\u51b2\u6cfe\ub32d\uc246\u7e3f::\u64ab\ud217\uc910\u7bad\u6ec6\ub70c, getfield:\u8640\u51b2\u6cfe\ub32d\uc246\u7e3f(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u74b1\u9255\u7bad\ud12e\u4ab3\u0c95, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), and:int[expected:boolean](ldc:int(1797), ldc:int(12321)))
                    putfield:boolean(\u8640\u51b2\u6cfe\ub32d\uc246\u7e3f::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u8640\u51b2\u6cfe\ub32d\uc246\u7e3f(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u74b1\u9255\u7bad\ud12e\u4ab3\u0c95, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), and:int[expected:boolean](ldc:int(-27267), ldc:int(27266)))
                    putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u960f\uc84e\u183a\u93a2\uf9c5\u965f, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), and:int[expected:boolean](ldc:int(-10290), ldc:int(10289)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
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
            invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), getfield:ITextComponent(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), div:int(getfield:int(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), and:int(ldc:int(11831), ldc:int(4098))), ldc:int(15), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u873d\ua61f\ubb2b\u7873\u16f6\u4daf$11(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\ube23\u16f6\u76bc\u7af6\u3d4b\uf94d, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8753\u8aa5\u51b2\u494c\ub70c\u16f6$10(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), initobject:\u7d52\u7e3f\u5db4\u5bc4\u6d69\ub1b9[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u7d52\u7e3f\u5db4\u5bc4\u6d69\ub1b9::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4c04\u62da\ud7e8\u7c6b\u4d85\uceb8$9(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), initobject:\u4492\u4ab3\u97e6\u71ae\ucfaf\u7873[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u4492\u4ab3\u97e6\u71ae\ucfaf\u7873::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], invokevirtual:\u4f52\ua068\u4f52\u47c2\u4492(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubded\u6c56\u5654\u3bc9\u9937\u4492, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)), invokedynamic:Consumer<\u4f52\ua068\u4f52\u47c2\u4492>(accept:(L\ua562\ucb79\uc87f\u3dd3\ubcb0/\ufcaf\u3504\u4975\u3776\u120d\u64ab;)Ljava/util/function/Consumer;, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), invokevirtual:File(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ua068\u5d20\ucef1\uc3e3\ub6ab\uf995, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u51b2\u5fe1\u3bd6\u9033\u839e\u4e72), xor:int(ldc:int(8361), ldc:int(8354))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u64f2\u34df\u71f1\u51fa\u4f52\u4492$8(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), initobject:\u12b2\u59ec\u8cae\u3e2a\u120d\u72f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u12b2\u59ec\u8cae\u3e2a\u120d\u72f1::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u946b\u67d0\u3bd6\uc3e3\ub113\uc84e$7(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), initobject:\uf995\ub113\u51fa\u9937\u6bb9\uae87[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uf995\ub113\u51fa\u9937\u6bb9\uae87::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), invokevirtual:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u516c\ub8be\u839e\u47c2\ub171, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u7043\ub83f\uf995\uc7fe\u4bc8\u5f50$6(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), initobject:\ua068\u7bad\u392e\u7330\u7043\ud7e8[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\ua068\u7bad\u392e\u7330\u7043\ud7e8::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u0800\u965f\u9255\ua6bd\u4e72\u3d64$5(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), initobject:\u71f1\uc910\ud12e\u516c\uf995\u8aa5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u71f1\uc910\ud12e\u516c\uf995\u8aa5::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6b0d\u97b7\u12cb\u16f6\uc2bd\u7049$4(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), initobject:\u5d20\u3d64\uc31c\ub18d\ua61f\u4ab3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u5d20\u3d64\uc31c\ub18d\ua61f\u4ab3::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u839e\u99f7\u4f4a\u12b2\u873d\ud523$3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), initobject:\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3::<init>, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u7049\u8389\ubf56\u4ab3\u7af6\u873d$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u6c52\u8c8a\u76bc\ud7e8\u99f7\ubefe::\ud36e\u7ce1\ub18d\uae87\u8640\u67e9, getstatic:\u6c52\u8c8a\u76bc\ud7e8\u99f7\ubefe(\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u8753\u5bc4\u8640\ucef1\u61a4\u600f), getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab))
            invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995], invokevirtual:ITextComponent(\u6c52\u8c8a\u76bc\ud7e8\u99f7\ubefe::\u6ec6\u0b8e\uc2bd\u69d9\u8350\u1833, getstatic:\u6c52\u8c8a\u76bc\ud7e8\u99f7\ubefe(\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u8753\u5bc4\u8640\ucef1\u61a4\u600f), getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u5fe1\u600f\u624e\u5d20\u183a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8350\u64f2\u12cb\u392e\u92ee\u6b5f$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        stack_DC_0 : \u67e9\u4daf\u760c\ud217\ua6bd\ubff1 [generated]
        stack_D9_1 : BooleanConsumer [generated]
        expr_70 : TranslationTextComponent [generated]
        stack_D6_1 : String [generated]
        expr_98 : Object[] [generated]
        
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
            stack_DC_0 = getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)
            stack_D9_1 = invokedynamic:BooleanConsumer(accept:(L\ua562\ucb79\uc87f\u3dd3\ubcb0/\ufcaf\u3504\u4975\u3776\u120d\u64ab;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)
            expr_70 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u51b2\u5fe1\u3bd6\u9033\u839e\u4e72), and:int(ldc:int(76), ldc:int(812))))
            stack_D6_1 = loadelement:String(getstatic:String[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u51b2\u5fe1\u3bd6\u9033\u839e\u4e72), xor:int(ldc:int(-24509), ldc:int(-24498)))
            expr_98 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-27584), ldc:int(-27583)))
            storeelement:Object(expr_98:Object[], and:int(ldc:int(18445), ldc:int(-18446)), initobject:TranslationTextComponent[expected:Object](TranslationTextComponent::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u51b2\u5fe1\u3bd6\u9033\u839e\u4e72), and:int(ldc:int(8718), ldc:int(3390)))), invokevirtual:String(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u6c52\u8df4\u6b0d\u8cae\u624e\u16f6, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc84e\uc229\u7006\u7049\ufe34\ubb2b::\u3bc9\u6435\u47c2\uf9c5\u3a62\u6198, invokevirtual:\uc84e\uc229\u7006\u7049\ufe34\ubb2b(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3d4b\ud523\uff55\u647c\u4ab3\u7af6, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))))))))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, stack_DC_0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\uc238\u0b8e\ubefe\uc87f\uc9f6\u836c(\uc238\u0b8e\ubefe\uc87f\uc9f6\u836c::<init>, stack_D9_1:BooleanConsumer, expr_70:TranslationTextComponent[expected:ITextComponent], initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_D6_1:String, expr_98:Object[])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u0b8e\ubded\ua068\u5d20\ucfaf\u3776$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u72f1\ufe34\uc2e8\u52d3\ud51e\u7006, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab, invokestatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u8413\uc4d2\ud51e\u759a\u873d\u385b, add:int(invokevirtual:int(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u8d90\ud36e\ub70c\u946b\u7e3f\uc2e8, getfield:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u72f1\ufe34\uc2e8\u52d3\ud51e\u7006, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)), and:int(ldc:int(17), ldc:int(3113)))))
            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)), initobject:\u8389\ubff1\ua068\u5245\u8258[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u8389\ubff1\ua068\u5245\u8258::<init>, getfield:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u72f1\ufe34\uc2e8\u52d3\ud51e\u7006, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u960f\uc84e\u183a\u93a2\uf9c5\u965f, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab), invokespecial:ITextComponent(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u6198\u8709\u7af6\u3d64\uc3e3\u4f4a, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab, getfield:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u72f1\ufe34\uc2e8\u52d3\ud51e\u7006, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_8A : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_C8_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_32F_0 : byte[] [generated]
        stack_3AC_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_2C7 : byte[]
        var_4_2C8 : int
        expr_98 : int [generated]
        var_5_318 : int
        var_3_31D : byte[]
        var_4_31E : int
        var_0_325 : int
        expr_32F : byte [generated]
        stack_377_2 : byte [generated]
        stack_355_0 : byte [generated]
        expr_C8 : int [generated]
        var_3_39A : byte[]
        var_4_39B : int
        expr_3AF : byte [generated]
        var_3_F8 : String
        stack_2A5_0 : String[] [generated]
        expr_10A : String[] [generated]
        expr_2AD : \ub7dc\u34df\u071d\u494c\u0b8e\u97e6[] [generated]
        
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
            var_0_8A = and:int(ldc:int(1061415561), ldc:int(2145238523))
            expr_68 = var_2_6C = stack_96_0 = stack_98_0 = stack_C6_0 = stack_C8_0 = stack_EC_0 = stack_32F_0 = stack_3AC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Bvc8dAh0aVwYJCPpNxxnwFxWyBwEJ/fMF+v8dAh0aVwYJCPpKwwsHBg/EBRr9FxwBQvYL+PALyAEKCQn/ABNVEwUX8//EBRr9FxwBQPEN+gRKygQVDv/EBRr9FxwBQPoRCgEPxwwPBA4F/RUMAU/wCPf5+78dAh0aExEDBQsMAU/wCPf5+78dAh0aVBUIGvoAzAFH+AEG/g21DA8HEQgIFxwBQgQMDw4MzvADDfH29BUcCAQdHAFBDgXwDxnABxoQ+uIB8AX+GxQBEAAAAAwBQQoaAA77xA8BBPUVDAFAAAsB/f/EBRr9FxwBTgAK+PQMwPYVEB0O8AIt8fb0URfdFwYAZaq1rbawA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_2C7 = newarray:byte[](byte.class, expr_70:int)
                var_4_2C8 = expr_70:int
                
                loop {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(1063495647))
                    var_4_2C8 = add:int(var_4_2C8:int, ldc:int(-1))
                    storeelement:byte(var_3_2C7:byte[], var_4_2C8:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_2C8:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_2C8:int, and:int(ldc:int(10341), ldc:int(16521)))), ldc:int(6)), xor:int(ldc:int(837), ldc:int(838)))))
                    
                    if (cmpne:boolean(var_4_2C8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_EC_0 = stack_32F_0 = stack_3AC_0 = var_3_2C7:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0205)
                }
                
                if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(-1677713398))
                }
                else {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(1995698877))
                    expr_98 = arraylength:int(stack_98_0:byte[])
                    
                    if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                        var_5_318 = expr_98:int
                        var_3_31D = newarray:byte[](byte.class, expr_98:int)
                        var_4_31E = expr_98:int
                        
                        loop {
                            var_0_325 = and:int(var_0_8A:int, ldc:int(-145513491))
                            var_4_31E = add:int(var_4_31E:int, ldc:int(-1))
                            expr_32F = stack_377_2 = loadelement(stack_32F_0, var_4_31E)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_31E:int, ldc:int(6)), neg:int(var_5_318:int)), ldc:int(0))) {
                                stack_377_2 = stack_355_0 = add:byte(expr_32F:byte, loadelement:byte(var_3_31D:byte[], add:int(var_4_31E:int, ldc:int(6))))
                                goto(Label_0869)
                            }
                            
                            Label_0828:
                            
                            if (cmpeq:boolean(and:int(var_0_325:int, ldc:int(32768)), ldc:int(0))) {
                                var_0_325 = and:int(var_0_325:int, ldc:int(1918874958))
                            }
                            else {
                                var_0_325 = and:int(var_0_325:int, ldc:int(2001862077))
                                stack_377_2 = stack_355_0 = add:byte(expr_32F:byte, ldc:byte(6))
                            }
                            
                            Label_0869:
                            
                            if (cmpeq:boolean(and:int(var_0_325:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0828)
                            }
                            
                            var_0_8A = and:int(var_0_325:int, ldc:int(938059149))
                            storeelement:byte(var_3_31D:byte[], var_4_31E:int, stack_377_2:byte)
                            
                            if (cmpne:boolean(var_4_31E:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_EC_0 = stack_32F_0 = stack_3AC_0 = var_3_31D:byte[]
                    }
                }
                
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(2)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(2091308801))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(1)), ldc:int(0))) {
                        var_0_8A = and:int(var_0_8A:int, ldc:int(-1125869232))
                        loopcontinue()
                    }
                    
                    var_0_8A = and:int(var_0_8A:int, ldc:int(939259629))
                    expr_C8 = arraylength:int(stack_C8_0:byte[])
                    
                    if (cmpne:boolean(expr_C8:int, ldc:int(0))) {
                        var_3_39A = newarray:byte[](byte.class, expr_C8:int)
                        var_4_39B = expr_C8:int
                        
                        loop {
                            var_0_8A = and:int(var_0_8A:int, ldc:int(2135273113))
                            var_4_39B = add:int(var_4_39B:int, ldc:int(-1))
                            expr_3AF = xor:byte(loadelement:byte(stack_3AC_0:byte[], var_4_39B:int), ldc:byte(1))
                            storeelement:byte(var_3_39A:byte[], var_4_39B:int, add:int(or:int(and:int(shl:int(expr_3AF:byte, and:int(ldc:int(11566), ldc:int(20))), ldc:int(-16)), and:int(shr:int(expr_3AF:byte[expected:int], xor:int(ldc:int(1152), ldc:int(1156))), ldc:int(15))), ldc:int(94)))
                            
                            if (cmpne:boolean(var_4_39B:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_EC_0 = stack_32F_0 = stack_3AC_0 = var_3_39A:byte[]
                    }
                }
                
                Label_0205:
                
                if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_8A = and:int(var_0_8A:int, ldc:int(-1038632637))
            }
            
            var_3_F8 = initobject:String(String::<init>, stack_EC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2A5_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32123), ldc:int(-32118)))
            expr_10A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16463), ldc:int(13839)))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(285), ldc:int(279)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(13068), ldc:int(-13151)), and:int(ldc:int(18), ldc:int(1131))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(-19451), ldc:int(-19448)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(25398), ldc:int(4162)), xor:int(ldc:int(22), ldc:int(12))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(1740), ldc:int(4365)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(16432), ldc:int(16426)), xor:int(ldc:int(1222), ldc:int(1257))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(-32762), ldc:int(-32754)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-24460), ldc:int(-24485)), and:int(ldc:int(5194), ldc:int(10331))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(641), ldc:int(647)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(10274), ldc:int(10344)), xor:int(ldc:int(-30181), ldc:int(-30137))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(-32256), ldc:int(-32252)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(25695), ldc:int(2268)), xor:int(ldc:int(4426), ldc:int(4390))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(10308), ldc:int(10317)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-22481), ldc:int(-22461)), xor:int(ldc:int(12455), ldc:int(12505))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(24603), ldc:int(24597)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(9335), ldc:int(9225)), and:int(ldc:int(4351), ldc:int(16785))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(14407), ldc:int(17813)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(2082), ldc:int(2227)), xor:int(ldc:int(4196), ldc:int(4293))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(13655), ldc:int(2087)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(10372), ldc:int(10277)), and:int(ldc:int(21685), ldc:int(2741))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(20483), ldc:int(69)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(4277), ldc:int(25333)), xor:int(ldc:int(-30596), ldc:int(-30542))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(9282), ldc:int(2818)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(8434), ldc:int(8252)), xor:int(ldc:int(25022), ldc:int(24930))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(-24935), ldc:int(24934)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(2045), ldc:int(220)), and:int(ldc:int(745), ldc:int(6633))))
            storeelement:String(expr_10A:String[], and:int(ldc:int(5459), ldc:int(2187)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, xor:int(ldc:int(-31016), ldc:int(-31183)), xor:int(ldc:int(60), ldc:int(202))))
            storeelement:String(expr_10A:String[], xor:int(ldc:int(8392), ldc:int(8387)), invokevirtual:String[expected:String](String::substring, var_3_F8:String, and:int(ldc:int(21239), ldc:int(246)), xor:int(ldc:int(16753), ldc:int(16505))))
            putstatic:String[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u51b2\u5fe1\u3bd6\u9033\u839e\u4e72, expr_10A:String[])
            expr_2AD = newarray:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[](\u51fa\u12cb\u7330\u74b1\u6c52.\ub7dc\u34df\u071d\u494c\u0b8e\u97e6.class, xor:int(ldc:int(-16384), ldc:int(-16383)))
            storeelement:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6(expr_2AD:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[], and:int(ldc:int(-32459), ldc:int(31944)), getstatic:\u6435\u3d4b\u927d\u67e9\u4f52\ub7dc[expected:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6](\ub7dc\u34df\u071d\u494c\u0b8e\u97e6::\u7c6b\u36d3\u120d\u59ec\u9255\u92ff))
            putstatic:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[](\ufcaf\u3504\u4975\u3776\u120d\u64ab::\u3d64\u3a62\u4f4a\uc9f6\u8258\ud4fe, expr_2AD:\ub7dc\u34df\u071d\u494c\u0b8e\u97e6[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66F : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_67A : int
        
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
        var_3_66F = and:int(ldc:int(-1568194878), ldc:int(-1515991265))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufcaf\u3504\u4975\u3776\u120d\u64ab[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(-1275404390))
            var_5_80 = and:int(ldc:int(5545), ldc:int(-7594))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11435), ldc:int(11432)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_66F:int, ldc:int(-57209028))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, xor:int(ldc:int(768), ldc:int(769)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(2441), ldc:int(8245)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_66F = and:int(var_3_D8:int, ldc:int(-56697215))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(4869), ldc:int(33)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-711177471))
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1593984342))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(914969313))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(941775130))
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-516829084))
                        goto(Label_0741)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(74738338))
                        goto(Label_0602)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1184181172))
                    }
                    else {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1230766476))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0602)
                            }
                            
                            goto(Label_0876)
                        }
                    }
                    
                    Label_0433:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1709797269))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(260098420))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(377591471))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1878908776))
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0741)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(494549664))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-503402814))
                            var_11_E9 = and:int(ldc:int(13264), ldc:int(-16380))
                            goto(Label_1518)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0602:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-692645549))
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1632686151))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1922351290))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-790872453))
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(711125460))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1042555445))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-343785477))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0876)
                        }
                    }
                    
                    Label_0741:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1888947132))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-2126715231))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-998074384))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1452999055))
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1966436851))
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1158500693))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0876:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(852038632))
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0741)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1580544447))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(8205), ldc:int(35))
                                goto(Label_1127)
                            }
                        }
                    }
                    
                    Label_0969:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1057485124))
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(835556840))
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0876)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0741)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1664742644))
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(675300272))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-355750362))
                        var_11_E9 = and:int(ldc:int(14595), ldc:int(-14596))
                    }
                    
                    Label_1127:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-2137649777))
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(446190678))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0969)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-81875783))
                            goto(Label_0876)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0741)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-2104369293))
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(2009790744))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-525201629))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1377)
                            }
                        }
                    }
                    
                    Label_1255:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1127)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1402133214))
                            goto(Label_0969)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-944916839))
                            goto(Label_0876)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0741)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1178167676))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1595707478))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                        goto(Label_1518)
                    }
                    
                    Label_1377:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-752307736))
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-950074954))
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1185210089))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0741)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(583552222))
                        goto(Label_0602)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-574842323))
                        goto(Label_0433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(-103616551))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1518:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67A = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1529:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1747268974))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1101880767))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1762925635))
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-355869706))
                        goto(Label_0741)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1331433954))
                        var_17_67A = add:int(var_16_117:int, xor:int(ldc:int(9024), ldc:int(9025)))
                        looporswitchbreak()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(25671031))
                }
                
                var_3_66F = and:int(var_3_66F:int, ldc:int(-493928563))
                
                if (cmple:boolean(var_5_80 = var_17_67A:int, sub:int(var_6_87:int, and:int(ldc:int(8195), ldc:int(23173))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(2101553591))
            goto(Label_0108)
        }
    }
}
