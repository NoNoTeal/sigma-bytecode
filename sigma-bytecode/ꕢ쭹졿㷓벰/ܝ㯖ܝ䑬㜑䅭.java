public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u071d\u3bd6\u071d\u446c\u3711\u416d {
    public void \u071d\u3bd6\u071d\u446c\u3711\u416d(java.time.Duration p0) {
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
            invokespecial:Object(Object::<init>, this:\u071d\u3bd6\u071d\u446c\u3711\u416d)
            putfield:AtomicReference<\ua562\u62da\u183a\u52d3\u9af2\u5140>(\u071d\u3bd6\u071d\u446c\u3711\u416d::\u4492\u5f50\ube23\u36d3\u3a62\u4d85, this:\u071d\u3bd6\u071d\u446c\u3711\u416d, initobject:AtomicReference<\ua562\u62da\u183a\u52d3\u9af2\u5140>(AtomicReference<V>::<init>))
            putfield:float(\u071d\u3bd6\u071d\u446c\u3711\u416d::\uf9c5\ufe34\ud171\uafe7\u62da\u3bd6, this:\u071d\u3bd6\u071d\u446c\u3711\u416d, div:float(ldc:float(1000.0f), l2f:float(invokevirtual:long(Duration::toMillis, p0:Duration))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7ce1\u527a\u624e\u12b2\u5140\u34df(java.lang.String p0) {
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
    
    private \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ua562\u62da\u183a\u52d3\u9af2\u5140 lambda$\u8d98\u156b\ub8be\u600f\u3d4b\u3776$0(java.lang.String p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ua562\u62da\u183a\u52d3\u9af2\u5140 p1) {
        var_3_5F : int
        stack_98_0 : \ua562\u62da\u183a\u52d3\u9af2\u5140 [generated]
        
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
            var_3_5F = and:int(ldc:int(-244416594), ldc:int(-316476174))
            
            if (logicaland:boolean(cmpne:boolean(p1:\ua562\u62da\u183a\u52d3\u9af2\u5140, aconstnull:\ua562\u62da\u183a\u52d3\u9af2\u5140()), invokevirtual:boolean(String::equals, p0:String, invokestatic:String[expected:Object](\ua562\u62da\u183a\u52d3\u9af2\u5140::\u8d98\u446c\u47c2\ub19c\u960f\u52d3, p1:\ua562\u62da\u183a\u52d3\u9af2\u5140)))) {
                stack_98_0 = p1:\ua562\u62da\u183a\u52d3\u9af2\u5140
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-953746456))
                stack_98_0 = initobject:\ua562\u62da\u183a\u52d3\u9af2\u5140(\ua562\u62da\u183a\u52d3\u9af2\u5140::<init>, p0:String, invokestatic:RateLimiter(RateLimiter::create, f2d:double(getfield:float(\u071d\u3bd6\u071d\u446c\u3711\u416d::\uf9c5\ufe34\ud171\uafe7\u62da\u3bd6, this:\u071d\u3bd6\u071d\u446c\u3711\u416d))))
            }
            
            return:\ua562\u62da\u183a\u52d3\u9af2\u5140(stack_98_0:\ua562\u62da\u183a\u52d3\u9af2\u5140)
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
    
    public void \u6bb9\u624e\u92ee\ub18d\u4daf\uf94d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_657 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_662 : int
        
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
        var_3_657 = and:int(ldc:int(873166983), ldc:int(1968962556))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u071d\u3bd6\u071d\u446c\u3711\u416d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
            var_3_657 = and:int(var_3_657:int, ldc:int(-973220515))
        }
        else {
            var_3_657 = and:int(var_3_657:int, ldc:int(1844100849))
            var_5_85 = and:int(ldc:int(-25256), ldc:int(25253))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15259), ldc:int(13210)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_657:int, ldc:int(-1582318461))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(8737), ldc:int(6289)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(5130), ldc:int(5131)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_657 = and:int(var_3_DA:int, ldc:int(-387031420))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(554), ldc:int(555)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1661748838))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(432180940))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1170590819))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1539819761))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(2066645858))
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1489237241))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(619445704))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0589)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-938607558))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(31537292))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1006629418))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(171867138))
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1118807973))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1496637684))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1461687172))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1202791479))
                            var_11_EB = and:int(ldc:int(27226), ldc:int(-27484))
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0589:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1880563101))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(867753311))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1108032220))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(118882881))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1506050565))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1467458119))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1154767799))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1921353097))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1733427439))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(532067699))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(1805564894))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1987551341))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1365744388))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(531070833))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(673168824))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(16770), ldc:int(16771))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0932:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-620770530))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(439105789))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1362135999))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1587362913))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(643750573))
                        var_11_EB = and:int(ldc:int(-22239), ldc:int(22108))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-2098583195))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1172450893))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(515725678))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-613482157))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1525576414))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(639945243))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-110951824))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1588650343))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-928722687))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(978517942))
                            goto(Label_1083)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(431308542))
                            goto(Label_0932)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1253703648))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1187348200))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1119167549))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1778898567))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-793480913))
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(219652736))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1017134617))
                        loopcontinue()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(1856944347))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1490:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_662 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1501:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1421115466))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(813786168))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1049057018))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(941032137))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1017684263))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(743324099))
                        var_17_662 = add:int(var_16_119:int, xor:int(ldc:int(201), ldc:int(200)))
                        looporswitchbreak()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(-2122684591))
                }
                
                var_3_657 = and:int(var_3_657:int, ldc:int(-1426383642))
                
                if (cmple:boolean(var_5_85 = var_17_662:int, sub:int(var_6_8C:int, xor:int(ldc:int(26112), ldc:int(26113))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
            var_3_657 = and:int(var_3_657:int, ldc:int(-417730834))
            goto(Label_0106)
        }
    }
}
