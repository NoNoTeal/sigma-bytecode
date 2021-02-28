public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u446c\u7af6\u5bc4\ub83f\u8413\u600f {
    public void \u446c\u7af6\u5bc4\ub83f\u8413\u600f() {
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
            invokespecial:Object(Object::<init>, this:\u446c\u7af6\u5bc4\ub83f\u8413\u600f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7c6b\ua562\u5db4\u7006\u1833\u516c(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
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
    
    private static void \u7c6b\ua562\u5db4\u7006\u1833\u516c(java.nio.ByteBuffer p0, int p1, \u12b2\u7049\u8df4\uc9f6\uae87.\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f p2, int p3) {
        var_4_AD : int
        
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
            var_4_AD = and:int(ldc:int(-571338773), ldc:int(-1129181585))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokevirtual:Buffer(Buffer::clear, p0:ByteBuffer[expected:Buffer])
            
            if (cmpgt:boolean(p3:int, ldc:int(0))) {
                invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u5bc4\u527a\u839e\u600f\u946b\ub6ab, p2:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, invokestatic:long(MemoryUtil::memAddress, p0:ByteBuffer))
                
                if (logicalnot:boolean(invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c))) {
                    goto(Label_0160)
                }
                
                invokestatic:void(\u8cae\u7006\uc7fe\u88c5\u5140\u965f::\u1187\u516c\u7ce1\u7af6\u6c56\u4daf, p1:int, and:int(ldc:int(13587), ldc:int(-13756)), p3:int, p2:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f, p0:ByteBuffer)
                goto(Label_0208)
            }
            
            Label_0116:
            
            if (cmpeq:boolean(and:int(var_4_AD:int, ldc:int(16384)), ldc:int(0))) {
                return:void()
            }
            
            var_4_AD = and:int(var_4_AD:int, ldc:int(2104897543))
            Label_0160:
            
            if (cmpeq:boolean(and:int(var_4_AD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0116)
            }
            
            var_4_AD = and:int(var_4_AD:int, ldc:int(-1912649133))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u8389\u4f4a\u7c6b\u4e72\ud12e\ubcb0, p1:int, and:int(ldc:int(7714), ldc:int(-7795)), p3:int)
            Label_0208:
            var_4_AD = and:int(var_4_AD:int, ldc:int(-856425773))
            invokevirtual:void(\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f::\u7873\u8bb0\u0b8e\ucfaf\uc87f\u0a06, p2:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f)
            goto(Label_0116)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u446c\ufe34\u927d\u6bb9\u8d98\u9255$0(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
        var_3_64 : Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>
        var_4_6C : \uc246\ub83f\u12b2\u69d9\u61a4\u52d3
        
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
            var_3_64 = invokevirtual:Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u4ab3\u8389\uafe7\uceb8\u4d85\ua6bd, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            var_4_6C = checkcast:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc246\ub83f\u12b2\u69d9\u61a4\u52d3.class, invokevirtual:Object[expected:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3](Pair::getFirst, var_3_64:Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>))
            invokestatic:void(\u446c\u7af6\u5bc4\ub83f\u8413\u600f::\u7c6b\ua562\u5db4\u7006\u1833\u516c, checkcast:ByteBuffer(java.nio.ByteBuffer.class, invokevirtual:Object[expected:ByteBuffer](Pair::getSecond, var_3_64:Pair<\uc246\ub83f\u12b2\u69d9\u61a4\u52d3, ByteBuffer>)), invokevirtual:int(\uc246\ub83f\u12b2\u69d9\u61a4\u52d3::\uc229\u4975\ubb2b\u718f\u3776\u4179, var_4_6C:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3), invokevirtual:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\uc246\ub83f\u12b2\u69d9\u61a4\u52d3::\u97b7\u8709\u76bc\ub1b9\uf9c5\u59ec, var_4_6C:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3), invokevirtual:int(\uc246\ub83f\u12b2\u69d9\u61a4\u52d3::\u1187\u5245\u7049\u9af2\u446c\u965f, var_4_6C:\uc246\ub83f\u12b2\u69d9\u61a4\u52d3))
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
    
    public void \uc87f\u6bb9\u4f4a\u4cd9\uceb8\ub70c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_618 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_623 : int
        
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
        var_3_618 = and:int(ldc:int(-258721376), ldc:int(-454639686))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u446c\u7af6\u5bc4\ub83f\u8413\u600f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(-1127270155))
            var_5_7D = and:int(ldc:int(-18940), ldc:int(2538))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10515), ldc:int(-10520)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_618:int, ldc:int(-222330951))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-23488), ldc:int(-23487)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(564), ldc:int(565)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_618 = and:int(var_3_D2:int, ldc:int(-1146307346))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4618), ldc:int(4619)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1865076438))
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-823958799))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-2095084307))
                        goto(Label_0884)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(750203562))
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1907913476))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-405490009))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0776)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1478017682))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-636362395))
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-296031713))
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(510572885))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1198601514))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-204181257))
                        var_11_E3 = and:int(ldc:int(1171), ldc:int(-1180))
                        goto(Label_1452)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(447669560))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1870417408))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-156060231))
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-406965086))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0776)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(419613172))
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0884)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(150989216))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1797598820))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1362807047))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0776:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-936175273))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-280298779))
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1468791631))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1580812380))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(8224), ldc:int(8225))
                                goto(Label_1055)
                            }
                        }
                    }
                    
                    Label_0884:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1116407565))
                        goto(Label_1320)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1737500112))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-269589932))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1437928807))
                            goto(Label_0776)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(412034450))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1578482815))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1517473369))
                        var_11_E3 = and:int(ldc:int(2359), ldc:int(-10552))
                    }
                    
                    Label_1055:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0884)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-2088973175))
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-291131151))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1973062104))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1449243646))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1885029143))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1281018897))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1320)
                            }
                        }
                    }
                    
                    Label_1182:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1781357314))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1247025716))
                            goto(Label_1055)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0884)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-490154494))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1031141636))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(762785249))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-320523541))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1452)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1320:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1433278014))
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0884)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1107488858))
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-742759798))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1922727212))
                        loopcontinue()
                    }
                    
                    var_3_618 = and:int(var_3_618:int, ldc:int(-1427161615))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1452:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_623 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1463:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1320)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0884)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(229545605))
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1283748841))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-108545099))
                        var_17_623 = add:int(var_16_111:int, and:int(ldc:int(16513), ldc:int(2069)))
                        looporswitchbreak()
                    }
                    
                    var_3_618 = and:int(var_3_618:int, ldc:int(261887127))
                }
                
                var_3_618 = and:int(var_3_618:int, ldc:int(-1109953028))
                
                if (cmple:boolean(var_5_7D = var_17_623:int, sub:int(var_6_84:int, and:int(ldc:int(5), ldc:int(1297))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(1211095576))
            goto(Label_0106)
        }
    }
}
