public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5654\u0800\ub1b9\ua562\u3e75\u8cae {
    public void \u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u12b2\u7049\u8df4\uc9f6\uae87.\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f p0) {
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
    
    public void \u8aa5\u3776\u8308\u446c\u3e75\uc87f() {
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
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u960f\u7ce1\u98a4\uc238\u98a4\u4f52, ldc:int(34962), getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ufe34\u8709\u3d64\u4179\u600f\u8413, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\uf995\uc2e8\u6198\u8d90\u494c(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
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
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \u5bc4\u7af6\uc87f\ub8be\u4f4a\u16f6(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
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
    
    private void \u8d90\ubff1\u0c95\u6cfe\uc229\u965f(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
        var_2_AB : int
        var_4_64 : Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>
        var_5_79 : \uc246\ub83f\u12b2\u69d9\u61a4\u52d3
        var_6_F4 : ByteBuffer
        
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
            var_2_AB = and:int(ldc:int(-885031302), ldc:int(-2013890054))
            var_4_64 = invokevirtual:Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u4ab3\u8389\uafe7\uceb8\u4d85\ua6bd, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            putfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u4daf\ucef1\u839e\u6d99\u718f\u3776, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, and:int(ldc:int(13828), ldc:int(-13829)))
            var_5_79 = checkcast:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc246\ub83f\u12b2\u69d9\u61a4\u52d3.class, invokevirtual:Object[expected:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3](Pair::getFirst, var_4_64:Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>))
            
            if (cmpne:boolean(invokevirtual:int(\uc246\ub83f\u12b2\u69d9\u61a4\u52d3::\uc229\u4975\ubb2b\u718f\u3776\u4179, var_5_79:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3), ldc:int(7))) {
                putfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u4daf\ucef1\u839e\u6d99\u718f\u3776, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, invokevirtual:int(\uc246\ub83f\u12b2\u69d9\u61a4\u52d3::\uc229\u4975\ubb2b\u718f\u3776\u4179, var_5_79:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_AB:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_AB = and:int(var_2_AB:int, ldc:int(-2021934081))
                    
                    if (cmpne:boolean(getfield:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7049\ua6bd\u759a\u6bb9\ud217\u92ee, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), aconstnull:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a())) {
                        invokevirtual:void(\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a::\u69d9\u6b5f\ucfaf\u8d98\uc31c\ud4fe, getfield:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7049\ua6bd\u759a\u6bb9\ud217\u92ee, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), checkcast:ByteBuffer(java.nio.ByteBuffer.class, invokevirtual:Object(Pair::getSecond, var_4_64:Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>)), getfield:\ub83f\u4f52\u7bad\u6b0d\u183a\u7d52(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u36d3\u494c\u3d4b\u4ab3\u4daf\u7049, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_AB:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_AB = and:int(var_2_AB:int, ldc:int(-628464419))
                }
                else {
                    var_2_AB = and:int(var_2_AB:int, ldc:int(-877488066))
                    
                    if (cmpeq:boolean(getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ufe34\u8709\u3d64\u4179\u600f\u8413, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), ldc:int(-1))) {
                        looporswitchbreak()
                    }
                    
                    var_6_F4 = checkcast:ByteBuffer(java.nio.ByteBuffer.class, invokevirtual:Object[expected:ByteBuffer](Pair::getSecond, var_4_64:Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>))
                    putfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u759a\u3e75\u9033\u40a9\u0800\u69d9, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, div:int(invokevirtual:int(Buffer::remaining, var_6_F4:ByteBuffer[expected:Buffer]), invokevirtual:int(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\ua3b4\u3d4b\uc2bd\u7d52\uc7fe\u4e72, getfield:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u836c\u7bad\ub70c\uceb8\ud12e\u6fb0, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))))
                    invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u8aa5\u3776\u8308\u446c\u3e75\uc87f, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae)
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f, ldc:int(34962), var_6_F4:ByteBuffer, ldc:int(35044))
                    invokestatic:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7ce1\u7c6b\ubb2b\ub6ab\ub19c\u36d3)
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u946b\u7043\u56bd\uc87f\uf94d\u9255(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p0, int p1) {
        var_3_97 : int
        
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
            var_3_97 = and:int(ldc:int(-1625679329), ldc:int(-545303891))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3e2a\u3e75\u071d\u72f1\u7c6b\u873d, p0:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2)
            
            if (cmpgt:boolean(getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u4daf\ucef1\u839e\u6d99\u718f\u3776, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), ldc:int(0))) {
                p1 = getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u4daf\ucef1\u839e\u6d99\u718f\u3776, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae)
            }
            
            loop {
                if (cmpne:boolean(and:int(var_3_97:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_97 = and:int(var_3_97:int, ldc:int(2132079915))
                    
                    if (cmpne:boolean(getfield:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7049\ua6bd\u759a\u6bb9\ud217\u92ee, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), aconstnull:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a())) {
                        invokevirtual:void(\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a::\ua3b4\u92ff\u4d85\u8308\uc7fe\ub6ab, getfield:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7049\ua6bd\u759a\u6bb9\ud217\u92ee, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), p1:int, getfield:\ub83f\u4f52\u7bad\u6b0d\u183a\u7d52(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u36d3\u494c\u3d4b\u4ab3\u4daf\u7049, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_97:int, ldc:int(128)), ldc:int(0))) {
                    var_3_97 = and:int(var_3_97:int, ldc:int(480787758))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u93a2\u8c8a\u16f6\uf94d\u6c56\ucfaf, p1:int, and:int(ldc:int(-890), ldc:int(889)), getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u759a\u3e75\u9033\u40a9\u0800\u69d9, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))
                    looporswitchbreak()
                }
                
                var_3_97 = and:int(var_3_97:int, ldc:int(1324041809))
            }
            
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uae87\ua3b4\u88c5\u8413\u7d52\u647c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u946b\u7043\u56bd\uc87f\uf94d\u9255(int p0) {
        var_2_92 : int
        
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
            var_2_92 = and:int(ldc:int(-1635836331), ldc:int(-30609289))
            
            if (cmpgt:boolean(getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u4daf\ucef1\u839e\u6d99\u718f\u3776, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), ldc:int(0))) {
                p0 = getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u4daf\ucef1\u839e\u6d99\u718f\u3776, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae)
            }
            
            do {
                if (cmpeq:boolean(and:int(var_2_92:int, ldc:int(4)), ldc:int(0))) {
                    var_2_92 = and:int(var_2_92:int, ldc:int(2054267716))
                }
                else {
                    var_2_92 = and:int(var_2_92:int, ldc:int(842862303))
                    
                    if (cmpeq:boolean(getfield:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7049\ua6bd\u759a\u6bb9\ud217\u92ee, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), aconstnull:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a())) {
                        loopcontinue()
                    }
                    
                    invokevirtual:void(\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a::\ua3b4\u92ff\u4d85\u8308\uc7fe\ub6ab, getfield:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7049\ua6bd\u759a\u6bb9\ud217\u92ee, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), p0:int, getfield:\ub83f\u4f52\u7bad\u6b0d\u183a\u7d52(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u36d3\u494c\u3d4b\u4ab3\u4daf\u7049, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))
                    return:void()
                }
            } while (cmpne:boolean(and:int(var_2_92:int, ldc:int(8)), ldc:int(0)))
            
            var_2_92 = and:int(var_2_92:int, ldc:int(724408407))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u93a2\u8c8a\u16f6\uf94d\u6c56\ucfaf, p0:int, and:int(ldc:int(17472), ldc:int(-17473)), getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u759a\u3e75\u9033\u40a9\u0800\u69d9, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7ce1\u7c6b\ubb2b\ub6ab\ub19c\u36d3() {
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
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u960f\u7ce1\u98a4\uc238\u98a4\u4f52, ldc:int(34962), and:int(ldc:int(-25539), ldc:int(25026)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            
            if (cmpge:boolean(getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ufe34\u8709\u3d64\u4179\u600f\u8413, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae), ldc:int(0))) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, getfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ufe34\u8709\u3d64\u4179\u600f\u8413, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))
                putfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ufe34\u8709\u3d64\u4179\u600f\u8413, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, ldc:int(-1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6198\ufe34\u6d69\u6fb0\u4c04\uc29a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a p0) {
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
            
            if (cmpne:boolean(p0:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a, aconstnull:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a())) {
                invokevirtual:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::close, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae)
                putfield:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7049\ua6bd\u759a\u6bb9\ud217\u92ee, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, p0:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a)
                putfield:\ub83f\u4f52\u7bad\u6b0d\u183a\u7d52(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u36d3\u494c\u3d4b\u4ab3\u4daf\u7049, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, initobject:\ub83f\u4f52\u7bad\u6b0d\u183a\u7d52(\ub83f\u4f52\u7bad\u6b0d\u183a\u7d52::<init>))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a \u7af6\u8cae\u9af2\u6cfe\uc4d2\u6fb0() {
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
            return:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(getfield:\u3e75\u59ec\u5245\uc4d2\u8cae\u4f4a(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u7049\ua6bd\u759a\u6bb9\ud217\u92ee, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6ec6\ua3b4\ubcb0\u74b1\uc238\ub171$3(java.lang.Runnable p0) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u446c\ubcb0\u8d98\u6c56\uc7fe\ub19c, invokedynamic:\u6b5f\u8389\ub32d\ub83f\u71f1(\u12b2\ub32d\u92ff\ud217\u3d4b\u3776:(Ljava/lang/Runnable;)L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\u6b5f\u8389\ub32d\ub83f\u71f1;, p0:Runnable))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4c2b\u69d9\u071d\u416d\u4c04\ua068$2(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
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
            invokespecial:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u8d90\ubff1\u0c95\u6cfe\uc229\u965f, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud51e\u16f6\ua61f\ubff1\ub1b9\u36d3$1(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
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
            invokespecial:void(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\u8d90\ubff1\u0c95\u6cfe\uc229\u965f, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub8be\u7873\u6cfe\u59ec\ua61f\u3e75$0(java.lang.Integer p0) {
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
            putfield:int(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::\ufe34\u8709\u3d64\u4179\u600f\u8413, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae, invokevirtual:int(Integer::intValue, p0:Integer))
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
    
    public void \ud36e\u7ce1\u3711\ub1b9\u4d85\u99f7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_659 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_664 : int
        
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
        var_3_659 = and:int(ldc:int(893709061), ldc:int(2137177817))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5654\u0800\ub1b9\ua562\u3e75\u8cae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_659 = and:int(var_3_659:int, ldc:int(-144266245))
            var_5_81 = and:int(ldc:int(10380), ldc:int(-10381))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2358), ldc:int(-2359)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_659:int, ldc:int(2001252187))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(68), ldc:int(69)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(10240), ldc:int(10241)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_659 = and:int(var_3_DA:int, ldc:int(2147191641))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(513), ldc:int(10277)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1610948487))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-490041080))
                        goto(Label_1225)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1182457951))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1958377901))
                    }
                    else {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1976696417))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(512)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(2131724405))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1264912798))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1225)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-953397246))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(2137320009))
                        var_11_EB = and:int(ldc:int(10640), ldc:int(-10705))
                        goto(Label_1503)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1164318430))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-616050493))
                        goto(Label_1225)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(1)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-2004890220))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-909650147))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-1836628549))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1217537441))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0699:
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-205549653))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(565490274))
                        goto(Label_1225)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-1923769510))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(1064882125))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0819:
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1414843929))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-1126134270))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-2444333))
                        goto(Label_1225)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(36305670))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(2059419833))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-562263574))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(-36790597))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(161), ldc:int(1091))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1225)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-733933760))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(141527746))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(2134962171))
                        var_11_EB = and:int(ldc:int(-18094), ldc:int(18092))
                    }
                    
                    Label_1101:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-2038203391))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(512)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-667667601))
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(1339698498))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-118834509))
                            loopcontinue()
                        }
                        
                        var_3_659 = and:int(var_3_659:int, ldc:int(2138622715))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1359)
                            }
                        }
                    }
                    
                    Label_1225:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-2119551502))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(1857329449))
                            goto(Label_1101)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(1063624295))
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(-792269034))
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_659 = and:int(var_3_659:int, ldc:int(2137567063))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1503)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1359:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(1)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(430460474))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(8434784))
                        goto(Label_1225)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(999082090))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(64)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(597351780))
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(2088792994))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_659 = and:int(var_3_659:int, ldc:int(-1241784549))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1503:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_664 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1514:
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-281441640))
                        goto(Label_1225)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-673888902))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(1396473763))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(128)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(211618145))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_659:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_659 = and:int(var_3_659:int, ldc:int(-10182765))
                        var_17_664 = add:int(var_16_119:int, xor:int(ldc:int(-8128), ldc:int(-8127)))
                        looporswitchbreak()
                    }
                }
                
                var_3_659 = and:int(var_3_659:int, ldc:int(1070194199))
                
                if (cmple:boolean(var_5_81 = var_17_664:int, sub:int(var_6_88:int, and:int(ldc:int(329), ldc:int(12289))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_659:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_659 = and:int(var_3_659:int, ldc:int(-1539421053))
            goto(Label_0108)
        }
    }
}
