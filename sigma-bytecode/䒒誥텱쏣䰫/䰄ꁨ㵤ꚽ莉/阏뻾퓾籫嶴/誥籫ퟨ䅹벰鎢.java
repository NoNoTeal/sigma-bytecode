public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2 {
    public void \u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2(java.lang.String p0) {
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
            invokespecial:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::<init>, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2, p0:String)
            invokevirtual:void(\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u4c04\u98a4\ud12e\u6c52\u7ce1\u3711, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\uc238\u5db4\uafe7\u3c25\u120d(int p0, int p1) {
        var_6_6D : int[]
        var_7_97 : int
        
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
            var_6_6D = loadelement:int[](getfield:int[][](\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2), invokevirtual:int(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u8350\u7330\u392e\u446c\u3a62\u76bc, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e]))
            
            if (logicalor:boolean(cmpne:boolean(loadelement:int(var_6_6D:int[], and:int(ldc:int(7957), ldc:int(-7958))), p0:int), cmpne:boolean(loadelement:int(var_6_6D:int[], xor:int(ldc:int(16518), ldc:int(16519))), p1:int))) {
                storeelement:int(var_6_6D:int[], and:int(ldc:int(-14722), ldc:int(14721)), p0:int)
                storeelement:int(var_6_6D:int[], xor:int(ldc:int(24), ldc:int(25)), p1:int)
                var_7_97 = invokevirtual:int(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u93a2\u71ae\ua068\uc910\u8cae\u416d, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e])
                
                if (cmpge:boolean(var_7_97:int, ldc:int(0))) {
                    invokestatic:void(\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\ua068\u446c\u071d\u8d98\uc84e\u120d)
                    invokestatic:void(ARBShaderObjects::glUniform2iARB, var_7_97:int, p0:int, p1:int)
                    invokevirtual:void(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u9a18\u0c95\u93a2\uc910\uc7fe\u8bb0, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e])
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int[] \u8258\u64ab\u5f50\u3504\u5fe1\u3bc9() {
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
            return:int[](loadelement:int[](getfield:int[][](\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2), invokevirtual:int(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u8350\u7330\u392e\u446c\u3a62\u76bc, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e])))
        }
        
        goto(Label_0006)
    }
    
    public void \u9af2\u446c\u6bb9\ua562\u494c\u527a(int p0) {
        var_4_85 : int[][]
        var_5_8E : int[][]
        stack_D9_0 : int[][] [generated]
        expr_C1 : int[] [generated]
        
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
            
            if (cmpge:boolean(p0:int, arraylength:int(getfield:int[][](\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2)))) {
                var_4_85 = getfield:int[][](\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2)
                var_5_8E = newarray:int[][](int[].class, add:int(p0:int, ldc:int(10)))
                invokestatic:void(System::arraycopy, var_4_85:int[][][expected:Object], and:int(ldc:int(-29108), ldc:int(12723)), var_5_8E:int[][][expected:Object], and:int(ldc:int(-4511), ldc:int(4382)), arraylength:int(var_4_85:int[][]))
                putfield:int[][](\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2, var_5_8E:int[][])
            }
            
            if (cmpeq:boolean(loadelement:int[](getfield:int[][](\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2), p0:int), aconstnull:int[]())) {
                stack_D9_0 = getfield:int[][](\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2)
                expr_C1 = newarray:int[](int.class, xor:int(ldc:int(-32686), ldc:int(-32688)))
                storeelement:int(expr_C1:int[], xor:int(ldc:int(10753), ldc:int(10752)), storeelement:int(expr_C1:int[], and:int(ldc:int(6965), ldc:int(-24384)), ldc:int(-2147483648)))
                storeelement:int[](stack_D9_0:int[][], p0:int, expr_C1:int[])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u98a4\ud12e\u6c52\u7ce1\u3711() {
        expr_68 : int[][] [generated]
        stack_92_1 : int [generated]
        expr_7A : int[] [generated]
        
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
            expr_68 = newarray:int[][](int[].class, and:int(ldc:int(4105), ldc:int(1059)))
            stack_92_1 = and:int(ldc:int(-2519), ldc:int(2518))
            expr_7A = newarray:int[](int.class, and:int(ldc:int(9219), ldc:int(20866)))
            storeelement:int(expr_7A:int[], and:int(ldc:int(16707), ldc:int(137)), storeelement:int(expr_7A:int[], and:int(ldc:int(-14827), ldc:int(6632)), ldc:int(-2147483648)))
            storeelement:int[](expr_68:int[][], stack_92_1:int, expr_7A:int[])
            putfield:int[][](\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2, expr_68:int[][])
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
    
    public void \ub7dc\u8308\u7049\u3776\uafe7\u71f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_625 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_630 : int
        
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
        var_3_625 = and:int(ldc:int(985407390), ldc:int(-1644627969))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-92318786))
            var_5_7D = and:int(ldc:int(-6577), ldc:int(6576))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12728), ldc:int(-12733)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_625:int, ldc:int(1034583035))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(279), ldc:int(21729)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(4357), ldc:int(195)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_625 = and:int(var_3_CA:int, ldc:int(-1736838181))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1673), ldc:int(6145)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(271640400))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-876351162))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1522294348))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-623391686))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-565301854))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(645399030))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1525339134))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(524687256))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1627812483))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-692160752))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(520774959))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-616851526))
                        var_11_DB = and:int(ldc:int(13859), ldc:int(-14052))
                        goto(Label_1447)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1155010426))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1807913402))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(135329067))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1039949912))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(305514182))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-303432900))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1992716956))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(960225211))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1384328828))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1221230005))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(490635230))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(331387376))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1620910843))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1076340627))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(936692848))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1859498217))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-93366277))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(16515), ldc:int(1))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1176779994))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1802980155))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-781043191))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(695854523))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-388490247))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(2108595199))
                        var_11_DB = and:int(ldc:int(14656), ldc:int(-14657))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(682821505))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(915280802))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(655076256))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1246012793))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1279563723))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-198281754))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(184778186))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(452509599))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-580637221))
                            goto(Label_1059)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1262325923))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1059633087))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(733973120))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-495394131))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1959568821))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1256066230))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1373198503))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2057521168))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-557985865))
                        loopcontinue()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(2021233598))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_630 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2064882072))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-885383988))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1527203635))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2126122873))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-295985899))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(787704543))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-646138914))
                        var_17_630 = add:int(var_16_109:int, and:int(ldc:int(1061), ldc:int(8321)))
                        looporswitchbreak()
                    }
                }
                
                var_3_625 = and:int(var_3_625:int, ldc:int(2121103326))
                
                if (cmple:boolean(var_5_7D = var_17_630:int, sub:int(var_6_84:int, and:int(ldc:int(1561), ldc:int(30855))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
