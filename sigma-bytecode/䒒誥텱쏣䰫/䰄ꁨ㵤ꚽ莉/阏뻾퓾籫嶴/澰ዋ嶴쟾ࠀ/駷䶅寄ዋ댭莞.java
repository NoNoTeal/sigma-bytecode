public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e {
    public void \u99f7\u4d85\u5bc4\u12cb\ub32d\u839e() {
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
    
    public int \u3dd3\u8cae\uc87f\u67e9\u7d52\u74b1(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, java.util.function.IntSupplier p1) {
        var_3_9D : int
        var_5_6C : int
        var_6_7A : int
        var_7_86 : \uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d
        var_10_FD : int
        var_11_107 : int
        
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
        var_3_9D = and:int(ldc:int(1059566024), ldc:int(761454044))
        var_5_6C = shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(2), ldc:int(6)))
        var_6_7A = shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(1060), ldc:int(1056)))
        var_7_86 = checkcast:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d(\ud36e\u6bb9\u960f\u4c04\u64ab.\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d.class, invokevirtual:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d(ThreadLocal<\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d>::get, getfield:ThreadLocal<\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d>(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u76bc\u7006\u5245\uc910\u3e2a\u99f7, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
        
        if (cmpeq:boolean(getfield:int(\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d::\u97e6\ub6ab\u51b2\u64ab\u4492\u8aa5, var_7_86:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d), var_5_6C:int)) {
            if (cmpeq:boolean(getfield:int(\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d::\u93a2\uc31c\u1187\u5fe1\u7049\u74b1, var_7_86:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d), var_6_7A:int)) {
                goto(Label_0202)
            }
        }
        
        Label_0146:
        
        if (cmpne:boolean(and:int(var_3_9D:int, ldc:int(64)), ldc:int(0))) {
            var_3_9D = and:int(var_3_9D:int, ldc:int(758100571))
            putfield:int(\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d::\u97e6\ub6ab\u51b2\u64ab\u4492\u8aa5, var_7_86:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d, var_5_6C:int)
            putfield:int(\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d::\u93a2\uc31c\u1187\u5fe1\u7049\u74b1, var_7_86:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d, var_6_7A:int)
            putfield:int[](\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d::\u6b0d\u6c52\u6d69\u183a\u76bc\u6d69, var_7_86:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d, invokespecial:int[](\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\ub6ab\u6198\u0a06\u120d\ud523\ub8be, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, var_5_6C:int, var_6_7A:int))
        }
        
        Label_0202:
        
        if (cmpne:boolean(and:int(var_3_9D:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_9D = and:int(var_3_9D:int, ldc:int(-401488497))
            goto(Label_0146)
        }
        
        var_10_FD = or:int(shl:int(and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)), and:int(ldc:int(17428), ldc:int(4454))), and:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(15)))
        var_11_107 = loadelement:int(getfield:int[](\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d::\u6b0d\u6c52\u6d69\u183a\u76bc\u6d69, var_7_86:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d), var_10_FD:int)
        
        if (cmpeq:boolean(var_11_107:int, ldc:int(-1))) {
            return:int(storeelement:int(getfield:int[](\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d::\u6b0d\u6c52\u6d69\u183a\u76bc\u6d69, var_7_86:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d), var_10_FD:int, invokeinterface:int(IntSupplier::getAsInt, p1:IntSupplier)))
        }
        
        return:int(var_11_107:int)
    }
    
    public void \uc7fe\u836c\u759a\u71ae\ua562\u71ae(int p0, int p1) {
        var_3_1ED : int
        var_5_93 : int
        var_6_110 : int
        var_7_17A : long
        
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
            var_3_1ED = and:int(ldc:int(877325019), ldc:int(1319043228))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_3_1ED:int, ldc:int(256)), ldc:int(0))) {
                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-1912945078))
                    }
                    else {
                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-562142230))
                        invokevirtual:void(WriteLock::lock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(16777216)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_1ED = and:int(var_3_1ED:int, ldc:int(318889372))
                }
                
                var_3_1ED = and:int(var_3_1ED:int, ldc:int(-297512965))
                var_5_93 = ldc:int(-1)
                
                loop {
                    if (cmpne:boolean(and:int(var_3_1ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-1495951634))
                        
                        if (cmpgt:boolean(var_5_93:int, xor:int(ldc:int(-30720), ldc:int(-30719)))) {
                            invokevirtual:void(WriteLock::unlock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                            goto(Label_0452)
                        }
                    }
                    
                    Label_0187:
                    
                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(2087572044))
                        goto(Label_0452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(8)), ldc:int(0))) {
                            var_3_1ED = and:int(var_3_1ED:int, ldc:int(-1035118753))
                            loopcontinue()
                        }
                        
                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-854321252))
                    }
                    
                    Label_0229:
                    
                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-456002312))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0187)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_1ED = and:int(var_3_1ED:int, ldc:int(1734923717))
                            loopcontinue()
                        }
                        
                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-1083888758))
                        var_6_110 = ldc:int(-1)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_3_1ED:int, ldc:int(4096)), ldc:int(0))) {
                                var_3_1ED = and:int(var_3_1ED:int, ldc:int(127018461))
                                goto(Label_0340)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(128)), ldc:int(0))) {
                                var_3_1ED = and:int(var_3_1ED:int, ldc:int(-271033285))
                            }
                            else {
                                var_3_1ED = and:int(var_3_1ED:int, ldc:int(1145580792))
                                
                                if (cmpgt:boolean(var_6_110:int, xor:int(ldc:int(736), ldc:int(737)))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_0321:
                            
                            if (cmpne:boolean(and:int(var_3_1ED:int, ldc:int(2147483647)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_3_1ED:int, ldc:int(1048576)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_3_1ED = and:int(var_3_1ED:int, ldc:int(83503835))
                            }
                            
                            Label_0340:
                            
                            if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(128)), ldc:int(0))) {
                                goto(Label_0321)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_1ED:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_1ED = and:int(var_3_1ED:int, ldc:int(396086033))
                            }
                            else {
                                var_3_1ED = and:int(var_3_1ED:int, ldc:int(1198523036))
                                var_7_17A = invokestatic:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, add:int(p0:int, var_5_93:int), add:int(p1:int, var_6_110:int))
                                
                                do {
                                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(128)), ldc:int(0))) {
                                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-1251488797))
                                    }
                                    else {
                                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-589863492))
                                        invokevirtual:Object(Long2ObjectLinkedOpenHashMap::remove, getfield:Long2ObjectLinkedOpenHashMap<int[]>(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u4cd9\ub83f\ub83f\u0b8e\u0a06\ub7dc, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e), var_7_17A:long)
                                    }
                                } while (cmpne:boolean(and:int(var_3_1ED:int, ldc:int(4096)), ldc:int(0)))
                                
                                var_3_1ED = and:int(var_3_1ED:int, ldc:int(1596672973))
                                inc:int(var_6_110, ldc:int(1))
                            }
                        }
                        
                        inc:int(var_5_93, ldc:int(1))
                        loopcontinue()
                    }
                    
                    Label_0452:
                    
                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_1ED = and:int(var_3_1ED:int, ldc:int(-537069904))
                        goto(Label_0187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_1ED:int, ldc:int(1048576)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_1ED = and:int(var_3_1ED:int, ldc:int(41283032))
                }
                
                var_3_1ED = and:int(var_3_1ED:int, ldc:int(1713472207))
            }
            finally {
                invokevirtual:void(WriteLock::unlock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u40a9\u7ce1\ub113\u7006\ub7dc() {
        var_1_12A : int
        
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
            var_1_12A = and:int(ldc:int(-1210807517), ldc:int(-537678476))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_12A:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_12A = and:int(var_1_12A:int, ldc:int(126410099))
                        goto(Label_0257)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_12A:int, ldc:int(64)), ldc:int(0))) {
                        var_1_12A = and:int(var_1_12A:int, ldc:int(2141341606))
                        goto(Label_0205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_12A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_12A = and:int(var_1_12A:int, ldc:int(2119430138))
                    }
                    else {
                        var_1_12A = and:int(var_1_12A:int, ldc:int(458750958))
                        invokevirtual:void(WriteLock::lock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                    }
                    
                    Label_0156:
                    
                    if (cmpeq:boolean(and:int(var_1_12A:int, ldc:int(256)), ldc:int(0))) {
                        var_1_12A = and:int(var_1_12A:int, ldc:int(674255657))
                        goto(Label_0257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_12A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_12A = and:int(var_1_12A:int, ldc:int(-575066747))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_12A:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_12A = and:int(var_1_12A:int, ldc:int(1942851430))
                        invokevirtual:void(Long2ObjectLinkedOpenHashMap::clear, getfield:Long2ObjectLinkedOpenHashMap<int[]>(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u4cd9\ub83f\ub83f\u0b8e\u0a06\ub7dc, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e))
                    }
                    
                    Label_0205:
                    
                    if (cmpne:boolean(and:int(var_1_12A:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_12A:int, ldc:int(64)), ldc:int(0))) {
                            var_1_12A = and:int(var_1_12A:int, ldc:int(-1288787073))
                            goto(Label_0156)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_12A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_12A = and:int(var_1_12A:int, ldc:int(-1092591307))
                            loopcontinue()
                        }
                        
                        var_1_12A = and:int(var_1_12A:int, ldc:int(459188583))
                        invokevirtual:void(WriteLock::unlock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                    }
                    
                    Label_0257:
                    
                    if (cmpeq:boolean(and:int(var_1_12A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_12A = and:int(var_1_12A:int, ldc:int(-638034818))
                        goto(Label_0205)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_12A:int, ldc:int(4)), ldc:int(0))) {
                        var_1_12A = and:int(var_1_12A:int, ldc:int(-83666347))
                        goto(Label_0156)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_12A:int, ldc:int(1024)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_12A = and:int(var_1_12A:int, ldc:int(1071639026))
            }
            finally {
                invokevirtual:void(WriteLock::unlock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int[] \ub6ab\u6198\u0a06\u120d\ud523\ub8be(int p0, int p1) {
        var_3_2A4 : int
        var_5_6A : long
        var_7_AA : int[]
        var_3_116 : int
        var_8_1AE : int[]
        var_3_4B5 : int
        
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
        var_3_2A4 = and:int(and:int(ldc:int(-526743174), ldc:int(-117907969)), ldc:int(-722559167))
        var_5_6A = invokestatic:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, p0:int, p1:int)
        
        loop {
            Label_0108:
            
            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(67108864)), ldc:int(0))) {
                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1834638473))
            }
            else {
                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1011227304))
                invokevirtual:void(ReadLock::lock, invokevirtual:ReadLock(ReentrantReadWriteLock::readLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
            }
            
            loop {
                try {
                    if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1338172453))
                        loopcontinue(Label_0108)
                    }
                    
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-475398796))
                    var_7_AA = checkcast:int[](int[].class, invokevirtual:Object[expected:int[]](Long2ObjectLinkedOpenHashMap::get, getfield:Long2ObjectLinkedOpenHashMap<int[]>(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u4cd9\ub83f\ub83f\u0b8e\u0a06\ub7dc, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e), var_5_6A:long))
                    Label_0172:
                    
                    while (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Block_21)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(64)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-657881147))
                            invokevirtual:void(ReadLock::unlock, invokevirtual:ReadLock(ReentrantReadWriteLock::readLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                        }
                        
                        Label_0216:
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Block_23)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Block_24)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Block_25)
                        }
                    }
                    
                    goto(Label_0363)
                    Block_21:
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(9688165))
                    goto(Label_0329)
                    Block_23:
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1453807133))
                    goto(Label_0363)
                    Block_24:
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1616829589))
                    goto(Label_0329)
                    Block_25:
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-326581774))
                }
                finally {
                    loop {
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_116 = and:int(var_3_2A4:int, ldc:int(-1049549477))
                        }
                        else {
                            var_3_116 = and:int(var_3_2A4:int, ldc:int(-69492757))
                            invokevirtual:void(ReadLock::unlock, invokevirtual:ReadLock(ReentrantReadWriteLock::readLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                        }
                        
                        if (cmpne:boolean(and:int(var_3_116:int, ldc:int(524288)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_3_2A4 = and:int(var_3_116:int, ldc:int(593533722))
                    }
                    
                    var_3_2A4 = and:int(var_3_116:int, ldc:int(-360009230))
                }
                
                if (cmpeq:boolean(var_7_AA:int[], aconstnull:int[]())) {
                    goto(Label_0421)
                }
                
                Label_0329:
                
                if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-2030231820))
                        goto(Label_0216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0172)
                    }
                    
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-873489931))
                }
                
                Label_0363:
                
                if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(536914988))
                    goto(Label_0329)
                }
                
                if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1710916030))
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(512)), ldc:int(0))) {
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1272454296))
                    goto(Label_0172)
                }
                
                looporswitchbreak()
            }
            
            return:int[](var_7_AA:int[])
            Label_0421:
            var_8_1AE = newarray:int[](int.class, and:int(ldc:int(4364), ldc:int(8513)))
            
            loop {
                Label_0432:
                
                if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1427036738))
                    goto(Label_1091)
                }
                
                if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1008)
                }
                
                if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0893)
                }
                
                if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1892606799))
                    goto(Label_0803)
                }
                
                if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1097469682))
                    goto(Label_0703)
                }
                
                if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0595)
                }
                
                if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0520)
                }
                
                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-863056402))
                invokestatic:void(Arrays::fill, var_8_1AE:int[], ldc:int(-1))
                
                try {
                    loop {
                        Label_0520:
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1140849972))
                            goto(Label_1008)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0893)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0803)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(256)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(32768)), ldc:int(0))) {
                                loopcontinue(Label_0432)
                            }
                            
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-105927818))
                            invokevirtual:void(WriteLock::lock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                        }
                        
                        Label_0595:
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1091)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1008)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1467928811))
                            goto(Label_0893)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-395107413))
                            goto(Label_0803)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(64)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(41637694))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(8388608)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(64)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1791449262))
                                loopcontinue(Label_0432)
                            }
                            
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-157563035))
                            
                            if (cmplt:boolean(invokevirtual:int(Long2ObjectLinkedOpenHashMap::size, getfield:Long2ObjectLinkedOpenHashMap<int[]>(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u4cd9\ub83f\ub83f\u0b8e\u0a06\ub7dc, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)), xor:int(ldc:int(4717), ldc:int(4973)))) {
                                goto(Label_0893)
                            }
                        }
                        
                        Label_0703:
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(512)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(99072276))
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1112225591))
                            goto(Label_1008)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(207526163))
                            goto(Label_0893)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1373421046))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0595)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(134217728)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1685913018))
                                loopcontinue(Label_0432)
                            }
                            
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-896541353))
                        }
                        
                        Label_0803:
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1091)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(609475003))
                            goto(Label_1008)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1680633671))
                                goto(Label_0703)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_0595)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(76625087))
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                                loopcontinue(Label_0432)
                            }
                            
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-134563371))
                            invokevirtual:Object(Long2ObjectLinkedOpenHashMap::removeFirst, getfield:Long2ObjectLinkedOpenHashMap<int[]>(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u4cd9\ub83f\ub83f\u0b8e\u0a06\ub7dc, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e))
                        }
                        
                        Label_0893:
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1713976029))
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(32768)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1851542416))
                                goto(Label_0803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(32768)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(489748161))
                                goto(Label_0703)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1288195049))
                                goto(Label_0595)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(32768)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(1864900402))
                                loopcontinue(Label_0432)
                            }
                            
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-489099419))
                            invokevirtual:Object(Long2ObjectLinkedOpenHashMap::put, getfield:Long2ObjectLinkedOpenHashMap<int[]>(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u4cd9\ub83f\ub83f\u0b8e\u0a06\ub7dc, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e), var_5_6A:long, var_8_1AE:int[][expected:Object])
                        }
                        
                        Label_1008:
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-1981009354))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0893)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_0803)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-198181274))
                                goto(Label_0703)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_0595)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(134217728)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(1073741824)), ldc:int(0))) {
                                loopcontinue(Label_0432)
                            }
                            
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-406214696))
                            invokevirtual:void(WriteLock::unlock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                        }
                        
                        Label_1091:
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1008)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(953014463))
                            goto(Label_0893)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(512)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(180723513))
                            goto(Label_0803)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(2147098829))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2A4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(608434147))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_2A4:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-410412325))
                                loopcontinue(Label_0432)
                            }
                            
                            var_3_2A4 = and:int(var_3_2A4:int, ldc:int(-287716026))
                            looporswitchbreak()
                        }
                    }
                }
                finally {
                    var_3_4B5 = and:int(var_3_2A4:int, ldc:int(-778521233))
                    invokevirtual:void(WriteLock::unlock, invokevirtual:WriteLock(ReentrantReadWriteLock::writeLock, getfield:ReentrantReadWriteLock(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)))
                    var_3_2A4 = and:int(var_3_4B5:int, ldc:int(-119679619))
                }
                
                looporswitchbreak()
            }
            
            return:int[](var_8_1AE:int[])
        }
    }
    
    private static \ud36e\u6bb9\u960f\u4c04\u64ab.\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d lambda$\uc2bd\u759a\u4ab3\uff55\u9af2\u7049$0() {
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
            return:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d(initobject:\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d(\uc4d2\u516c\u64f2\u9a18\u6bb9\uae5d::<init>, aconstnull:\uf94d\ub18d\u5654\ubff1\u624e\ua6bd()))
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
    
    public void \ub19c\u516c\ub7dc\ud217\u446c\u5654(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65A : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_CF : double
        var_3_E1 : int
        var_11_F2 : int
        var_14_11C : double
        var_16_120 : int
        var_12_118 : double
        var_17_665 : int
        
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
        var_3_65A = and:int(ldc:int(628233976), ldc:int(-436216048))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(857368110))
        }
        else {
            var_3_65A = and:int(var_3_65A:int, ldc:int(393961298))
            var_5_89 = and:int(ldc:int(9608), ldc:int(-9609))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24482), ldc:int(21281)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E1 = and:int(var_3_65A:int, ldc:int(624760538))
                    var_9_CF = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F2 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F2:int, sub:int(var_6_90:int, xor:int(ldc:int(1536), ldc:int(1537)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F2:int, xor:int(ldc:int(24576), ldc:int(24577)))), var_7_9F:double))) {
                        inc:int(var_11_F2, ldc:int(1))
                    }
                    
                    var_3_65A = and:int(var_3_E1:int, ldc:int(893171643))
                    var_14_11C = var_7_9F:double
                    var_16_120 = var_11_F2:int
                }
                else {
                    var_11_F2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(640), ldc:int(641)))
                    var_12_118 = var_14_11C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_120 = var_11_F2:int, var_6_90:int)) {
                        var_9_CF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F2:int)
                        var_16_120 = var_11_F2:int
                        var_14_11C = var_12_118:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(752356583))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1147559011))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-827608011))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1085567551))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0719)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1681761589))
                    }
                    else {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-981739554))
                        
                        if (cmplt:boolean(var_16_120:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0600)
                            }
                            
                            goto(Label_0838)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1672023665))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1567442420))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-135290212))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-760504264))
                        goto(Label_0838)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0719)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-119702563))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1252315244))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1878488660))
                        var_11_F2 = and:int(ldc:int(-23028), ldc:int(6625))
                        goto(Label_1499)
                    }
                    
                    Label_0600:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-707870390))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1225586627))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-763825775))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(724724652))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1611538603))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11C = var_9_CF:double
                            goto(Label_0838)
                        }
                    }
                    
                    Label_0719:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(892487850))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2109511039))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1004663037))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1116031306))
                        var_14_11C = mul:double(ldc:double(0.5), add:double(var_9_CF:double, var_14_11C:double))
                    }
                    
                    Label_0838:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1108017808))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1533370703))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(618062153))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0719)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(2085176903))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-176267598))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F2 = xor:int(ldc:int(154), ldc:int(155))
                                goto(Label_1114)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1365012279))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-828370653))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0838)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(609405630))
                            goto(Label_0719)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1496622677))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(393394749))
                        var_11_F2 = and:int(ldc:int(-7893), ldc:int(6804))
                    }
                    
                    Label_1114:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0838)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1777896320))
                            goto(Label_0719)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-477357672))
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(241732503))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(670479098))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                                goto(Label_1369)
                            }
                        }
                    }
                    
                    Label_1223:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2141106741))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-2040081069))
                            goto(Label_1114)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1281887239))
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0838)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0719)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-175113100))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1699923143))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(182822860))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-705564070))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11C:double, var_5_89:int, var_16_120:int)
                        goto(Label_1499)
                    }
                    
                    Label_1369:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1896763947))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1972954512))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(201458202))
                        goto(Label_0719)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(940874321))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(-2017854530))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11C:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_665 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1930637057))
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-2110410400))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1665676146))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(713203581))
                        goto(Label_0838)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0719)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-45846795))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(938678033))
                        var_17_665 = add:int(var_16_120:int, xor:int(ldc:int(-16350), ldc:int(-16349)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65A = and:int(var_3_65A:int, ldc:int(1999748731))
                
                if (cmple:boolean(var_5_89 = var_17_665:int, sub:int(var_6_90:int, and:int(ldc:int(545), ldc:int(65))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(-1455529319))
            goto(Label_0108)
        }
    }
}
