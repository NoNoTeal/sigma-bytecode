public class \u56bd\u8413\u647c\u5bc4\ud158.\u946b\u416d\u71ae\ua61f\u4cd9\u12b2 {
    public void \u946b\u416d\u71ae\ua61f\u4cd9\u12b2(java.io.DataInputStream p0) {
        var_4_8A : int
        var_5_DA : int
        var_6_10E : \u59ec\u92ee\uc2bd\ub113\u12b2\uc910
        
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
            invokespecial:Object(Object::<init>, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2)
            putfield:List<\u59ec\u92ee\uc2bd\ub113\u12b2\uc910>(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\u6b5f\u960f\u71ae\u64f2\ubefe\u6c52, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2, initobject:ArrayList<\u59ec\u92ee\uc2bd\ub113\u12b2\uc910>[expected:List<\u59ec\u92ee\uc2bd\ub113\u12b2\uc910>](ArrayList<E>::<init>))
            putfield:int(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\ud51e\u4ab3\ucef1\uc238\ucef1\u3711, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2, or:int(or:int(shl:int(invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream]), ldc:int(16)), shl:int(invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream]), ldc:int(8))), invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream])))
            var_4_8A = invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream])
            invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream])
            putfield:int(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\u1187\u516c\u56bd\u5245\u8bb0\u4cd9, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2, invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream]))
            putfield:int(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\u3504\u6cfe\uc31c\u4179\ud4fe\u183a, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2, invokestatic:int(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\ud4fe\u7006\u9937\u7049\u120d\u4d85, p0:DataInputStream))
            
            if (cmpeq:boolean(getfield:int(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\ud51e\u4ab3\ucef1\uc238\ucef1\u3711, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), ldc:int(4801587))) {
                if (cmple:boolean(var_4_8A:int, xor:int(ldc:int(19714), ldc:int(19718)))) {
                    if (cmpeq:boolean(and:int(getfield:int(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\u1187\u516c\u56bd\u5245\u8bb0\u4cd9, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), ldc:int(64)), ldc:int(64))) {
                        invokevirtual:int(DataInputStream::skipBytes, p0:DataInputStream, sub:int(invokestatic:int(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\ud4fe\u7006\u9937\u7049\u120d\u4d85, p0:DataInputStream), ldc:int(6)))
                    }
                    
                    var_5_DA = getfield:int(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\u3504\u6cfe\uc31c\u4179\ud4fe\u183a, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2)
                    
                    while (cmpgt:boolean(var_5_DA:int, ldc:int(0))) {
                        var_6_10E = initobject:\u59ec\u92ee\uc2bd\ub113\u12b2\uc910(\u59ec\u92ee\uc2bd\ub113\u12b2\uc910::<init>, p0:DataInputStream)
                        invokeinterface:boolean(List<\u59ec\u92ee\uc2bd\ub113\u12b2\uc910>::add, getfield:List<\u59ec\u92ee\uc2bd\ub113\u12b2\uc910>(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\u6b5f\u960f\u71ae\u64f2\ubefe\u6c52, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), var_6_10E:\u59ec\u92ee\uc2bd\ub113\u12b2\uc910)
                        var_5_DA = l2i:int(sub:long(i2l:long(var_5_DA:int), invokevirtual:long(\u59ec\u92ee\uc2bd\ub113\u12b2\uc910::\ub1b9\u97b7\u3e2a\u7ce1\u5d20\ub18d, var_6_10E:\u59ec\u92ee\uc2bd\ub113\u12b2\uc910)))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\ua562\ucb79\uc87f\u3dd3\ubcb0.\u59ec\u92ee\uc2bd\ub113\u12b2\uc910> \u8c8a\ubded\u718f\u647c\u9033\u34df() {
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
            return:List<\u59ec\u92ee\uc2bd\ub113\u12b2\uc910>(invokestatic:List<\u59ec\u92ee\uc2bd\ub113\u12b2\uc910>(Collections::unmodifiableList, getfield:List<\u59ec\u92ee\uc2bd\ub113\u12b2\uc910>(\u946b\u416d\u71ae\ua61f\u4cd9\u12b2::\u6b5f\u960f\u71ae\u64f2\ubefe\u6c52, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2)))
        }
        
        goto(Label_0006)
    }
    
    public static int \ud4fe\u7006\u9937\u7049\u120d\u4d85(java.io.DataInputStream p0) {
        var_1_5F : int
        var_3_67 : int
        var_4_6F : int
        
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
            var_1_5F = and:int(ldc:int(-1148109752), ldc:int(-875201209))
            var_3_67 = and:int(ldc:int(19545), ldc:int(-24314))
            var_4_6F = and:int(ldc:int(13484), ldc:int(-14253))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1407089746))
                
                if (cmpge:boolean(var_4_6F:int, and:int(ldc:int(9358), ldc:int(4)))) {
                    looporswitchbreak()
                }
                
                var_3_67 = or:int(var_3_67:int, and:int(invokevirtual:int(FilterInputStream::read, p0:DataInputStream[expected:FilterInputStream]), ldc:int(127)))
                inc:int(var_4_6F, ldc:int(1))
            }
            
            return:int(var_3_67:int)
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
    
    public void \u6bb9\uc229\u4e72\ud217\u3bd6\u6d69(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_623 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_62E : int
        
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
        var_3_623 = and:int(ldc:int(-746513513), ldc:int(-548807210))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u946b\u416d\u71ae\ua61f\u4cd9\u12b2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
            var_3_623 = and:int(var_3_623:int, ldc:int(-1894845042))
        }
        else {
            var_3_623 = and:int(var_3_623:int, ldc:int(-604807265))
            var_5_85 = and:int(ldc:int(-26194), ldc:int(25169))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16939), ldc:int(16938)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_623:int, ldc:int(-687392322))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(528), ldc:int(529)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(10369), ldc:int(10368)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_623 = and:int(var_3_DA:int, ldc:int(-747897409))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(18946), ldc:int(18947)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1331468041))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-789248556))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1888922673))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1724959277))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(946750603))
                    }
                    else {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-620144129))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1685891132))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-36557498))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-517845184))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1473445852))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1180875337))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-73057858))
                            var_11_EB = and:int(ldc:int(8225), ldc:int(-8226))
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1797687751))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1829609192))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(2130090029))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(64)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-2027527295))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-2012300870))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(-545448969))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(8)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1442461824))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1191202810))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(756561913))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-1834763788))
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(-150479873))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(8)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(2082139311))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1395051209))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-358286894))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(128)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1212975948))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-1723481055))
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(-147883041))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(4105), ldc:int(961))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1730608959))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-863795425))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(128)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(161656008))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(64)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1025474717))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1759478640))
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(-77767681))
                        var_11_EB = and:int(ldc:int(6491), ldc:int(-22876))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1482196580))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1935259260))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-2002680786))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-719882355))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-840420359))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(8)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1268195507))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(-210403369))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1974455520))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(328204513))
                            goto(Label_1075)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-1882146534))
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(-546480673))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1447)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1331715853))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(2067371783))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1061770122))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-2021824209))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-180618562))
                        loopcontinue()
                    }
                    
                    var_3_623 = and:int(var_3_623:int, ldc:int(-687662121))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62E = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(865635670))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(607673466))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1448183065))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-700998764))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(128)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1140379667))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(4)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-608485442))
                        var_17_62E = add:int(var_16_119:int, xor:int(ldc:int(-32464), ldc:int(-32463)))
                        looporswitchbreak()
                    }
                }
                
                var_3_623 = and:int(var_3_623:int, ldc:int(-207651849))
                
                if (cmple:boolean(var_5_85 = var_17_62E:int, sub:int(var_6_8C:int, and:int(ldc:int(5185), ldc:int(8373))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(4)), ldc:int(0))) {
            var_3_623 = and:int(var_3_623:int, ldc:int(-784326943))
            goto(Label_0106)
        }
    }
}
