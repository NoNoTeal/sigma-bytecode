public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\uae87\u6b5f\u647c\u156b\uc229\u4e72 {
    public void \uae87\u6b5f\u647c\u156b\uc229\u4e72() {
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
            invokespecial:Object(Object::<init>, this:\uae87\u6b5f\u647c\u156b\uc229\u4e72)
            putfield:List<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>(\uae87\u6b5f\u647c\u156b\uc229\u4e72::\u6b0d\u8df4\u8bb0\u3504\uceb8\u6198, this:\uae87\u6b5f\u647c\u156b\uc229\u4e72, invokestatic:ArrayList[expected:List<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>](Lists::newArrayList))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5654\u873d\ubb2b\u47c2\u5245(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, double p1) {
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
            
            if (cmpne:boolean(p1:double, ldc:double(0.0))) {
                invokeinterface:boolean(List<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>::add, getfield:List<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>(\uae87\u6b5f\u647c\u156b\uc229\u4e72::\u6b0d\u8df4\u8bb0\u3504\uceb8\u6198, this:\uae87\u6b5f\u647c\u156b\uc229\u4e72), initobject:\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c(\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:double))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public double \u67e9\u718f\uc238\u8258\u5f50\ud523(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, double p1) {
        var_6_71 : double
        var_8_7C : Iterator<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>
        
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
        
        if (cmpne:boolean(p1:double, ldc:double(0.0))) {
            var_6_71 = ldc:double(0.0)
            var_8_7C = invokeinterface:Iterator<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>(List<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>::iterator, getfield:List<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>(\uae87\u6b5f\u647c\u156b\uc229\u4e72::\u6b0d\u8df4\u8bb0\u3504\uceb8\u6198, this:\uae87\u6b5f\u647c\u156b\uc229\u4e72))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_8_7C:Iterator<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>)) {
                var_6_71 = add:double(var_6_71:double, invokevirtual:double(\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c::\ua61f\u6fb0\uc2bd\u6198\u3bc9\u12cb, checkcast:\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c.class, invokeinterface:\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c(Iterator<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>::next, var_8_7C:Iterator<\u71ae\u183a\u61a4\uc2e8\u64ab\ub19c>)), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            }
            
            return:double(mul:double(var_6_71:double, p1:double))
        }
        
        return:double(ldc:double(0.0))
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
    
    public void \ub70c\u4179\u69d9\u56bd\u5654\u88c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_61D = and:int(ldc:int(10520388), ldc:int(921278405))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae87\u6b5f\u647c\u156b\uc229\u4e72[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-289454644))
            var_5_7D = and:int(ldc:int(-9018), ldc:int(9017))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19485), ldc:int(19468)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61D:int, ldc:int(818031598))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(665), ldc:int(3329)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4741), ldc:int(8195)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_D2:int, ldc:int(-325352612))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-15344), ldc:int(-15343)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-825543592))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-176495824))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1165587907))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(419837261))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(87547352))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(306436355))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1045837148))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1548351649))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(450556438))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-524633764))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-400296943))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1309385236))
                            var_11_E3 = and:int(ldc:int(30762), ldc:int(-32043))
                            goto(Label_1455)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-749240729))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(191459974))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2050622073))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(812906308))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1448303508))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(367979392))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-226927744))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-974890145))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(947677760))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(345132109))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-105370053))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-430232334))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1805692285))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(535522907))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1709066900))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1083360765))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1260242569))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(1161), ldc:int(531))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-345193384))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1847859589))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1339525639))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-122978684))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-12637875))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1178112004))
                        var_11_E3 = and:int(ldc:int(4448), ldc:int(-4449))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1222086907))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1763534406))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-742949830))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1213635756))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1536837181))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(177745217))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-813140920))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1973092836))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-324988997))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1399488566))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1204756371))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2078577991))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1455)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-795881805))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(70227763))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1427494389))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-116797886))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1236080454))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(337230344))
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-957230116))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(147610845))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1776369283))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1171363175))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(420012091))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-52382249))
                        var_17_628 = add:int(var_16_111:int, and:int(ldc:int(773), ldc:int(6177)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-672554553))
                
                if (cmple:boolean(var_5_7D = var_17_628:int, sub:int(var_6_84:int, xor:int(ldc:int(2242), ldc:int(2243))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-690546206))
            goto(Label_0106)
        }
    }
}
