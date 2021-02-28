public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf {
    private void \ua562\u8aa5\ua562\ud51e\ubff1\ufcaf(java.nio.channels.WritableByteChannel p0) {
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
            invokespecial:STBIWriteCallback(STBIWriteCallback::<init>, this:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf)
            putfield:WritableByteChannel(\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf::\ub1b9\u47c2\u6fb0\uafe7\u16f6\u0a06, this:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf, p0:WritableByteChannel)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void invoke(long p0, long p1, int p2) {
        var_6_B4 : int
        var_8_70 : ByteBuffer
        var_9_AD : IOException
        
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
            var_6_B4 = and:int(and:int(ldc:int(221939228), ldc:int(1294705469)), ldc:int(-1227181185))
            var_8_70 = invokestatic:ByteBuffer(\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf::getData, p1:long, p2:int)
            
            try {
                do {
                    if (cmpeq:boolean(and:int(var_6_B4:int, ldc:int(524288)), ldc:int(0))) {
                        var_6_B4 = and:int(var_6_B4:int, ldc:int(-871102164))
                    }
                    else {
                        var_6_B4 = and:int(var_6_B4:int, ldc:int(1983813566))
                        invokeinterface:int(WritableByteChannel::write, getfield:WritableByteChannel(\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf::\ub1b9\u47c2\u6fb0\uafe7\u16f6\u0a06, this:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf), var_8_70:ByteBuffer)
                    }
                } while (cmpeq:boolean(and:int(var_6_B4:int, ldc:int(2147483647)), ldc:int(0)))
                
                var_6_B4 = and:int(var_6_B4:int, ldc:int(1570745213))
            }
            catch (java.io.IOException var_9_AD) {
                var_6_B4 = and:int(var_6_B4:int, ldc:int(-2071219297))
                putfield:IOException(\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf::\u983f\u7043\ud36e\u6435\u392e\u0a06, this:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf, var_9_AD:IOException)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc246\u88c5\u4cd9\u6cfe\uc4d2\u8709() {
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
        
        if (cmpeq:boolean(getfield:IOException(\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf::\u983f\u7043\ud36e\u6435\u392e\u0a06, this:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf), aconstnull:IOException())) {
            return:void()
        }
        
        athrow(getfield:IOException(\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf::\u983f\u7043\ud36e\u6435\u392e\u0a06, this:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf))
    }
    
    public void \ua562\u8aa5\ua562\ud51e\ubff1\ufcaf(java.nio.channels.WritableByteChannel p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u3e75\ubded\u71f1\u927d\uc238\u624e p1) {
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
            invokespecial:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf(\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf::<init>, this:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf, p0:WritableByteChannel)
            return:void()
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
    
    public void \uc238\u6c56\u71ae\ub8be\u6435\u4c04(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_625 = and:int(ldc:int(-1064253844), ldc:int(-901064894))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua562\u8aa5\ua562\ud51e\ubff1\ufcaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-600099442))
        }
        else {
            var_3_625 = and:int(var_3_625:int, ldc:int(1127868115))
            var_5_85 = and:int(ldc:int(-23218), ldc:int(23057))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20372), ldc:int(-32670)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_625:int, ldc:int(-930490544))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(4230), ldc:int(4231)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-28096), ldc:int(-28095)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_625 = and:int(var_3_D2:int, ldc:int(1186328445))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-31741), ldc:int(-31742)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-348575645))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1899641542))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-110673025))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1724124118))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(956795942))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1771235171))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2000404538))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-974603824))
                    }
                    else {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-590098613))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1314696347))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1116962784))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1239999104))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-427758876))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-614604962))
                        var_11_E3 = and:int(ldc:int(-14797), ldc:int(10700))
                        goto(Label_1463)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1716535689))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-539273462))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1374044558))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-872738016))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(2080956119))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1494726872))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1264014917))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(2022215581))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-882192647))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(567899349))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-725329036))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1265233246))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1615432995))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-2136440599))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(1413996490))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(4303), ldc:int(10513))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1141824543))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1520118508))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-503015417))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1479260452))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-629501947))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1364475138))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1035802790))
                        var_11_E3 = and:int(ldc:int(-15598), ldc:int(3173))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(984468594))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1688393250))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(2125627819))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-299457929))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1584117470))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1244972093))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-327039127))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(930380468))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-358278176))
                            goto(Label_1075)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(512)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1243244663))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-677733310))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-313464862))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1463)
                    }
                    
                    Label_1324:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1555835789))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-855901804))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-522638091))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-559738481))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1686465191))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1953907520))
                        loopcontinue()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(2003818071))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_630 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1121957320))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1648781821))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-133451071))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1583543075))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-534059425))
                        var_17_630 = add:int(var_16_111:int, xor:int(ldc:int(21000), ldc:int(21001)))
                        looporswitchbreak()
                    }
                }
                
                var_3_625 = and:int(var_3_625:int, ldc:int(1985277633))
                
                if (cmple:boolean(var_5_85 = var_17_630:int, sub:int(var_6_8C:int, and:int(ldc:int(15905), ldc:int(5))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
