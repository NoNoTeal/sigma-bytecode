public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u760c\u4179\u4f52\u0800\u5db4 {
    private void \u760c\u4179\u4f52\u0800\u5db4() {
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
            invokespecial:Object(Object::<init>, this:\u760c\u4179\u4f52\u0800\u5db4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static byte[] \u64f2\u6d69\u92ff\u6d69\ub19c\ub102(byte[][] p0) {
        var_1_5F : int
        var_3_67 : int
        var_5_6E : int
        var_6_77 : int
        
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
            var_1_5F = and:int(ldc:int(-163036437), ldc:int(2138042022))
            var_3_67 = and:int(ldc:int(5736), ldc:int(-22265))
            var_5_6E = arraylength:int(p0:byte[][])
            var_6_77 = and:int(ldc:int(-22374), ldc:int(21345))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-582408454))
                
                if (cmpge:boolean(var_6_77:int, var_5_6E:int)) {
                    looporswitchbreak()
                }
                
                var_3_67 = add:int(var_3_67:int, arraylength:int(loadelement:byte[](p0:byte[][], var_6_77:int)))
                inc:int(var_6_77, ldc:int(1))
            }
            
            return:byte[](invokestatic:byte[](\u760c\u4179\u4f52\u0800\u5db4::\u64f2\u6d69\u92ff\u6d69\ub19c\ub102, p0:byte[][], var_3_67:int))
        }
        
        goto(Label_0006)
    }
    
    public static byte[] \u64f2\u6d69\u92ff\u6d69\ub19c\ub102(byte[][] p0, int p1) {
        var_2_70 : int
        var_4_95 : ByteBuffer
        var_6_9D : int
        var_7_A6 : int
        
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
        var_2_70 = and:int(ldc:int(1949850022), ldc:int(1794896295))
        
        if (cmpeq:boolean(arraylength:int(p0:byte[][]), ldc:int(0))) {
            return:byte[](newarray:byte[](byte.class, and:int(ldc:int(-9560), ldc:int(9303))))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_70:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_70 = and:int(var_2_70:int, ldc:int(-479604329))
                
                if (cmpeq:boolean(arraylength:int(p0:byte[][]), and:int(ldc:int(16391), ldc:int(14401)))) {
                    return:byte[](loadelement:byte[](p0:byte[][], and:int(ldc:int(23562), ldc:int(-23595))))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_70:int, ldc:int(256)), ldc:int(0))) {
                var_4_95 = invokestatic:ByteBuffer(ByteBuffer::allocate, p1:int)
                var_6_9D = arraylength:int(p0:byte[][])
                var_7_A6 = and:int(ldc:int(-7807), ldc:int(1658))
                
                while (cmplt:boolean(var_7_A6:int, var_6_9D:int)) {
                    invokevirtual:ByteBuffer(ByteBuffer::put, var_4_95:ByteBuffer, loadelement:byte[](p0:byte[][], var_7_A6:int))
                    inc:int(var_7_A6, ldc:int(1))
                }
                
                return:byte[](invokevirtual:byte[](ByteBuffer::array, var_4_95:ByteBuffer))
            }
            
            var_2_70 = and:int(var_2_70:int, ldc:int(-1490625029))
        }
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
    
    public void \ucb79\u72f1\u8350\u6bb9\u7d52\u7af6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(-378761916), ldc:int(1845288444))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u760c\u4179\u4f52\u0800\u5db4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(2027468096))
            var_5_7D = and:int(ldc:int(14486), ldc:int(-15519))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27284), ldc:int(26770)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5ED:int, ldc:int(-344398000))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(8331), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(17065), ldc:int(261)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_D2:int, ldc:int(-43260067))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(66), ldc:int(67)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1162598372))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1667115856))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1076476678))
                    }
                    else {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1878564335))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(295184311))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1030913199))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1515268806))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-596006341))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1686226288))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1746882375))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(368475143))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1870575091))
                            var_11_E3 = and:int(ldc:int(15460), ldc:int(-15477))
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1888269773))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-933175532))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(2130520862))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-646055409))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-69235389))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-332309420))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-396609572))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1624678643))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-600945370))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2076824940))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1438271051))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-33465146))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-254814830))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-338061334))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(6305), ldc:int(31))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1736586927))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-250245826))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1915647671))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-104832331))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1777205103))
                        var_11_E3 = and:int(ldc:int(24876), ldc:int(-24941))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-710473450))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(250003304))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1836830281))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1062613048))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1571174195))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(399735094))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2043202917))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(895404342))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(42199326))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-622542805))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2014211953))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-42039326))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1525389923))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2033811226))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1116871326))
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(1869399874))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(214022890))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1538436057))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2039220939))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2011565695))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1733996458))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1868342607))
                        var_17_5F8 = add:int(var_16_111:int, xor:int(ldc:int(13314), ldc:int(13315)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(2087356375))
                
                if (cmple:boolean(var_5_7D = var_17_5F8:int, sub:int(var_6_84:int, and:int(ldc:int(24611), ldc:int(4353))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-634915764))
            goto(Label_0106)
        }
    }
}
