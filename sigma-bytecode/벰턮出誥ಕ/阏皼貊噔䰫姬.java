public interface \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec {
    \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf \u4e72\u5db4\u7bad\u071d\u72f1\u494c();
    
    void \ua562\u62da\uf995\u62da\uc7fe\ub1b9(\u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf p0);
    
    boolean \ub32d\u5140\u946b\u47c2\ubded\u527a();
    
    java.util.Set<java.lang.String> \u6b0d\u51fa\uc229\ud158\u071d\u3d4b();
    
    void \u3dd3\ua61f\u416d\ucb79\u6435\ucfaf(java.lang.String p0, boolean p1);
    
    void \u8350\u5245\u4f4a\u3d64\u5654\u3d64(\u5245\u8aa5\u61a4\u7049\u4cd9.\u446c\u67d0\ua562\u97b7\u6c56\u59ec p0) {
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
    
    java.lang.String \u4bc8\ua3b4\u0800\uc87f\u93a2\u97b7(int p0) {
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
        
        switch (p0:int) {
            case 19132:
                return:String(ldc:String("McRegion"))
            
            case 19133:
                return:String(ldc:String("Anvil"))
            
            default:
                return:String(ldc:String("Unknown?"))
        }
    }
    
    \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u4cd9\ud4fe\u3bd6\u983f\u8c8a\u8413();
    
    void \u52d3\ub6ab\ud36e\u7873\u6c52\u9255(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0);
    
    \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc84e\u983f\u0a06\u3d64\u5d20\u4179 \u6435\u5db4\uc31c\u7049\ubded\u3bc9();
    
    \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ubded\u9033\u5654\u6198\uc29a\uc910 \u527a\u8bb0\uceb8\u7e3f\u9937\ua61f();
    
    \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u4f52\u9937\u7e3f\u7d52\u836c\ua068(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1);
    
    boolean \u7af6\u946b\uceb8\uc246\u5d20\u6b5f();
    
    int \u12cb\u3e2a\u8389\u946b\u7043\u7043();
    
    java.lang.String \u51b2\u67e9\ua068\u4e72\u4f4a\u1187();
    
    \u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 \u1833\ub102\u72f1\u4ab3\u647c\uff55();
    
    void \ud171\u983f\u6d69\u92ee\u5fe1\u4c2b(\u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 p0);
    
    boolean \u8709\u0b8e\u6d99\u3c25\u9033\uae5d();
    
    \u6435\ub8be\u718f\u6b0d\u67e9.\u8753\u0800\u4f4a\u4975\u64ab\u4c04 \u3bc9\u6435\u47c2\uf9c5\u3a62\u6198();
    
    void \ub171\u8709\u92ff\u7ce1\ud51e\u0800(\u6435\ub8be\u718f\u6b0d\u67e9.\u8753\u0800\u4f4a\u4975\u64ab\u4c04 p0);
    
    boolean \uc87f\u71ae\u5245\uff55\u9255\u5140();
    
    void \u8bb0\u8cae\u0b8e\ub1b9\ud217\u7330(boolean p0);
    
    \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7e3f\ubff1\u718f\ub171\u72f1 \uf94d\u873d\u836c\u9a18\u718f\ud7e8();
    
    \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u51b2\u946b\ub70c\u74b1\ub19c\u4bc8();
    
    \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u0a06\u40a9\u183a\uc9f6\u40a9\u7c6b();
    
    void \u0b8e\uc84e\u4f4a\ubcb0\u5f50\ubff1(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0);
    
    \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \ub32d\u446c\uf9c5\u3504\u4c04\u7ce1();
    
    com.mojang.serialization.Lifecycle \uc2bd\ub19c\uc7fe\u6c52\u40a9\u7049();
    
    java.lang.String lambda$\u93a2\u3d4b\u72f1\uc246\u8d98\ufe34$2() {
        var_3_66 : int
        stack_90_0 : String [generated]
        expr_70 : Object[] [generated]
        
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
            var_3_66 = invokeinterface:int(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u12cb\u3e2a\u8389\u946b\u7043\u7043, this:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)
            stack_90_0 = ldc:String("0x%05X - %s")
            expr_70 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(46), ldc:int(8723)))
            storeelement:Object(expr_70:Object[], and:int(ldc:int(-29378), ldc:int(25281)), invokestatic:Integer[expected:Object](Integer::valueOf, var_3_66:int))
            storeelement:Object(expr_70:Object[], and:int(ldc:int(23121), ldc:int(1059)), invokeinterface:String[expected:Object](\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u4bc8\ua3b4\u0800\uc87f\u93a2\u97b7, this:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec, var_3_66:int))
            return:String(invokestatic:String(String::format, stack_90_0:String, expr_70:Object[]))
        }
        
        goto(Label_0006)
    }
    
    java.lang.String lambda$\uae87\u3bc9\ub7dc\u56bd\u8cae\u600f$1() {
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
            return:String(invokestatic:String(Boolean::toString, invokeinterface:boolean(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u5140\u946b\u47c2\ubded\u527a, this:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)))
        }
        
        goto(Label_0006)
    }
    
    java.lang.String lambda$\uafe7\ub113\u8413\ubcb0\u4f4a\u960f$0() {
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
            return:String(invokestatic:String(String::join, ldc:String[expected:CharSequence](", "), invokeinterface:Set<String>[expected:Iterable<? extends CharSequence>](\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u6b0d\u51fa\uc229\ud158\u071d\u3d4b, this:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)))
        }
        
        goto(Label_0006)
    }
}
