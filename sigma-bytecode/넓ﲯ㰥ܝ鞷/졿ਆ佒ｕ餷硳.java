public class \ub113\ufcaf\u3c25\u071d\u97b7.\uc87f\u0a06\u4f52\uff55\u9937\u7873 {
    public void \uc87f\u0a06\u4f52\uff55\u9937\u7873(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            invokespecial:Object(Object::<init>, this:\uc87f\u0a06\u4f52\uff55\u9937\u7873)
            putfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\uc87f\u0a06\u4f52\uff55\u9937\u7873::\ud4fe\ua562\ua562\ub171\u8350\ucfaf, this:\uc87f\u0a06\u4f52\uff55\u9937\u7873, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean test(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
        
        if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
            return:boolean(and:int[expected:boolean](ldc:int(-10953), ldc:int(10952)))
        }
        
        if (instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
            return:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u61a4\ud523\u7006\u3c25\ua3b4\u0c95, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\uc87f\u0a06\u4f52\uff55\u9937\u7873::\ud4fe\ua562\ua562\ub171\u8350\ucfaf, this:\uc87f\u0a06\u4f52\uff55\u9937\u7873)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-14062), ldc:int(14052)))
    }
    
    public boolean test(java.lang.Object p0) {
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
            return:boolean(invokevirtual:boolean(\uc87f\u0a06\u4f52\uff55\u9937\u7873::test, this:\uc87f\u0a06\u4f52\uff55\u9937\u7873, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, p0:Object[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
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
    
    public void \ub7dc\u3bc9\u7ce1\u6d69\u67d0\u40a9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_608 : int
        
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
        var_3_5FD = and:int(ldc:int(1013238348), ldc:int(1877363661))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\u0a06\u4f52\uff55\u9937\u7873[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1039596054))
            var_5_7D = and:int(ldc:int(-2547), ldc:int(2546))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12800), ldc:int(-12801)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FD:int, ldc:int(-319437089))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(2056), ldc:int(2057)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(19697), ldc:int(13057)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_D2:int, ldc:int(-1377411354))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32446), ldc:int(-32445)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0509)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(754407382))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0509)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0357:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1493732497))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1573644038))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1749951177))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(502997857))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1075325011))
                            var_11_E3 = and:int(ldc:int(-3516), ldc:int(1451))
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0509:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1084712211))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-620848073))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-556047099))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1022783648))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2121096919))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-511003620))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(668049595))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1576809574))
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(80087216))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-654604733))
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1048507327))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(965826579))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-603263261))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1189799352))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1073170967))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(8225), ldc:int(385))
                                goto(Label_0995)
                            }
                        }
                    }
                    
                    Label_0849:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1377730435))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1098517790))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-532334957))
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(912100047))
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1064061684))
                        var_11_E3 = and:int(ldc:int(6784), ldc:int(-6785))
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(123496346))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(763524103))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1049258719))
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(470241357))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1330584351))
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-513031770))
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1530006418))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1394182579))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1430809365))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1790861522))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1328422967))
                            goto(Label_0849)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(968473940))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(229231865))
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1584940196))
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1978237308))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-294326641))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1407)
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(904547010))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1477102466))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1508325183))
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0509)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1334179952))
                        goto(Label_0357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(781382066))
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(1844928365))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1099939543))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-145204011))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1898502817))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(556129))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-192179338))
                        goto(Label_0509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1819232973))
                        var_17_608 = add:int(var_16_111:int, and:int(ldc:int(8197), ldc:int(2483)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(220557347))
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(-277940388))
                
                if (cmple:boolean(var_5_7D = var_17_608:int, sub:int(var_6_84:int, xor:int(ldc:int(24596), ldc:int(24597))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(932418126))
            goto(Label_0106)
        }
    }
}
