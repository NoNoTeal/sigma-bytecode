public abstract class \u516c\u3d64\u718f\ub171\u6b5f.\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9 {
    private void \u8d90\u7006\u527a\ua3b4\u16f6\u4cd9() {
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
            invokespecial:Object(Object::<init>, this:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u960f\u4975\u8308\ua61f\u98a4\ubcb0(long p0, long p1, int p2) {
        var_6_61 : int
        stack_78_0 : int [generated]
        
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
        var_6_61 = and:int(ldc:int(-1113756700), ldc:int(-1411634188))
        
        try {
            var_6_61 = and:int(var_6_61:int, ldc:int(738157483))
            stack_78_0 = invokevirtual:int(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::\u3bd6\u8709\ub7dc\ua3b4\u3d4b\u59ec, this:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9, p1:long, p2:int)
            var_6_61 = and:int(var_6_61:int, ldc:int(1014998757))
            return:int(stack_78_0:int)
        }
        catch (java.io.IOException var_8_7D) {
            putfield:boolean(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::\ub1b9\u4ab3\u4bc8\u8413\uc29a\u6b5f, this:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9, xor:int[expected:boolean](ldc:int(17473), ldc:int(17472)))
            return:int(and:int(ldc:int(20561), ldc:int(-21074)))
        }
    }
    
    public void \u9255\u51b2\u0800\ub102\u927d\u8258(long p0, int p1) {
        var_4_94 : int
        
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
            var_4_94 = and:int(ldc:int(1731624392), ldc:int(-180454416))
            
            try {
                do {
                    if (cmpeq:boolean(and:int(var_4_94:int, ldc:int(4194304)), ldc:int(0))) {
                        var_4_94 = and:int(var_4_94:int, ldc:int(1740078820))
                        invokevirtual:void(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::\uc31c\u836c\u5d20\u7d52\uae5d\u183a, this:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9, p1:int)
                    }
                } while (cmpne:boolean(and:int(var_4_94:int, ldc:int(134217728)), ldc:int(0)))
                
                var_4_94 = and:int(var_4_94:int, ldc:int(-59015979))
            }
            catch (java.io.IOException var_6_8D) {
                var_4_94 = and:int(var_4_94:int, ldc:int(2103885512))
                putfield:boolean(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::\ub1b9\u4ab3\u4bc8\u8413\uc29a\u6b5f, this:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9, xor:int[expected:boolean](ldc:int(401), ldc:int(400)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u6d69\u8bb0\u5654\u4c04\u3d4b\u97e6(long p0) {
        var_3_5F : int
        stack_86_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-1438268198), ldc:int(-273386346))
            
            if (logicalnot:boolean(getfield:boolean(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::\ub1b9\u4ab3\u4bc8\u8413\uc29a\u6b5f, this:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-556569657))
                stack_86_0 = and:int(ldc:int(26448), ldc:int(-28625))
            }
            else {
                stack_86_0 = and:int(ldc:int(1729), ldc:int(2067))
            }
            
            return:int(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public abstract int \u3bd6\u8709\ub7dc\ua3b4\u3d4b\u59ec(long p0, int p1);
    
    public abstract void \uc31c\u836c\u5d20\u7d52\uae5d\u183a(int p0);
    
    public abstract void close();
    
    public void \u8d90\u7006\u527a\ua3b4\u16f6\u4cd9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4e72\u5d20\u960f\u4179\u12b2\u51b2 p0) {
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
            invokespecial:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9(\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9::<init>, this:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\u59ec\u52d3\ucef1\u8389\u64f2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_620 : int
        
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
        var_3_615 = and:int(ldc:int(46529812), ldc:int(-694620299))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d90\u7006\u527a\ua3b4\u16f6\u4cd9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(1029088243))
        }
        else {
            var_3_615 = and:int(var_3_615:int, ldc:int(-1629033004))
            var_5_85 = and:int(ldc:int(3866), ldc:int(-12059))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1748), ldc:int(-18165)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_615:int, ldc:int(1915616727))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(23040), ldc:int(23041)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2265), ldc:int(16901)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_DA:int, ldc:int(-637419595))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8320), ldc:int(8321)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1893091643))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(340623630))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-57184807))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-2130383886))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1559440293))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-932753267))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-764874892))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(15367483))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-49959124))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(559749276))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1891184013))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(2136796982))
                            var_11_EB = and:int(ldc:int(-15459), ldc:int(15394))
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-287974614))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1423152622))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1292911106))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2042291976))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1415246879))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1239129075))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(18491747))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(856552771))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-946996518))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1551831114))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1928224304))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(791418273))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(229206612))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(443486348))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(319467348))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(17418), ldc:int(17419))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(923883666))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(719815784))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-202914624))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1176086439))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(308531967))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1761761369))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1860087734))
                        var_11_EB = and:int(ldc:int(-28107), ldc:int(27850))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1225781330))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1100241107))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-47058307))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1544270046))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(62897637))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(271189117))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(922660351))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(530721332))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1872229211))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1361751485))
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1702274231))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(884192990))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1608449373))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1447)
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(141156384))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1170374487))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-228490713))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1737875202))
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(1041166263))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(863072693))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1393670429))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1862564654))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(664321495))
                        var_17_620 = add:int(var_16_119:int, xor:int(ldc:int(1028), ldc:int(1029)))
                        looporswitchbreak()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(1278146787))
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(918531356))
                
                if (cmple:boolean(var_5_85 = var_17_620:int, sub:int(var_6_8C:int, and:int(ldc:int(2585), ldc:int(1059))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(576128193))
            goto(Label_0106)
        }
    }
}
