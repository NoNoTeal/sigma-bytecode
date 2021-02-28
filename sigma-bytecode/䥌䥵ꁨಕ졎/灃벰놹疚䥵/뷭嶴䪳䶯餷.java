public final class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ubded\u5db4\u4ab3\u4daf\u9937 {
    public void \ubded\u5db4\u4ab3\u4daf\u9937() {
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
            invokespecial:Object(Object::<init>, this:\ubded\u5db4\u4ab3\u4daf\u9937)
            putfield:short(\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937, ldc:short(-1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9255\u36d3\uc84e\u4492\ubff1\u416d(int p0, int p1) {
        var_3_117 : int
        var_5_71 : int
        stack_101_0 : int [generated]
        stack_101_1 : int [generated]
        
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
            var_3_117 = and:int(ldc:int(-2092525098), ldc:int(-770768913))
            var_5_71 = shl:int(xor:int(ldc:int(-23040), ldc:int(-23039)), sub:int(p1:int, xor:int(ldc:int(12448), ldc:int(12449))))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0261)
                }
                
                if (cmpeq:boolean(and:int(var_3_117:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0144)
                }
                
                var_3_117 = and:int(var_3_117:int, ldc:int(-1963470653))
                
                if (cmpne:boolean(and:int(getfield:short[expected:int](\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937), ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0144)
                }
                
                stack_101_0 = and:int(ldc:int(4621), ldc:int(2161))
                
                do {
                    Label_0200:
                    
                    if (cmpne:boolean(and:int(var_3_117:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(1500984002))
                        
                        if (cmpne:boolean(and:int(p0:int, var_5_71:int), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        stack_101_1 = and:int(ldc:int(647), ldc:int(1057))
                        Label_0252:
                        var_3_117 = and:int(var_3_117:int, ldc:int(-576266509))
                        
                        if (cmpeq:boolean(xor:int(stack_101_0:int, stack_101_1:int), ldc:int(0))) {
                            goto(Label_0261)
                        }
                        
                        putfield:short(\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937, i2s:short(shl:int(getfield:short[expected:int](\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937), and:int(ldc:int(1), ldc:int(8809)))))
                        putfield:short(\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937, i2s:short(xor:short[expected:int](getfield:short(\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937), getstatic:short(\ubded\u5db4\u4ab3\u4daf\u9937::\u6fb0\u8709\u647c\ua6bd\u6c56\u527a))))
                        goto(Label_0334)
                    }
                } while (cmpne:boolean(and:int(var_3_117:int, ldc:int(8)), ldc:int(0)))
                
                var_3_117 = and:int(var_3_117:int, ldc:int(1535572979))
                stack_101_1 = and:int(ldc:int(16955), ldc:int(-29564))
                goto(Label_0252)
                Label_0144:
                
                if (cmpne:boolean(and:int(var_3_117:int, ldc:int(512)), ldc:int(0))) {
                    var_3_117 = and:int(var_3_117:int, ldc:int(1297378973))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_117:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_117 = and:int(var_3_117:int, ldc:int(1672372420))
                        loopcontinue()
                    }
                    
                    var_3_117 = and:int(var_3_117:int, ldc:int(-1282525225))
                    stack_101_0 = and:int(ldc:int(8462), ldc:int(-8975))
                    goto(Label_0200)
                }
                
                Label_0261:
                
                if (cmpne:boolean(and:int(var_3_117:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0144)
                }
                
                if (cmpne:boolean(and:int(var_3_117:int, ldc:int(1024)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_117 = and:int(var_3_117:int, ldc:int(-1017178905))
                putfield:short(\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937, i2s:short(shl:int(getfield:short[expected:int](\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937), xor:int(ldc:int(17), ldc:int(16)))))
                Label_0334:
                var_3_117 = and:int(var_3_117:int, ldc:int(2106588919))
                
                if (cmpne:boolean(var_5_71 = ushr:int(var_5_71:int, xor:int(ldc:int(12321), ldc:int(12320))), ldc:int(0))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public short \u960f\u071d\u1187\u9937\ud171\u3504() {
        var_3_64 : short
        
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
            var_3_64 = getfield:short(\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937)
            putfield:short(\ubded\u5db4\u4ab3\u4daf\u9937::\uc87f\ud217\u7873\u51fa\u718f\u59ec, this:\ubded\u5db4\u4ab3\u4daf\u9937, ldc:short(-1))
            return:short(var_3_64:short)
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
            putstatic:short(\ubded\u5db4\u4ab3\u4daf\u9937::\u6fb0\u8709\u647c\ua6bd\u6c56\u527a, and:int[expected:short](ldc:int(-29067), ldc:int(-24563)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u6d69\u4c2b\u9937\ub8be\u624e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5F0 : int
        
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
        var_3_5E5 = and:int(ldc:int(-1720522862), ldc:int(259944280))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubded\u5db4\u4ab3\u4daf\u9937[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1939047305))
        }
        else {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-327504140))
            var_5_85 = and:int(ldc:int(26261), ldc:int(-26302))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18255), ldc:int(1806)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5E5:int, ldc:int(1853503036))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(8641), ldc:int(2057)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(3456), ldc:int(3457)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_DA:int, ldc:int(-1937851275))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(12289), ldc:int(18565)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-162132284))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(383505195))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2079991325))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-578182112))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-604692719))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-846419015))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1709360328))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1968687604))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1350760707))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1404658788))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1056880374))
                        var_11_EB = and:int(ldc:int(-24012), ldc:int(23683))
                        goto(Label_1399)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1616244224))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2072201205))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(886812442))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(729785950))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1182042716))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(804451744))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1879559880))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1223437397))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1492843871))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(535078619))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1577037694))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-961779768))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-272627235))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1842639265))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(299589626))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1108168936))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(516), ldc:int(517))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1513901641))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(715135682))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(340515817))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-236485759))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1887492783))
                        var_11_EB = and:int(ldc:int(-14293), ldc:int(13012))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-562175269))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(586910144))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1931467207))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1111955366))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1070181268))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-311283109))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1083002916))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(811259286))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(867680960))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(796648947))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-937067294))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-514416945))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1427604254))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-662733537))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1286748019))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(421059090))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2029337927))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1803456060))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-302092875))
                        var_17_5F0 = add:int(var_16_119:int, and:int(ldc:int(33), ldc:int(6355)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-898109997))
                
                if (cmple:boolean(var_5_85 = var_17_5F0:int, sub:int(var_6_8C:int, and:int(ldc:int(15), ldc:int(12833))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1275170569))
            goto(Label_0106)
        }
    }
}
