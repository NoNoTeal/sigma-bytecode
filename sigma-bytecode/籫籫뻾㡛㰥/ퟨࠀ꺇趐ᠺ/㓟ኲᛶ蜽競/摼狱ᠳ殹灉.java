public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049 {
    public void \u647c\u72f1\u1833\u6bb9\u7049(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa p1) {
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
    
    public void \u647c\u72f1\u1833\u6bb9\u7049(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa p1, \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f[] p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u446c\u8308\uc29a\u6d99\ubefe<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u446c\u8308\uc29a\u6d99\ubefe<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> p4) {
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
            invokespecial:Object(Object::<init>, this:\u647c\u72f1\u1833\u6bb9\u7049)
            putfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\u647c\u72f1\u1833\u6bb9\u7049::\u9033\u6b0d\u4e72\ud7e8\u7ce1\u61a4, this:\u647c\u72f1\u1833\u6bb9\u7049, invokestatic:EnumMap[expected:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>](Maps::newEnumMap, ldc:Class<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9.class)))
            putfield:\ucb79\u7ce1\ubded\u3d64\ub171(\u647c\u72f1\u1833\u6bb9\u7049::\u61a4\u6d99\u760c\u416d\uf94d\u6ec6, this:\u647c\u72f1\u1833\u6bb9\u7049, getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u3e2a\u4d85\ub6ab\uc3e3\u416d\ub8be))
            putfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u647c\u72f1\u1833\u6bb9\u7049::\u0b8e\u8df4\u8413\ud523\u8d98\ubcb0, this:\u647c\u72f1\u1833\u6bb9\u7049, invokestatic:HashMap[expected:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>](Maps::newHashMap))
            putfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\ua61f\u839e\ubded\u3bd6\u8350\ud7e8, this:\u647c\u72f1\u1833\u6bb9\u7049, invokestatic:HashMap[expected:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>](Maps::newHashMap))
            putfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049, newarray:\uc29a\u6198\u6bb9\u4492\u965f[](\u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f.class, ldc:int(16)))
            putfield:List<\uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\u3504\uf94d\u836c\ud7e8\u3c25\ud4fe, this:\u647c\u72f1\u1833\u6bb9\u7049, invokestatic:ArrayList[expected:List<\uc31c\uc87f\uc246\u3776\ub7dc>](Lists::newArrayList))
            putfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u647c\u72f1\u1833\u6bb9\u7049::\ud158\ubf56\ub70c\u6cfe\u3e75\u7ce1, this:\u647c\u72f1\u1833\u6bb9\u7049, invokestatic:ArrayList[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>](Lists::newArrayList))
            putfield:ShortList[](\u647c\u72f1\u1833\u6bb9\u7049::\ubff1\ub32d\u7006\uc246\u873d\u3e2a, this:\u647c\u72f1\u1833\u6bb9\u7049, newarray:ShortList[](it.unimi.dsi.fastutil.shorts.ShortList.class, ldc:int(16)))
            putfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\u647c\u72f1\u1833\u6bb9\u7049::\u9255\u0b8e\u72f1\ufe34\u7043\u8350, this:\u647c\u72f1\u1833\u6bb9\u7049, invokestatic:HashMap[expected:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>](Maps::newHashMap))
            putfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(\u647c\u72f1\u1833\u6bb9\u7049::\u3711\u5f50\uceb8\u4e72\ub32d\u3711, this:\u647c\u72f1\u1833\u6bb9\u7049, invokestatic:HashMap[expected:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>](Maps::newHashMap))
            putfield:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, BitSet>(\u647c\u72f1\u1833\u6bb9\u7049::\u3e2a\ubded\uc7fe\uc246\u927d\ud171, this:\u647c\u72f1\u1833\u6bb9\u7049, initobject:Object2ObjectArrayMap[expected:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, BitSet>](Object2ObjectArrayMap::<init>))
            putfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u647c\u72f1\u1833\u6bb9\u7049::\ud51e\u946b\u4f4a\u071d\u5bc4\u4cd9, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
            putfield:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa(\u647c\u72f1\u1833\u6bb9\u7049::\u6bb9\u8308\u6bb9\u4f4a\u416d\ube23, this:\u647c\u72f1\u1833\u6bb9\u7049, p1:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa)
            putfield:\u446c\u8308\uc29a\u6d99\ubefe<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u647c\u72f1\u1833\u6bb9\u7049::\u4f52\ubff1\u6d99\u760c\ub8be\u7af6, this:\u647c\u72f1\u1833\u6bb9\u7049, p3:\u446c\u8308\uc29a\u6d99\ubefe<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)
            putfield:\u446c\u8308\uc29a\u6d99\ubefe<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\u647c\u72f1\u1833\u6bb9\u7049::\u3711\ube23\u9255\u5bc4\u69d9\u4492, this:\u647c\u72f1\u1833\u6bb9\u7049, p4:\u446c\u8308\uc29a\u6d99\ubefe<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>)
            
            if (cmpne:boolean(p2:\uc29a\u6198\u6bb9\u4492\u965f[], aconstnull:\uc29a\u6198\u6bb9\u4492\u965f[]())) {
                if (cmpne:boolean(arraylength:int(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049)), arraylength:int(p2:\uc29a\u6198\u6bb9\u4492\u965f[]))) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u647c\u72f1\u1833\u6bb9\u7049::\u071d\ubf56\uf995\u4daf\u6198\u4492), loadelement:String(getstatic:String[](\u647c\u72f1\u1833\u6bb9\u7049::\ud158\u6ec6\u6d99\u7e3f\u5bc4\ub6ab), and:int(ldc:int(17679), ldc:int(-21920))), invokestatic:Integer[expected:Object](Integer::valueOf, arraylength:int(p2:\uc29a\u6198\u6bb9\u4492\u965f[])), invokestatic:Integer[expected:Object](Integer::valueOf, arraylength:int(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049))))
                }
                else {
                    invokestatic:void(System::arraycopy, p2:\uc29a\u6198\u6bb9\u4492\u965f[][expected:Object], and:int(ldc:int(-10661), ldc:int(10532)), getfield:\uc29a\u6198\u6bb9\u4492\u965f[][expected:Object](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049), and:int(ldc:int(-16078), ldc:int(13453)), arraylength:int(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \uc238\uc31c\ua61f\u92ee\u51b2\u527a(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_64 : int
        var_5_82 : \uc29a\u6198\u6bb9\u4492\u965f
        
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
        var_4_64 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        
        if (logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7bad\ucef1\u5d20\u3bc9\ubefe\u5d20, var_4_64:int))) {
            var_5_82 = loadelement:\uc29a\u6198\u6bb9\u4492\u965f(invokevirtual:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, this:\u647c\u72f1\u1833\u6bb9\u7049), shr:int(var_4_64:int, and:int(ldc:int(12388), ldc:int(18436))))
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(ternaryop:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokestatic:boolean(\uc29a\u6198\u6bb9\u4492\u965f::\u647c\ud217\u8413\u6c56\ub70c\u3d4b, var_5_82:\uc29a\u6198\u6bb9\u4492\u965f), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc29a\u6198\u6bb9\u4492\u965f::\ud158\u4179\u8df4\u59ec\u64ab\u67d0, var_5_82:\uc29a\u6198\u6bb9\u4492\u965f, and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)), and:int(var_4_64:int, ldc:int(15)), and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)))))
        }
        
        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ua6bd\u516c\u5db4\u8bb0\ucef1\u446c)))
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u9033\u3711\u494c\u88c5\u69d9\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_66 : int
        var_5_85 : \uc29a\u6198\u6bb9\u4492\u965f
        
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
        var_4_66 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        
        if (logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7bad\ucef1\u5d20\u3bc9\ubefe\u5d20, var_4_66:int))) {
            var_5_85 = loadelement:\uc29a\u6198\u6bb9\u4492\u965f(invokevirtual:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, this:\u647c\u72f1\u1833\u6bb9\u7049), shr:int(var_4_66:int, and:int(ldc:int(133), ldc:int(516))))
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(ternaryop:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(invokestatic:boolean(\uc29a\u6198\u6bb9\u4492\u965f::\u647c\ud217\u8413\u6c56\ub70c\u3d4b, var_5_85:\uc29a\u6198\u6bb9\u4492\u965f), invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u8cae\ucb79\ud7e8\ub8be\u156b\u960f::\u74b1\u51b2\u6ec6\ub113\u5140\u8bb0, getstatic:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u718f\u8753\ua61f\u67d0\ud51e\uc87f)), invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uc29a\u6198\u6bb9\u4492\u965f::\u8aa5\u3e75\u927d\u47c2\u97b7\uf94d, var_5_85:\uc29a\u6198\u6bb9\u4492\u965f, and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)), and:int(var_4_66:int, ldc:int(15)), and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)))))
        }
        
        return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u8cae\ucb79\ud7e8\ub8be\u156b\u960f::\u74b1\u51b2\u6ec6\ub113\u5140\u8bb0, getstatic:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u718f\u8753\ua61f\u67d0\ud51e\uc87f)))
    }
    
    public java.util.stream.Stream<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u6c56\u5db4\u9937\u3bc9\u647c\ufcaf() {
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
            return:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokeinterface:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Collection<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::stream, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Collection<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>](\u647c\u72f1\u1833\u6bb9\u7049::\ud158\ubf56\ub70c\u6cfe\u3e75\u7ce1, this:\u647c\u72f1\u1833\u6bb9\u7049)))
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.shorts.ShortList[] \u9a18\u7d52\u7043\u6435\u0b8e\u3e75() {
        var_1_61 : int
        var_3_67 : ShortList[]
        var_4_71 : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_5_99 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_1_61 = and:int(ldc:int(1999016339), ldc:int(-849155141))
            var_3_67 = newarray:ShortList[](it.unimi.dsi.fastutil.shorts.ShortList.class, ldc:int(16))
            var_4_71 = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u647c\u72f1\u1833\u6bb9\u7049::\ud158\ubf56\ub70c\u6cfe\u3e75\u7ce1, this:\u647c\u72f1\u1833\u6bb9\u7049))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-180907274))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_71:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))) {
                    looporswitchbreak()
                }
                
                var_5_99 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_4_71:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                invokeinterface:boolean(ShortList::add, invokestatic:ShortList(\u8aa5\ubded\ub18d\u4f4a\u4f52::\uf9c5\u4975\u5bc4\u8308\uc2bd\ub7dc, var_3_67:ShortList[], shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_5_99:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(25092), ldc:int(6484)))), invokestatic:short(\u647c\u72f1\u1833\u6bb9\u7049::\ud4fe\u7049\u183a\uf995\u4bc8\u6198, var_5_99:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            }
            
            return:ShortList[](var_3_67:ShortList[])
        }
        
        goto(Label_0006)
    }
    
    public void \u156b\u4daf\u718f\uf9c5\u392e\u67d0(short p0, int p1) {
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
            invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u72f1\uc3e3\u8709\u4e72\u3776\ub83f, this:\u647c\u72f1\u1833\u6bb9\u7049, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u647c\u72f1\u1833\u6bb9\u7049::\ubf56\u12cb\u71ae\u873d\u7043\u6c52, p0:short, p1:int, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u647c\u72f1\u1833\u6bb9\u7049::\ud51e\u946b\u4f4a\u071d\u5bc4\u4cd9, this:\u647c\u72f1\u1833\u6bb9\u7049)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\uc3e3\u8709\u4e72\u3776\ub83f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u647c\u72f1\u1833\u6bb9\u7049::\ud158\ubf56\ub70c\u6cfe\u3e75\u7ce1, this:\u647c\u72f1\u1833\u6bb9\u7049), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u183a\u647c\u71f1\u6435\u6c52\u8df4, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \uc7fe\u4975\u3bd6\u5bc4\u8cae\u839e(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, boolean p2) {
        var_4_63 : int
        var_6_69 : int
        var_7_6F : int
        var_8_75 : int
        var_4_10D : int
        var_10_134 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_11_152 : EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>
        var_12_155 : Set<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>
        var_13_15C : Iterator<Object>
        var_14_249 : \ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9
        var_13_236 : Iterator<Object>
        
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
        var_4_63 = and:int(ldc:int(2058462470), ldc:int(-404772514))
        var_6_69 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        var_7_6F = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        var_8_75 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        
        if (cmpge:boolean(var_7_6F:int, ldc:int(0))) {
            if (cmplt:boolean(var_7_6F:int, xor:int(ldc:int(21562), ldc:int(21818)))) {
                if (cmpne:boolean(loadelement:\uc29a\u6198\u6bb9\u4492\u965f(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049), shr:int(var_7_6F:int, and:int(ldc:int(5), ldc:int(2052)))), getstatic:\uc29a\u6198\u6bb9\u4492\u965f(\ud523\u92ff\ubb2b\u759a\ud36e::\ua6bd\u8d90\ub8be\u71ae\u8413\ub8be))) {
                    goto(Label_0201)
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)))) {
                    goto(Label_0201)
                }
                
                return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            }
        }
        
        Label_0124:
        
        if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0245)
        }
        
        if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ua6bd\u516c\u5db4\u8bb0\ucef1\u446c)))
        }
        
        Label_0201:
        
        if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1258059241))
                goto(Label_0124)
            }
            
            var_4_63 = and:int(var_4_63:int, ldc:int(1993963782))
            
            if (cmpgt:boolean(invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u93a2\u16f6\u93a2\u4daf\u8389\u6ec6, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), ldc:int(0))) {
                invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u647c\u72f1\u1833\u6bb9\u7049::\ud158\ubf56\ub70c\u6cfe\u3e75\u7ce1, this:\u647c\u72f1\u1833\u6bb9\u7049), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, add:int(and:int(var_6_69:int, ldc:int(15)), invokevirtual:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u8640\u51fa\uc7fe\u5bc4\u6fb0\u1187, invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u647c\u72f1\u1833\u6bb9\u7049::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u647c\u72f1\u1833\u6bb9\u7049))), var_7_6F:int, add:int(and:int(var_8_75:int, ldc:int(15)), invokevirtual:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u47c2\u965f\u4492\u61a4\u72f1\u3a62, invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u647c\u72f1\u1833\u6bb9\u7049::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u647c\u72f1\u1833\u6bb9\u7049)))))
            }
        }
        
        Label_0245:
        
        if (cmpne:boolean(and:int(var_4_63:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0201)
        }
        
        if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
            var_4_10D = and:int(var_4_63:int, ldc:int(-1343397394))
            var_10_134 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc29a\u6198\u6bb9\u4492\u965f::\u3bd6\uc4d2\u183a\ubff1\u7e3f\u8258, invokevirtual:\uc29a\u6198\u6bb9\u4492\u965f(\u647c\u72f1\u1833\u6bb9\u7049::\uc2bd\u8709\u8389\ub113\u7af6\u120d, this:\u647c\u72f1\u1833\u6bb9\u7049, shr:int(var_7_6F:int, and:int(ldc:int(10532), ldc:int(16469)))), and:int(var_6_69:int, ldc:int(15)), and:int(var_7_6F:int, ldc:int(15)), and:int(var_8_75:int, ldc:int(15)), p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            
            if (invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, getfield:\ucb79\u7ce1\ubded\u3d64\ub171(\u647c\u72f1\u1833\u6bb9\u7049::\u61a4\u6d99\u760c\u416d\uf94d\u6ec6, this:\u647c\u72f1\u1833\u6bb9\u7049), getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u7d52\u8413\u6bb9\u983f\u3dd3\u8c8a))) {
                if (cmpne:boolean(p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_10_134:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                    if (cmpeq:boolean(invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ud523\uc87f\ub18d\ua6bd\u4cd9\uc229, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\u647c\u72f1\u1833\u6bb9\u7049[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ud523\uc87f\ub18d\ua6bd\u4cd9\uc229, var_10_134:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\u647c\u72f1\u1833\u6bb9\u7049[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                        if (cmpeq:boolean(invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u93a2\u16f6\u93a2\u4daf\u8389\u6ec6, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u93a2\u16f6\u93a2\u4daf\u8389\u6ec6, var_10_134:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u1187\ubcb0\u9a18\u9af2\uf94d\ubded, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u1187\ubcb0\u9a18\u9af2\uf94d\ubded, var_10_134:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                                    goto(Label_0323)
                                }
                            }
                        }
                    }
                    
                    var_4_10D = and:int(var_4_10D:int, ldc:int(737914310))
                    invokevirtual:void(\ube23\u51b2\u92ee\u6435\u8308\u1833::\ub83f\uf9c5\u4492\u6c52\u4c04\u960f, invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u647c\u72f1\u1833\u6bb9\u7049::\u5d20\u12cb\u6b5f\u67e9\u8389\u8258, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                }
            }
            
            Label_0323:
            var_11_152 = invokevirtual:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>(\ucb79\u7ce1\ubded\u3d64\ub171::\u385b\u74b1\uc4d2\ubcb0\u8d98\u51fa, invokevirtual:\ucb79\u7ce1\ubded\u3d64\ub171(\u647c\u72f1\u1833\u6bb9\u7049::\u8753\ud523\u6cfe\u0c95\u946b\u385b, this:\u647c\u72f1\u1833\u6bb9\u7049))
            var_12_155 = aconstnull:Set<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>()
            var_13_15C = invokevirtual:Iterator<Object>(AbstractCollection<Object>::iterator, var_11_152:AbstractCollection<Object>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_13_15C:Iterator<Object>)) {
                var_14_249 = checkcast:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9.class, invokeinterface:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(Iterator<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>::next, var_13_15C:Iterator<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>))
                
                if (cmpne:boolean(checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\u647c\u72f1\u1833\u6bb9\u7049::\u9033\u6b0d\u4e72\ud7e8\u7ce1\u61a4, this:\u647c\u72f1\u1833\u6bb9\u7049), var_14_249:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object])), aconstnull:\u8df4\u7ce1\ub6ab\u5245\u7d52())) {
                    loopcontinue()
                }
                
                if (cmpeq:boolean(var_12_155:Set<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>, aconstnull:Set<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>())) {
                    var_12_155 = invokestatic:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>[expected:Set<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>](EnumSet<E>::noneOf, ldc:Class<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9.class))
                }
                
                invokevirtual:boolean(AbstractCollection<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>::add, var_12_155:AbstractCollection<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>, var_14_249:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9)
            }
            
            if (cmpne:boolean(var_12_155:AbstractCollection<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>, aconstnull:AbstractCollection<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>())) {
                invokestatic:void(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u0c95\u8258\u071d\u3bd6\u9af2\u47c2, this:\u647c\u72f1\u1833\u6bb9\u7049[expected:\u8aa5\ubded\ub18d\u4f4a\u4f52], var_12_155:Set<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>)
            }
            
            var_13_236 = invokevirtual:Iterator<Object>(AbstractCollection<Object>::iterator, var_11_152:AbstractCollection<Object>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_13_236:Iterator<Object>)) {
                invokevirtual:boolean(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u6435\u7043\u120d\ud36e\ua068\u7330, checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\u647c\u72f1\u1833\u6bb9\u7049::\u9033\u6b0d\u4e72\ud7e8\u7ce1\u61a4, this:\u647c\u72f1\u1833\u6bb9\u7049), checkcast:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9.class, invokeinterface:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(Iterator<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>::next, var_13_236:Iterator<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>)))), and:int(var_6_69:int, ldc:int(15)), var_7_6F:int, and:int(var_8_75:int, ldc:int(15)), p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            }
            
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(var_10_134:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        }
        
        goto(Label_0124)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f \uc2bd\u8709\u8389\ub113\u7af6\u120d(int p0) {
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
            
            if (cmpeq:boolean(loadelement:\uc29a\u6198\u6bb9\u4492\u965f(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:int), getstatic:\uc29a\u6198\u6bb9\u4492\u965f(\ud523\u92ff\ubb2b\u759a\ud36e::\ua6bd\u8d90\ub8be\u71ae\u8413\ub8be))) {
                storeelement:\uc29a\u6198\u6bb9\u4492\u965f(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:int, initobject:\uc29a\u6198\u6bb9\u4492\u965f(\uc29a\u6198\u6bb9\u4492\u965f::<init>, shl:int(p0:int, xor:int(ldc:int(385), ldc:int(389)))))
            }
            
            return:\uc29a\u6198\u6bb9\u4492\u965f(loadelement:\uc29a\u6198\u6bb9\u4492\u965f(getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:int))
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\u647c\u6bb9\u7873\u759a\u69d9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p1) {
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
            invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u3bc9\uc31c\u36d3\u64ab\u4c2b\u120d, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::put, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u647c\u72f1\u1833\u6bb9\u7049::\u0b8e\u8df4\u8413\ud523\u8d98\ubcb0, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u839e\u67d0\u71f1\u4c2b\u3dd3\u156b() {
        var_3_6E : HashSet
        
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
            var_3_6E = invokestatic:HashSet(Sets::newHashSet, invokeinterface:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Iterable](Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::keySet, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\ua61f\u839e\ubded\u3bd6\u8350\ud7e8, this:\u647c\u72f1\u1833\u6bb9\u7049)))
            invokeinterface:boolean(Set<Object>::addAll, var_3_6E:HashSet<Object>[expected:Set<Object>], invokeinterface:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Collection<?>](Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::keySet, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u647c\u72f1\u1833\u6bb9\u7049::\u0b8e\u8df4\u8413\ud523\u8d98\ubcb0, this:\u647c\u72f1\u1833\u6bb9\u7049)))
            return:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(var_3_6E:HashSet<Object>)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(checkcast:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1.class, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::get, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u647c\u72f1\u1833\u6bb9\u7049::\u0b8e\u8df4\u8413\ud523\u8d98\ubcb0, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1> \u7c6b\u4179\uc2bd\u8308\uc229\u7af6() {
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
            return:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u647c\u72f1\u1833\u6bb9\u7049::\u0b8e\u8df4\u8413\ud523\u8d98\ubcb0, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
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
            invokeinterface:boolean(List<\uc31c\uc87f\uc246\u3776\ub7dc>::add, getfield:List<\uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\u3504\uf94d\u836c\ud7e8\u3c25\ud4fe, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\uc31c\uc87f\uc246\u3776\ub7dc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_4_7B : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u72f1\u8753\u8bb0\ub102\ua3b4\u3c25, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                var_4_7B = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua562\uc29a\u965f\u4cd9\uf995\u4975, p0:\u7d52\u718f\u3776\u6fb0\ub83f, var_4_7B:\uc31c\uc87f\uc246\u3776\ub7dc)
                invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, this:\u647c\u72f1\u1833\u6bb9\u7049, var_4_7B:\uc31c\uc87f\uc246\u3776\ub7dc)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> \u839e\u6ec6\uc87f\u6ec6\u67d0\ud4fe() {
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
            return:List<\uc31c\uc87f\uc246\u3776\ub7dc>(getfield:List<\uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\u3504\uf94d\u836c\ud7e8\u3c25\ud4fe, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \u8df4\u965f\u416d\uc2e8\ub6ab\u61a4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8df4\u446c\u6d69\u5fe1\u64f2 p0) {
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
            putfield:\u8df4\u446c\u6d69\u5fe1\u64f2(\u647c\u72f1\u1833\u6bb9\u7049::\u446c\u5fe1\u4daf\u2dcc\u873d\u9937, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:\u8df4\u446c\u6d69\u5fe1\u64f2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8df4\u446c\u6d69\u5fe1\u64f2 \u8c8a\u4179\u416d\u64f2\u2dcc\u3776() {
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
            return:\u8df4\u446c\u6d69\u5fe1\u64f2(getfield:\u8df4\u446c\u6d69\u5fe1\u64f2(\u647c\u72f1\u1833\u6bb9\u7049::\u446c\u5fe1\u4daf\u2dcc\u873d\u9937, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \u3711\u839e\u3a62\ubff1\ub102\u7e3f(boolean p0) {
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
            putfield:boolean(\u647c\u72f1\u1833\u6bb9\u7049::\u62da\u873d\u8709\u64f2\u98a4\u97b7, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u446c\uc7fe\u5d20\ube23\u4bc8\ud51e() {
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
            return:boolean(getfield:boolean(\u647c\u72f1\u1833\u6bb9\u7049::\u62da\u873d\u8709\u64f2\u98a4\u97b7, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 \u8753\ud523\u6cfe\u0c95\u946b\u385b() {
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
            return:\ucb79\u7ce1\ubded\u3d64\ub171(getfield:\ucb79\u7ce1\ubded\u3d64\ub171(\u647c\u72f1\u1833\u6bb9\u7049::\u61a4\u6d99\u760c\u416d\uf94d\u6ec6, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \u3e2a\u7d52\ub102\uc29a\u8d90\u0800(\u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p0) {
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
            putfield:\ucb79\u7ce1\ubded\u3d64\ub171(\u647c\u72f1\u1833\u6bb9\u7049::\u61a4\u6d99\u760c\u416d\uf94d\u6ec6, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:\ucb79\u7ce1\ubded\u3d64\ub171)
            invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u3711\u839e\u3a62\ubff1\ub102\u7e3f, this:\u647c\u72f1\u1833\u6bb9\u7049, and:int[expected:boolean](ldc:int(25169), ldc:int(257)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f[] \uc84e\u446c\u4f4a\uc910\u9a18\u416d() {
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
            return:\uc29a\u6198\u6bb9\u4492\u965f[](getfield:\uc29a\u6198\u6bb9\u4492\u965f[](\u647c\u72f1\u1833\u6bb9\u7049::\u40a9\uf94d\u7c6b\uae87\uc246\u4f4a, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\ube23\u51b2\u92ee\u6435\u8308\u1833 \u5d20\u12cb\u6b5f\u67e9\u8389\u8258() {
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
            return:\ube23\u51b2\u92ee\u6435\u8308\u1833(getfield:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u647c\u72f1\u1833\u6bb9\u7049::\u385b\u7330\u836c\u9a18\u8aa5\u1187, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<java.util.Map.Entry<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52>> \uc7fe\u1187\u7c6b\u759a\uc9f6\u3d64() {
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
            return:Collection<Entry<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>>(invokestatic:Set<Object>[expected:Collection<Entry<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>>](Collections::unmodifiableSet, invokeinterface:Set<Entry<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>>(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::entrySet, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\u647c\u72f1\u1833\u6bb9\u7049::\u9033\u6b0d\u4e72\ud7e8\u7ce1\u61a4, this:\u647c\u72f1\u1833\u6bb9\u7049))))
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\u8d90\u8753\u59ec\u56bd\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0, long[] p1) {
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
            invokevirtual:void(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u8258\u1187\u3d4b\u6cfe\u76bc\u120d, invokevirtual:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u647c\u72f1\u1833\u6bb9\u7049::\ub70c\uc84e\u9937\u759a\u385b\u0a06, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9), p1:long[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52 \ub70c\uc84e\u9937\u759a\u385b\u0a06(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0) {
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
    
    public int \u8258\u7af6\ubb2b\u6198\u6fb0\u9a18(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0, int p1, int p2) {
        var_6_72 : \u8df4\u7ce1\ub6ab\u5245\u7d52
        
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
            var_6_72 = checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\u647c\u72f1\u1833\u6bb9\u7049::\u9033\u6b0d\u4e72\ud7e8\u7ce1\u61a4, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object]))
            
            if (cmpeq:boolean(var_6_72:\u8df4\u7ce1\ub6ab\u5245\u7d52, aconstnull:\u8df4\u7ce1\ub6ab\u5245\u7d52())) {
                invokestatic:void(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u0c95\u8258\u071d\u3bd6\u9af2\u47c2, this:\u647c\u72f1\u1833\u6bb9\u7049[expected:\u8aa5\ubded\ub18d\u4f4a\u4f52], invokestatic:EnumSet<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>[expected:Set<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9>](EnumSet<E>::of, p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9))
                var_6_72 = checkcast:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52.class, invokeinterface:\u8df4\u7ce1\ub6ab\u5245\u7d52(Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>::get, getfield:Map<\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, \u8df4\u7ce1\ub6ab\u5245\u7d52>(\u647c\u72f1\u1833\u6bb9\u7049::\u9033\u6b0d\u4e72\ud7e8\u7ce1\u61a4, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9[expected:Object]))
            }
            
            return:int(sub:int(invokevirtual:int(\u8df4\u7ce1\ub6ab\u5245\u7d52::\u4daf\u4daf\ud217\ud523\u4179\u8350, var_6_72:\u8df4\u7ce1\ub6ab\u5245\u7d52, and:int(p1:int, ldc:int(15)), and:int(p2:int, ldc:int(15))), and:int(ldc:int(2865), ldc:int(3))))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c \u4f52\u4daf\uc910\ud217\uc3e3\u8d98() {
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
            return:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u647c\u72f1\u1833\u6bb9\u7049::\ud51e\u946b\u4f4a\u071d\u5bc4\u4cd9, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\ud171\u7bad\u3776\u36d3\ub83f(long p0) {
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
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?> \u64ab\u7af6\u8c8a\u9937\u40a9\u4bc8(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0) {
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
            return:\u34df\uceb8\u34df\u8640\u1187<?>(checkcast:\u34df\uceb8\u34df\u8640\u1187<?>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>.class, invokeinterface:\u34df\uceb8\u34df\u8640\u1187<?>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::get, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\u647c\u72f1\u1833\u6bb9\u7049::\u9255\u0b8e\u72f1\ufe34\u7043\u8350, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u5654\u9937\u72f1\ud4fe\u0c95<?>[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public void \uc9f6\u67e9\uc246\ubcb0\u6cfe\u3d4b(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?> p1) {
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
            invokeinterface:\u34df\uceb8\u34df\u8640\u1187<?>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::put, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\u647c\u72f1\u1833\u6bb9\u7049::\u9255\u0b8e\u72f1\ufe34\u7043\u8350, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u5654\u9937\u72f1\ud4fe\u0c95<?>, p1:\u34df\uceb8\u34df\u8640\u1187<?>)
            putfield:boolean(\u647c\u72f1\u1833\u6bb9\u7049::\u62da\u873d\u8709\u64f2\u98a4\u97b7, this:\u647c\u72f1\u1833\u6bb9\u7049, xor:int[expected:boolean](ldc:int(-31600), ldc:int(-31599)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> \u5245\u12cb\u7c6b\u72f1\uc4d2\u71f1() {
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
            return:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(invokestatic:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(Collections::unmodifiableMap, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\u647c\u72f1\u1833\u6bb9\u7049::\u9255\u0b8e\u72f1\ufe34\u7043\u8350, this:\u647c\u72f1\u1833\u6bb9\u7049)))
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\u69d9\u600f\uc87f\u40a9\ub6ab(java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> p0) {
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
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\u647c\u72f1\u1833\u6bb9\u7049::\u9255\u0b8e\u72f1\ufe34\u7043\u8350, this:\u647c\u72f1\u1833\u6bb9\u7049))
            invokeinterface:void(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::putAll, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(\u647c\u72f1\u1833\u6bb9\u7049::\u9255\u0b8e\u72f1\ufe34\u7043\u8350, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>)
            putfield:boolean(\u647c\u72f1\u1833\u6bb9\u7049::\u62da\u873d\u8709\u64f2\u98a4\u97b7, this:\u647c\u72f1\u1833\u6bb9\u7049, xor:int[expected:boolean](ldc:int(2136), ldc:int(2137)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.longs.LongSet \u9255\ub8be\u4c04\u6fb0\ub18d\u6b5f(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0) {
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
    
    public void \u4c2b\ua6bd\u7330\u839e\uae5d\u69d9(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0, long p1) {
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
    
    public java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, it.unimi.dsi.fastutil.longs.LongSet> \ua3b4\u6ec6\u62da\u71ae\u7ce1\u5140() {
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
            return:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(invokestatic:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(Collections::unmodifiableMap, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(\u647c\u72f1\u1833\u6bb9\u7049::\u3711\u5f50\uceb8\u4e72\ub32d\u3711, this:\u647c\u72f1\u1833\u6bb9\u7049)))
        }
        
        goto(Label_0006)
    }
    
    public void \ufe34\u9af2\u67d0\u8cae\ub113\uf995(java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, it.unimi.dsi.fastutil.longs.LongSet> p0) {
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
            invokeinterface:void(Map<K, V>::clear, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(\u647c\u72f1\u1833\u6bb9\u7049::\u3711\u5f50\uceb8\u4e72\ub32d\u3711, this:\u647c\u72f1\u1833\u6bb9\u7049))
            invokeinterface:void(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>::putAll, getfield:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(\u647c\u72f1\u1833\u6bb9\u7049::\u3711\u5f50\uceb8\u4e72\ub32d\u3711, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>)
            putfield:boolean(\u647c\u72f1\u1833\u6bb9\u7049::\u62da\u873d\u8709\u64f2\u98a4\u97b7, this:\u647c\u72f1\u1833\u6bb9\u7049, and:int[expected:boolean](ldc:int(8193), ldc:int(4727)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static short \ud4fe\u7049\u183a\uf995\u4bc8\u6198(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:short(i2s:short(or:int(or:int(and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)), shl:int(and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)), xor:int(ldc:int(4161), ldc:int(4165)))), shl:int(and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)), ldc:int(8)))))
        }
        
        goto(Label_0006)
    }
    
    public static \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \ubf56\u12cb\u71ae\u873d\u7043\u6c52(short p0, int p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p2) {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, add:int(and:short[expected:int](p0:short, ldc:short(15)), shl:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p2:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), xor:int(ldc:int(25665), ldc:int(25669)))), add:int(and:int(ushr:int(p0:short[expected:int], xor:int(ldc:int(3075), ldc:int(3079))), ldc:int(15)), shl:int(p1:int, and:int(ldc:int(17637), ldc:int(780)))), add:int(and:int(ushr:int(p0:short[expected:int], ldc:int(8)), ldc:int(15)), shl:int(getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p2:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), and:int(ldc:int(24725), ldc:int(358))))))
        }
        
        goto(Label_0006)
    }
    
    public void \u8350\u071d\ua61f\u5140\u2dcc\u3e2a(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            
            if (logicalnot:boolean(invokestatic:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8350\u0800\u7d52\u6d69\uf995\u67d0, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                invokeinterface:boolean(ShortList::add, invokestatic:ShortList(\u8aa5\ubded\ub18d\u4f4a\u4f52::\uf9c5\u4975\u5bc4\u8308\uc2bd\ub7dc, getfield:ShortList[](\u647c\u72f1\u1833\u6bb9\u7049::\ubff1\ub32d\u7006\uc246\u873d\u3e2a, this:\u647c\u72f1\u1833\u6bb9\u7049), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(513), ldc:int(517)))), invokestatic:short(\u647c\u72f1\u1833\u6bb9\u7049::\ud4fe\u7049\u183a\uf995\u4bc8\u6198, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.shorts.ShortList[] \u12b2\u8df4\u156b\uc9f6\u51fa\u97e6() {
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
            return:ShortList[](getfield:ShortList[](\u647c\u72f1\u1833\u6bb9\u7049::\ubff1\ub32d\u7006\uc246\u873d\u3e2a, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \u6435\uc87f\u6d69\u12cb\u7ce1\u3d64(short p0, int p1) {
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
            invokeinterface:boolean(ShortList::add, invokestatic:ShortList(\u8aa5\ubded\ub18d\u4f4a\u4f52::\uf9c5\u4975\u5bc4\u8308\uc2bd\ub7dc, getfield:ShortList[](\u647c\u72f1\u1833\u6bb9\u7049::\ubff1\ub32d\u7006\uc246\u873d\u3e2a, this:\u647c\u72f1\u1833\u6bb9\u7049), p1:int), p0:short)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u446c\u8308\uc29a\u6d99\ubefe<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> \u34df\u983f\u647c\ufcaf\ub102\u3e2a() {
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
            return:\u446c\u8308\uc29a\u6d99\ubefe<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(getfield:\u446c\u8308\uc29a\u6d99\ubefe<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u647c\u72f1\u1833\u6bb9\u7049::\u4f52\ubff1\u6d99\u760c\ub8be\u7af6, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u446c\u8308\uc29a\u6d99\ubefe<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> \uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56() {
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
            return:\u446c\u8308\uc29a\u6d99\ubefe<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(getfield:\u446c\u8308\uc29a\u6d99\ubefe<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\u647c\u72f1\u1833\u6bb9\u7049::\u3711\ube23\u9255\u5bc4\u69d9\u4492, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa \u183a\u7af6\u36d3\uc9f6\u6bb9\u5245() {
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
            return:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa(getfield:\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa(\u647c\u72f1\u1833\u6bb9\u7049::\u6bb9\u8308\u6bb9\u4f4a\u416d\ube23, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975(long p0) {
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
            putfield:long(\u647c\u72f1\u1833\u6bb9\u7049::\u718f\u6c56\uc87f\u3bc9\u16f6\ud51e, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public long \uc229\ubb2b\u62da\uc29a\u8753\u9255() {
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
            return:long(getfield:long(\u647c\u72f1\u1833\u6bb9\u7049::\u718f\u6c56\uc87f\u3bc9\u16f6\ud51e, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\u647c\u6bb9\u7873\u759a\u69d9(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
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
            invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::put, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\ua61f\u839e\ubded\u3bd6\u8350\ud7e8, this:\u647c\u72f1\u1833\u6bb9\u7049), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u647c\u72f1\u1833\u6bb9\u7049::\ud158\u6ec6\u6d99\u7e3f\u5bc4\ub6ab), and:int(ldc:int(24649), ldc:int(1539)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u647c\u72f1\u1833\u6bb9\u7049::\ud158\u6ec6\u6d99\u7e3f\u5bc4\ub6ab), xor:int(ldc:int(14339), ldc:int(14337)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u647c\u72f1\u1833\u6bb9\u7049::\ud158\u6ec6\u6d99\u7e3f\u5bc4\ub6ab), and:int(ldc:int(10371), ldc:int(515))))), p0:\uc31c\uc87f\uc246\u3776\ub7dc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> \ufe34\u0c95\uc3e3\ud171\u6435\u3bc9() {
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
            return:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(invokestatic:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(Collections::unmodifiableMap, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\ua61f\u839e\ubded\u3bd6\u8350\ud7e8, this:\u647c\u72f1\u1833\u6bb9\u7049)))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ua6bd\u6ec6\ub1b9\u7873\u7873\ub83f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\uc31c\uc87f\uc246\u3776\ub7dc(checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::get, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\ua61f\u839e\ubded\u3bd6\u8350\ud7e8, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ubefe\u4e72\u6d99\uf995\u759a\uc84e(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        var_4_67 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        stack_9A_0 : \uc31c\uc87f\uc246\u3776\ub7dc [generated]
        
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
            var_2_61 = and:int(ldc:int(1867067569), ldc:int(2111511481))
            var_4_67 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u647c\u72f1\u1833\u6bb9\u7049::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (cmpeq:boolean(var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-546480599))
                stack_9A_0 = checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::get, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\ua61f\u839e\ubded\u3bd6\u8350\ud7e8, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object]))
            }
            else {
                stack_9A_0 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u7e3f\uc229\u34df\u61a4\ud7e8\u6b0d, var_4_67:\ub83f\uc9f6\u47c2\u67d0\u7ce1, initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>))
            }
            
            return:\uc31c\uc87f\uc246\u3776\ub7dc(stack_9A_0:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public void \ud4fe\u6c56\ud217\uc4d2\u6b0d\u3776(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::remove, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u647c\u72f1\u1833\u6bb9\u7049::\u0b8e\u8df4\u8413\ud523\u8d98\ubcb0, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])
            invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>::remove, getfield:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc31c\uc87f\uc246\u3776\ub7dc>(\u647c\u72f1\u1833\u6bb9\u7049::\ua61f\u839e\ubded\u3bd6\u8350\ud7e8, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.BitSet \u516c\u873d\ud12e\u99f7\u97b7\u6d99(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc910\u98a4\u120d\u3bc9\ubcb0 p0) {
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
            return:BitSet(checkcast:BitSet(java.util.BitSet.class, invokeinterface:BitSet(Map<\uc910\u98a4\u120d\u3bc9\ubcb0, BitSet>::get, getfield:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, BitSet>(\u647c\u72f1\u1833\u6bb9\u7049::\u3e2a\ubded\uc7fe\uc246\u927d\ud171, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\uc910\u98a4\u120d\u3bc9\ubcb0[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.BitSet \ufcaf\u5140\ub6ab\u8bb0\u3d64\ufe34(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc910\u98a4\u120d\u3bc9\ubcb0 p0) {
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
    
    public void \ud523\ufe34\u6d99\ubff1\u12cb\u965f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc910\u98a4\u120d\u3bc9\ubcb0 p0, java.util.BitSet p1) {
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
            invokeinterface:BitSet(Map<\uc910\u98a4\u120d\u3bc9\ubcb0, BitSet>::put, getfield:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, BitSet>(\u647c\u72f1\u1833\u6bb9\u7049::\u3e2a\ubded\uc7fe\uc246\u927d\ud171, this:\u647c\u72f1\u1833\u6bb9\u7049), p0:\uc910\u98a4\u120d\u3bc9\ubcb0, p1:BitSet)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\u3bd6\u946b\u156b\u92ff\u6b5f(\u56bd\u8413\u647c\u5bc4\ud158.\ube23\u51b2\u92ee\u6435\u8308\u1833 p0) {
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
            putfield:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u647c\u72f1\u1833\u6bb9\u7049::\u385b\u7330\u836c\u9a18\u8aa5\u1187, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:\ube23\u51b2\u92ee\u6435\u8308\u1833)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub83f\u51fa\uc2bd\u88c5\ua6bd\uafe7() {
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
            return:boolean(getfield:boolean(\u647c\u72f1\u1833\u6bb9\u7049::\ud217\u0800\u5db4\ud523\u5f50\ucb79, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\u5fe1\uc229\u74b1\ufe34\u5bc4(boolean p0) {
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
            putfield:boolean(\u647c\u72f1\u1833\u6bb9\u7049::\ud217\u0800\u5db4\ud523\u5f50\ucb79, this:\u647c\u72f1\u1833\u6bb9\u7049, p0:boolean)
            invokevirtual:void(\u647c\u72f1\u1833\u6bb9\u7049::\u3711\u839e\u3a62\ubff1\ub102\u7e3f, this:\u647c\u72f1\u1833\u6bb9\u7049, xor:int[expected:boolean](ldc:int(16457), ldc:int(16456)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238 \uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238(invokevirtual:\u446c\u8308\uc29a\u6d99\ubefe<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>[expected:\u8258\uc238\u7e3f\u36d3\uc238](\u647c\u72f1\u1833\u6bb9\u7049::\uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238 \u34df\u983f\u647c\ufcaf\ub102\u3e2a() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238(invokevirtual:\u446c\u8308\uc29a\u6d99\ubefe<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u8258\uc238\u7e3f\u36d3\uc238](\u647c\u72f1\u1833\u6bb9\u7049::\u34df\u983f\u647c\ufcaf\ub102\u3e2a, this:\u647c\u72f1\u1833\u6bb9\u7049))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.BitSet lambda$\u36d3\ucfaf\u3bd6\ub171\u56bd\u3bd6$5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc910\u98a4\u120d\u3bc9\ubcb0 p0) {
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
            return:BitSet(initobject:BitSet(BitSet::<init>, ldc:int(65536)))
        }
        
        goto(Label_0006)
    }
    
    private static it.unimi.dsi.fastutil.longs.LongSet lambda$\uae5d\u8350\u92ff\ube23\u69d9\u6d69$4(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 p0) {
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
            return:LongSet(initobject:LongOpenHashSet[expected:LongSet](LongOpenHashSet::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static it.unimi.dsi.fastutil.longs.LongSet lambda$\u8bb0\uc3e3\ua61f\u99f7\uc2bd\u3bd6$3(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 p0) {
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
            return:LongSet(initobject:LongOpenHashSet[expected:LongSet](LongOpenHashSet::<init>))
        }
        
        goto(Label_0006)
    }
    
    private \u494c\u4975\ua068\u0c95\uc84e.\u8df4\u7ce1\ub6ab\u5245\u7d52 lambda$\u3bc9\u6c52\u3dd3\u9af2\uf94d\u40a9$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0) {
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
            return:\u8df4\u7ce1\ub6ab\u5245\u7d52(initobject:\u8df4\u7ce1\ub6ab\u5245\u7d52(\u8df4\u7ce1\ub6ab\u5245\u7d52::<init>, this:\u647c\u72f1\u1833\u6bb9\u7049[expected:\u8aa5\ubded\ub18d\u4f4a\u4f52], p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6c52\u12cb\ud158\u4492\u8753\u8258$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpne:boolean(p0:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, aconstnull:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f()), cmpne:boolean(p0:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, getstatic:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u718f\u8753\ua61f\u67d0\ud51e\uc87f))), and:int(ldc:int(22753), ldc:int(-23798)), xor:int(ldc:int(17168), ldc:int(17169))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc910\u2dcc\ub32d\u51fa\uc87f\u759a$0(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpne:boolean(p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, aconstnull:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a()), logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)))), and:int(ldc:int(-7341), ldc:int(7308)), xor:int(ldc:int(8289), ldc:int(8288))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_240 : int
        expr_6E : int [generated]
        stack_AD_0 : byte[] [generated]
        stack_AF_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_10D_0 : byte[] [generated]
        stack_157_0 : byte[] [generated]
        stack_159_0 : byte[] [generated]
        stack_18E_0 : byte[] [generated]
        stack_264_0 : byte[] [generated]
        stack_2BB_0 : byte[] [generated]
        stack_352_0 : byte[] [generated]
        stack_3A3_0 : byte[] [generated]
        stack_3F9_0 : byte[] [generated]
        var_4_22B : int
        var_3_230 : byte[]
        var_5_231 : int
        var_0_2B1 : int
        expr_2BB : byte [generated]
        stack_304_2 : byte [generated]
        stack_2E1_0 : byte [generated]
        expr_352 : byte [generated]
        expr_AF : int [generated]
        expr_DE : int [generated]
        var_2_10B : byte[]
        expr_10F : int [generated]
        var_3_391 : byte[]
        var_5_392 : int
        expr_159 : int [generated]
        var_3_3E7 : byte[]
        var_5_3E8 : int
        var_3_19A : String
        stack_21E_0 : String[] [generated]
        expr_1AC : String[] [generated]
        
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
        var_0_240 = and:int(ldc:int(-365370433), ldc:int(-893675589))
        expr_6E = arraylength:int(stack_AD_0 = stack_AF_0 = stack_DC_0 = stack_DE_0 = stack_10B_0 = stack_10D_0 = stack_157_0 = stack_159_0 = stack_18E_0 = stack_264_0 = stack_2BB_0 = stack_352_0 = stack_3A3_0 = stack_3F9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("zaF9W9kxXafPMVOlyyGht0db29Gzv09X3z9TRY1Xr11b31fRh6d5i+kroadXt1/BKbfFD7OVM7dfr1dHoSMxS8sVs0Wjp+dQ")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_22B = expr_6E:int
        var_3_230 = newarray:byte[](byte.class, expr_6E:int)
        var_5_231 = expr_6E:int
        Label_0563:
        
        while (cmpne:boolean(and:int(var_0_240:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(-943655599))
                goto(Label_0659)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(2069625851))
            var_5_231 = add:int(var_5_231:int, ldc:int(-1))
            storeelement:byte(var_3_230:byte[], var_5_231:int, xor:byte(loadelement:byte(stack_264_0:byte[], var_5_231:int), ldc:byte(89)))
            
            if (cmpne:boolean(var_5_231:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_10B_0 = stack_10D_0 = stack_157_0 = stack_159_0 = stack_18E_0 = stack_264_0 = stack_2BB_0 = stack_352_0 = stack_3A3_0 = stack_3F9_0 = var_3_230:byte[]
            goto(Label_0115)
        }
        
        var_0_240 = and:int(var_0_240:int, ldc:int(785945407))
        goto(Label_0810)
        Label_0659:
        
        while (cmpeq:boolean(and:int(var_0_240:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0563)
            }
            
            var_0_2B1 = and:int(var_0_240:int, ldc:int(-272766469))
            var_5_231 = add:int(var_5_231:int, ldc:int(-1))
            expr_2BB = stack_304_2 = loadelement(stack_2BB_0, var_5_231)
            
            if (cmplt:boolean(add:int(add:int(var_5_231:int, ldc:int(1)), neg:int(var_4_22B:int)), ldc:int(0))) {
                stack_304_2 = stack_2E1_0 = add:byte(expr_2BB:byte, loadelement:byte(var_3_230:byte[], add:int(var_5_231:int, ldc:int(1))))
                goto(Label_0753)
            }
            
            Label_0712:
            
            if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(8)), ldc:int(0))) {
                var_0_2B1 = and:int(var_0_2B1:int, ldc:int(1438835639))
            }
            else {
                var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-877942785))
                stack_304_2 = stack_2E1_0 = add:byte(expr_2BB:byte, ldc:byte(1))
            }
            
            Label_0753:
            
            if (cmpne:boolean(and:int(var_0_2B1:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0712)
            }
            
            var_0_240 = and:int(var_0_2B1:int, ldc:int(1254932923))
            storeelement:byte(var_3_230:byte[], var_5_231:int, stack_304_2:byte)
            
            if (cmpne:boolean(var_5_231:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_10B_0 = stack_10D_0 = stack_157_0 = stack_159_0 = stack_18E_0 = stack_264_0 = stack_2BB_0 = stack_352_0 = stack_3A3_0 = stack_3F9_0 = var_3_230:byte[]
            goto(Label_0180)
        }
        
        var_0_240 = and:int(var_0_240:int, ldc:int(-371889967))
        Label_0810:
        
        while (cmpne:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(278756354))
                goto(Label_0563)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(1869256127))
            var_5_231 = add:int(var_5_231:int, ldc:int(-1))
            expr_352 = loadelement:byte(stack_352_0:byte[], var_5_231:int)
            storeelement:byte(var_3_230:byte[], var_5_231:int, or:int(and:int(shl:int(expr_352:byte, xor:int(ldc:int(2180), ldc:int(2176))), ldc:int(-16)), and:int(shr:int(expr_352:byte[expected:int], xor:int(ldc:int(49), ldc:int(53))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_231:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_10B_0 = stack_10D_0 = stack_157_0 = stack_159_0 = stack_18E_0 = stack_264_0 = stack_2BB_0 = stack_352_0 = stack_3A3_0 = stack_3F9_0 = var_3_230:byte[]
            goto(Label_0227)
        }
        
        goto(Label_0659)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0350)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(-1669080351))
            goto(Label_0276)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(256)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(2010274456))
            goto(Label_0227)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(2063129599))
            expr_AF = arraylength:int(stack_AF_0:byte[])
            
            if (cmpne:boolean(expr_AF:int, ldc:int(0))) {
                var_4_22B = expr_AF:int
                var_3_230 = newarray:byte[](byte.class, expr_AF:int)
                var_5_231 = expr_AF:int
                goto(Label_0659)
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0350)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0276)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(2075979263))
            expr_DE = arraylength:int(stack_DE_0:byte[])
            
            if (cmpne:boolean(expr_DE:int, ldc:int(0))) {
                var_4_22B = expr_DE:int
                var_3_230 = newarray:byte[](byte.class, expr_DE:int)
                var_5_231 = expr_DE:int
                goto(Label_0810)
            }
        }
        
        Label_0227:
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0350)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0180)
            }
            
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(-629352449))
            var_2_10B = stack_10B_0:byte[]
            expr_10F = add:int(arraylength:int(stack_10D_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_10F:int, ldc:int(0))) {
                var_3_391 = newarray:byte[](byte.class, expr_10F:int)
                var_5_392 = expr_10F:int
                
                loop {
                    var_0_240 = and:int(var_0_240:int, ldc:int(-542315077))
                    var_5_392 = add:int(var_5_392:int, ldc:int(-1))
                    storeelement:byte(var_3_391:byte[], var_5_392:int, add:int(shl:int(loadelement:byte(stack_3A3_0:byte[], var_5_392:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_10B:byte[], add:int(var_5_392:int, and:int(ldc:int(529), ldc:int(12325)))), ldc:int(5)), xor:int(ldc:int(-32743), ldc:int(-32738)))))
                    
                    if (cmpne:boolean(var_5_392:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_10B_0 = stack_10D_0 = stack_157_0 = stack_159_0 = stack_18E_0 = stack_264_0 = stack_2BB_0 = stack_352_0 = stack_3A3_0 = stack_3F9_0 = var_3_391:byte[]
            }
        }
        
        Label_0276:
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(524288)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(-695904793))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(-103484298))
                goto(Label_0227)
            }
            
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(1437053504))
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_240 = and:int(var_0_240:int, ldc:int(-814770693))
            expr_159 = arraylength:int(stack_159_0:byte[])
            
            if (cmpne:boolean(expr_159:int, ldc:int(0))) {
                var_3_3E7 = newarray:byte[](byte.class, expr_159:int)
                var_5_3E8 = expr_159:int
                
                loop {
                    var_0_240 = and:int(var_0_240:int, ldc:int(-363091525))
                    var_5_3E8 = add:int(var_5_3E8:int, ldc:int(-1))
                    storeelement:byte(var_3_3E7:byte[], var_5_3E8:int, add:byte(loadelement:byte(stack_3F9_0:byte[], var_5_3E8:int), ldc:byte(21)))
                    
                    if (cmpne:boolean(var_5_3E8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_DC_0 = stack_DE_0 = stack_10B_0 = stack_10D_0 = stack_157_0 = stack_159_0 = stack_18E_0 = stack_264_0 = stack_2BB_0 = stack_352_0 = stack_3A3_0 = stack_3F9_0 = var_3_3E7:byte[]
            }
        }
        
        Label_0350:
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0276)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0227)
        }
        
        if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0180)
        }
        
        if (cmpne:boolean(and:int(var_0_240:int, ldc:int(131072)), ldc:int(0))) {
            var_0_240 = and:int(var_0_240:int, ldc:int(868900331))
            goto(Label_0115)
        }
        
        var_3_19A = initobject:String(String::<init>, stack_18E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_21E_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2196), ldc:int(9061)))
        expr_1AC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32221), ldc:int(-32217)))
        storeelement:String(expr_1AC:String[], and:int(ldc:int(-2161), ldc:int(2160)), invokevirtual:String[expected:String](String::substring, var_3_19A:String, and:int(ldc:int(4447), ldc:int(-14688)), xor:int(ldc:int(132), ldc:int(192))))
        storeelement:String(expr_1AC:String[], xor:int(ldc:int(2704), ldc:int(2705)), invokevirtual:String[expected:String](String::substring, var_3_19A:String, xor:int(ldc:int(109), ldc:int(41)), and:int(ldc:int(4197), ldc:int(28253))))
        storeelement:String(expr_1AC:String[], xor:int(ldc:int(776), ldc:int(778)), invokevirtual:String[expected:String](String::substring, var_3_19A:String, xor:int(ldc:int(231), ldc:int(162)), xor:int(ldc:int(-16262), ldc:int(-16324))))
        storeelement:String(expr_1AC:String[], and:int(ldc:int(24583), ldc:int(4123)), invokevirtual:String[expected:String](String::substring, var_3_19A:String, and:int(ldc:int(4294), ldc:int(10870)), and:int(ldc:int(199), ldc:int(3167))))
        putstatic:String[](\u647c\u72f1\u1833\u6bb9\u7049::\ud158\u6ec6\u6d99\u7e3f\u5bc4\ub6ab, expr_1AC:String[])
        putstatic:Logger(\u647c\u72f1\u1833\u6bb9\u7049::\u071d\ubf56\uf995\u4daf\u6198\u4492, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \uc29a\ubb2b\u8640\u839e\u72f1\u3bc9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_669 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_674 : int
        
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
        var_3_669 = and:int(ldc:int(-191054326), ldc:int(578735180))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u647c\u72f1\u1833\u6bb9\u7049[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(321679570))
        }
        else {
            var_3_669 = and:int(var_3_669:int, ldc:int(-1140876262))
            var_5_8A = and:int(ldc:int(-15450), ldc:int(3145))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18728), ldc:int(18723)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_669:int, ldc:int(-1104318644))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(12301), ldc:int(17473)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(160), ldc:int(161)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_669 = and:int(var_3_DA:int, ldc:int(-1257498469))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(16941), ldc:int(11587)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1211373513))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1957129966))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1763330921))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-424158990))
                    }
                    else {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1316201329))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1729182171))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2084304070))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(932480778))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-420161183))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-406049572))
                        var_11_EB = and:int(ldc:int(9116), ldc:int(-9184))
                        goto(Label_1517)
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1569490047))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1555486926))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1353124685))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(296144610))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(948845416))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(260459598))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1439491446))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1789938849))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1102864007))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1072463772))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(634256332))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1177976900))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1481564892))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1031633706))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(356714231))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1648602593))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1084418924))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1393647813))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(5640), ldc:int(5641))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-5130193))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1650027954))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-823043252))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1980546378))
                        var_11_EB = and:int(ldc:int(-5215), ldc:int(5134))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1022428891))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1689478006))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-617079146))
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1172984823))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-100807891))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(251370628))
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1431262632))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1792194747))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-293692996))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1517)
                    }
                    
                    Label_1389:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1338343273))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1965929971))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1291907552))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(618466459))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_674 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1945523930))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-335067676))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(305506791))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-456053589))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1303607027))
                        var_17_674 = add:int(var_16_119:int, and:int(ldc:int(16401), ldc:int(1093)))
                        looporswitchbreak()
                    }
                }
                
                var_3_669 = and:int(var_3_669:int, ldc:int(2039241194))
                
                if (cmple:boolean(var_5_8A = var_17_674:int, sub:int(var_6_91:int, and:int(ldc:int(409), ldc:int(577))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
