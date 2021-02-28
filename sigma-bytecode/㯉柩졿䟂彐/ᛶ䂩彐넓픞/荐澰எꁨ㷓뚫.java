public interface \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<P> {
    com.mojang.serialization.Codec<P> \ua562\uc7fe\ufcaf\u6b0d\uf9c5\u839e();
    
    \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<P> \u927d\u51b2\uc229\u76bc\u5bc4\uc84e(java.lang.String p0, com.mojang.serialization.Codec<P> p1) {
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
    
    com.mojang.serialization.Codec lambda$\u392e\u3d4b\u52d3\u74b1\u6b0d\uc229$0(com.mojang.serialization.Codec p0) {
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
            return:Codec(p0:Codec)
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
            putstatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u98a4\u8d98\u3c25\u446c\u12b2\u93a2>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab::\u67e9\u40a9\ud12e\u446c\u93a2\u9a18, invokestatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u98a4\u8d98\u3c25\u446c\u12b2\u93a2>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<P>::\u927d\u51b2\uc229\u76bc\u5bc4\uc84e, ldc:String("single_pool_element"), getstatic:Codec<\u98a4\u8d98\u3c25\u446c\u12b2\u93a2>(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\uc4d2\u9255\u6c52\uc238\u0c95\u5fe1)))
            putstatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u392e\ub8be\ufcaf\u965f\u88c5\u92ff>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab::\u4cd9\u3dd3\u8bb0\u12b2\u3d4b\u960f, invokestatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u392e\ub8be\ufcaf\u965f\u88c5\u92ff>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<P>::\u927d\u51b2\uc229\u76bc\u5bc4\uc84e, ldc:String("list_pool_element"), getstatic:Codec<\u392e\ub8be\ufcaf\u965f\u88c5\u92ff>(\u392e\ub8be\ufcaf\u965f\u88c5\u92ff::\u5db4\u5bc4\u12cb\u7ce1\u4179\uae5d)))
            putstatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u8c8a\u946b\uc246\uf995\u392e\u8413>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab::\u6c52\ua61f\u5245\u8753\ub32d\u7049, invokestatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u8c8a\u946b\uc246\uf995\u392e\u8413>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<P>::\u927d\u51b2\uc229\u76bc\u5bc4\uc84e, ldc:String("feature_pool_element"), getstatic:Codec<\u8c8a\u946b\uc246\uf995\u392e\u8413>(\u8c8a\u946b\uc246\uf995\u392e\u8413::\u9937\u3bd6\u0b8e\ub113\u51fa\u3504)))
            putstatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u4c2b\u600f\u97e6\u071d\u647c\ua068>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab::\u647c\ud51e\ub113\ud36e\ua6bd\u93a2, invokestatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u4c2b\u600f\u97e6\u071d\u647c\ua068>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<P>::\u927d\u51b2\uc229\u76bc\u5bc4\uc84e, ldc:String("empty_pool_element"), getstatic:Codec<\u4c2b\u600f\u97e6\u071d\u647c\ua068>(\u4c2b\u600f\u97e6\u071d\u647c\ua068::\ufe34\u8d90\ub70c\u67e9\ud36e\u8389)))
            putstatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\ub8be\uc84e\ud171\u8d90\ua61f\u12b2>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab::\ube23\u7bad\u5654\u4c04\u93a2\u839e, invokestatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\ub8be\uc84e\ud171\u8d90\ua61f\u12b2>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<P>::\u927d\u51b2\uc229\u76bc\u5bc4\uc84e, ldc:String("legacy_single_pool_element"), getstatic:Codec<\ub8be\uc84e\ud171\u8d90\ua61f\u12b2>(\ub8be\uc84e\ud171\u8d90\ua61f\u12b2::\u12b2\u8308\u9a18\u8cae\ua61f\u8cae)))
            return:void()
        }
        
        goto(Label_0006)
    }
}
