public class \u5d20\u97b7\u8753\u873d\u16f6.\u6435\u385b\ud171\uc246\u516c {
    public void \u6435\u385b\ud171\uc246\u516c(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u3e75\u8709\u927d\ub171\u51b2 p0, boolean p1) {
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
            invokespecial:\u71ae\u8389\u92ff\u92ff\u0800(\u71ae\u8389\u92ff\u92ff\u0800::<init>, this:\u6435\u385b\ud171\uc246\u516c)
            putfield:\u3e75\u8709\u927d\ub171\u51b2(\u6435\u385b\ud171\uc246\u516c::\u760c\ua3b4\u99f7\u7330\u4975, this:\u6435\u385b\ud171\uc246\u516c, p0:\u3e75\u8709\u927d\ub171\u51b2)
            putfield:boolean(\u6435\u385b\ud171\uc246\u516c::\u93a2\u965f\u0a06\ua61f\u69d9, this:\u6435\u385b\ud171\uc246\u516c, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u946b\u92ee\u6fb0\ua6bd\ubefe(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u3e75\u8709\u927d\ub171\u51b2 p0) {
        var_2_B1 : int
        stack_110_0 : int [generated]
        
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
            var_2_B1 = and:int(ldc:int(-169220136), ldc:int(-172721283))
            
            if (getfield:boolean(\u6435\u385b\ud171\uc246\u516c::\u93a2\u965f\u0a06\ua61f\u69d9, this:\u6435\u385b\ud171\uc246\u516c)) {
                if (cmpne:boolean(invokevirtual:double(\u3e75\u8709\u927d\ub171\u51b2::\uc4d2\u3711\u8389\u8640\u71ae, p0:\u3e75\u8709\u927d\ub171\u51b2, getfield:\u3e75\u8709\u927d\ub171\u51b2(\u6435\u385b\ud171\uc246\u516c::\u760c\ua3b4\u99f7\u7330\u4975, this:\u6435\u385b\ud171\uc246\u516c)), ldc:double(1.0))) {
                    goto(Label_0205)
                }
                
                stack_110_0 = xor:int[expected:boolean](ldc:int(4134), ldc:int(4135))
                return:boolean(stack_110_0:boolean)
            }
            
            Label_0103:
            
            if (cmpeq:boolean(and:int(var_2_B1:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_B1 = and:int(var_2_B1:int, ldc:int(368432237))
                goto(Label_0205)
            }
            
            if (cmpeq:boolean(and:int(var_2_B1:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_B1 = and:int(var_2_B1:int, ldc:int(612992962))
            }
            else {
                var_2_B1 = and:int(var_2_B1:int, ldc:int(-303562788))
                
                if (cmpeq:boolean(invokevirtual:double(\u3e75\u8709\u927d\ub171\u51b2::\uc4d2\u3711\u8389\u8640\u71ae, p0:\u3e75\u8709\u927d\ub171\u51b2, getfield:\u3e75\u8709\u927d\ub171\u51b2(\u6435\u385b\ud171\uc246\u516c::\u760c\ua3b4\u99f7\u7330\u4975, this:\u6435\u385b\ud171\uc246\u516c)), ldc:double(0.0))) {
                    stack_110_0 = and:int[expected:boolean](ldc:int(6337), ldc:int(13))
                    return:boolean(stack_110_0:boolean[expected:int])
                }
            }
            
            Label_0151:
            
            if (cmpeq:boolean(and:int(var_2_B1:int, ldc:int(16384)), ldc:int(0))) {
                var_2_B1 = and:int(var_2_B1:int, ldc:int(617523836))
            }
            else {
                if (cmpne:boolean(and:int(var_2_B1:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_B1 = and:int(var_2_B1:int, ldc:int(-273231015))
                    stack_110_0 = and:int[expected:boolean](ldc:int(31057), ldc:int(-32090))
                    return:boolean(stack_110_0:boolean[expected:int])
                }
                
                goto(Label_0103)
            }
            
            Label_0205:
            
            if (cmpeq:boolean(and:int(var_2_B1:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_B1 = and:int(var_2_B1:int, ldc:int(-2051181715))
                goto(Label_0151)
            }
            
            if (cmpne:boolean(and:int(var_2_B1:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0103)
            }
            
            var_2_B1 = and:int(var_2_B1:int, ldc:int(-302883905))
            stack_110_0 = and:int[expected:boolean](ldc:int(15120), ldc:int(-16177))
            return:boolean(stack_110_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public double \u6c52\u8753\ud36e\ua562\ub113(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u3e75\u8709\u927d\ub171\u51b2 p0) {
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
            return:double(invokevirtual:double(\u3e75\u8709\u927d\ub171\u51b2::\u59ec\u7873\ud12e\u92ee\u0b8e, getfield:\u3e75\u8709\u927d\ub171\u51b2(\u6435\u385b\ud171\uc246\u516c::\u760c\ua3b4\u99f7\u7330\u4975, this:\u6435\u385b\ud171\uc246\u516c), p0:\u3e75\u8709\u927d\ub171\u51b2))
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
    
    public void \u64f2\u9255\uc7fe\u51b2\u3e75(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(-1378407596), ldc:int(-2056031292))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6435\u385b\ud171\uc246\u516c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-1192428304))
        }
        else {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-154715153))
            var_5_85 = and:int(ldc:int(-12433), ldc:int(12432))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2464), ldc:int(415)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61D:int, ldc:int(-2049474731))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(2049), ldc:int(8589)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(645), ldc:int(18809)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_DA:int, ldc:int(-540046339))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8196), ldc:int(8197)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-381254585))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-92745462))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1547067204))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-791834324))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(841074757))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-85694808))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1644345595))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1474726773))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1502491688))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1207599309))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1029937014))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-2082399611))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-276839425))
                        var_11_EB = and:int(ldc:int(-919), ldc:int(918))
                        goto(Label_1431)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1970171406))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1073758881))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-217373917))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(115179293))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1062970781))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1359411362))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1578473530))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1690267280))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(588124894))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1898328154))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-327022391))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(859950554))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(889077302))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1904790642))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(3089), ldc:int(4229))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(944399267))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(88768319))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1450652339))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-867975362))
                        var_11_EB = and:int(ldc:int(-15472), ldc:int(15431))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(565564395))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1305685497))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-566451730))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1227334824))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1200083268))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1412278948))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1896210786))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2031782020))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(677489439))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1276456326))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(496325978))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1130512648))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-2126038292))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-930965374))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-279746723))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1431)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1883282353))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1653165937))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1596086986))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-729949322))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(36278444))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-868262719))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2023613810))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1116371560))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1836771408))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1703247557))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1100899330))
                        var_17_628 = add:int(var_16_119:int, xor:int(ldc:int(1049), ldc:int(1048)))
                        looporswitchbreak()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(447828569))
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-1932929265))
                
                if (cmple:boolean(var_5_85 = var_17_628:int, sub:int(var_6_8C:int, and:int(ldc:int(8451), ldc:int(1089))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-593404049))
            goto(Label_0106)
        }
    }
}
