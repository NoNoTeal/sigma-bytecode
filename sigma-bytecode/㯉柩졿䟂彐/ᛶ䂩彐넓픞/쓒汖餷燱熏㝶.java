public abstract class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc4d2\u6c56\u9937\u71f1\u718f\u3776 {
    public void \uc4d2\u6c56\u9937\u71f1\u718f\u3776() {
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
            invokespecial:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::<init>, this:\uc4d2\u6c56\u9937\u71f1\u718f\u3776)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u7043\u93a2\u416d\u9af2\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_625 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_625 = and:int(ldc:int(-1294595683), ldc:int(1088315687))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc4d2\u6c56\u9937\u71f1\u718f\u3776[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(83824103))
            var_5_7D = and:int(ldc:int(30930), ldc:int(-31443))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2586), ldc:int(-2587)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_625:int, ldc:int(-1193641689))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(2324), ldc:int(2325)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-32752), ldc:int(-32751)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_625 = and:int(var_3_D2:int, ldc:int(586821391))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(21255), ldc:int(1129)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1325433534))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1772578075))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-54775931))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-608976871))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1305972305))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1400966778))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(330949329))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(732412830))
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1071062333))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0597)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(300726139))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-117435242))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1171028070))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(374901784))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-2033400849))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(376224540))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-901229027))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-774718185))
                            var_11_E3 = and:int(ldc:int(-8526), ldc:int(8525))
                            goto(Label_1455)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0597:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(795143968))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1117861553))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(199035039))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1795259987))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1955544900))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1095371720))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1906764682))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(639694399))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-2144964381))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1244235963))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-498973085))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1052839356))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(629509573))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-636163341))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-2054538286))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(594816249))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1309502195))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(16515), ldc:int(16514))
                                goto(Label_1107)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1412950370))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-136135621))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1939713482))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1586867589))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1986153151))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(1238773695))
                        var_11_E3 = and:int(ldc:int(-3362), ldc:int(3361))
                    }
                    
                    Label_1107:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(669320189))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-746218207))
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1661269871))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-274963550))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1176810713))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(796177848))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-315716072))
                            goto(Label_1107)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1728937352))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1655378021))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1496762298))
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-902584660))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(553100727))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1455)
                    }
                    
                    Label_1356:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2115437807))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(-707330107))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_630 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1511751453))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1578209461))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-841907355))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(220363029))
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1159765665))
                        var_17_630 = add:int(var_16_111:int, xor:int(ldc:int(17), ldc:int(16)))
                        looporswitchbreak()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(-1471822757))
                }
                
                var_3_625 = and:int(var_3_625:int, ldc:int(-841602723))
                
                if (cmple:boolean(var_5_7D = var_17_630:int, sub:int(var_6_84:int, and:int(ldc:int(33), ldc:int(4801))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-2113447629))
            goto(Label_0106)
        }
    }
}
