public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\ud7e8\u97b7\ufcaf\u6fb0 {
    public void \u34df\ud7e8\u97b7\ufcaf\u6fb0(com.mojang.serialization.Codec<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u836c\u6fb0\uc910\u64ab\u5f50> p0) {
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
            invokespecial:\ub70c\u1833\ub19c\u183a\u3d64<\u836c\u6fb0\uc910\u64ab\u5f50>(\ub70c\u1833\ub19c\u183a\u3d64<\u836c\u6fb0\uc910\u64ab\u5f50>::<init>, this:\u34df\ud7e8\u97b7\ufcaf\u6fb0[expected:\ub70c\u1833\ub19c\u183a\u3d64<\u836c\u6fb0\uc910\u64ab\u5f50>], p0:Codec<\u836c\u6fb0\uc910\u64ab\u5f50>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u0c95\u16f6\u3a62\u4bc8\u5654\uff55(java.util.Random p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u836c\u6fb0\uc910\u64ab\u5f50 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
    
    public java.util.stream.Stream \u0c95\u16f6\u3a62\u4bc8\u5654\uff55(java.util.Random p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ud158\u4c2b\ub102\ubded\ub19c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
            return:Stream(invokevirtual:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u34df\ud7e8\u97b7\ufcaf\u6fb0::\u0c95\u16f6\u3a62\u4bc8\u5654\uff55, this:\u34df\ud7e8\u97b7\ufcaf\u6fb0, p0:Random, checkcast:\u836c\u6fb0\uc910\u64ab\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u836c\u6fb0\uc910\u64ab\u5f50.class, p1:\ud158\u4c2b\ub102\ubded\ub19c[expected:\u836c\u6fb0\uc910\u64ab\u5f50]), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 lambda$\u9af2\ub6ab\u1187\ud158\ud36e\u6bb9$0(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, int p1) {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\u6ec6\u8d98\u8aa5\u3d64\ud36e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(-875914402), ldc:int(-1815131689))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u34df\ud7e8\u97b7\ufcaf\u6fb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(1618548458))
        }
        else {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-1744870955))
            var_5_85 = and:int(ldc:int(-19415), ldc:int(19284))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25105), ldc:int(25104)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_60D:int, ldc:int(-1477761563))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(4245), ldc:int(33)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2305), ldc:int(17031)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_DA:int, ldc:int(-2116400162))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(130), ldc:int(131)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2021027715))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1659709411))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1991640832))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1497657897))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2124203678))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-645070766))
                    }
                    else {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-674505252))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-663864223))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1146601955))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1859625946))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1231880579))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-771752449))
                            var_11_EB = and:int(ldc:int(3528), ldc:int(-3533))
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1937130355))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1308443480))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-203703245))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1124573202))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-40049885))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2120909469))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-909415585))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-533086098))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-245710583))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1485517448))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(696645989))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1856014844))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1544666627))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(969188857))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(754502057))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(533383978))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-438573595))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(1285), ldc:int(1284))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-608054139))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1677788689))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1335229722))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1704117672))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1150362205))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-204537371))
                        var_11_EB = and:int(ldc:int(-13774), ldc:int(12748))
                    }
                    
                    Label_1075:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-761197264))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(984528554))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1451067276))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1818636654))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1511003684))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-82126861))
                            goto(Label_1075)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(886935189))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1078836895))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-369483913))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-371161207))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(902952303))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1645125826))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1424856778))
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-1409606713))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-677333919))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1877414776))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1019706544))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1037397411))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1173105826))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(348522370))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2114241059))
                        var_17_618 = add:int(var_16_119:int, and:int(ldc:int(81), ldc:int(17057)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-169882674))
                
                if (cmple:boolean(var_5_85 = var_17_618:int, sub:int(var_6_8C:int, xor:int(ldc:int(6), ldc:int(7))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(17433306))
            goto(Label_0106)
        }
    }
}
