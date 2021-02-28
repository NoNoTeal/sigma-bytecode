public abstract class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud217\uc246\uff55\u6d69\u5245\u927d<T> {
    public void \ud217\uc246\uff55\u6d69\u5245\u927d(T extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4c2b\u12b2\u62da\u8389\ub18d p0, \u47c2\u2dcc\u12cb\ud171\u8c8a.\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2 p1, \ub113\ufcaf\u3c25\u071d\u97b7.\u0b8e\ud4fe\uc229\u92ee\ud4fe p2, net.minecraft.util.text.ITextComponent p3, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p4) {
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
            invokespecial:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>(\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>::<init>, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>], p0:T extends \u4c2b\u12b2\u62da\u8389\ub18d, p2:\u0b8e\ud4fe\uc229\u92ee\ud4fe, p3:ITextComponent)
            putfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2(\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>, p1:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2)
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud217\uc246\uff55\u6d69\u5245\u927d::\ubcb0\ucef1\u516c\u8258\ubb2b\u97e6, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>, p4:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
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
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
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
            invokespecial:void(\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>::\u759a\uc87f\u5140\ud36e\u12cb\ubcb0, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>])
            invokevirtual:void(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\u3d4b\u7bad\u71ae\u4492\u446c\ud36e, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_61 : int
        
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
            var_5_61 = and:int(ldc:int(1247941866), ldc:int(-580247))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            
            if (logicaland:boolean(invokevirtual:boolean(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\u8258\u72f1\u51fa\u8d98\u3bd6\u61a4, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>)), getfield:boolean(\ud217\uc246\uff55\u6d69\u5245\u927d::\u4c2b\u873d\ub113\ubf56\u93a2\u156b, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))) {
                invokevirtual:void(\ud217\uc246\uff55\u6d69\u5245\u927d<T>::\uff55\u3a62\u92ff\u69d9\u4ab3\uc2bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p3:float, p1:int, p2:int)
                invokevirtual:void(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            }
            else {
                var_5_61 = and:int(var_5_61:int, ldc:int(1782775039))
                invokevirtual:void(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
                invokespecial:void(\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
                invokevirtual:void(\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2::\u873d\ud51e\u4f52\u3c25\ua61f\u74b1, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2(\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u7ce1\u3dd3\u9255\u69d9\u64ab\uc87f, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\ua3b4\u392e\u965f\u3711\u4c2b\u4d85, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), and:int[expected:boolean](ldc:int(19013), ldc:int(8235)), p3:float)
            }
            
            invokevirtual:void(\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>::\uc87f\u8753\ucfaf\u9af2\u64ab\ud4fe, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int)
            invokevirtual:void(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\ucef1\u527a\u99f7\u2dcc\u4d85\u4d85, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u7ce1\u3dd3\u9255\u69d9\u64ab\uc87f, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\ua3b4\u392e\u965f\u3711\u4c2b\u4d85, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uff55\u3a62\u92ff\u69d9\u4ab3\uc2bd(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, float p1, int p2, int p3) {
        var_7_7C : int
        var_8_82 : int
        var_9_F6 : int
        
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ud217\uc246\uff55\u6d69\u5245\u927d::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>)), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud217\uc246\uff55\u6d69\u5245\u927d::\ubcb0\ucef1\u516c\u8258\ubb2b\u97e6, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))
            var_7_7C = getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u7ce1\u3dd3\u9255\u69d9\u64ab\uc87f, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>)
            var_8_82 = getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\ua3b4\u392e\u965f\u3711\u4c2b\u4d85, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>)
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_7_7C:int, var_8_82:int, and:int(ldc:int(-18957), ldc:int(18956)), and:int(ldc:int(17701), ldc:int(-17718)), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u64f2\u446c\u760c\uc84e\u92ff\u97e6, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\uc84e\u7049\ub102\u416d\u36d3\u9255, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))
            
            if (invokevirtual:boolean(\u4c2b\u12b2\u62da\u8389\ub18d::\u4c04\uc9f6\u927d\ua068\u1833\u3dd3, checkcast:T extends \u4c2b\u12b2\u62da\u8389\ub18d[expected:\u4c2b\u12b2\u62da\u8389\ub18d](T extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4c2b\u12b2\u62da\u8389\ub18d.class, getfield:T extends \u4c2b\u12b2\u62da\u8389\ub18d(\ud217\uc246\uff55\u6d69\u5245\u927d::\uc2bd\u7043\u4bc8\ud171\u12b2\ud158, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>)))) {
                var_9_F6 = invokevirtual:int(\u4c2b\u12b2\u62da\u8389\ub18d::\ubcb0\u97b7\u6cfe\u446c\ub83f\u97b7, checkcast:T extends \u4c2b\u12b2\u62da\u8389\ub18d[expected:\u4c2b\u12b2\u62da\u8389\ub18d](T extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4c2b\u12b2\u62da\u8389\ub18d.class, getfield:T extends \u4c2b\u12b2\u62da\u8389\ub18d(\ud217\uc246\uff55\u6d69\u5245\u927d::\uc2bd\u7043\u4bc8\ud171\u12b2\ud158, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>)))
                invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(var_7_7C:int, ldc:int(56)), sub:int(add:int(add:int(var_8_82:int, ldc:int(36)), ldc:int(12)), var_9_F6:int), xor:int(ldc:int(1132), ldc:int(1244)), sub:int(ldc:int(12), var_9_F6:int), ldc:int(14), add:int(var_9_F6:int, xor:int(ldc:int(1028), ldc:int(1029))))
            }
            
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(var_7_7C:int, ldc:int(79)), add:int(var_8_82:int, ldc:int(34)), and:int(ldc:int(18868), ldc:int(12976)), ldc:int(14), add:int(invokevirtual:int(\u4c2b\u12b2\u62da\u8389\ub18d::\ud523\u56bd\u16f6\ub102\ud171\u8df4, checkcast:T extends \u4c2b\u12b2\u62da\u8389\ub18d[expected:\u4c2b\u12b2\u62da\u8389\ub18d](T extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4c2b\u12b2\u62da\u8389\ub18d.class, getfield:T extends \u4c2b\u12b2\u62da\u8389\ub18d(\ud217\uc246\uff55\u6d69\u5245\u927d::\uc2bd\u7043\u4bc8\ud171\u12b2\ud158, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))), and:int(ldc:int(17413), ldc:int(4105))), ldc:int(16))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\ud36e\u1187\u88c5\u7bad\u5bc4(double p0, double p1, int p2) {
        var_6_94 : int
        stack_D3_0 : int [generated]
        
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
        var_6_94 = and:int(ldc:int(2050593663), ldc:int(1945221119))
        
        if (logicalnot:boolean(invokevirtual:boolean(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:double, p1:double, p2:int))) {
            loop {
                if (cmpne:boolean(and:int(var_6_94:int, ldc:int(33554432)), ldc:int(0))) {
                    var_6_94 = and:int(var_6_94:int, ldc:int(2054510575))
                    
                    if (getfield:boolean(\ud217\uc246\uff55\u6d69\u5245\u927d::\u4c2b\u873d\ub113\ubf56\u93a2\u156b, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>)) {
                        if (invokevirtual:boolean(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\u8258\u72f1\u51fa\u8d98\u3bd6\u61a4, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))) {
                            stack_D3_0 = xor:int(ldc:int(-31992), ldc:int(-31991))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_6_94:int, ldc:int(8)), ldc:int(0))) {
                    var_6_94 = and:int(var_6_94:int, ldc:int(1923136895))
                    stack_D3_0 = invokespecial:boolean[expected:int](\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>], p0:double, p1:double, p2:int)
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_D3_0:int)
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(18624), ldc:int(18625)))
    }
    
    public void \u0c95\u6435\ubf56\u62da\u8df4\ub6ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u92ff\ubded\u0c95\u446c\u67d0 p0, int p1, int p2, \u6b0d\u12cb\u156b\u4179\u8bb0.\u5654\ud51e\uc910\u62da\u836c p3) {
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
            invokespecial:void(\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>::\u0c95\u6435\ubf56\u62da\u8df4\ub6ab, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>], p0:\u92ff\ubded\u0c95\u446c\u67d0, p1:int, p2:int, p3:\u5654\ud51e\uc910\u62da\u836c)
            invokevirtual:void(\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2::\u156b\u8cae\u3504\u4ab3\ua6bd\u8640, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2(\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:\u92ff\ubded\u0c95\u446c\u67d0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
        var_4_61 : int
        stack_95_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(1752457584), ldc:int(1724895716))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:int, p1:int, p2:int))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1618421952))
                stack_95_0 = invokespecial:boolean[expected:int](\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>], p0:int, p1:int, p2:int)
            }
            else {
                stack_95_0 = and:int(ldc:int(-17880), ldc:int(1431))
            }
            
            return:boolean(stack_95_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u12cb\u7d52\u385b\u93a2\u4492\u3504(double p0, double p1, int p2, int p3, int p4) {
        var_8_63 : int
        var_8_108 : int
        stack_E2_0 : int [generated]
        var_10_E2 : int
        stack_133_0 : int [generated]
        
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
            var_8_63 = and:int(ldc:int(1396161987), ldc:int(817352182))
            
            if (cmpge:boolean(p0:double, i2d:double(p2:int))) {
                if (cmpge:boolean(p1:double, i2d:double(p3:int))) {
                    if (cmplt:boolean(p0:double, i2d:double(add:int(p2:int, getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u64f2\u446c\u760c\uc84e\u92ff\u97e6, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))))) {
                        if (cmplt:boolean(p1:double, i2d:double(add:int(p3:int, getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\uc84e\u7049\ub102\u416d\u36d3\u9255, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))))) {
                            goto(Label_0188)
                        }
                    }
                }
            }
            
            Label_0109:
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(64)), ldc:int(0))) {
                var_8_108 = and:int(var_8_63:int, ldc:int(-1166109751))
                stack_E2_0 = xor:int(ldc:int(12321), ldc:int(12320))
                goto(Label_0226)
            }
            
            Label_0188:
            
            if (cmpne:boolean(and:int(var_8_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0109)
            }
            
            var_8_108 = and:int(var_8_63:int, ldc:int(-1183344158))
            stack_E2_0 = and:int(ldc:int(4153), ldc:int(-20542))
            Label_0226:
            var_10_E2 = stack_E2_0:int
            
            if (logicaland:boolean(invokevirtual:boolean(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\uff55\u61a4\u9033\u6d69\u4cd9\u760c, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:double, p1:double, getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u7ce1\u3dd3\u9255\u69d9\u64ab\uc87f, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\ua3b4\u392e\u965f\u3711\u4c2b\u4d85, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u64f2\u446c\u760c\uc84e\u92ff\u97e6, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\uc84e\u7049\ub102\u416d\u36d3\u9255, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p4:int), cmpne:boolean(var_10_E2:int, ldc:int(0)))) {
                stack_133_0 = xor:int(ldc:int(86), ldc:int(87))
            }
            else {
                var_8_108 = and:int(var_8_108:int, ldc:int(1581246954))
                stack_133_0 = and:int(ldc:int(-28032), ldc:int(27676))
            }
            
            return:boolean(stack_133_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ubb2b\ube23\u59ec\u61a4\u8753\uc4d2(char p0, int p1) {
        var_3_61 : int
        stack_8E_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(1643662879), ldc:int(-254416113))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\ubb2b\ube23\u59ec\u61a4\u8753\uc4d2, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), p0:char, p1:int))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1476090495))
                stack_8E_0 = invokespecial:boolean[expected:int](\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\ubb2b\ube23\u59ec\u61a4\u8753\uc4d2, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9], p0:char, p1:int)
            }
            else {
                stack_8E_0 = xor:int(ldc:int(338), ldc:int(339))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u97b7\uae5d\u4492\u392e\ud12e\ud36e() {
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
            invokevirtual:void(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\u93a2\u97b7\u7bad\u3e75\ub83f\ucef1, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3 \u8389\ud12e\uc84e\uc910\ua068\u983f() {
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
            return:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3(getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))
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
            invokevirtual:void(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\ua562\u527a\u34df\u5d20\uc910\uf995, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))
            invokespecial:void(\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>::\u760c\ud51e\u3e2a\uc910\uc7fe\u71ae, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:\ua562\ub83f\u5d20\u8d90\u4bc8\uf995<T>])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8413\uc4d2\uc4d2\u97b7\uc7fe\u7ce1$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\u7330\u61a4\uafe7\u2dcc\u446c\u600f, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:boolean(\ud217\uc246\uff55\u6d69\u5245\u927d::\u4c2b\u873d\ub113\ubf56\u93a2\u156b, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))
            invokevirtual:void(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\ub171\u98a4\u5bc4\u97e6\ud158\u7006, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>))
            putfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u7ce1\u3dd3\u9255\u69d9\u64ab\uc87f, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>, invokevirtual:int(\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3::\u6b5f\u1833\uc2e8\ub6ab\ud12e\uae5d, getfield:\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2[expected:\u8c8a\u7873\ubefe\u8bb0\u120d\uc3e3](\ud217\uc246\uff55\u6d69\u5245\u927d::\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:boolean(\ud217\uc246\uff55\u6d69\u5245\u927d::\u4c2b\u873d\ub113\ubf56\u93a2\u156b, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u64f2\u446c\u760c\uc84e\u92ff\u97e6, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>)))
            invokevirtual:void(\u7043\uceb8\ube23\ubb2b\u071d\u3776::\u3a62\u3a62\u98a4\uff55\u98a4\u7e3f, checkcast:\u7043\uceb8\ube23\ubb2b\u071d\u3776(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u7043\uceb8\ube23\ubb2b\u071d\u3776.class, p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u7043\uceb8\ube23\ubb2b\u071d\u3776]), add:int(getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u7ce1\u3dd3\u9255\u69d9\u64ab\uc87f, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), ldc:int(20)), sub:int(div:int(getfield:int(\ud217\uc246\uff55\u6d69\u5245\u927d::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>), xor:int(ldc:int(576), ldc:int(578))), ldc:int(49)))
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
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud217\uc246\uff55\u6d69\u5245\u927d::\uc2bd\u6ec6\ub102\u92ff\u8308\u6c52, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, ldc:String("textures/gui/recipe_button.png")))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_694 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_69F : int
        
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
        var_3_694 = and:int(ldc:int(-690183108), ldc:int(-2080920027))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud217\uc246\uff55\u6d69\u5245\u927d<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(1644470593))
        }
        else {
            var_3_694 = and:int(var_3_694:int, ldc:int(-1494745425))
            var_5_89 = and:int(ldc:int(-30648), ldc:int(25523))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28221), ldc:int(11832)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_694:int, ldc:int(-1681541521))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, and:int(ldc:int(581), ldc:int(12417)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(12804), ldc:int(12805)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_694 = and:int(var_3_D9:int, ldc:int(-1148273409))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(-24288), ldc:int(-24287)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1670115604))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1277576271))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-2026337786))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-238838231))
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-152802982))
                        goto(Label_0733)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(990129702))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(745571359))
                    }
                    else {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1148211420))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0881)
                        }
                    }
                    
                    Label_0436:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1814539603))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-305798377))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-636570217))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-554238546))
                            var_11_EA = and:int(ldc:int(926), ldc:int(-927))
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0592:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1054690839))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(674168827))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(701371086))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1110573567))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1289612251))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(636669513))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-807535442))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0881)
                        }
                    }
                    
                    Label_0733:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-139478065))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-435401543))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(562554031))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1258811598))
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1601855890))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(132867255))
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-695877650))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1280935460))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(262872174))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1774970100))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-70930946))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = and:int(ldc:int(8709), ldc:int(2305))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0996:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1406991267))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1694516702))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1284021492))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1117737127))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1010520083))
                        var_11_EA = and:int(ldc:int(10537), ldc:int(-10670))
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-967669482))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-63308299))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0996)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-883066349))
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1568998467))
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(2017033285))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-138413017))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0996)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1911101913))
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1902448009))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1764378953))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                        goto(Label_1544)
                    }
                    
                    Label_1407:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1238710159))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-678685267))
                        goto(Label_0733)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1012661845))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(119896735))
                        goto(Label_0436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(-875234257))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69F = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(529400416))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-558488544))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1768287646))
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1537442067))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-2012530515))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-538986700))
                        var_17_69F = add:int(var_16_118:int, and:int(ldc:int(16421), ldc:int(5697)))
                        looporswitchbreak()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(-741808703))
                }
                
                var_3_694 = and:int(var_3_694:int, ldc:int(-1682641858))
                
                if (cmple:boolean(var_5_89 = var_17_69F:int, sub:int(var_6_90:int, xor:int(ldc:int(6), ldc:int(7))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
