public class \u59ec\u8413\u97e6\uc229\u3776.\u5140\u8258\u5f50\u8bb0\ub102\u6b5f {
    public static java.util.Optional<\u59ec\u8413\u97e6\uc229\u3776.\u5140\u8258\u5f50\u8bb0\ub102\u6b5f> \ua562\u3bc9\ub19c\uae5d\u12cb\uc246(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 p2) {
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
    
    public static java.util.Optional<\u59ec\u8413\u97e6\uc229\u3776.\u5140\u8258\u5f50\u8bb0\ub102\u6b5f> \u6fb0\u5f50\u5fe1\u12b2\u3e2a\u76bc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, java.util.function.Predicate<\u59ec\u8413\u97e6\uc229\u3776.\u5140\u8258\u5f50\u8bb0\ub102\u6b5f> p2, \u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 p3) {
        var_4_61 : int
        var_6_74 : Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>
        var_4_B5 : int
        stack_D5_0 : \u6c52\u156b\u4179\u5654\uceb8\u9af2 [generated]
        
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
        var_4_61 = and:int(ldc:int(1678015427), ldc:int(1145338591))
        var_6_74 = invokevirtual:Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>(Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>::filter, invokestatic:Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>(Optional<T>::of, initobject:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::<init>, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u6c52\u156b\u4179\u5654\uceb8\u9af2)), p2:Predicate<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>)
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_6_74:Optional))) {
            loop {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_4_B5 = and:int(var_4_61:int, ldc:int(525312957))
                }
                else {
                    var_4_B5 = and:int(var_4_61:int, ldc:int(-327909426))
                    
                    if (cmpeq:boolean(p3:\u6c52\u156b\u4179\u5654\uceb8\u9af2, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d))) {
                        stack_D5_0 = getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u6d69\ud523\ud51e\ube23\u7330\uc7fe)
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_B5:int, ldc:int(64)), ldc:int(0))) {
                    var_4_B5 = and:int(var_4_B5:int, ldc:int(-592020007))
                    stack_D5_0 = getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d)
                    looporswitchbreak()
                }
                
                var_4_61 = and:int(var_4_B5:int, ldc:int(1631393470))
            }
            
            return:Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>(invokevirtual:Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>(Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>::filter, invokestatic:Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>(Optional<T>::of, initobject:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::<init>, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, stack_D5_0:\u6c52\u156b\u4179\u5654\uceb8\u9af2)), p2:Predicate<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>))
        }
        
        return:Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>(var_6_74:Optional<\u5140\u8258\u5f50\u8bb0\ub102\u6b5f>)
    }
    
    public void \u5140\u8258\u5f50\u8bb0\ub102\u6b5f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 p2) {
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
            invokespecial:Object(Object::<init>, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f)
            putfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd)
            putfield:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u839e\u88c5\ub83f\u6fb0\u7049\u74b1, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, p2:\u6c52\u156b\u4179\u5654\uceb8\u9af2)
            putfield:\u760c\u4975\u4179\uc246\u8640\u64f2(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ud12e\u3d4b\u8709\u385b\ud171\ud12e, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, ternaryop:\u760c\u4975\u4179\uc246\u8640\u64f2(cmpne:boolean(p2:\u6c52\u156b\u4179\u5654\uceb8\u9af2, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d)), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f)))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, invokespecial:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u40a9\uc9f6\u120d\ub83f\u3711\u3bd6, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            
            if (cmpne:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                putfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, invokespecial:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u74b1\u4daf\ubf56\u8df4\u4daf\u8c8a, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f))
                
                if (cmpgt:boolean(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), ldc:int(0))) {
                    putfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u6435\u7043\uae5d\ufcaf\u8bb0\ud523, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, invokespecial:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\uc229\u56bd\u960f\u7873\u5140\u1833, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f))
                }
            }
            else {
                putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                putfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, xor:int(ldc:int(17417), ldc:int(17416)))
                putfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u6435\u7043\uae5d\ufcaf\u8bb0\ud523, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, xor:int(ldc:int(16388), ldc:int(16389)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u40a9\uc9f6\u120d\ub83f\u3711\u3bd6(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_7E : int
        var_4_71 : int
        var_4_AB : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_5_BC : int
        
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
            var_2_7E = and:int(ldc:int(1262671457), ldc:int(-93794519))
            var_4_71 = invokestatic:int(Math::max, and:int(ldc:int(-22193), ldc:int(21680)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(21)))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_7E:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_7E = and:int(var_2_7E:int, ldc:int(-604127738))
                }
                else {
                    var_2_7E = and:int(var_2_7E:int, ldc:int(-898369551))
                    
                    if (cmpgt:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_4_71:int)) {
                        if (invokestatic:boolean(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ub6ab\u7c6b\u8709\uf995\u494c\uc29a, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))) {
                            p0 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            loopcontinue()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_7E:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_7E = and:int(var_2_7E:int, ldc:int(1159490852))
            }
            
            var_4_AB = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, getfield:\u760c\u4975\u4179\uc246\u8640\u64f2(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ud12e\u3d4b\u8709\u385b\ud171\ud12e, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f))
            var_5_BC = sub:int(invokespecial:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u4daf\u67e9\ubcb0\u12cb\u965f\u3e75, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_4_AB:\u760c\u4975\u4179\uc246\u8640\u64f2), xor:int(ldc:int(8448), ldc:int(8449)))
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(ternaryop:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(cmpge:boolean(var_5_BC:int, ldc:int(0)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_4_AB:\u760c\u4975\u4179\uc246\u8640\u64f2, var_5_BC:int), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))
        }
        
        goto(Label_0006)
    }
    
    private int \u74b1\u4daf\ubf56\u8df4\u4daf\u8c8a() {
        var_1_5F : int
        var_3_6C : int
        stack_9E_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(508260452), ldc:int(1580181863))
            var_3_6C = invokespecial:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u4daf\u67e9\ubcb0\u12cb\u965f\u3e75, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), getfield:\u760c\u4975\u4179\uc246\u8640\u64f2(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ud12e\u3d4b\u8709\u385b\ud171\ud12e, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f))
            
            if (logicaland:boolean(cmpge:boolean(var_3_6C:int, xor:int(ldc:int(8256), ldc:int(8258))), cmple:boolean(var_3_6C:int, ldc:int(21)))) {
                stack_9E_0 = var_3_6C:int
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1532722410))
                stack_9E_0 = and:int(ldc:int(8896), ldc:int(-8897))
            }
            
            return:int(stack_9E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private int \u4daf\u67e9\ubcb0\u12cb\u965f\u3e75(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1) {
        var_3_5F : int
        var_5_67 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_6_70 : int
        var_3_7D : int
        var_7_C5 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
        var_3_5F = and:int(ldc:int(1441647989), ldc:int(-1375736705))
        var_5_67 = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
        var_6_70 = and:int(ldc:int(-17411), ldc:int(17410))
        
        loop {
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(33554432)), ldc:int(0))) {
                var_3_7D = and:int(var_3_5F:int, ldc:int(1626929604))
            }
            else {
                var_3_7D = and:int(var_3_5F:int, ldc:int(1589636628))
                
                if (cmple:boolean(var_6_70:int, ldc:int(21))) {
                    invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_5_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p1:\u760c\u4975\u4179\uc246\u8640\u64f2, var_6_70:int)
                    var_7_C5 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), var_5_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
                    
                    if (invokestatic:boolean(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ub6ab\u7c6b\u8709\uf995\u494c\uc29a, var_7_C5:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                        var_3_7D = and:int(var_3_7D:int, ldc:int(1220529444))
                        
                        if (invokeinterface:boolean(\u960f\u960f\u446c\ubb2b\u8cae\uc910::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, getstatic:\u960f\u960f\u446c\ubb2b\u8cae\uc910(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7873\u0c95\u392e\u8d90\uceb8\ubded), invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, var_5_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f))), getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), var_5_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])) {
                            var_3_5F = and:int(var_3_7D:int, ldc:int(-1829896803))
                            inc:int(var_6_70, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    else {
                        if (invokeinterface:boolean(\u960f\u960f\u446c\ubb2b\u8cae\uc910::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, getstatic:\u960f\u960f\u446c\ubb2b\u8cae\uc910(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7873\u0c95\u392e\u8d90\uceb8\ubded), var_7_C5:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), var_5_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])) {
                            return:int(var_6_70:int)
                        }
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_3_7D:int, ldc:int(2)), ldc:int(0))) {
                return:int(and:int(ldc:int(-16212), ldc:int(15939)))
            }
            
            var_3_5F = and:int(var_3_7D:int, ldc:int(1180318959))
        }
    }
    
    private int \uc229\u56bd\u960f\u7873\u5140\u1833() {
        var_1_5F : int
        var_3_67 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_4_6D : int
        stack_B4_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1027110611), ldc:int(-535356717))
            var_3_67 = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
            var_4_6D = invokespecial:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ud4fe\u4179\ube23\u6198\u6c56\ub1b9, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, var_3_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a)
            
            if (cmpge:boolean(var_4_6D:int, xor:int(ldc:int(4352), ldc:int(4355)))) {
                if (cmple:boolean(var_4_6D:int, ldc:int(21))) {
                    if (invokespecial:boolean(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u416d\u59ec\ua61f\u4f52\ufe34\u7af6, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, var_3_67:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_4_6D:int)) {
                        stack_B4_0 = var_4_6D:int
                        return:int(stack_B4_0:int)
                    }
                }
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(-1169048619))
            stack_B4_0 = and:int(ldc:int(18033), ldc:int(-18420))
            return:int(stack_B4_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u416d\u59ec\ua61f\u4f52\ufe34\u7af6(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a p0, int p1) {
        var_3_75 : int
        var_5_67 : int
        var_6_BA : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        
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
        var_3_75 = and:int(ldc:int(608212928), ldc:int(509386615))
        var_5_67 = and:int(ldc:int(27809), ldc:int(-32252))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_75:int, ldc:int(1048576)), ldc:int(0))) {
                var_3_75 = and:int(var_3_75:int, ldc:int(2072240125))
                
                if (cmplt:boolean(var_5_67:int, getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f))) {
                    var_6_BA = invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f)), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d), p1:int), getfield:\u760c\u4975\u4179\uc246\u8640\u64f2(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ud12e\u3d4b\u8709\u385b\ud171\ud12e, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), var_5_67:int)
                    
                    if (invokeinterface:boolean(\u960f\u960f\u446c\ubb2b\u8cae\uc910::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, getstatic:\u960f\u960f\u446c\ubb2b\u8cae\uc910(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7873\u0c95\u392e\u8d90\uceb8\ubded), invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), var_6_BA:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]), getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), var_6_BA:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])) {
                        var_3_75 = and:int(var_3_75:int, ldc:int(-656042071))
                        inc:int(var_5_67, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(17300), ldc:int(-18325)))
                }
            }
            
            if (cmpne:boolean(and:int(var_3_75:int, ldc:int(4096)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(20525), ldc:int(193)))
            }
            
            var_3_75 = and:int(var_3_75:int, ldc:int(-956292865))
        }
    }
    
    private int \ud4fe\u4179\ube23\u6198\u6c56\ub1b9(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a p0) {
        var_2_61 : int
        var_4_69 : int
        var_2_195 : int
        var_5_19D : int
        var_6_1F7 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_2_206 : int
        
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
        var_2_61 = and:int(ldc:int(-1995610027), ldc:int(1037007454))
        var_4_69 = and:int(ldc:int(6453), ldc:int(-6462))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1517648744))
                goto(Label_0358)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1166516787))
                goto(Label_0267)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-949191843))
                
                if (cmplt:boolean(var_4_69:int, ldc:int(21))) {
                    invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f)), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d), var_4_69:int), getfield:\u760c\u4975\u4179\uc246\u8640\u64f2(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ud12e\u3d4b\u8709\u385b\ud171\ud12e, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), ldc:int(-1))
                    
                    if (invokeinterface:boolean(\u960f\u960f\u446c\ubb2b\u8cae\uc910::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, getstatic:\u960f\u960f\u446c\ubb2b\u8cae\uc910(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7873\u0c95\u392e\u8d90\uceb8\ubded), invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]), getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])) {
                        goto(Label_0267)
                    }
                    
                    return:int(var_4_69:int)
                }
            }
            
            Label_0162:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(161812835))
                goto(Label_0358)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(676351074))
                    loopcontinue()
                }
                
                return:int(ldc:int(21))
            }
            
            Label_0267:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1417612971))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0162)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-604177028))
                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f)), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d), var_4_69:int), getfield:\u760c\u4975\u4179\uc246\u8640\u64f2(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ud12e\u3d4b\u8709\u385b\ud171\ud12e, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f))
                
                if (logicalnot:boolean(invokeinterface:boolean(\u960f\u960f\u446c\ubb2b\u8cae\uc910::\u47c2\uafe7\u9af2\u6d99\uc246\u12cb, getstatic:\u960f\u960f\u446c\ubb2b\u8cae\uc910(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7873\u0c95\u392e\u8d90\uceb8\ubded), invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]), getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]))) {
                    return:int(var_4_69:int)
                }
            }
            
            Label_0358:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1334096757))
                goto(Label_0267)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1137295652))
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                loopcontinue()
            }
            
            var_2_195 = and:int(var_2_61:int, ldc:int(-146474152))
            var_5_19D = and:int(ldc:int(-32731), ldc:int(4802))
            
            while (cmplt:boolean(var_5_19D:int, getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f))) {
                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f)), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d), var_4_69:int), getfield:\u760c\u4975\u4179\uc246\u8640\u64f2(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ud12e\u3d4b\u8709\u385b\ud171\ud12e, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), var_5_19D:int)
                var_6_1F7 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
                
                if (logicalnot:boolean(invokestatic:boolean(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ub6ab\u7c6b\u8709\uf995\u494c\uc29a, var_6_1F7:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))) {
                    return:int(var_4_69:int)
                }
                
                var_2_206 = and:int(var_2_195:int, ldc:int(527432022))
                
                if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_6_1F7:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u6c56\u9033\ube23\ub7dc\uc31c\u97e6))) {
                    putfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u600f\u4c2b\u8389\u0a06\u34df\ub70c, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f, add:int(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u600f\u4c2b\u8389\u0a06\u34df\ub70c, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), and:int(ldc:int(29581), ldc:int(113))))
                }
                
                var_2_195 = and:int(var_2_206:int, ldc:int(-504403080))
                inc:int(var_5_19D, ldc:int(1))
            }
            
            var_2_61 = and:int(var_2_195:int, ldc:int(-604079654))
            inc:int(var_4_69, ldc:int(1))
        }
    }
    
    private static boolean \ub6ab\u7c6b\u8709\uf995\u494c\uc29a(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        stack_B3_0 : int [generated]
        
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\u120d\u47c2\uafe7\u624e\ubb2b\u5654)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u6c56\u9033\ube23\ub7dc\uc31c\u97e6)))) {
                        stack_B3_0 = and:int[expected:boolean](ldc:int(3796), ldc:int(-7893))
                        return:boolean(stack_B3_0:boolean)
                    }
                }
            }
            
            stack_B3_0 = and:int[expected:boolean](ldc:int(1161), ldc:int(4131))
            return:boolean(stack_B3_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub102\ub32d\u8aa5\u8d90\uae5d\u98a4() {
        var_1_61 : int
        stack_D4_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(2010182828), ldc:int(1396104935))
            
            if (cmpne:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u7c6b\u3dd3\u6fb0\u6198\u8413\ub7dc, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                if (cmpge:boolean(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), xor:int(ldc:int(3617), ldc:int(3619)))) {
                    if (cmple:boolean(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), ldc:int(21))) {
                        if (cmpge:boolean(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u6435\u7043\uae5d\ufcaf\u8bb0\ud523, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), and:int(ldc:int(16451), ldc:int(3883)))) {
                            if (cmple:boolean(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u6435\u7043\uae5d\ufcaf\u8bb0\ud523, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), ldc:int(21))) {
                                stack_D4_0 = and:int[expected:boolean](ldc:int(2065), ldc:int(1761))
                                return:boolean(stack_D4_0:boolean)
                            }
                        }
                    }
                }
            }
            
            var_1_61 = and:int(var_1_61:int, ldc:int(2147407780))
            stack_D4_0 = and:int[expected:boolean](ldc:int(9573), ldc:int(-9574))
            return:boolean(stack_D4_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public void \u56bd\ubff1\ua6bd\u7043\u8389\ua6bd() {
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
    
    public boolean \ub6ab\ucfaf\uc246\u4c2b\uae87\u0800() {
        var_1_61 : int
        stack_A1_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1731382074), ldc:int(516406986))
            
            if (logicaland:boolean(invokevirtual:boolean(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ub102\ub32d\u8aa5\u8d90\uae5d\u98a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), cmpeq:boolean(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u600f\u4c2b\u8389\u0a06\u34df\ub70c, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), mul:int(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ua61f\uc3e3\ud171\u0c95\u385b\u36d3, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u6435\u7043\uae5d\ufcaf\u8bb0\ud523, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f))))) {
                stack_A1_0 = and:int(ldc:int(65), ldc:int(1281))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(483657434))
                stack_A1_0 = and:int(ldc:int(683), ldc:int(-8876))
            }
            
            return:boolean(stack_A1_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 \u1187\ub102\u9af2\u6ec6\u4daf\ua068(\u56bd\u8413\u647c\u5bc4\ud158.\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ua61f\u836c\uc31c\u7043\u4e72 p3) {
        var_4_13F : int
        var_6_70 : double
        var_8_7D : double
        var_10_83 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_11_97 : double
        var_16_FB : \u6c52\u156b\u4179\u5654\uceb8\u9af2
        var_14_EF : double
        stack_156_0 : \u6c52\u156b\u4179\u5654\uceb8\u9af2 [generated]
        var_16_156 : \u6c52\u156b\u4179\u5654\uceb8\u9af2
        
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
            var_4_13F = and:int(ldc:int(167439006), ldc:int(-1174486667))
            var_6_70 = sub:double(i2d:double(getfield:int(\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72::\ubefe\uff55\u071d\u71f1\u6ec6\u4ab3, p0:\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72)), f2d:double(getfield:float(\ua61f\u836c\uc31c\u7043\u4e72::\uf995\u6bb9\u7af6\u6d69\u9255\u8bb0, p3:\ua61f\u836c\uc31c\u7043\u4e72)))
            var_8_7D = sub:double(i2d:double(getfield:int(\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72::\ud36e\ud12e\ubf56\u6d99\u7043\u92ff, p0:\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72)), f2d:double(getfield:float(\ua61f\u836c\uc31c\u7043\u4e72::\u4c04\u7049\u59ec\u2dcc\u7006\u6b0d, p3:\ua61f\u836c\uc31c\u7043\u4e72)))
            var_10_83 = getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72::\u760c\u6435\u1187\ub113\u8cae\uc87f, p0:\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72)
            
            if (cmple:boolean(var_6_70:double, ldc:double(0.0))) {
                var_4_13F = and:int(var_4_13F:int, ldc:int(-1723993514))
                var_11_97 = ldc:double(0.5)
            }
            else {
                var_11_97 = invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub6ab\u3711\u92ee\u52d3\uff55\ub70c, sub:double(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ua562\u4492\ubff1\u6d99\u6bb9\u97b7, p2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, p1:\u6c52\u156b\u4179\u5654\uceb8\u9af2), f2d:double(add:float(i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u36d3\u71f1\u5654\ud217\u6d69\u960f, var_10_83:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], p1:\u6c52\u156b\u4179\u5654\uceb8\u9af2)), div:float(getfield:float(\ua61f\u836c\uc31c\u7043\u4e72::\uf995\u6bb9\u7af6\u6d69\u9255\u8bb0, p3:\ua61f\u836c\uc31c\u7043\u4e72), ldc:float(2.0f))))), ldc:double(0.0), var_6_70:double), ldc:double(0.0), ldc:double(1.0))
            }
            
            do {
                if (cmpne:boolean(and:int(var_4_13F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_13F = and:int(var_4_13F:int, ldc:int(801010461))
                    
                    if (cmple:boolean(var_8_7D:double, ldc:double(0.0))) {
                        loopcontinue()
                    }
                    
                    var_16_FB = getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u385b\ub83f\u47c2\u5245\u7c6b\uc31c)
                    var_14_EF = invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub6ab\u3711\u92ee\u52d3\uff55\ub70c, sub:double(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ua562\u4492\ubff1\u6d99\u6bb9\u97b7, p2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, var_16_FB:\u6c52\u156b\u4179\u5654\uceb8\u9af2), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u36d3\u71f1\u5654\ud217\u6d69\u960f, var_10_83:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_16_FB:\u6c52\u156b\u4179\u5654\uceb8\u9af2))), ldc:double(0.0), var_8_7D:double), ldc:double(0.0), ldc:double(1.0))
                    
                    do {
                        Label_0281:
                        
                        if (cmpne:boolean(and:int(var_4_13F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_4_13F = and:int(var_4_13F:int, ldc:int(-8825963))
                            
                            if (cmpne:boolean(p1:\u6c52\u156b\u4179\u5654\uceb8\u9af2, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d))) {
                                loopcontinue()
                            }
                            
                            stack_156_0 = getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u6d69\ud523\ud51e\ube23\u7330\uc7fe)
                            Label_0334:
                            var_16_156 = stack_156_0:\u6c52\u156b\u4179\u5654\uceb8\u9af2
                            return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, var_11_97:double, var_14_EF:double, sub:double(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ua562\u4492\ubff1\u6d99\u6bb9\u97b7, p2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, var_16_156:\u6c52\u156b\u4179\u5654\uceb8\u9af2), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u36d3\u71f1\u5654\ud217\u6d69\u960f, var_10_83:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_16_156:\u6c52\u156b\u4179\u5654\uceb8\u9af2)), ldc:double(0.5)))))
                        }
                    } while (cmpeq:boolean(and:int(var_4_13F:int, ldc:int(134217728)), ldc:int(0)))
                    
                    var_4_13F = and:int(var_4_13F:int, ldc:int(1530646583))
                    stack_156_0 = getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d)
                    goto(Label_0334)
                }
            } while (cmpne:boolean(and:int(var_4_13F:int, ldc:int(1)), ldc:int(0)))
            
            var_4_13F = and:int(var_4_13F:int, ldc:int(-276895195))
            var_14_EF = ldc:double(0.0)
            goto(Label_0281)
        }
        
        goto(Label_0006)
    }
    
    public static \u494c\u4975\ua068\u0c95\uc84e.\u183a\uc3e3\u51b2\u4f4a\u1187\u647c \u624e\u3776\ud36e\u47c2\ud36e\u5140(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72 p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ua61f\u836c\uc31c\u7043\u4e72 p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p5, float p6, float p7) {
        var_8_63 : int
        var_10_69 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_12_7E : \u6c52\u156b\u4179\u5654\uceb8\u9af2
        var_13_85 : double
        var_15_8C : double
        stack_B4_0 : int [generated]
        var_8_B2 : int
        var_17_B4 : int
        stack_EC_0 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8 [generated]
        var_8_EA : int
        var_18_EC : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_19_107 : double
        var_21_117 : double
        var_23_121 : double
        stack_150_0 : int [generated]
        var_25_150 : int
        
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
            var_8_63 = and:int(ldc:int(-443172884), ldc:int(-174590974))
            var_10_69 = getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72::\u760c\u6435\u1187\ub113\u8cae\uc87f, p1:\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72)
            var_12_7E = checkcast:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2.class, invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_10_69:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u6c52\u156b\u4179\u5654\uceb8\u9af2>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u6c52\u156b\u4179\u5654\uceb8\u9af2>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\uc229\u8753\u392e\u40a9\u4daf\u74b1)))
            var_13_85 = i2d:double(getfield:int(\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72::\ubefe\uff55\u071d\u71f1\u6ec6\u4ab3, p1:\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72))
            var_15_8C = i2d:double(getfield:int(\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72::\ud36e\ud12e\ubf56\u6d99\u7043\u92ff, p1:\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72))
            
            if (cmpne:boolean(p2:\u6c52\u156b\u4179\u5654\uceb8\u9af2, var_12_7E:\u6c52\u156b\u4179\u5654\uceb8\u9af2)) {
                var_8_63 = and:int(var_8_63:int, ldc:int(-1279793761))
                stack_B4_0 = ldc:int(90)
            }
            else {
                stack_B4_0 = and:int(ldc:int(-21850), ldc:int(21785))
            }
            
            var_8_B2 = and:int(var_8_63:int, ldc:int(765307711))
            var_17_B4 = stack_B4_0:int
            
            if (cmpne:boolean(p2:\u6c52\u156b\u4179\u5654\uceb8\u9af2, var_12_7E:\u6c52\u156b\u4179\u5654\uceb8\u9af2)) {
                var_8_B2 = and:int(var_8_B2:int, ldc:int(-201987030))
                stack_EC_0 = initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, p5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, p5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), neg:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, p5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)))
            }
            else {
                stack_EC_0 = p5:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8
            }
            
            var_8_EA = and:int(var_8_B2:int, ldc:int(2142743750))
            var_18_EC = stack_EC_0:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8
            var_19_107 = add:double(div:double(f2d:double(getfield:float(\ua61f\u836c\uc31c\u7043\u4e72::\uf995\u6bb9\u7af6\u6d69\u9255\u8bb0, p4:\ua61f\u836c\uc31c\u7043\u4e72)), ldc:double(2.0)), mul:double(sub:double(var_13_85:double, f2d:double(getfield:float(\ua61f\u836c\uc31c\u7043\u4e72::\uf995\u6bb9\u7af6\u6d69\u9255\u8bb0, p4:\ua61f\u836c\uc31c\u7043\u4e72))), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, p3:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)))
            var_21_117 = mul:double(sub:double(var_15_8C:double, f2d:double(getfield:float(\ua61f\u836c\uc31c\u7043\u4e72::\u4c04\u7049\u59ec\u2dcc\u7006\u6b0d, p4:\ua61f\u836c\uc31c\u7043\u4e72))), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, p3:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
            var_23_121 = add:double(ldc:double(0.5), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, p3:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))
            
            if (cmpne:boolean(var_12_7E:\u6c52\u156b\u4179\u5654\uceb8\u9af2, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d))) {
                var_8_EA = and:int(var_8_EA:int, ldc:int(832021458))
                stack_150_0 = and:int(ldc:int(-22816), ldc:int(20764))
            }
            else {
                stack_150_0 = xor:int(ldc:int(8265), ldc:int(8264))
            }
            
            var_25_150 = stack_150_0:int
            return:\u183a\uc3e3\u51b2\u4f4a\u1187\u647c(initobject:\u183a\uc3e3\u51b2\u4f4a\u1187\u647c(\u183a\uc3e3\u51b2\u4f4a\u1187\u647c::<init>, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_10_69:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ternaryop:double(cmpeq:boolean(var_25_150:int, ldc:int(0)), var_23_121:double, var_19_107:double)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_10_69:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), var_21_117:double), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_10_69:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ternaryop:double(cmpeq:boolean(var_25_150:int, ldc:int(0)), var_19_107:double, var_23_121:double))), var_18_EC:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, add:float(p6:float, i2f:float(var_17_B4:int)), p7:float))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ucb79\u5bc4\u40a9\uc3e3\u4d85\ub83f$2(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            invokeinterface:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, getfield:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u72f1\u7ce1\ucef1\ub83f\u516c](\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u0c95\u4975\ud36e\u446c\u69d9\u61a4, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, ldc:int(18))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u3bd6\u8df4\u120d\u2dcc\u927d\uf94d$1(\u59ec\u8413\u97e6\uc229\u3776.\u5140\u8258\u5f50\u8bb0\ub102\u6b5f p0) {
        var_1_61 : int
        stack_98_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-665717313), ldc:int(-213849601))
            
            if (logicaland:boolean(invokevirtual:boolean(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\ub102\ub32d\u8aa5\u8d90\uae5d\u98a4, p0:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), cmpeq:boolean(getfield:int(\u5140\u8258\u5f50\u8bb0\ub102\u6b5f::\u600f\u4c2b\u8389\u0a06\u34df\ub70c, p0:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f), ldc:int(0)))) {
                stack_98_0 = and:int(ldc:int(4129), ldc:int(777))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-665716289))
                stack_98_0 = and:int(ldc:int(-6291), ldc:int(6290))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4bc8\u5140\u4c04\u4975\u6cfe\u6c56$0(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
            return:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7e3f\ubb2b\ubefe\u9033\uc246\u5db4)))
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
    
    public void \u8640\u56bd\u3504\uc229\ub8be\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_685 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_690 : int
        
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
        var_3_685 = and:int(ldc:int(409542649), ldc:int(1578975231))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\u8258\u5f50\u8bb0\ub102\u6b5f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(64)), ldc:int(0))) {
            var_3_685 = and:int(var_3_685:int, ldc:int(810391128))
        }
        else {
            var_3_685 = and:int(var_3_685:int, ldc:int(-664053763))
            var_5_89 = and:int(ldc:int(26049), ldc:int(-26566))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12381), ldc:int(12380)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_685:int, ldc:int(2077300735))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, and:int(ldc:int(2561), ldc:int(8561)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(1799), ldc:int(1)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_685 = and:int(var_3_E2:int, ldc:int(511672315))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(8388), ldc:int(8389)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(658007923))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(305644187))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(316636727))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-563084657))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1052096507))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-298013028))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1360267332))
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1904979100))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(594407419))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1439960791))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(1527764985))
                        var_11_F3 = and:int(ldc:int(-15098), ldc:int(12913))
                        goto(Label_1549)
                    }
                    
                    Label_0590:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-630219366))
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-580611676))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(102698249))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-678341968))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-94213108))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-645416967))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(803577519))
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1247606234))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-343181450))
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1409625222))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1181771777))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-660410512))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(769770380))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1457537069))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-910115385))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-586942469))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(145), ldc:int(15617))
                                goto(Label_1143)
                            }
                        }
                    }
                    
                    Label_0971:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-238645383))
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1889537462))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1920588290))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1473109162))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1898936822))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(64)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1635750314))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(959830011))
                        var_11_F3 = and:int(ldc:int(823), ldc:int(-26424))
                    }
                    
                    Label_1143:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(658530441))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1943560696))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1492948567))
                            goto(Label_0971)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1645766659))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1255:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(2127649192))
                        goto(Label_1560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1356681169))
                            goto(Label_1143)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0971)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-300932376))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-707822090))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1590039084))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-802996032))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1105862659))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                        goto(Label_1549)
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(346733562))
                        goto(Label_1560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(231738222))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(94440039))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(64)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1181133194))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-626814830))
                        loopcontinue()
                    }
                    
                    var_3_685 = and:int(var_3_685:int, ldc:int(-105834501))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1549:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_690 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1560:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1046272792))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(64)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1300180777))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-446192170))
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1176041871))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-591955969))
                        var_17_690 = add:int(var_16_121:int, and:int(ldc:int(27137), ldc:int(1133)))
                        looporswitchbreak()
                    }
                }
                
                var_3_685 = and:int(var_3_685:int, ldc:int(1512800255))
                
                if (cmple:boolean(var_5_89 = var_17_690:int, sub:int(var_6_90:int, xor:int(ldc:int(4272), ldc:int(4273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
            var_3_685 = and:int(var_3_685:int, ldc:int(1442958759))
            goto(Label_0108)
        }
    }
}
