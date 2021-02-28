public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\uf9c5\u16f6\ub102\u3c25\u4c2b {
    public void \uf9c5\u16f6\ub102\u3c25\u4c2b() {
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
            invokespecial:Object(Object::<init>, this:\uf9c5\u16f6\ub102\u3c25\u4c2b)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<java.lang.Float> \uc29a\u52d3\ub171\u0c95\u7c6b\u836c(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p4) {
        var_6_61 : int
        stack_A8_0 : Optional<Float> [generated]
        
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
            var_6_61 = and:int(ldc:int(-2124527868), ldc:int(844070798))
            
            if (logicaland:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), invokevirtual:boolean(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\ubff1\uc4d2\ub1b9\u8cae\ud4fe\u8308, p4:\uf995\u8709\ua61f\ub32d\ubff1\u99f7))) {
                stack_A8_0 = invokestatic:Optional<Float>(Optional<T>::empty)
            }
            else {
                var_6_61 = and:int(var_6_61:int, ldc:int(-1284614810))
                stack_A8_0 = invokestatic:Optional<Float>(Optional<T>::of, invokestatic:Float(Float::valueOf, invokestatic:float(Math::max, invokevirtual:float(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8bb0\u4f4a\u156b\u8753\u92ee\ub7dc, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])), invokevirtual:float(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u8c8a\u4d85\u3711\u6198\u527a\u3d4b, p4:\uf995\u8709\ua61f\ub32d\ubff1\u99f7))))
            }
            
            return:Optional<Float>(stack_A8_0:Optional<Float>)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4c2b\u12b2\ud523\u8bb0\ub7dc\u120d(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, float p4) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(516), ldc:int(517)))
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
    
    public void \u8413\u3e75\u69d9\uceb8\u494c\u52d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64B : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_656 : int
        
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
        var_3_64B = and:int(ldc:int(99530417), ldc:int(-75565633))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uf9c5\u16f6\ub102\u3c25\u4c2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(670022955))
            var_5_7D = and:int(ldc:int(-12377), ldc:int(12376))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(432), ldc:int(-433)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_64B:int, ldc:int(-1309761371))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(2304), ldc:int(2305)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4121), ldc:int(2051)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_64B = and:int(var_3_D2:int, ldc:int(-847271771))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(898), ldc:int(899)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1828428395))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(499228734))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-2146175404))
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1755069846))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-959735918))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1396746907))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1685898497))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(513415563))
                    }
                    else {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(695205775))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(797377553))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(10305573))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1300966683))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(748964772))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(491292160))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(427735883))
                            var_11_E3 = and:int(ldc:int(-19501), ldc:int(19500))
                            goto(Label_1505)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-362538106))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1693048694))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1199494850))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(710778386))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-2116574807))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-126368897))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1171271495))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1508898579))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-100508950))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(770383232))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1283711372))
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(583551868))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(856445721))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1254879023))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1889932988))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(897491143))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1658562427))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(783611739))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1878238122))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(321114956))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1330669286))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-623880360))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(192014447))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(2113912263))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(8229), ldc:int(2441))
                                goto(Label_1139)
                            }
                        }
                    }
                    
                    Label_0993:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1031440203))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1368125005))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(256482953))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1664372817))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1408216321))
                        var_11_E3 = and:int(ldc:int(-27776), ldc:int(11349))
                    }
                    
                    Label_1139:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-497345623))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(240430773))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-339899072))
                            goto(Label_0993)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(149900733))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-106179698))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1442756499))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1258:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1139)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1154778352))
                            goto(Label_0993)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1522821920))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1973392470))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-685272240))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1098885063))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1505)
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(178077412))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-837184763))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-2111731067))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(73798921))
                        loopcontinue()
                    }
                    
                    var_3_64B = and:int(var_3_64B:int, ldc:int(-1753226251))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1505:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_656 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1516:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(946820871))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1891564908))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-590589928))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(595521087))
                        var_17_656 = add:int(var_16_111:int, xor:int(ldc:int(-32694), ldc:int(-32693)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64B = and:int(var_3_64B:int, ldc:int(-739331387))
                
                if (cmple:boolean(var_5_7D = var_17_656:int, sub:int(var_6_84:int, xor:int(ldc:int(2241), ldc:int(2240))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(524288)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(-2067143240))
            goto(Label_0106)
        }
    }
}
