public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc7fe\u927d\u2dcc\ubb2b\u5db4 {
    public void \uc7fe\u927d\u2dcc\ubb2b\u5db4(com.mojang.serialization.Codec<\u516c\u3d64\u718f\ub171\u6b5f.\u7043\u6cfe\u4daf\u4c04\u3bd6> p0) {
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
            invokespecial:\ub70c\u1833\ub19c\u183a\u3d64<\u7043\u6cfe\u4daf\u4c04\u3bd6>(\ub70c\u1833\ub19c\u183a\u3d64<\u7043\u6cfe\u4daf\u4c04\u3bd6>::<init>, this:\uc7fe\u927d\u2dcc\ubb2b\u5db4[expected:\ub70c\u1833\ub19c\u183a\u3d64<\u7043\u6cfe\u4daf\u4c04\u3bd6>], p0:Codec<\u7043\u6cfe\u4daf\u4c04\u3bd6>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u0c95\u16f6\u3a62\u4bc8\u5654\uff55(java.util.Random p0, \u516c\u3d64\u718f\ub171\u6b5f.\u7043\u6cfe\u4daf\u4c04\u3bd6 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_6_66 : Stream<? extends T>
        var_6_A1 : Stream<Object>
        
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
        var_6_66 = invokestatic:Stream<? extends T>(Stream<T>::empty)
        
        if (cmpne:boolean(invokevirtual:int(Random::nextInt, p0:Random, ldc:int(14)), ldc:int(0))) {
            return:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokestatic:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Stream<T>::empty))
        }
        
        var_6_A1 = invokestatic:Stream<Object>(Stream<T>::concat, var_6_66:Stream<? extends T>, invokestatic:Stream<? extends T>(Stream<T>::of, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:? extends T](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:int(Random::nextInt, p0:Random, ldc:int(16)), add:int(ldc:int(55), invokevirtual:int(Random::nextInt, p0:Random, ldc:int(16))), invokevirtual:int(Random::nextInt, p0:Random, ldc:int(16)))))
        
        if (cmpeq:boolean(invokevirtual:int(Random::nextInt, p0:Random, and:int(ldc:int(16390), ldc:int(8204))), ldc:int(0))) {
            var_6_A1 = invokestatic:Stream<Object>(Stream<Object>::concat, var_6_A1:Stream<? extends T>, invokestatic:Stream<? extends T>(Stream<T>::of, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:? extends T](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:int(Random::nextInt, p0:Random, ldc:int(16)), add:int(ldc:int(55), invokevirtual:int(Random::nextInt, p0:Random, ldc:int(16))), invokevirtual:int(Random::nextInt, p0:Random, ldc:int(16)))))
        }
        
        return:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(var_6_A1:Stream<Object>)
    }
    
    public java.util.stream.Stream \u0c95\u16f6\u3a62\u4bc8\u5654\uff55(java.util.Random p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ud158\u4c2b\ub102\ubded\ub19c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
            return:Stream(invokevirtual:Stream<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\uc7fe\u927d\u2dcc\ubb2b\u5db4::\u0c95\u16f6\u3a62\u4bc8\u5654\uff55, this:\uc7fe\u927d\u2dcc\ubb2b\u5db4, p0:Random, checkcast:\u7043\u6cfe\u4daf\u4c04\u3bd6(\u516c\u3d64\u718f\ub171\u6b5f.\u7043\u6cfe\u4daf\u4c04\u3bd6.class, p1:\ud158\u4c2b\ub102\ubded\ub19c[expected:\u7043\u6cfe\u4daf\u4c04\u3bd6]), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\u6ec6\u8d98\u8aa5\u3d64\ud36e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_600 : int
        
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
        var_3_5F5 = and:int(ldc:int(-2108587223), ldc:int(-79392531))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc7fe\u927d\u2dcc\ubb2b\u5db4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-730596671))
        }
        else {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-422788151))
            var_5_85 = and:int(ldc:int(-27990), ldc:int(27984))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27267), ldc:int(-27292)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5F5:int, ldc:int(-632756453))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(264), ldc:int(265)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-24256), ldc:int(-24255)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5F5 = and:int(var_3_DA:int, ldc:int(-1963543811))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8745), ldc:int(17415)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2049431467))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(600767396))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1377596207))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(944451668))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1680586979))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-924951638))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-936313531))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1902365511))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1659424716))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-672833731))
                            var_11_EB = and:int(ldc:int(7333), ldc:int(-7334))
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-473805745))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2122032453))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1964792575))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1697259089))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1453086394))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1037460203))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(147914366))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-771351316))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(848243968))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-226982723))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(239573132))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1726194104))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1997036988))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(228793965))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1831513663))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-742327185))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(17691), ldc:int(545))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(174386491))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-940292477))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1262705126))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-776231856))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(345130714))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-69309409))
                        var_11_EB = and:int(ldc:int(-11744), ldc:int(10717))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1546823436))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-687949897))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1469645657))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1590669877))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1629137931))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-144230503))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(362548481))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-869440344))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-792031508))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1008697299))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1399)
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1158196917))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1577547744))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1853339331))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1091432295))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_600 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(330298293))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1355833472))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1043449875))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-341842559))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(112133473))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-873308867))
                        var_17_600 = add:int(var_16_119:int, and:int(ldc:int(11), ldc:int(5)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2127244087))
                }
                
                var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-68323623))
                
                if (cmple:boolean(var_5_85 = var_17_600:int, sub:int(var_6_8C:int, and:int(ldc:int(18697), ldc:int(177))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-65573604))
            goto(Label_0106)
        }
    }
}
