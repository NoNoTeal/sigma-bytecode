public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9 {
    public void \u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0) {
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
            invokespecial:Object(Object::<init>, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)
            putfield:int(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u5654\u6d99\u8640\ubefe\u8350\u5140, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, ldc:int(-1))
            putfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u718f\uc246\u4cd9\u6fb0\u9033\u52d3, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, and:int[expected:boolean](ldc:int(8749), ldc:int(1025)))
            putfield:\u927d\ub32d\u4e72\u1187\ud158\u983f(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u67e9\u7049\u3504\u4bc8\u7ce1\u51fa, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, initobject:\u927d\ub32d\u4e72\u1187\ud158\u983f(\u927d\ub32d\u4e72\u1187\ud158\u983f::<init>))
            putfield:\u927d\ub32d\u4e72\u1187\ud158\u983f(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub83f\u9a18\u4c2b\uc229\u88c5\uc31c, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, initobject:\u927d\ub32d\u4e72\u1187\ud158\u983f(\u927d\ub32d\u4e72\u1187\ud158\u983f::<init>))
            putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u873d\uceb8\u5245\u8258\u6d69\u3a62, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, ldc:double(4.9E-324))
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u1187\u3d64\u0800\ub102\ub83f\u0b8e(long p0, int p1, int p2, int p3) {
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
    
    private void \uc2bd\ucef1\ua562\u3bd6\u7873\u446c(long p0, double p1, double p2) {
        var_7_63 : int
        var_7_252 : int
        var_9_82 : \u946b\u67d0\ub18d\u4cd9\ub1b9
        stack_171_0 : double [generated]
        var_10_172 : double
        var_7_228 : int
        var_16_23B : float
        
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
        var_7_63 = and:int(ldc:int(-1863870854), ldc:int(-977800589))
        
        if (cmpne:boolean(invokevirtual:\ua068\u7af6\u3e75\u3bc9\ua562(\ucfaf\ud217\u8df4\u52d3\u446c::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))), aconstnull:\ua068\u7af6\u3e75\u3bc9\ua562())) {
            invokevirtual:void(\ucfaf\ud217\u8df4\u52d3\u446c::\ufe34\u7873\ua61f\uf94d\u3e2a\u9a18, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), p1:double, p2:double)
            return:void()
        }
        
        var_7_252 = and:int(var_7_63:int, ldc:int(-1767833997))
        var_9_82 = initobject:\u946b\u67d0\ub18d\u4cd9\ub1b9(\u946b\u67d0\ub18d\u4cd9\ub1b9::<init>, p2:double)
        invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_9_82:\u946b\u67d0\ub18d\u4cd9\ub1b9[expected:\u6435\u385b\uae5d\u7049\u8bb0])
        
        if (invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_9_82:\u946b\u67d0\ub18d\u4cd9\ub1b9[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d])) {
            return:void()
        }
        
        loop {
            if (cmpne:boolean(and:int(var_7_252:int, ldc:int(1)), ldc:int(0))) {
                var_7_252 = and:int(var_7_252:int, ldc:int(-484013325))
                goto(Label_0290)
            }
            
            if (cmpeq:boolean(and:int(var_7_252:int, ldc:int(2147483647)), ldc:int(0))) {
                var_7_252 = and:int(var_7_252:int, ldc:int(111618966))
            }
            else {
                var_7_252 = and:int(var_7_252:int, ldc:int(-1923039245))
                
                if (cmpeq:boolean(p0:long, invokevirtual:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u8308\ubb2b\u5245\ubefe\ud158, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))) {
                    if (logicalnot:boolean(getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u3e75\u64ab\ua562\u40a9\u51b2\u4bc8, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))))) {
                        goto(Label_0290)
                    }
                    
                    stack_171_0 = invokestatic:double(Math::signum, p2:double)
                    goto(Label_0351)
                }
            }
            
            Label_0211:
            
            if (cmpne:boolean(and:int(var_7_252:int, ldc:int(134217728)), ldc:int(0))) {
                var_7_252 = and:int(var_7_252:int, ldc:int(-1101812437))
            }
            else {
                if (cmpeq:boolean(and:int(var_7_252:int, ldc:int(4)), ldc:int(0))) {
                    return:void()
                }
                
                loopcontinue()
            }
            
            Label_0290:
            
            if (cmpne:boolean(and:int(var_7_252:int, ldc:int(4)), ldc:int(0))) {
                var_7_252 = and:int(var_7_252:int, ldc:int(-514644625))
                goto(Label_0211)
            }
            
            if (cmpeq:boolean(and:int(var_7_252:int, ldc:int(32768)), ldc:int(0))) {
                var_7_252 = and:int(var_7_252:int, ldc:int(1261841521))
                loopcontinue()
            }
            
            var_7_252 = and:int(var_7_252:int, ldc:int(-979135626))
            stack_171_0 = p2:double
            Label_0351:
            var_7_252 = and:int(var_7_252:int, ldc:int(-1964181513))
            var_10_172 = mul:double(stack_171_0:double, getfield:double(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u59ec\u34df\ufe34\u718f\u5db4\u7e3f, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))))
            
            if (cmpne:boolean(getfield:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud36e\ub83f\u3d64\u6d99\ucef1\ud217, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), aconstnull:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9())) {
                goto(Label_0211)
            }
            
            if (cmpne:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())) {
                invokevirtual:boolean(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u385b\ub1b9\u9255\u8c8a\u16f6\u61a4, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), div:double(mul:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u4492\u965f\u47c2\ubefe\ub32d\u7049, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), i2d:double(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uae87\ua562\uceb8\uc9f6\u600f\u74b1, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))))), i2d:double(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc910\u0c95\u5d20\u6435\ucfaf\u836c, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))))), div:double(mul:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ubcb0\u600f\u8d90\ubff1\u56bd\u927d, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), i2d:double(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\ud171\u3e75\u76bc\u99f7\u946b, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))))), i2d:double(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uff55\ua068\ubcb0\u67e9\u56bd\u071d, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))))), var_10_172:double)
                goto(Label_0211)
            }
            
            loop {
                if (cmpne:boolean(and:int(var_7_252:int, ldc:int(16384)), ldc:int(0))) {
                    var_7_252 = and:int(var_7_252:int, ldc:int(-1542913680))
                }
                else {
                    var_7_252 = and:int(var_7_252:int, ldc:int(-81199494))
                    
                    if (cmpeq:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                        goto(Label_0211)
                    }
                    
                    if (cmpne:boolean(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub8be\u6fb0\u5245\u5f50\u93a2\u40a9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), ldc:double(0.0))) {
                        if (cmpne:boolean(invokestatic:double(Math::signum, var_10_172:double), invokestatic:double(Math::signum, getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub8be\u6fb0\u5245\u5f50\u93a2\u40a9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)))) {
                            putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub8be\u6fb0\u5245\u5f50\u93a2\u40a9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, ldc:double(0.0))
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_7_252:int, ldc:int(134217728)), ldc:int(0))) {
                    var_7_228 = and:int(var_7_252:int, ldc:int(-1238444426))
                    putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub8be\u6fb0\u5245\u5f50\u93a2\u40a9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, add:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub8be\u6fb0\u5245\u5f50\u93a2\u40a9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), var_10_172:double))
                    var_16_23B = i2f:float(d2i:int(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub8be\u6fb0\u5245\u5f50\u93a2\u40a9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)))
                    
                    if (cmpeq:boolean(var_16_23B:float, ldc:float(0.0f))) {
                        return:void()
                    }
                    
                    loop {
                        if (cmpne:boolean(and:int(var_7_228:int, ldc:int(1048576)), ldc:int(0))) {
                            var_7_252 = and:int(var_7_228:int, ldc:int(1610869646))
                        }
                        else {
                            var_7_252 = and:int(var_7_228:int, ldc:int(-1795768714))
                            putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub8be\u6fb0\u5245\u5f50\u93a2\u40a9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, sub:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub8be\u6fb0\u5245\u5f50\u93a2\u40a9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), f2d:double(var_16_23B:float)))
                            
                            if (invokevirtual:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)))) {
                                if (logicalnot:boolean(invokevirtual:boolean(\uff55\ucb79\u34df\u8d90\ud523\u6d99::\ub171\u120d\u839e\u67d0\u8cae\ufcaf, invokevirtual:\uff55\ucb79\u34df\u8d90\ud523\u6d99(\u120d\u446c\uff55\u3d64\u494c\u69d9::\u56bd\ubff1\ube23\uae87\u6ec6\u8df4, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)))))) {
                                    var_7_252 = and:int(var_7_252:int, ldc:int(-1866599429))
                                    invokevirtual:void(\uc9f6\u759a\u64ab\u97e6\u9255::\uc238\u6c56\u1833\ua068\u718f\u0c95, getfield:\uc9f6\u759a\u64ab\u97e6\u9255(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ufe34\u92ee\ua61f\u3e2a\uc4d2\u7c6b, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, add:float(invokevirtual:float(\uc9f6\u759a\u64ab\u97e6\u9255::\u6bb9\uc238\u51b2\u6d69\u8c8a\u5fe1, getfield:\uc9f6\u759a\u64ab\u97e6\u9255(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ufe34\u92ee\ua61f\u3e2a\uc4d2\u7c6b, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)))), mul:float(var_16_23B:float, ldc:float(0.005f))), ldc:float(0.0f), ldc:float(0.2f)))
                                    goto(Label_0211)
                                }
                                
                                invokevirtual:void(\uff55\ucb79\u34df\u8d90\ud523\u6d99::\u3711\ud36e\u1833\u47c2\u965f\u9af2, invokevirtual:\uff55\ucb79\u34df\u8d90\ud523\u6d99(\u120d\u446c\uff55\u3d64\u494c\u69d9::\u56bd\ubff1\ube23\uae87\u6ec6\u8df4, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), f2d:double(neg:float(var_16_23B:float)))
                                goto(Label_0211)
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_7_252:int, ldc:int(4096)), ldc:int(0))) {
                            var_7_252 = and:int(var_7_252:int, ldc:int(-1485794694))
                            invokevirtual:void(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u2dcc\u9a18\u3c25\u62da\uae5d\ua562, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), f2d:double(var_16_23B:float))
                            goto(Label_0211)
                        }
                        
                        var_7_228 = and:int(var_7_252:int, ldc:int(-1118835044))
                    }
                }
            }
        }
    }
    
    private void \u6ec6\u4bc8\u385b\u3a62\u7006\u5db4(long p0, java.util.List<java.nio.file.Path> p1) {
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
            
            if (cmpne:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())) {
                invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u8d90\u6b0d\u7006\u56bd\u64f2\ua3b4, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), p1:List<Path>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud7e8\u873d\u8258\ub7dc\u156b\u647c(long p0) {
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
            invokestatic:void(\ud217\u600f\u1833\u1187\ud36e\u9255::\u6cfe\u97b7\u0c95\u7d52\u88c5\u56bd, p0:long, invokedynamic:GLFWCursorPosCallbackI(invoke:(L\u51b2\u6fb0\ufcaf\u61a4\u0800/\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9;)Lorg/lwjgl/glfw/GLFWCursorPosCallbackI;, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), invokedynamic:GLFWMouseButtonCallbackI(invoke:(L\u51b2\u6fb0\ufcaf\u61a4\u0800/\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9;)Lorg/lwjgl/glfw/GLFWMouseButtonCallbackI;, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), invokedynamic:GLFWScrollCallbackI(invoke:(L\u51b2\u6fb0\ufcaf\u61a4\u0800/\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9;)Lorg/lwjgl/glfw/GLFWScrollCallbackI;, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), invokedynamic:GLFWDropCallbackI(invoke:(L\u51b2\u6fb0\ufcaf\u61a4\u0800/\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9;)Lorg/lwjgl/glfw/GLFWDropCallbackI;, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc246\uff55\uc238\u3e2a\u5db4\ube23(long p0, double p1, double p2) {
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
    
    public void \u5f50\u3d64\u6198\u12b2\uc238\ud7e8() {
        var_1_61 : int
        var_3_65 : double
        var_5_6C : double
        var_7_B4 : double
        var_9_C2 : double
        var_11_EC : double
        var_13_F5 : double
        var_15_111 : double
        var_17_126 : double
        var_19_147 : int
        
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
            var_1_61 = and:int(ldc:int(1704258434), ldc:int(-676207151))
            var_3_65 = invokestatic:double(\u600f\u64f2\u3c25\u69d9\u3504\u156b::\ub102\u4daf\uc87f\u76bc\uafe7\u8bb0)
            var_5_6C = sub:double(var_3_65:double, getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u873d\uceb8\u5245\u8258\u6d69\u3a62, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
            putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u873d\uceb8\u5245\u8258\u6d69\u3a62, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, var_3_65:double)
            
            if (logicaland:boolean(invokevirtual:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u92ff\u7d52\ub83f\uc2e8\ud523\u69d9, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\uceb8\u983f\ub19c\ubcb0\u960f, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)))) {
                var_7_B4 = add:double(mul:double(getfield:double(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf94d\u7049\u12cb\u7006\uafe7\u494c, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), ldc:double(0.6000000238418579)), ldc:double(0.20000000298023224))
                var_9_C2 = mul:double(mul:double(mul:double(var_7_B4:double, var_7_B4:double), var_7_B4:double), ldc:double(8.0))
                
                if (logicalnot:boolean(getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4d85\ua6bd\u4cd9\u7006\u69d9\u7049, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1438251489))
                    invokevirtual:void(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u92ff\u3d4b\u7330\u1187\u4c2b\u67e9, getfield:\u927d\ub32d\u4e72\u1187\ud158\u983f(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u67e9\u7049\u3504\u4bc8\u7ce1\u51fa, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
                    invokevirtual:void(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u92ff\u3d4b\u7330\u1187\u4c2b\u67e9, getfield:\u927d\ub32d\u4e72\u1187\ud158\u983f(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub83f\u9a18\u4c2b\uc229\u88c5\uc31c, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
                    var_11_EC = mul:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ud158\u5f50\u3d64\u16f6\ufe34\ub7dc, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), var_9_C2:double)
                    var_13_F5 = mul:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uf9c5\u69d9\u69d9\uc29a\uf9c5\ubff1, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), var_9_C2:double)
                }
                else {
                    var_15_111 = invokevirtual:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u4c04\ub171\ud171\u51fa\u62da\ub6ab, getfield:\u927d\ub32d\u4e72\u1187\ud158\u983f(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u67e9\u7049\u3504\u4bc8\u7ce1\u51fa, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), mul:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ud158\u5f50\u3d64\u16f6\ufe34\ub7dc, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), var_9_C2:double), mul:double(var_5_6C:double, var_9_C2:double))
                    var_17_126 = invokevirtual:double(\u927d\ub32d\u4e72\u1187\ud158\u983f::\u4c04\ub171\ud171\u51fa\u62da\ub6ab, getfield:\u927d\ub32d\u4e72\u1187\ud158\u983f(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ub83f\u9a18\u4c2b\uc229\u88c5\uc31c, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), mul:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uf9c5\u69d9\u69d9\uc29a\uf9c5\ubff1, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), var_9_C2:double), mul:double(var_5_6C:double, var_9_C2:double))
                    var_11_EC = var_15_111:double
                    var_13_F5 = var_17_126:double
                }
                
                putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ud158\u5f50\u3d64\u16f6\ufe34\ub7dc, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, ldc:double(0.0))
                putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uf9c5\u69d9\u69d9\uc29a\uf9c5\ubff1, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, ldc:double(0.0))
                var_19_147 = xor:int(ldc:int(45), ldc:int(44))
                
                if (getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4179\uc238\ub70c\u6bb9\ub102\u6c56, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)))) {
                    var_19_147 = ldc:int(-1)
                }
                
                invokevirtual:void(\ud217\ufe34\u4d85\u6b0d\u1187\u5f50::\u8753\ua61f\u7330\ud12e\u8350\u1187, invokevirtual:\ud217\ufe34\u4d85\u6b0d\u1187\u5f50(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4c2b\ub19c\u3c25\u5654\u5654\u4179, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), var_11_EC:double, var_13_F5:double)
                
                if (cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                    invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\u4e72\u8308\u99f7\ubb2b\u74b1, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), var_11_EC:double, mul:double(var_13_F5:double, i2d:double(var_19_147:int)))
                }
            }
            else {
                putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ud158\u5f50\u3d64\u16f6\ufe34\ub7dc, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, ldc:double(0.0))
                putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uf9c5\u69d9\u69d9\uc29a\uf9c5\ubff1, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, ldc:double(0.0))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8308\ubcb0\ud158\u0c95\ub83f\ubff1() {
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
            return:boolean(getfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ud36e\u52d3\ucfaf\u927d\u5f50\ua068, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u392e\u183a\u4492\u6435\uc2bd\u8753() {
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
            return:boolean(getfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u8aa5\ua3b4\u64ab\u0b8e\u76bc\u12b2, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
        }
        
        goto(Label_0006)
    }
    
    public double \u8709\ud12e\u4c04\u8753\uc87f\u8308() {
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
            return:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u4492\u965f\u47c2\ubefe\ub32d\u7049, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
        }
        
        goto(Label_0006)
    }
    
    public double \ubefe\u3e2a\u8389\u8df4\u4cd9\ua562() {
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
            return:double(getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ubcb0\u600f\u8d90\ubff1\u56bd\u927d, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
        }
        
        goto(Label_0006)
    }
    
    public void \u92ff\u9937\ub102\uc87f\u600f\u5f50() {
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
            putfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u718f\uc246\u4cd9\u6fb0\u9033\u52d3, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, xor:int[expected:boolean](ldc:int(17), ldc:int(16)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u92ff\u7d52\ub83f\uc2e8\ud523\u69d9() {
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
            return:boolean(getfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u9937\u47c2\u0800\u873d\u759a\uc238, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
        }
        
        goto(Label_0006)
    }
    
    public void \ua6bd\u1187\u983f\u7e3f\u5140\u67d0() {
        var_1_61 : int
        
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
            var_1_61 = and:int(ldc:int(-1084360154), ldc:int(-1084621837))
            
            if (invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\uceb8\u983f\ub19c\ubcb0\u960f, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))) {
                if (logicalnot:boolean(getfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u9937\u47c2\u0800\u873d\u759a\uc238, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))) {
                    if (logicalnot:boolean(getstatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u7006\u8709\u5140\u7330\u9937))) {
                        invokestatic:void(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u61a4\u88c5\u6d69\ub102\u3bc9\ua61f)
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-41944393))
                    putfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u9937\u47c2\u0800\u873d\u759a\uc238, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, and:int[expected:boolean](ldc:int(10261), ldc:int(1091)))
                    putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u4492\u965f\u47c2\ubefe\ub32d\u7049, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, i2d:double(div:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc910\u0c95\u5d20\u6435\ucfaf\u836c, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), and:int(ldc:int(8450), ldc:int(21059)))))
                    putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ubcb0\u600f\u8d90\ubff1\u56bd\u927d, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, i2d:double(div:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uff55\ua068\ubcb0\u67e9\u56bd\u071d, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), and:int(ldc:int(15), ldc:int(114)))))
                    invokestatic:void(\ud217\u600f\u1833\u1187\ud36e\u9255::\u0a06\u3e75\u839e\u385b\ub8be\u759a, invokevirtual:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u8308\ubb2b\u5245\ubefe\ud158, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), ldc:int(212995), getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u4492\u965f\u47c2\ubefe\ub32d\u7049, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ubcb0\u600f\u8d90\ubff1\u56bd\u927d, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
                    putfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3504\u0800\ub6ab\u4f4a\u946b\u71ae, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), xor:int(ldc:int(1204), ldc:int(9124)))
                    putfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u718f\uc246\u4cd9\u6fb0\u9033\u52d3, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, xor:int[expected:boolean](ldc:int(20480), ldc:int(20481)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u56bd\u76bc\u7ce1\ub18d\u759a\ubb2b() {
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
            
            if (getfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u9937\u47c2\u0800\u873d\u759a\uc238, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)) {
                putfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u9937\u47c2\u0800\u873d\u759a\uc238, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, and:int[expected:boolean](ldc:int(-13044), ldc:int(12403)))
                putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u4492\u965f\u47c2\ubefe\ub32d\u7049, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, i2d:double(div:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc910\u0c95\u5d20\u6435\ucfaf\u836c, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), xor:int(ldc:int(25088), ldc:int(25090)))))
                putfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ubcb0\u600f\u8d90\ubff1\u56bd\u927d, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, i2d:double(div:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uff55\ua068\ubcb0\u67e9\u56bd\u071d, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), and:int(ldc:int(3090), ldc:int(21030)))))
                invokestatic:void(\ud217\u600f\u1833\u1187\ud36e\u9255::\u0a06\u3e75\u839e\u385b\ub8be\u759a, invokevirtual:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u8308\ubb2b\u5245\ubefe\ud158, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))), ldc:int(212993), getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u4492\u965f\u47c2\ubefe\ub32d\u7049, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), getfield:double(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ubcb0\u600f\u8d90\ubff1\u56bd\u927d, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\u6c52\u8258\u7bad\u67e9\u624e() {
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
            putfield:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u718f\uc246\u4cd9\u6fb0\u9033\u52d3, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, xor:int[expected:boolean](ldc:int(65), ldc:int(64)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud158\ud4fe\ufcaf\u6d69\u34df\u52d3$11(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753 p0, double p1, double p2, double p3, double p4) {
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
            invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\u3776\uae87\ud171\ubb2b\u3bc9\uafe7, p0:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, p1:double, p2:double, getfield:int(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u5654\u6d99\u8640\ubefe\u8350\u5140, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9), p3:double, p4:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u4ab3\uafe7\uc31c\uc910\u97e6\u99f7$10(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753 p0, double p1, double p2) {
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
            invokeinterface:void(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\ua3b4\uf9c5\u8308\u6c52\u4f4a\u965f, p0:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, p1:double, p2:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud158\u6cfe\uc229\uc238\ucb79\uc3e3$9(long p0, int p1, long p2) {
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
    
    private void lambda$\u8258\u0b8e\u965f\u51b2\u927d\u156b$8(long p0, java.nio.file.Path[] p1) {
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
            invokespecial:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u6ec6\u4bc8\u385b\u3a62\u7006\u5db4, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, p0:long, invokestatic:List<Path>(Arrays::asList, p1:Path[]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u759a\uc87f\u6b0d\uc31c\ub7dc\u600f$7(long p0, double p1, double p2) {
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
    
    private void lambda$\uae5d\u946b\u7bad\ufe34\u5140\uc29a$6(long p0, double p1, double p2) {
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
            invokespecial:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc2bd\ucef1\ua562\u3bd6\u7873\u446c, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, p0:long, p1:double, p2:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u416d\uceb8\ub83f\ud158\u36d3\u6bb9$5(long p0, int p1, int p2, int p3) {
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
    
    private void lambda$\ucb79\u6b5f\u385b\ua562\u8cae\uc246$4(long p0, int p1, int p2, int p3) {
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
            invokespecial:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u1187\u3d64\u0800\ub102\ub83f\u0b8e, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, p0:long, p1:int, p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u92ff\ud12e\uc7fe\ud12e\ub6ab\u0b8e$3(long p0, double p1, double p2) {
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
    
    private void lambda$\u416d\u5245\uc4d2\u647c\u64f2\uc2e8$2(long p0, double p1, double p2) {
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
            invokespecial:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\uff55\uc238\u3e2a\u5db4\ube23, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9, p0:long, p1:double, p2:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub70c\u8df4\ud4fe\u34df\ub32d\u8aa5$1(boolean[] p0, double p1, double p2, int p3) {
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
            storeelement:boolean(p0:boolean[], and:int(ldc:int(4762), ldc:int(-4763)), invokevirtual:boolean(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\ucb79\ua61f\ub18d\u416d\u416d\uc246, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), p1:double, p2:double, p3:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u156b\uceb8\u446c\u6fb0\u4ab3\u839e$0(boolean[] p0, double p1, double p2, int p3) {
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
            storeelement:boolean(p0:boolean[], and:int(ldc:int(20), ldc:int(-21)), invokevirtual:boolean(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\uc246\ubefe\u1833\ud12e\u92ff\u6435, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9)), p1:double, p2:double, p3:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_211 : int
        expr_6E : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_14A_0 : byte[] [generated]
        stack_224_0 : byte[] [generated]
        stack_276_0 : byte[] [generated]
        stack_2E7_0 : byte[] [generated]
        stack_33D_0 : byte[] [generated]
        var_4_1FC : int
        var_3_201 : byte[]
        var_5_202 : int
        var_0_26C : int
        expr_276 : byte [generated]
        stack_2B5_2 : byte [generated]
        stack_292_0 : byte [generated]
        var_0_87 : int
        expr_9C : int [generated]
        var_2_D3 : byte[]
        expr_D7 : int [generated]
        var_3_2D5 : byte[]
        var_5_2D6 : int
        expr_116 : int [generated]
        var_3_32B : byte[]
        var_5_32C : int
        expr_33D : byte [generated]
        var_3_156 : String
        stack_1F5_0 : String[] [generated]
        expr_168 : String[] [generated]
        
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
        var_0_211 = and:int(ldc:int(1652163971), ldc:int(1459873713))
        expr_6E = arraylength:int(stack_9A_0 = stack_9C_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_14A_0 = stack_224_0 = stack_276_0 = stack_2E7_0 = stack_33D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("WlpK6opaWhnyqisC6jLQCjrUchrg+hL86mLCGrJ6ItpaAYLqI1KqEvAKOtRyGuD6EvzqYsIasnoi2lpJ6rJr0viKOtRyGuD6EvzqYsIasnoi2loROsIjasKKIhCKOtRyGuD6EvzqYsIaJ+IarQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1FC = expr_6E:int
        var_3_201 = newarray:byte[](byte.class, expr_6E:int)
        var_5_202 = expr_6E:int
        Label_0516:
        
        while (cmpeq:boolean(and:int(var_0_211:int, ldc:int(4096)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(-945298043))
            var_5_202 = add:int(var_5_202:int, ldc:int(-1))
            storeelement:byte(var_3_201:byte[], var_5_202:int, xor:byte(add:byte(loadelement:byte(stack_224_0:byte[], var_5_202:int), ldc:byte(101)), ldc:byte(111)))
            
            if (cmpne:boolean(var_5_202:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_14A_0 = stack_224_0 = stack_276_0 = stack_2E7_0 = stack_33D_0 = var_3_201:byte[]
            goto(Label_0115)
        }
        
        var_0_211 = and:int(var_0_211:int, ldc:int(-135106134))
        Label_0598:
        
        while (cmpeq:boolean(and:int(var_0_211:int, ldc:int(32768)), ldc:int(0))) {
            var_0_26C = and:int(var_0_211:int, ldc:int(1617583918))
            var_5_202 = add:int(var_5_202:int, ldc:int(-1))
            expr_276 = stack_2B5_2 = loadelement(stack_276_0, var_5_202)
            
            if (cmplt:boolean(add:int(add:int(var_5_202:int, ldc:int(3)), neg:int(var_4_1FC:int)), ldc:int(0))) {
                stack_2B5_2 = stack_292_0 = add:byte(expr_276:byte, loadelement:byte(var_3_201:byte[], add:int(var_5_202:int, ldc:int(3))))
                goto(Label_0674)
            }
            
            Label_0643:
            
            if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(131072)), ldc:int(0))) {
                var_0_26C = and:int(var_0_26C:int, ldc:int(1261837103))
                stack_2B5_2 = stack_292_0 = add:byte(expr_276:byte, ldc:byte(3))
            }
            
            Label_0674:
            
            if (cmpeq:boolean(and:int(var_0_26C:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0643)
            }
            
            var_0_211 = and:int(var_0_26C:int, ldc:int(1351309625))
            storeelement:byte(var_3_201:byte[], var_5_202:int, stack_2B5_2:byte)
            
            if (cmpne:boolean(var_5_202:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_14A_0 = stack_224_0 = stack_276_0 = stack_2E7_0 = stack_33D_0 = var_3_201:byte[]
            goto(Label_0161)
        }
        
        var_0_211 = and:int(var_0_211:int, ldc:int(227839134))
        goto(Label_0516)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0283)
        }
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(65536)), ldc:int(0))) {
            var_0_87 = and:int(var_0_211:int, ldc:int(-2065854661))
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(131072)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(1897809249))
            expr_9C = arraylength:int(stack_9C_0:byte[])
            
            if (cmpne:boolean(expr_9C:int, ldc:int(0))) {
                var_4_1FC = expr_9C:int
                var_3_201 = newarray:byte[](byte.class, expr_9C:int)
                var_5_202 = expr_9C:int
                goto(Label_0598)
            }
        }
        
        Label_0161:
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(65536)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(705048017))
            goto(Label_0283)
        }
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(512)), ldc:int(0))) {
            var_0_87 = and:int(var_0_211:int, ldc:int(-260401723))
        }
        else {
            if (cmpne:boolean(and:int(var_0_211:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_87 = and:int(var_0_211:int, ldc:int(1119303981))
            var_2_D3 = stack_D3_0:byte[]
            expr_D7 = add:int(arraylength:int(stack_D5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_3_2D5 = newarray:byte[](byte.class, expr_D7:int)
                var_5_2D6 = expr_D7:int
                
                loop {
                    var_0_87 = and:int(var_0_87:int, ldc:int(1562846180))
                    var_5_2D6 = add:int(var_5_2D6:int, ldc:int(-1))
                    storeelement:byte(var_3_2D5:byte[], var_5_2D6:int, add:int(shl:int(loadelement:byte(stack_2E7_0:byte[], var_5_2D6:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_D3:byte[], add:int(var_5_2D6:int, and:int(ldc:int(2725), ldc:int(25859)))), ldc:int(7)), and:int(ldc:int(6145), ldc:int(8323)))))
                    
                    if (cmpne:boolean(var_5_2D6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_14A_0 = stack_224_0 = stack_276_0 = stack_2E7_0 = stack_33D_0 = var_3_2D5:byte[]
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_87:int, ldc:int(131072)), ldc:int(0))) {
            var_0_211 = and:int(var_0_87:int, ldc:int(519586635))
        }
        else {
            if (cmpne:boolean(and:int(var_0_87:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_211 = and:int(var_0_87:int, ldc:int(-816091096))
                goto(Label_0161)
            }
            
            if (cmpne:boolean(and:int(var_0_87:int, ldc:int(4)), ldc:int(0))) {
                var_0_211 = and:int(var_0_87:int, ldc:int(-1645095126))
                goto(Label_0115)
            }
            
            var_0_211 = and:int(var_0_87:int, ldc:int(-249684121))
            expr_116 = arraylength:int(stack_116_0:byte[])
            
            if (cmpne:boolean(expr_116:int, ldc:int(0))) {
                var_3_32B = newarray:byte[](byte.class, expr_116:int)
                var_5_32C = expr_116:int
                
                loop {
                    var_0_211 = and:int(var_0_211:int, ldc:int(-249142352))
                    var_5_32C = add:int(var_5_32C:int, ldc:int(-1))
                    expr_33D = loadelement:byte(stack_33D_0:byte[], var_5_32C:int)
                    storeelement:byte(var_3_32B:byte[], var_5_32C:int, or:int(and:int(shl:int(expr_33D:byte, and:int(ldc:int(10372), ldc:int(16964))), ldc:int(-16)), and:int(shr:int(expr_33D:byte[expected:int], xor:int(ldc:int(-28128), ldc:int(-28124))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_32C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_D3_0 = stack_D5_0 = stack_114_0 = stack_116_0 = stack_14A_0 = stack_224_0 = stack_276_0 = stack_2E7_0 = stack_33D_0 = var_3_32B:byte[]
            }
        }
        
        Label_0283:
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(4)), ldc:int(0))) {
            var_0_87 = and:int(var_0_211:int, ldc:int(-521641867))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_211:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0161)
        }
        
        if (cmpne:boolean(and:int(var_0_211:int, ldc:int(4096)), ldc:int(0))) {
            var_0_211 = and:int(var_0_211:int, ldc:int(1374441733))
            goto(Label_0115)
        }
        
        var_3_156 = initobject:String(String::<init>, stack_14A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1F5_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17181), ldc:int(3237)))
        expr_168 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(29), ldc:int(16389)))
        storeelement:String(expr_168:String[], and:int(ldc:int(5132), ldc:int(2452)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(10793), ldc:int(-10794)), xor:int(ldc:int(-30590), ldc:int(-30585))))
        storeelement:String(expr_168:String[], and:int(ldc:int(24790), ldc:int(-25816)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(5639), ldc:int(77)), xor:int(ldc:int(7318), ldc:int(7305))))
        storeelement:String(expr_168:String[], and:int(ldc:int(9243), ldc:int(2083)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(2559), ldc:int(31)), xor:int(ldc:int(20503), ldc:int(20526))))
        storeelement:String(expr_168:String[], and:int(ldc:int(2114), ldc:int(266)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(1339), ldc:int(2617)), and:int(ldc:int(6229), ldc:int(25177))))
        storeelement:String(expr_168:String[], xor:int(ldc:int(-28159), ldc:int(-28160)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(8273), ldc:int(21587)), xor:int(ldc:int(2323), ldc:int(2431))))
        putstatic:String[](\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u446c\u7049\ub70c\u4bc8\u40a9\u946b, expr_168:String[])
    }
    
    public void \u9033\u5fe1\u6bb9\u56bd\u36d3\ub32d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65B : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_666 : int
        
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
        var_3_65B = and:int(ldc:int(798410825), ldc:int(-684828837))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_65B = and:int(var_3_65B:int, ldc:int(-1800595512))
        }
        else {
            var_3_65B = and:int(var_3_65B:int, ldc:int(1207721123))
            var_5_89 = and:int(ldc:int(-10764), ldc:int(10763))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(603), ldc:int(-604)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_65B:int, ldc:int(1430412469))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(8200), ldc:int(8201)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(12293), ldc:int(12292)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_65B = and:int(var_3_E2:int, ldc:int(-1478889023))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(58), ldc:int(59)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1288903191))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1535929914))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1041073556))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(836583136))
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(2028668221))
                    }
                    else {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-679952445))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(813694064))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1674261998))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1193766858))
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-762543415))
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-2015621363))
                        var_11_F3 = and:int(ldc:int(25665), ldc:int(-25922))
                        goto(Label_1519)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(916627886))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(580298336))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-257042671))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1591984293))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(489963574))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1639044910))
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-976806797))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0717:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1581194267))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1470683113))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-691750113))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-583665805))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0833:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-2067745181))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1132512849))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(2064444639))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(2102853123))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(1673320285))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-8181915))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = xor:int(ldc:int(11296), ldc:int(11297))
                                goto(Label_1141)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-491487893))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-166404702))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1358526964))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-340002858))
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-1719410364))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(1108026445))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-2038623290))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(2145697705))
                        var_11_F3 = and:int(ldc:int(6156), ldc:int(-6157))
                    }
                    
                    Label_1141:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(2037936381))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(1551614580))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-1021575766))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(1273561304))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1624312423))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1371)
                            }
                        }
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1141)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(1997403017))
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-1167647008))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-815361635))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1519)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1371:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1496414118))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(678721140))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1386372527))
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1618653604))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-317319189))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-603128653))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65B = and:int(var_3_65B:int, ldc:int(1035265051))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1519:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_666 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1530:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-426745672))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-802666613))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(933546411))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-38674823))
                        var_17_666 = add:int(var_16_121:int, and:int(ldc:int(1205), ldc:int(513)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65B = and:int(var_3_65B:int, ldc:int(1303615041))
                
                if (cmple:boolean(var_5_89 = var_17_666:int, sub:int(var_6_90:int, xor:int(ldc:int(-30684), ldc:int(-30683))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(128)), ldc:int(0))) {
            var_3_65B = and:int(var_3_65B:int, ldc:int(-405631947))
            goto(Label_0108)
        }
    }
}
