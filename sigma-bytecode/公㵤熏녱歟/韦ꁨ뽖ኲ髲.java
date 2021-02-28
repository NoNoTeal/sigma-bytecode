public class \u516c\u3d64\u718f\ub171\u6b5f.\u97e6\ua068\ubf56\u12b2\u9af2 {
    public void \u97e6\ua068\ubf56\u12b2\u9af2(com.mojang.serialization.Codec<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uf9c5\ub8be\ud51e\ud7e8\u88c5> p0) {
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
            invokespecial:\u624e\u527a\u8640\uc238\u9255<\uf9c5\ub8be\ud51e\ud7e8\u88c5>(\u624e\u527a\u8640\uc238\u9255<\uf9c5\ub8be\ud51e\ud7e8\u88c5>::<init>, this:\u97e6\ua068\ubf56\u12b2\u9af2[expected:\u624e\u527a\u8640\uc238\u9255<\uf9c5\ub8be\ud51e\ud7e8\u88c5>], p0:Codec<\uf9c5\ub8be\ud51e\ud7e8\u88c5>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \ub1b9\u527a\u156b\u9a18\u67e9\u965f(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u120d\u839e\u1187\ud36e\ub18d\u4bc8 p0, java.util.Random p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uf9c5\ub8be\ud51e\ud7e8\u88c5 p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3) {
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
        
        if (cmpne:boolean(invokevirtual:int(Random::nextInt, p1:Random, getfield:int(\uf9c5\ub8be\ud51e\ud7e8\u88c5::\u51b2\ub8be\u3a62\u8df4\u5140\u183a, p2:\uf9c5\ub8be\ud51e\ud7e8\u88c5)), ldc:int(0))) {
            return:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokestatic:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Stream<T>::empty))
        }
        
        return:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokestatic:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Stream<T>::of, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, add:int(invokevirtual:int(Random::nextInt, p1:Random, ldc:int(16)), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:int(Random::nextInt, p1:Random, invokevirtual:int(\u120d\u839e\u1187\ud36e\ub18d\u4bc8::\u946b\u0a06\uc84e\uceb8\uc31c\u3c25, p0:\u120d\u839e\u1187\ud36e\ub18d\u4bc8)), add:int(invokevirtual:int(Random::nextInt, p1:Random, ldc:int(16)), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))))
    }
    
    public java.util.stream.Stream \ub1b9\u527a\u156b\u9a18\u67e9\u965f(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u120d\u839e\u1187\ud36e\ub18d\u4bc8 p0, java.util.Random p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ud158\u4c2b\ub102\ubded\ub19c p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3) {
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
            return:Stream(invokevirtual:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u97e6\ua068\ubf56\u12b2\u9af2::\ub1b9\u527a\u156b\u9a18\u67e9\u965f, this:\u97e6\ua068\ubf56\u12b2\u9af2, p0:\u120d\u839e\u1187\ud36e\ub18d\u4bc8, p1:Random, checkcast:\uf9c5\ub8be\ud51e\ud7e8\u88c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uf9c5\ub8be\ud51e\ud7e8\u88c5.class, p2:\ud158\u4c2b\ub102\ubded\ub19c[expected:\uf9c5\ub8be\ud51e\ud7e8\u88c5]), p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\u6ec6\u8d98\u8aa5\u3d64\ud36e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_625 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
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
        var_3_625 = and:int(ldc:int(-211806873), ldc:int(-403661335))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u97e6\ua068\ubf56\u12b2\u9af2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-27961259))
        }
        else {
            var_3_625 = and:int(var_3_625:int, ldc:int(-344049309))
            var_5_85 = and:int(ldc:int(-18326), ldc:int(18324))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19281), ldc:int(-19290)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_625:int, ldc:int(-446611459))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(8234), ldc:int(8235)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(4160), ldc:int(4161)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_625 = and:int(var_3_D2:int, ldc:int(-278881813))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-4096), ldc:int(-4095)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(188101380))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(654416326))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(895098509))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-814673393))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-383415683))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-266499590))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1242214967))
                    }
                    else {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-444801679))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(71043736))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1320667223))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-137206651))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-437412355))
                            var_11_E3 = and:int(ldc:int(-20882), ldc:int(20880))
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-179135232))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1382986636))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1264385714))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1518261559))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-76022423))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1594932758))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(300488056))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-702820716))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-50921712))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-2061426180))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-2077635364))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-35409411))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1425330435))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-424002706))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(79052344))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1269092390))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-76367513))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(25621), ldc:int(707))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1476944593))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1759118883))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-816694116))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1301158958))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(757444285))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-479063045))
                        var_11_E3 = and:int(ldc:int(17741), ldc:int(-17742))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(147451349))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1630984860))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(343168734))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1910052353))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(564968177))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(2098527396))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(614025830))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-345432705))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(231934356))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1187093880))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-2059592887))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-134457867))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1879775151))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-834725076))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-629674326))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2094326684))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(660913129))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(91320990))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1080471968))
                        loopcontinue()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(-505170079))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_630 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(156818363))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-141670189))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(151483426))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(728874717))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-42206359))
                        var_17_630 = add:int(var_16_111:int, xor:int(ldc:int(528), ldc:int(529)))
                        looporswitchbreak()
                    }
                }
                
                var_3_625 = and:int(var_3_625:int, ldc:int(-69059227))
                
                if (cmple:boolean(var_5_85 = var_17_630:int, sub:int(var_6_8C:int, and:int(ldc:int(99), ldc:int(10373))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
